import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!o;")
	public static Class41 aClass41_10;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Z")
	public static boolean aBoolean244 = true;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
	public static final int[] anIntArray338 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(JI)V")
	public static void method3026(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZ)V")
	public static void method3027(@OriginalArg(1) boolean arg0) {
		for (@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) Static463.aClass181_52.method3972(); local6 != null; local6 = (Class2_Sub3) Static463.aClass181_52.method3975()) {
			if (local6.aClass2_Sub8_Sub4_2 != null) {
				Static414.aClass2_Sub8_Sub1_2.method1041(local6.aClass2_Sub8_Sub4_2);
				local6.aClass2_Sub8_Sub4_2 = null;
			}
			if (local6.aClass2_Sub8_Sub4_1 != null) {
				Static414.aClass2_Sub8_Sub1_2.method1041(local6.aClass2_Sub8_Sub4_1);
				local6.aClass2_Sub8_Sub4_1 = null;
			}
			local6.method6260();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class2_Sub3 local57 = (Class2_Sub3) Static294.aClass181_27.method3972(); local57 != null; local57 = (Class2_Sub3) Static294.aClass181_27.method3975()) {
			if (local57.aClass2_Sub8_Sub4_2 != null) {
				Static414.aClass2_Sub8_Sub1_2.method1041(local57.aClass2_Sub8_Sub4_2);
				local57.aClass2_Sub8_Sub4_2 = null;
			}
			local57.method6260();
		}
		for (@Pc(84) Class2_Sub3 local84 = (Class2_Sub3) Static271.aClass220_24.method5096(); local84 != null; local84 = (Class2_Sub3) Static271.aClass220_24.method5098()) {
			if (local84.aClass2_Sub8_Sub4_2 != null) {
				Static414.aClass2_Sub8_Sub1_2.method1041(local84.aClass2_Sub8_Sub4_2);
				local84.aClass2_Sub8_Sub4_2 = null;
			}
			local84.method6260();
		}
	}
}
