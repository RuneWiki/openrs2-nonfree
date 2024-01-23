import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
	public static int anInt5122;

	@OriginalMember(owner = "client!ui", name = "N", descriptor = "Lclient!nk;")
	public static Class121 aClass121_127;

	@OriginalMember(owner = "client!ui", name = "O", descriptor = "Lclient!kf;")
	public static Class90 aClass90_8;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "[C")
	public static char[] aCharArray4 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "S")
	public static short aShort47 = 32767;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
	public static int anInt5125 = 0;

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "Lclient!vh;")
	public static Class187 aClass187_143 = new Class187(50);

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString306 = "Please remove ";

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "Z")
	public static boolean aBoolean351 = false;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
	public static void method4384() {
		for (@Pc(10) Class1_Sub18 local10 = (Class1_Sub18) Static159.aClass59_26.method1704(); local10 != null; local10 = (Class1_Sub18) Static159.aClass59_26.method1701()) {
			if (local10.anInt1783 == -1) {
				local10.anInt1787 = 0;
				Static315.method4458(local10);
			} else {
				local10.method4779();
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)[Lclient!cf;")
	public static Class23[] method4386() {
		@Pc(4) Class23[] local4 = new Class23[Static94.anInt3439];
		for (@Pc(15) int local15 = 0; local15 < Static94.anInt3439; local15++) {
			if (Static156.aBoolean211) {
				local4[local15] = new Class23_Sub2(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local15], Static254.anIntArray412[local15], Static160.anIntArray267[local15], Static235.anIntArray468[local15], Static69.aByteArrayArray15[local15], Static83.anIntArray144);
			} else {
				local4[local15] = new Class23_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local15], Static254.anIntArray412[local15], Static160.anIntArray267[local15], Static235.anIntArray468[local15], Static69.aByteArrayArray15[local15], Static83.anIntArray144);
			}
		}
		Static117.method2101();
		return local4;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BII)V")
	public static void method4387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg1, 5);
		local8.method2866();
		local8.anInt3315 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIZI)V")
	public static void method4389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static85.method1597(arg1)) {
			Static294.method4481(arg0, arg3, Static274.aClass66ArrayArray1[arg1], arg2, -1);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method4390(@OriginalArg(0) Class121 arg0) {
		Static250.aClass121_108 = arg0;
	}
}
