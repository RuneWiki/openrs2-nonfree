import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public static int anInt3925;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	public static int anInt3932;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "[B")
	public static byte[] aByteArray42 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1349 = Static64.method1101("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1348 = aClass51_1349;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public static int anInt3928 = 0;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1350 = Static64.method1101("Clientscript error in: ");

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1351 = Static64.method1101("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!sj;")
	public static Class1_Sub2_Sub17 method3040(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub17 local6 = (Class1_Sub2_Sub17) Static36.aClass123_4.method3640((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static126.aClass70_29.method3509(arg0, 0);
		} else {
			local25 = Static201.aClass70_41.method3509(arg0 & 0x7FFF, 0);
		}
		local6 = new Class1_Sub2_Sub17();
		if (local25 != null) {
			local6.method3185(new Class1_Sub16(local25));
		}
		if (arg0 >= 32768) {
			local6.method3190();
		}
		Static36.aClass123_4.method3644(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!me;II)Lclient!ia;")
	public static Class51 method3041(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		if (!Static209.method3452(Static33.method587(arg0), arg1) && arg0.anObjectArray30 == null) {
			return null;
		} else if (arg0.aClass51Array18 == null || arg0.aClass51Array18.length <= arg1 || arg0.aClass51Array18[arg1] == null || arg0.aClass51Array18[arg1].method1436().method1399() == 0) {
			return Static135.aBoolean135 ? Static150.method2574(new Class51[] { Static109.aClass51_793, Static27.method511(arg1) }) : null;
		} else {
			return arg0.aClass51Array18[arg1];
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
	public static int method3044(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZBLclient!me;)V")
	public static void method3046(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(23) int local23 = arg1.anInt2813 == 0 ? arg1.anInt2835 : arg1.anInt2813;
		@Pc(35) int local35 = arg1.anInt2841 == 0 ? arg1.anInt2802 : arg1.anInt2841;
		Static209.method3455(local23, arg0, local35, arg1.anInt2807, Static64.aClass71ArrayArray1[arg1.anInt2807 >> 16]);
		if (arg1.aClass71Array2 != null) {
			Static209.method3455(local23, arg0, local35, arg1.anInt2807, arg1.aClass71Array2);
		}
		@Pc(68) Class1_Sub13 local68 = (Class1_Sub13) Static120.aClass102_14.method3093((long) arg1.anInt2807);
		if (local68 != null) {
			Static110.method1049(local68.anInt1677, local35, arg0, local23);
		}
	}
}
