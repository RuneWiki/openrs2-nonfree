import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_40 = new Class16();

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_41 = new Class16();

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)V")
	public static void method4411() {
		if (Static232.aClass133_1 == null) {
			return;
		}
		while (true) {
			while (Static246.anInt4940 < Static165.aClass157_Sub1Array5.length) {
				@Pc(26) Class157_Sub1 local26 = Static165.aClass157_Sub1Array5[Static246.anInt4940];
				if (local26 != null && local26.anInt4798 == -1) {
					if (Static170.aClass11_Sub34_1 == null) {
						Static170.aClass11_Sub34_1 = Static232.aClass133_1.method3562(local26.aString45);
					}
					@Pc(50) int local50 = Static170.aClass11_Sub34_1.anInt5507;
					if (local50 == -1) {
						return;
					}
					Static170.aClass11_Sub34_1 = null;
					local26.anInt4798 = local50;
					Static246.anInt4940++;
				} else {
					Static246.anInt4940++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public static void method4412() {
		@Pc(10) Class26 local10 = Static196.aClass26_38;
		synchronized (Static196.aClass26_38) {
			Static196.aClass26_38.method333();
		}
		local10 = Static281.aClass26_51;
		synchronized (Static281.aClass26_51) {
			Static281.aClass26_51.method333();
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	public static void method4413() {
		if (Static315.anIntArray506 != null) {
			return;
		}
		Static315.anIntArray506 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		int var2 = 0;
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
				@Pc(86) float local86 = (1.0F - local47) * local56;
				@Pc(94) float local94 = (1.0F - local47 * local79) * local56;
				@Pc(105) float local105 = (1.0F - local47 * (1.0F - local79)) * local56;
				if (local73 == 0) {
					local62 = local86;
					local58 = local56;
					local60 = local105;
				} else if (local73 == 1) {
					local62 = local86;
					local58 = local94;
					local60 = local56;
				} else if (local73 == 2) {
					local58 = local86;
					local60 = local56;
					local62 = local105;
				} else if (local73 == 3) {
					local62 = local56;
					local58 = local86;
					local60 = local94;
				} else if (local73 == 4) {
					local58 = local105;
					local62 = local56;
					local60 = local86;
				} else if (local73 == 5) {
					local62 = local94;
					local60 = local86;
					local58 = local56;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(198) int local198 = (int) (local58 * 256.0F);
				@Pc(203) int local203 = (int) (local60 * 256.0F);
				@Pc(208) int local208 = (int) (local62 * 256.0F);
				@Pc(221) int local221 = (local203 << 8) + (-(-(local198 << 16) - local208) - 16777216);
				Static315.anIntArray506[var2++] = local221;
			}
		}
	}
}
