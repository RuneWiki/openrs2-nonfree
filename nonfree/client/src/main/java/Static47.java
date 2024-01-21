import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!he;")
	private static Class26 aClass26_738 = Static6.method100("Members only world");

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public static int anInt1417 = -1;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!he;")
	private static Class26 aClass26_739 = Static6.method100("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
	public static int anInt1425 = 0;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "Lclient!he;")
	public static Class26 aClass26_740 = Static6.method100("::clientdrop");

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "Lclient!he;")
	public static Class26 aClass26_741 = Static6.method100("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "Lclient!he;")
	public static Class26 aClass26_742 = aClass26_739;

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
	public static int anInt1428 = 500;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
	public static int anInt1430 = 0;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "Lclient!he;")
	public static Class26 aClass26_743 = aClass26_738;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) Class3_Sub8 local12 = (Class3_Sub8) Static99.aClass65_70.method1958();
		@Pc(14) Class3_Sub8 local14 = null;
		while (local12 != null) {
			if (local12.anInt1146 == arg8 && arg1 == local12.anInt1141 && arg6 == local12.anInt1138 && local12.anInt1145 == arg3) {
				local14 = local12;
				break;
			}
			local12 = (Class3_Sub8) Static99.aClass65_70.method1962();
		}
		if (local14 == null) {
			local14 = new Class3_Sub8();
			local14.anInt1145 = arg3;
			local14.anInt1138 = arg6;
			local14.anInt1146 = arg8;
			local14.anInt1141 = arg1;
			Static43.method1871(local14);
			Static99.aClass65_70.method1955(local14);
		}
		local14.anInt1140 = arg5;
		local14.anInt1136 = arg2;
		local14.anInt1139 = arg4;
		local14.anInt1137 = arg0;
		local14.anInt1142 = arg7;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public static void method899() {
		aClass26_741 = null;
		aClass26_739 = null;
		aClass26_738 = null;
		aClass26_740 = null;
		aClass26_743 = null;
		aClass26_742 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ef;Lclient!ef;Z)V")
	public static void method901(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) boolean arg2) {
		Static32.aClass16_45 = arg1;
		Static20.aClass16_27 = arg0;
		Static70.aBoolean81 = arg2;
	}
}
