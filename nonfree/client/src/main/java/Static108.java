import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!hf;")
	public static Class118_Sub1 aClass118_Sub1_2;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	public static int anInt2509 = 0;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_13 = new Class316(8);

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "S")
	public static short aShort35 = 256;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I")
	public static int method2362(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)Z")
	public static boolean method2363(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static382.anInt6687; local1 < Static538.anInt9338; local1++) {
			@Pc(6) Class206[][] local6 = Static313.aClass206ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static278.anInt5506; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static406.anInt7107 + local9;
				@Pc(18) int local18 = Static406.anInt7107 - local9;
				if (local14 >= Static530.anInt8978 || local18 < Static518.anInt8804) {
					for (@Pc(27) int local27 = -Static278.anInt5506; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static265.anInt5150 + local27;
						@Pc(36) int local36 = Static265.anInt5150 - local27;
						@Pc(48) Class206 local48;
						if (local14 >= Static530.anInt8978) {
							if (local32 >= Static537.anInt9318) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean415) {
									Static71.aBoolean148 = arg0;
									Static128.aClass43_1.method3643(local48);
									Static128.aClass43_1.method3636();
								}
							}
							if (local36 < Static227.anInt8838) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean415) {
									Static71.aBoolean148 = arg0;
									Static128.aClass43_1.method3643(local48);
									Static128.aClass43_1.method3636();
								}
							}
						}
						if (local18 < Static518.anInt8804) {
							if (local32 >= Static537.anInt9318) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean415) {
									Static71.aBoolean148 = arg0;
									Static128.aClass43_1.method3643(local48);
									Static128.aClass43_1.method3636();
								}
							}
							if (local36 < Static227.anInt8838) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean415) {
									Static71.aBoolean148 = arg0;
									Static128.aClass43_1.method3643(local48);
									Static128.aClass43_1.method3636();
								}
							}
						}
						if (Static511.anInt9418 == 0) {
							if (Static144.aBoolean206) {
								Static128.aClass43_1.method3639(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
