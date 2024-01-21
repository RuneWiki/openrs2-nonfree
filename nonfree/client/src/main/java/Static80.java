import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!nb", name = "Qc", descriptor = "Lclient!af;")
	public static Class5 aClass5_984 = Static45.method1937("Schlie-8en");

	@OriginalMember(owner = "client!nb", name = "Vc", descriptor = "I")
	public static int anInt1993 = 0;

	@OriginalMember(owner = "client!nb", name = "Wc", descriptor = "Lclient!af;")
	public static Class5 aClass5_986 = Static45.method1937("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!nb", name = "td", descriptor = "Lclient!af;")
	private static Class5 aClass5_991 = Static45.method1937("Login limit exceeded)3");

	@OriginalMember(owner = "client!nb", name = "Zc", descriptor = "Lclient!af;")
	public static Class5 aClass5_987 = aClass5_991;

	@OriginalMember(owner = "client!nb", name = "ad", descriptor = "Lclient!af;")
	public static Class5 aClass5_988 = Static45.method1937("mapdots");

	@OriginalMember(owner = "client!nb", name = "fd", descriptor = "Lclient!af;")
	public static Class5 aClass5_989 = null;

	@OriginalMember(owner = "client!nb", name = "gd", descriptor = "I")
	public static final int anInt1999 = 20;

	@OriginalMember(owner = "client!nb", name = "kd", descriptor = "Lclient!af;")
	public static Class5 aClass5_990 = Static45.method1937("_");

	@OriginalMember(owner = "client!nb", name = "od", descriptor = "I")
	public static volatile int anInt2006 = 0;

	@OriginalMember(owner = "client!nb", name = "vd", descriptor = "Lclient!af;")
	public static Class5 aClass5_992 = Static45.method1937("<img=1>");

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V")
	public static void method1408() {
		aClass5_992 = null;
		aClass5_986 = null;
		aClass5_987 = null;
		aClass5_990 = null;
		aClass5_991 = null;
		aClass5_984 = null;
		aClass5_989 = null;
		aClass5_988 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZBZZI)Lclient!r;")
	public static Class41_Sub1 method1409(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class70 local10 = null;
		if (Static46.aClass54_1 != null) {
			local10 = new Class70(arg3, Static46.aClass54_1, Static1.aClass54Array1[arg3], 1000000);
		}
		return new Class41_Sub1(local10, Static118.aClass70_4, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLclient!rd;I)Lclient!af;")
	public static Class5 method1411(@OriginalArg(1) Class1_Sub20 arg0) {
		try {
			@Pc(15) Class5 local15 = new Class5();
			local15.anInt178 = arg0.method2056();
			if (local15.anInt178 > 32767) {
				local15.anInt178 = 32767;
			}
			local15.aByteArray2 = new byte[local15.anInt178];
			arg0.anInt2951 += Static9.aClass3_1.method58(0, local15.aByteArray2, local15.anInt178, arg0.anInt2951, arg0.aByteArray36);
			return local15;
		} catch (@Pc(52) Exception local52) {
			return Static104.aClass5_1213;
		}
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)V")
	public static void method1412() {
		if (Static73.aClass62_1 != null) {
			@Pc(7) Class62 local7 = Static73.aClass62_1;
			synchronized (Static73.aClass62_1) {
				Static73.aClass62_1 = null;
			}
		}
	}
}
