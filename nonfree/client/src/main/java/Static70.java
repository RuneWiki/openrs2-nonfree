import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!la", name = "H", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_11;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!ic;")
	private static Class34 aClass34_793 = Static56.method816("Please wait)3)3)3");

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_794 = Static56.method816("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_795 = Static56.method816("T");

	@OriginalMember(owner = "client!la", name = "A", descriptor = "[I")
	public static int[] anIntArray210 = new int[1000];

	@OriginalMember(owner = "client!la", name = "B", descriptor = "I")
	public static int anInt1700 = 0;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "Lclient!ic;")
	public static Class34 aClass34_796 = Static56.method816("::fpson");

	@OriginalMember(owner = "client!la", name = "F", descriptor = "I")
	public static int anInt1702 = 10;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "Lclient!ic;")
	public static Class34 aClass34_797 = aClass34_793;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1049() {
		aClass34_793 = null;
		aClass34_797 = null;
		aClass14_Sub1_11 = null;
		aClass34_794 = null;
		aClass34_795 = null;
		anIntArray210 = null;
		aClass34_796 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!se;")
	public static Class62 method1050(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class62_Sub1");
			@Pc(18) Class62 local18 = (Class62) local6.getDeclaredConstructor().newInstance();
			local18.method1991(arg2, arg0, arg1);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class62_Sub2 local31 = new Class62_Sub2();
			local31.method1991(arg2, arg0, arg1);
			return local31;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1051() {
		Static33.anIntArray113 = new int[151];
		Static9.anIntArray21 = new int[33];
		Static25.anIntArray88 = new int[33];
		Static119.anIntArray383 = new int[151];
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 999;
			local25 = 0;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static22.aClass8_Sub1_Sub3_Sub2_7.aByteArray3[local27 + Static22.aClass8_Sub1_Sub3_Sub2_7.anInt484 * local19] == 0) {
					if (local23 == 999) {
						local23 = local27;
					}
				} else if (local23 != 999) {
					local25 = local27;
					break;
				}
			}
			Static25.anIntArray88[local19] = local23;
			Static9.anIntArray21[local19] = local25 - local23;
		}
		for (local23 = 5; local23 < 156; local23++) {
			local25 = 999;
			local27 = 0;
			for (@Pc(89) int local89 = 25; local89 < 172; local89++) {
				if (Static22.aClass8_Sub1_Sub3_Sub2_7.aByteArray3[local89 + Static22.aClass8_Sub1_Sub3_Sub2_7.anInt484 * local23] == 0 && (local89 > 34 || local23 > 34)) {
					if (local25 == 999) {
						local25 = local89;
					}
				} else if (local25 != 999) {
					local27 = local89;
					break;
				}
			}
			Static119.anIntArray383[local23 - 5] = local25 - 25;
			Static33.anIntArray113[local23 - 5] = local27 - local25;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZI)I")
	public static int method1052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(15) int local15 = method1052(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local15 *= arg0;
			}
			return local15;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	public static boolean method1053(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
