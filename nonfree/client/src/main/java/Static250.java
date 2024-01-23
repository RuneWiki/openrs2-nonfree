import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "[I")
	public static int[] anIntArray388 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString164 = "Examine";

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
	public static int anInt4906 = -1;

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Loading textures - ";

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "J")
	public static long aLong171 = 0L;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIILclient!ie;)V")
	public static void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class73 arg3) {
		for (@Pc(15) Class4_Sub26 local15 = (Class4_Sub26) Static80.aClass17_11.method613(); local15 != null; local15 = (Class4_Sub26) Static80.aClass17_11.method607()) {
			if (local15.anInt3907 == arg1 && local15.anInt3915 == arg0 * 128 && arg2 * 128 == local15.anInt3914 && arg3.anInt2237 == local15.aClass73_1.anInt2237) {
				if (local15.aClass4_Sub6_Sub1_3 != null) {
					Static10.aClass4_Sub6_Sub4_1.method3730(local15.aClass4_Sub6_Sub1_3);
					local15.aClass4_Sub6_Sub1_3 = null;
				}
				if (local15.aClass4_Sub6_Sub1_2 != null) {
					Static10.aClass4_Sub6_Sub4_1.method3730(local15.aClass4_Sub6_Sub1_2);
					local15.aClass4_Sub6_Sub1_2 = null;
				}
				local15.method4690();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
	public static void method3844() {
		if (Static300.aString197.toLowerCase().indexOf("microsoft") != -1) {
			Static305.anIntArray471[189] = 26;
			Static305.anIntArray471[222] = 59;
			Static305.anIntArray471[186] = 57;
			Static305.anIntArray471[188] = 71;
			Static305.anIntArray471[223] = 28;
			Static305.anIntArray471[192] = 58;
			Static305.anIntArray471[187] = 27;
			Static305.anIntArray471[220] = 74;
			Static305.anIntArray471[221] = 43;
			Static305.anIntArray471[191] = 73;
			Static305.anIntArray471[190] = 72;
			Static305.anIntArray471[219] = 42;
			return;
		}
		Static305.anIntArray471[47] = 73;
		Static305.anIntArray471[91] = 42;
		Static305.anIntArray471[46] = 72;
		Static305.anIntArray471[92] = 74;
		if (Static300.aMethod1 == null) {
			Static305.anIntArray471[192] = 58;
			Static305.anIntArray471[222] = 59;
		} else {
			Static305.anIntArray471[192] = 28;
			Static305.anIntArray471[222] = 58;
			Static305.anIntArray471[520] = 59;
		}
		Static305.anIntArray471[93] = 43;
		Static305.anIntArray471[61] = 27;
		Static305.anIntArray471[45] = 26;
		Static305.anIntArray471[44] = 71;
		Static305.anIntArray471[59] = 57;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)J")
	public static long method3845() {
		return Static148.aClass25_1.method4580();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method3846(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(20) int local20 = Static156.aClass4_Sub2_Sub9_4.method4100(arg0, 250);
		@Pc(32) int local32 = Static156.aClass4_Sub2_Sub9_4.method4096(arg0, 250) * 13;
		if (Static251.aBoolean330) {
			Static87.method1464(6, 6, local20 + 4 + 4, local32 + 8, 0);
			Static87.method1452(6, 6, local20 + 8, local32 + 4 + 4, 16777215);
		} else {
			Static258.method4031(6, 6, local20 + 8, local32 - -8, 0);
			Static258.method4025(6, 6, local20 + 4 + 4, local32 - -8, 16777215);
		}
		Static156.aClass4_Sub2_Sub9_4.method4095(arg0, 10, 10, local20, local32, 16777215, -1, 1, 1, 0);
		Static123.method2033(local32 + 4 + 4, 6, local20 + 4 + 4, 6);
		if (!arg1) {
			Static210.method3316(10, local20, local32, 10);
		} else if (Static251.aBoolean330) {
			Static251.method3887();
		} else {
			try {
				@Pc(162) Graphics local162 = Static139.aCanvas1.getGraphics();
				Static147.aClass42_1.method3931(local162);
			} catch (@Pc(170) Exception local170) {
				Static139.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)I")
	public static int method3847(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (arg0 * local25 >> 12) + 40960;
		return local13 * local33 >> 12;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3848(@OriginalArg(0) String arg0) {
		if (Static168.aClass4_Sub12Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(18) long local18 = Static193.method3171(arg0);
		if (local18 == 0L) {
			return;
		}
		while (local10 < Static168.aClass4_Sub12Array1.length && Static168.aClass4_Sub12Array1[local10].aLong211 != local18) {
			local10++;
		}
		if (Static168.aClass4_Sub12Array1.length > local10 && Static168.aClass4_Sub12Array1[local10] != null) {
			Static175.aClass4_Sub24_Sub1_1.method3123(176);
			Static175.aClass4_Sub24_Sub1_1.method3079(Static168.aClass4_Sub12Array1[local10].aLong211);
		}
	}
}
