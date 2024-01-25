import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!ps", name = "K", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_168 = new Class200(79, 8);

	@OriginalMember(owner = "client!ps", name = "O", descriptor = "[Lclient!fda;")
	public static final Class110[] aClass110Array1 = new Class110[8];

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)Z")
	public static boolean method6400(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method6401(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static373.method5548(local13) : local13;
		} else if (arg1 instanceof Class260) {
			@Pc(27) Class260 local27 = (Class260) arg1;
			return local27.method6262();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BZ)V")
	public static void method6402(@OriginalArg(1) boolean arg0) {
		if (Static341.aClass22_4 != null) {
			Static341.aClass22_4.method7460();
			Static341.aClass22_4 = null;
		}
		Static360.anInt6253 = 0;
		Static116.method2086();
		Static310.method4830();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static520.aClass175Array1[local17].method4286();
		}
		Static212.method3537(false);
		System.gc();
		Static210.method8325();
		Static609.aBoolean725 = false;
		Static57.anInt1427 = -1;
		Static480.method6802();
		Static562.method7870(true);
		Static376.anInt6481 = 0;
		Static508.anInt8219 = 0;
		Static338.anInt5885 = 0;
		Static470.anInt7589 = 0;
		Static456.anInt7439 = 0;
		Static406.anInt6899 = 0;
		for (@Pc(57) int local57 = 0; local57 < aClass110Array1.length; local57++) {
			aClass110Array1[local57] = null;
		}
		Static327.method4980();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local75] = null;
		}
		Static317.anInt5602 = 0;
		Static514.aClass323_32.method7485();
		Static608.anInt10053 = 0;
		Static263.aClass323_18.method7485();
		Static83.method1789();
		Static406.anInt6903 = 0;
		Static382.aClass282_1.method6480();
		Static325.method4946();
		Static577.method8015();
		Static77.aLong53 = 0L;
		Static209.aClass2_Sub47_1 = null;
		if (arg0) {
			Static213.method3541(12);
			return;
		}
		Static213.method3541(3);
		try {
			Static655.method4698("loggedout", Static107.anApplet1);
		} catch (@Pc(131) Throwable local131) {
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
	public static void method6404() {
		try {
			@Pc(29) Method local29 = Runtime.class.getMethod("availableProcessors");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Integer local39 = (Integer) local29.invoke(local33, (Object[]) null);
					Static229.anInt4228 = local39;
				} catch (@Pc(44) Throwable local44) {
				}
			}
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[BZ[BIIIII)V")
	public static void method6405(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg2[local26] += arg1[arg5++];
				@Pc(38) int local38 = arg0++;
				arg2[local38] += arg1[arg5++];
				@Pc(50) int local50 = arg0++;
				arg2[local50] += arg1[arg5++];
				@Pc(62) int local62 = arg0++;
				arg2[local62] += arg1[arg5++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg0++;
				arg2[local26] += arg1[arg5++];
			}
			arg0 += arg7;
			arg5 += arg4;
		}
	}
}
