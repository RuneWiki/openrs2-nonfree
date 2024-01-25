import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!us", name = "h", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_86 = new Class11(16, 8);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	public static void method5189() {
		if (Static298.anIntArray1009 != null) {
			return;
		}
		Static298.anIntArray1009 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(36) double local36 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(74) double local74;
				if (local54 < 0.5D) {
					local74 = (local47 + 1.0D) * local54;
				} else {
					local74 = local47 + local54 - local54 * local47;
				}
				@Pc(92) double local92 = local54 * 2.0D - local74;
				@Pc(96) double local96 = local36 + 0.3333333333333333D;
				if (local96 > 1.0D) {
					local96--;
				}
				@Pc(110) double local110 = local36 - 0.3333333333333333D;
				if (local110 < 0.0D) {
					local110++;
				}
				if (local36 * 6.0D < 1.0D) {
					local58 = local92 + (local74 - local92) * 6.0D * local36;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local74;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = local92 + (0.6666666666666666D - local36) * (-local92 + local74) * 6.0D;
				} else {
					local58 = local92;
				}
				if (local96 * 6.0D < 1.0D) {
					local56 = local92 + (local74 - local92) * 6.0D * local96;
				} else if (local96 * 2.0D < 1.0D) {
					local56 = local74;
				} else if (local96 * 3.0D < 2.0D) {
					local56 = local92 + (local74 - local92) * 6.0D * (0.6666666666666666D - local96);
				} else {
					local56 = local92;
				}
				if (local110 * 6.0D < 1.0D) {
					local60 = local92 + (local74 - local92) * 6.0D * local110;
				} else if (local110 * 2.0D < 1.0D) {
					local60 = local74;
				} else if (local110 * 3.0D < 2.0D) {
					local60 = local92 + (0.6666666666666666D - local110) * 6.0D * (local74 - local92);
				} else {
					local60 = local92;
				}
			}
			local56 = Math.pow(local56, local20);
			local58 = Math.pow(local58, local20);
			local60 = Math.pow(local60, local20);
			@Pc(291) int local291 = (int) (local56 * 256.0D);
			@Pc(296) int local296 = (int) (local58 * 256.0D);
			@Pc(301) int local301 = (int) (local60 * 256.0D);
			@Pc(311) int local311 = (local291 << 16) + (local296 << 8) + local301;
			Static298.anIntArray1009[local22] = local311;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method5190(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = (arg1 ? Static18.anInt425 : Static65.anInt4695) + local19;
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(35) Class2_Sub10_Sub6 local35 = Static3.method74(local29);
			if (local35.aBoolean102 && local35.method1143().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static161.aShortArray53 = null;
					Static264.anInt4609 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(66) short[] local66 = new short[local11.length * 2];
					for (@Pc(68) int local68 = 0; local68 < local13; local68++) {
						local66[local68] = local11[local68];
					}
					local11 = local66;
				}
				local11[local13++] = (short) local29;
			}
		}
		Static264.anInt4609 = local13;
		Static161.aShortArray53 = local11;
		Static235.anInt4194 = 0;
		@Pc(109) String[] local109 = new String[Static264.anInt4609];
		for (@Pc(111) int local111 = 0; local111 < Static264.anInt4609; local111++) {
			local109[local111] = Static3.method74(local11[local111]).method1143();
		}
		Static280.method4257(local109, Static161.aShortArray53);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "()V")
	public static void method5192() {
		Static10.method5059(Static12.anInt311);
	}
}
