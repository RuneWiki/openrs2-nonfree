import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Z")
	public static boolean aBoolean393;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "[I")
	public static int[] anIntArray680;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public static int anInt5281 = -1;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIII)Z")
	public static boolean method4483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface1 local9 = (Interface1) Static48.method4691(arg1, arg0, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static217.method5630(local9) & true;
		}
		local9 = (Interface1) Static252.method5177(arg1, arg0, arg2, gd.class);
		if (local9 != null) {
			local11 &= Static217.method5630(local9);
		}
		local9 = (Interface1) Static44.method981(arg1, arg0, arg2);
		if (local9 != null) {
			local11 &= Static217.method5630(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	public static void method4484() {
		@Pc(6) int local6 = Static118.method5346();
		if (local6 == 0) {
			Static301.aByteArrayArrayArray11 = null;
			Static18.method300(0);
		} else if (local6 == 1) {
			Static198.method3543((byte) 0);
			Static18.method300(512);
			if (Static92.aByteArrayArrayArray3 != null) {
				Static247.method4268();
			}
		} else {
			Static198.method3543((byte) (Static233.anInt4634 - 4 & 0xFF));
			Static18.method300(2);
		}
		Static286.anInt5632 = Static168.anInt3508;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V")
	public static void method4485() {
		Static21.aClass103_1.method2679(5);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!ol;")
	public static Class153 method4487(@OriginalArg(1) int arg0) {
		@Pc(10) Class103 local10 = Static200.aClass103_37;
		@Pc(19) Class153 local19;
		synchronized (Static200.aClass103_37) {
			local19 = (Class153) Static200.aClass103_37.method2682((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(35) byte[] local35 = Static239.aClass180_61.method4560(arg0, 3);
		local19 = new Class153();
		if (local35 != null) {
			local19.method4065(new Class7_Sub3(local35));
		}
		@Pc(50) Class103 local50 = Static200.aClass103_37;
		synchronized (Static200.aClass103_37) {
			Static200.aClass103_37.method2687(local19, (long) arg0);
			return local19;
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Z")
	public static boolean method4488() {
		if (Static94.aBoolean158) {
			try {
				Static362.method3353("showVideoAd", Static116.aClass21_4.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public static void method4491() {
		@Pc(5) Class103 local5 = Static266.aClass103_54;
		synchronized (Static266.aClass103_54) {
			Static266.aClass103_54.method2678();
		}
		local5 = Static271.aClass103_57;
		synchronized (Static271.aClass103_57) {
			Static271.aClass103_57.method2678();
		}
		local5 = Static228.aClass103_45;
		synchronized (Static228.aClass103_45) {
			Static228.aClass103_45.method2678();
		}
		local5 = Static283.aClass103_60;
		synchronized (Static283.aClass103_60) {
			Static283.aClass103_60.method2678();
		}
	}
}
