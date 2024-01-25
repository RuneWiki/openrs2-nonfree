import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!km", name = "n", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_171 = new Class194(107, 6);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZILclient!dw;II[B)Lclient!gv;")
	public static Class94_Sub2_Sub1 method5120(@OriginalArg(0) int arg0, @OriginalArg(4) Class82_Sub1 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3) {
		if (arg1.aBoolean180 || Static112.method1840(arg0) && Static112.method1840(arg2)) {
			return new Class94_Sub2_Sub1(arg1, 3553, 6406, arg0, arg2, false, arg3, 6406);
		} else if (arg1.aBoolean176) {
			return new Class94_Sub2_Sub1(arg1, 34037, 6406, arg0, arg2, false, arg3, 6406);
		} else {
			return new Class94_Sub2_Sub1(arg1, 6406, arg0, arg2, Static533.method1203(arg0), Static533.method1203(arg2), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public static void method5123() {
		if (Static303.anIntArray531 != null) {
			return;
		}
		Static303.anIntArray531 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(38) float local38 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(56) float local56 = (float) local49 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local38 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(79) float local79 = (float) -local69 + local66;
				@Pc(86) float local86 = local56 * (1.0F - local47);
				@Pc(95) float local95 = (1.0F - local47 * local79) * local56;
				@Pc(106) float local106 = (1.0F - local47 * (1.0F - local79)) * local56;
				if (local73 == 0) {
					local62 = local86;
					local58 = local56;
					local60 = local106;
				} else if (local73 == 1) {
					local58 = local95;
					local60 = local56;
					local62 = local86;
				} else if (local73 == 2) {
					local62 = local106;
					local60 = local56;
					local58 = local86;
				} else if (local73 == 3) {
					local60 = local95;
					local58 = local86;
					local62 = local56;
				} else if (local73 == 4) {
					local62 = local56;
					local58 = local106;
					local60 = local86;
				} else if (local73 == 5) {
					local62 = local95;
					local58 = local56;
					local60 = local86;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(194) int local194 = (int) (local58 * 256.0F);
				@Pc(199) int local199 = (int) (local60 * 256.0F);
				@Pc(204) int local204 = (int) (local62 * 256.0F);
				@Pc(217) int local217 = local204 + (local199 << 8) + (local194 << 16) - 16777216;
				Static303.anIntArray531[local22++] = local217;
			}
		}
	}
}
