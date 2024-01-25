import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "[I")
	public static int[] anIntArray485;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
	public static int anInt3846;

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "[S")
	public static short[] aShortArray91 = new short[256];

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
	public static void method3176() {
		if (Static68.anIntArray184 != null) {
			return;
		}
		Static68.anIntArray184 = new int[65536];
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
				@Pc(85) float local85 = (1.0F - local47) * local56;
				@Pc(94) float local94 = local56 * (1.0F - local47 * local79);
				@Pc(106) float local106 = (1.0F - local47 * (1.0F - local79)) * local56;
				if (local73 == 0) {
					local62 = local85;
					local58 = local56;
					local60 = local106;
				} else if (local73 == 1) {
					local62 = local85;
					local58 = local94;
					local60 = local56;
				} else if (local73 == 2) {
					local62 = local106;
					local58 = local85;
					local60 = local56;
				} else if (local73 == 3) {
					local62 = local56;
					local58 = local85;
					local60 = local94;
				} else if (local73 == 4) {
					local62 = local56;
					local58 = local106;
					local60 = local85;
				} else if (local73 == 5) {
					local58 = local56;
					local60 = local85;
					local62 = local94;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(199) int local199 = (int) (local58 * 256.0F);
				@Pc(204) int local204 = (int) (local60 * 256.0F);
				@Pc(209) int local209 = (int) (local62 * 256.0F);
				@Pc(224) int local224 = (local199 << 16) + (local204 << 8) + local209 - 16777216;
				Static68.anIntArray184[local22++] = local224;
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BIIIZ)V")
	public static void method3177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static137.aLong72 = 0L;
		@Pc(16) int local16 = Static254.method3903();
		if (arg1 == 3 || local16 == 3) {
			arg3 = true;
		}
		if (!Static66.aClass164_2.method5308()) {
			arg3 = true;
		}
		Static38.method573(local16, arg2, arg1, arg0, arg3);
	}
}
