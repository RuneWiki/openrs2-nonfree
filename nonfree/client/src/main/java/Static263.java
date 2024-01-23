import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub8 aClass1_Sub2_Sub8_4;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "[[[Lclient!kb;")
	public static Class1_Sub19[][][] aClass1_Sub19ArrayArrayArray3;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "[[Lclient!rc;")
	public static Class1_Sub25[][] aClass1_Sub25ArrayArray3;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "Z")
	public static boolean aBoolean406 = false;

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "S")
	public static short aShort38 = 256;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(ZI)I")
	public static int method4059(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)Lclient!tk;")
	public static Class1_Sub2_Sub18 method4060(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2_Sub18 local6 = (Class1_Sub2_Sub18) Static94.aClass64_14.method1471((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23;
		if (arg0 < 32768) {
			local23 = Static1.aClass7_1.method253(arg0, 1);
		} else {
			local23 = Static79.aClass7_130.method253(arg0 & 0x7FFF, 1);
		}
		local6 = new Class1_Sub2_Sub18();
		if (local23 != null) {
			local6.method4003(new Class1_Sub18(local23));
		}
		if (arg0 >= 32768) {
			local6.method4002();
		}
		Static94.aClass64_14.method1466(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "(I)V")
	public static void method4062() {
		if (Static214.aBoolean322) {
			return;
		}
		Static214.aBoolean322 = true;
		Static45.aBoolean87 = true;
		if (Static290.aBoolean436) {
			Static152.aFloat81 = (int) Static152.aFloat81 + 47 & 0xFFFFFFF0;
		} else {
			Static70.aFloat38 += (12.0F - Static70.aFloat38) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	public static void method4063(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub11 local11 = Static163.method3579(4, arg0);
		local11.method1853();
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
	public static void method4064() {
		Static45.aClass31_8.method856(5);
	}
}
