import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V")
	public static void method6035(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static371.aFloat187 = 3.0F;
		} else if (arg0 == 50) {
			Static371.aFloat187 = 4.0F;
		} else if (arg0 == 75) {
			Static371.aFloat187 = 6.0F;
		} else if (arg0 == 100) {
			Static371.aFloat187 = 8.0F;
		} else if (arg0 == 200) {
			Static371.aFloat187 = 16.0F;
		}
		Static280.anInt5122 = -1;
		Static280.anInt5122 = -1;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lclient!vl;B)V")
	public static void method6038(@OriginalArg(0) Class16_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anIntArray585 == null && arg0.anIntArray592 == null) {
			return;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray585.length; local19++) {
			@Pc(22) int local22 = -1;
			if (arg0.anIntArray585 != null) {
				local22 = arg0.anIntArray585[local19];
			}
			if (local22 != -1) {
				local17 = false;
				@Pc(74) int local74;
				@Pc(89) int local89;
				@Pc(59) int local59;
				if ((local22 & 0xC0000000) == -1073741824) {
					local59 = local22 & 0xFFFFFFF;
					@Pc(63) int local63 = local59 >> 14;
					local74 = arg0.anInt8037 - (local63 - Static406.anInt6899) * 512 - 256;
					@Pc(78) int local78 = local59 & 0x3FFF;
					local89 = arg0.anInt8034 - (local78 - Static338.anInt5885) * 512 - 256;
				} else if ((local22 & 0x8000) == 0) {
					@Pc(133) Class2_Sub32 local133 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local22);
					if (local133 == null) {
						arg0.method6998(-1, local19);
						continue;
					}
					@Pc(145) Class16_Sub1_Sub1_Sub3_Sub1 local145 = local133.aClass16_Sub1_Sub1_Sub3_Sub1_2;
					local89 = arg0.anInt8034 - local145.anInt8034;
					local74 = arg0.anInt8037 - local145.anInt8037;
				} else {
					local59 = local22 & 0x7FFF;
					@Pc(102) Class16_Sub1_Sub1_Sub3_Sub2 local102 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local59];
					if (local102 == null) {
						arg0.method6998(-1, local19);
						continue;
					}
					local74 = arg0.anInt8037 - local102.anInt8037;
					local89 = arg0.anInt8034 - local102.anInt8034;
				}
				if (local74 != 0 || local89 != 0) {
					arg0.method6998((int) (Math.atan2((double) local74, (double) local89) * 2607.5945876176133D) & 0x3FFF, local19);
				}
			} else if (!arg0.method6998(-1, local19)) {
				local17 = false;
			}
		}
		if (local17) {
			arg0.anIntArray592 = null;
			arg0.anIntArray585 = null;
		}
	}
}
