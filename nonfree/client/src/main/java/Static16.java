import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	public static int anInt493;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 aClass1_Sub1_Sub12_Sub1_2;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Lclient!ed;")
	private static Class23 aClass23_188 = Static169.method2903("Loaded sprites");

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "Lclient!ed;")
	private static Class23 aClass23_189 = Static169.method2903("wishes to trade with you)3");

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "Lclient!ed;")
	public static Class23 aClass23_190 = aClass23_188;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public static int anInt497 = -1;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
	public static int anInt498 = 0;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_191 = aClass23_189;

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
	public static int anInt500 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBI)I")
	public static int method281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 * arg2 + arg0 * (4096 - arg1) >> 12;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	public static void method282() {
		aClass1_Sub1_Sub12_Sub1_2 = null;
		aClass23_191 = null;
		aClass23_189 = null;
		aClass23_190 = null;
		aClass23_188 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZ)I")
	public static int method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 - 1 & arg1 >> 31;
		return (arg1 + (arg1 >>> 31)) % arg0 + local12;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	public static void method284() {
		try {
			if (Static141.anInt3602 == 1) {
				@Pc(18) int local18 = Static35.aClass1_Sub11_Sub2_1.method1781();
				if (local18 > 0 && Static35.aClass1_Sub11_Sub2_1.method1764()) {
					local18 -= Static95.anInt2455;
					if (local18 < 0) {
						local18 = 0;
					}
					Static35.aClass1_Sub11_Sub2_1.method1775(local18);
				} else {
					Static35.aClass1_Sub11_Sub2_1.method1782();
					Static35.aClass1_Sub11_Sub2_1.method1776();
					if (Static5.aClass30_67 == null) {
						Static141.anInt3602 = 0;
					} else {
						Static141.anInt3602 = 2;
					}
					Static165.aClass31_1 = null;
					Static69.aClass1_Sub12_1 = null;
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static35.aClass1_Sub11_Sub2_1.method1782();
			Static165.aClass31_1 = null;
			Static141.anInt3602 = 0;
			Static69.aClass1_Sub12_1 = null;
			Static5.aClass30_67 = null;
		}
	}
}
