import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!vl;")
	public static Class186 aClass186_3;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt771;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!th;")
	public static Class168 aClass168_25;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
	public static int anInt773;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString49 = "Discard";

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	public static int anInt770 = 0;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString50 = "Examine";

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4 = new String[1000];

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "Lclient!tk;")
	public static Class170 aClass170_1 = new Class170();

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZIJI)Z")
	public static boolean method671(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = (int) arg1 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		@Pc(35) int local35 = (int) arg1 >> 20 & 0x3;
		if (local8 == 10 || local8 == 11 || local8 == 22) {
			@Pc(74) Class92 local74 = Static166.method2725(local19);
			@Pc(77) int local77 = local74.anInt3221;
			@Pc(86) int local86;
			@Pc(89) int local89;
			if (local35 == 0 || local35 == 2) {
				local86 = local74.anInt3227;
				local89 = local74.anInt3182;
			} else {
				local89 = local74.anInt3227;
				local86 = local74.anInt3182;
			}
			if (local35 != 0) {
				local77 = (local77 << local35 & 0xF) + (local77 >> 4 - local35);
			}
			Static72.method1264(arg0, arg2, local89, local77, local86, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], 0, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], 0);
		} else {
			Static72.method1264(arg0, arg2, 0, 0, 0, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0], local8 + 1, Static56.aClass2_Sub4_Sub2_1.anIntArray283[0], local35);
		}
		return true;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V")
	public static void method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
		Static2.aClass1_Sub14_Sub1_1.method2191(20);
		Static2.aClass1_Sub14_Sub1_1.method2191(arg0);
		Static2.aClass1_Sub14_Sub1_1.method2191(arg2);
		Static2.aClass1_Sub14_Sub1_1.method2208(arg3);
		Static2.aClass1_Sub14_Sub1_1.method2208(arg1);
		Static264.anInt5301 = 0;
		Static252.anInt5113 = -3;
		Static119.anInt2584 = 0;
		Static251.anInt5521 = 1;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)I")
	public static int method676() {
		return 6;
	}
}
