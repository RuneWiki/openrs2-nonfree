import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lclient!ea;")
	public static Class20 aClass20_17;

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!ee", name = "eb", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_6;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	public static int anInt706 = 2;

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "Lclient!ec;")
	public static Class22 aClass22_192 = Static60.method1113("Konfig geladen)3");

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lclient!wc;")
	public static Class81 aClass81_4 = new Class81(32);

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
	public static int anInt713 = 0;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "Lclient!ec;")
	public static Class22 aClass22_193 = Static60.method1113("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "Lclient!ec;")
	public static Class22 aClass22_194 = Static60.method1113("(U0a )2 in: ");

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_199 = Static60.method1113("OFF");

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "Lclient!ec;")
	public static Class22 aClass22_195 = aClass22_199;

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_196 = Static60.method1113(": ");

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lclient!ec;")
	private static Class22 aClass22_198 = Static60.method1113("Location");

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_197 = aClass22_198;

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
	public static int anInt722 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)I")
	public static int method505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static3.aByteArrayArrayArray1[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static3.aByteArrayArrayArray1[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!f;)V")
	public static void method507(@OriginalArg(1) Class4_Sub7 arg0) {
		@Pc(11) int local11 = arg0.anInt793;
		if (local11 == 324) {
			if (Static57.anInt1731 == -1) {
				Static50.anInt1410 = arg0.anInt792;
				Static57.anInt1731 = arg0.anInt780;
			}
			if (Static50.aClass21_1.aBoolean64) {
				arg0.anInt780 = Static57.anInt1731;
			} else {
				arg0.anInt780 = Static50.anInt1410;
			}
		} else if (local11 == 325) {
			if (Static57.anInt1731 == -1) {
				Static57.anInt1731 = arg0.anInt780;
				Static50.anInt1410 = arg0.anInt792;
			}
			if (Static50.aClass21_1.aBoolean64) {
				arg0.anInt780 = Static50.anInt1410;
			} else {
				arg0.anInt780 = Static57.anInt1731;
			}
		} else if (local11 == 327) {
			arg0.anInt775 = 150;
			arg0.anInt808 = (int) (Math.sin((double) Static117.anInt2877 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt752 = 5;
			arg0.anInt794 = 0;
		} else if (local11 == 328) {
			arg0.anInt775 = 150;
			arg0.anInt808 = (int) (Math.sin((double) Static117.anInt2877 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt752 = 5;
			arg0.anInt794 = 1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	public static void method508() {
		aClass22_193 = null;
		aClass20_17 = null;
		aClass22_197 = null;
		anIntArray77 = null;
		aClass22_199 = null;
		aClass22_192 = null;
		aClass22_196 = null;
		aClass22_198 = null;
		aClass22_195 = null;
		aClass4_Sub7_6 = null;
		aClass81_4 = null;
		aClass22_194 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZI)I")
	public static int method511() {
		return Static133.anInt3145 + Static53.anInt1498;
	}
}
