import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!mg;")
	public static Class160 aClass160_56;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!di;")
	public static final Class54 aClass54_70 = new Class54(33, 8);

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!di;")
	public static final Class54 aClass54_71 = new Class54(39, 15);

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!di;")
	public static final Class54 aClass54_72 = new Class54(38, 12);

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_106 = new Class265(72, 3);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method4067() {
		Static389.aBoolean445 = true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method4068() {
		if (Static244.anIntArray595 != null) {
			return;
		}
		Static244.anIntArray595 = new int[65536];
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
				@Pc(94) float local94 = local56 * (1.0F - local47 * local79);
				@Pc(104) float local104 = (1.0F - local47 * (1.0F - local79)) * local56;
				if (local73 == 0) {
					local58 = local56;
					local60 = local104;
					local62 = local86;
				} else if (local73 == 1) {
					local60 = local56;
					local58 = local94;
					local62 = local86;
				} else if (local73 == 2) {
					local60 = local56;
					local62 = local104;
					local58 = local86;
				} else if (local73 == 3) {
					local62 = local56;
					local60 = local94;
					local58 = local86;
				} else if (local73 == 4) {
					local60 = local86;
					local62 = local56;
					local58 = local104;
				} else if (local73 == 5) {
					local60 = local86;
					local58 = local56;
					local62 = local94;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(196) int local196 = (int) (local58 * 256.0F);
				@Pc(201) int local201 = (int) (local60 * 256.0F);
				@Pc(206) int local206 = (int) (local62 * 256.0F);
				@Pc(218) int local218 = (local201 << 8) + (local196 << 16) + local206 - 16777216;
				Static244.anIntArray595[local22++] = local218;
			}
		}
	}
}
