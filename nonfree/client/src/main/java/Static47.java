import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "Lclient!bc;")
	public static Class6 aClass6_11;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
	public static int anInt1304;

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "Lclient!q;")
	public static Class62 aClass62_12;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!kd;")
	public static Class39 aClass39_629 = Static108.method1915("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "Lclient!kd;")
	public static Class39 aClass39_630 = Static108.method1915("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "Lclient!jb;")
	public static Class33 aClass33_16 = new Class33(20);

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
	public static int anInt1307 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "I")
	public static int anInt1311 = 0;

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "Lclient!jb;")
	public static Class33 aClass33_17 = new Class33(30);

	@OriginalMember(owner = "client!hb", name = "gb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_631 = Static108.method1915("http:)4)4");

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
	public static void method826() {
		aClass39_631 = null;
		aClass62_12 = null;
		aClass39_629 = null;
		aClass33_17 = null;
		aClass33_16 = null;
		aClass6_11 = null;
		aClass39_630 = null;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)I")
	public static int method828(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)Lclient!re;")
	public static Class1_Sub1_Sub16 method829(@OriginalArg(0) int arg0) {
		@Pc(18) Class1_Sub1_Sub16 local18 = (Class1_Sub1_Sub16) Static121.aClass33_40.method1038((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static121.aClass62_33.method2008(arg0, 1);
		local18 = new Class1_Sub1_Sub16();
		if (local28 != null) {
			local18.method1880(new Class1_Sub18(local28), arg0);
		}
		local18.method1881();
		Static121.aClass33_40.method1042(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!gd;BII)V")
	public static void method830(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static89.aClass6_16.method2069();
		Static121.aClass1_Sub1_Sub4_Sub1_52.method492(0, 0);
		arg1.method741(Static39.aClass39_550, 55, 28, 16777215, 0);
		if (arg2 == 0) {
			arg1.method741(Static93.aClass39_1133, 55, 41, 65280, 0);
		}
		if (arg2 == 1) {
			arg1.method741(Static101.aClass39_1243, 55, 41, 16776960, 0);
		}
		if (arg2 == 2) {
			arg1.method741(Static107.aClass39_1309, 55, 41, 16711680, 0);
		}
		if (arg2 == 3) {
			arg1.method741(Static29.aClass39_449, 55, 41, 65535, 0);
		}
		arg1.method741(Static17.aClass39_301, 184, 28, 16777215, 0);
		if (arg3 == 0) {
			arg1.method741(Static93.aClass39_1133, 184, 41, 65280, 0);
		}
		if (arg3 == 1) {
			arg1.method741(Static101.aClass39_1243, 184, 41, 16776960, 0);
		}
		if (arg3 == 2) {
			arg1.method741(Static107.aClass39_1309, 184, 41, 16711680, 0);
		}
		arg1.method741(Static120.aClass39_1518, 324, 28, 16777215, 0);
		if (arg0 == 0) {
			arg1.method741(Static93.aClass39_1133, 324, 41, 65280, 0);
		}
		if (arg0 == 1) {
			arg1.method741(Static101.aClass39_1243, 324, 41, 16776960, 0);
		}
		if (arg0 == 2) {
			arg1.method741(Static107.aClass39_1309, 324, 41, 16711680, 0);
		}
		arg1.method760(Static68.aClass39_867, 417, 17, 85, 25, 16777215, 0, 1, 1, 0);
		try {
			@Pc(161) Graphics local161 = Static16.aCanvas10.getGraphics();
			Static89.aClass6_16.method2067(0, 453, local161);
		} catch (@Pc(169) Exception local169) {
			Static16.aCanvas10.repaint();
		}
	}
}
