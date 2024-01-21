import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!la", name = "w", descriptor = "[Lclient!ob;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array1;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public static volatile int anInt1459 = 0;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!fc;")
	private static Class25 aClass25_674 = Static78.method1313("Your account has been disabled)3");

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_675 = Static78.method1313("Welt");

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_676 = aClass25_674;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_677 = Static78.method1313("Standort");

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!p;")
	public static Class63 aClass63_9 = new Class63(64);

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_678 = Static78.method1313("Ausw-=hlen");

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_679 = Static78.method1313("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1131() {
		aClass25_674 = null;
		aClass25_678 = null;
		aClass25_677 = null;
		aClass25_675 = null;
		aClass1_Sub2_Sub14Array1 = null;
		aClass63_9 = null;
		aClass25_676 = null;
		aClass25_679 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!oc;)Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 method1132(@OriginalArg(1) int arg0, @OriginalArg(2) Class56 arg1) {
		return Static34.method756(arg1, arg0) ? Static105.method1693() : null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 method1133() {
		@Pc(15) Class1_Sub2_Sub2_Sub1 local15 = new Class1_Sub2_Sub2_Sub1();
		local15.anInt213 = Static39.anInt1092;
		local15.anInt212 = Static111.anIntArray434[0];
		local15.anInt214 = Static62.anIntArray267[0];
		local15.anInt210 = Static100.anIntArray402[0];
		local15.anInt211 = Static1.anInt20;
		@Pc(40) byte[] local40 = Static13.aByteArrayArray1[0];
		local15.anInt215 = Static88.anIntArray349[0];
		@Pc(51) int local51 = local15.anInt215 * local15.anInt210;
		local15.anIntArray40 = new int[local51];
		for (@Pc(57) int local57 = 0; local57 < local51; local57++) {
			local15.anIntArray40[local57] = Static1.anIntArray10[local40[local57] & 0xFF];
		}
		Static99.method1649();
		return local15;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1134() {
		try {
			@Pc(2) Graphics local2 = Static119.aCanvas1.getGraphics();
			Static84.aClass7_13.method1095(local2, 550, 4);
		} catch (@Pc(18) Exception local18) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)I")
	public static int method1135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return arg0 / 2 + (arg2 / 4 << 10) + (arg1 / 32 << 7);
	}
}
