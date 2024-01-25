import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gs", name = "H", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "Lclient!dp;")
	public static Class53 aClass53_57;

	@OriginalMember(owner = "client!gs", name = "O", descriptor = "[Lclient!mb;")
	public static Class132[] aClass132Array1;

	@OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
	public static int anInt2047;

	@OriginalMember(owner = "client!gs", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString81 = "Loading...";

	@OriginalMember(owner = "client!gs", name = "L", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!gs", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
	public static void method2220() {
		if (Static332.aString292.toLowerCase().indexOf("microsoft") != -1) {
			Static203.anIntArray442[188] = 71;
			Static203.anIntArray442[186] = 57;
			Static203.anIntArray442[187] = 27;
			Static203.anIntArray442[190] = 72;
			Static203.anIntArray442[221] = 43;
			Static203.anIntArray442[222] = 59;
			Static203.anIntArray442[223] = 28;
			Static203.anIntArray442[189] = 26;
			Static203.anIntArray442[192] = 58;
			Static203.anIntArray442[191] = 73;
			Static203.anIntArray442[220] = 74;
			Static203.anIntArray442[219] = 42;
			return;
		}
		Static203.anIntArray442[59] = 57;
		Static203.anIntArray442[47] = 73;
		Static203.anIntArray442[91] = 42;
		Static203.anIntArray442[61] = 27;
		Static203.anIntArray442[45] = 26;
		if (Static332.aMethod2 == null) {
			Static203.anIntArray442[192] = 58;
			Static203.anIntArray442[222] = 59;
		} else {
			Static203.anIntArray442[520] = 59;
			Static203.anIntArray442[192] = 28;
			Static203.anIntArray442[222] = 58;
		}
		Static203.anIntArray442[44] = 71;
		Static203.anIntArray442[46] = 72;
		Static203.anIntArray442[92] = 74;
		Static203.anIntArray442[93] = 43;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([[[Lclient!sk;B)V")
	public static void method2221(@OriginalArg(0) Class187[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class187[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class187 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass44_Sub3_1 instanceof Interface7) {
							((Interface7) local23.aClass44_Sub3_1).method5797();
						}
						if (local23.aClass44_Sub1_1 instanceof Interface7) {
							((Interface7) local23.aClass44_Sub1_1).method5797();
						}
						if (local23.aClass44_Sub1_2 instanceof Interface7) {
							((Interface7) local23.aClass44_Sub1_2).method5797();
						}
						if (local23.aClass44_Sub5_1 instanceof Interface7) {
							((Interface7) local23.aClass44_Sub5_1).method5797();
						}
						if (local23.aClass44_Sub5_2 instanceof Interface7) {
							((Interface7) local23.aClass44_Sub5_2).method5797();
						}
						for (@Pc(73) Class214 local73 = local23.aClass214_19; local73 != null; local73 = local73.aClass214_21) {
							@Pc(78) Class44_Sub4 local78 = local73.aClass44_Sub4_1;
							if (local78 instanceof Interface7) {
								((Interface7) local78).method5797();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2222(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static88.aClass48_1);
		arg0.addMouseMotionListener(Static88.aClass48_1);
		arg0.addFocusListener(Static88.aClass48_1);
	}
}
