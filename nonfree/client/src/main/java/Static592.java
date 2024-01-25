import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "[I")
	public static int[] anIntArray537;

	@OriginalMember(owner = "client!uda", name = "n", descriptor = "I")
	public static int anInt9719;

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_95 = new Class305(12, 2);

	@OriginalMember(owner = "client!uda", name = "k", descriptor = "[I")
	public static final int[] anIntArray538 = new int[200];

	@OriginalMember(owner = "client!uda", name = "m", descriptor = "Z")
	public static boolean aBoolean826 = false;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)Lclient!k;")
	public static Class187 method8117(@OriginalArg(0) int arg0) {
		@Pc(13) Class187[] local13 = Static253.method3897();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class187 local21 = local13[local15];
			if (arg0 == local21.anInt5766) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public static void method8119() {
		if (Static378.anIntArray380 != null) {
			return;
		}
		Static378.anIntArray380 = new int[65536];
		@Pc(22) double local22 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
			@Pc(39) float local39 = ((float) (local26 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(48) float local48 = (float) (local26 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(50) int local50 = 0; local50 < 128; local50++) {
				@Pc(56) float local56 = (float) local50 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local39 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(79) float local79 = (float) -local69 + local66;
				@Pc(85) float local85 = (1.0F - local48) * local56;
				@Pc(94) float local94 = (1.0F - local79 * local48) * local56;
				@Pc(105) float local105 = (1.0F - local48 * (1.0F - local79)) * local56;
				if (local73 == 0) {
					local58 = local56;
					local62 = local85;
					local60 = local105;
				} else if (local73 == 1) {
					local58 = local94;
					local60 = local56;
					local62 = local85;
				} else if (local73 == 2) {
					local60 = local56;
					local62 = local105;
					local58 = local85;
				} else if (local73 == 3) {
					local62 = local56;
					local60 = local94;
					local58 = local85;
				} else if (local73 == 4) {
					local60 = local85;
					local58 = local105;
					local62 = local56;
				} else if (local73 == 5) {
					local58 = local56;
					local62 = local94;
					local60 = local85;
				}
				local58 = (float) Math.pow((double) local58, local22);
				local60 = (float) Math.pow((double) local60, local22);
				local62 = (float) Math.pow((double) local62, local22);
				@Pc(188) int local188 = (int) (local58 * 256.0F);
				@Pc(193) int local193 = (int) (local60 * 256.0F);
				@Pc(198) int local198 = (int) (local62 * 256.0F);
				@Pc(210) int local210 = (local193 << 8) + (local188 << 16) + local198 - 16777216;
				Static378.anIntArray380[local24++] = local210;
			}
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	public static void method8120() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static201.anInt3834; local12++) {
			for (@Pc(15) int local15 = 0; local15 < Static626.anInt10238; local15++) {
				if (Static79.method1036(Static635.aClass226ArrayArrayArray3, true, local15, local12, local5)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}
}
