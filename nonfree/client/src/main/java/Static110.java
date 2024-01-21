import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_32;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5 = new byte[4][104][104];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1466 = Static122.method531("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[250][];

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	public static int anInt2525 = 0;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1467 = Static122.method531("");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public static void method1962() {
		aClass73_1467 = null;
		aClass73_1466 = null;
		aByteArrayArray7 = null;
		aByteArrayArrayArray5 = null;
		aClass3_Sub1_Sub3_Sub4_32 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!nf;I)V")
	public static void method1963(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub7_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt3184 && arg2 != -1) {
			@Pc(62) int local62 = Static98.method1697(arg2).anInt1321;
			if (local62 == 1) {
				arg1.anInt3172 = 0;
				arg1.anInt3187 = 0;
				arg1.anInt3173 = arg0;
				arg1.anInt3164 = 0;
			}
			if (local62 == 2) {
				arg1.anInt3187 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt3184 == -1 || Static98.method1697(arg2).anInt1325 >= Static98.method1697(arg1.anInt3184).anInt1325) {
			arg1.anInt3184 = arg2;
			arg1.anInt3135 = arg1.anInt3160;
			arg1.anInt3164 = 0;
			arg1.anInt3173 = arg0;
			arg1.anInt3187 = 0;
			arg1.anInt3172 = 0;
		}
	}
}
