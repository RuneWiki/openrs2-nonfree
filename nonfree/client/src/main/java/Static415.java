import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "Lclient!lk;")
	public static Class217 aClass217_6;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)I")
	public static int method5231(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)Lclient!hia;")
	public static Class150 method5232(@OriginalArg(1) int arg0) {
		@Pc(10) Class150 local10 = (Class150) Static653.aClass352_76.method7653((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static450.aClass34_94.method1239(0, arg0);
		local10 = new Class150();
		if (local20 != null) {
			local10.method3268(new Class4_Sub11(local20), arg0);
		}
		Static653.aClass352_76.method7655((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method5233(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static56.method1300(arg1);
		@Pc(10) int local10 = Static33.aCalendar24.get(5);
		@Pc(14) int local14 = Static33.aCalendar24.get(2);
		@Pc(26) int local26 = Static33.aCalendar24.get(1);
		return arg0 == 3 ? Static568.method7521(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static490.aStringArrayArray34[arg0][local14] + "-" + local26;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)Z")
	public static boolean method5234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static36.method737(arg0, arg1) || Static425.method5897(arg0, arg1);
	}

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)I")
	public static int method5236() {
		if ((double) Static154.aFloat8 == 3.0D) {
			return 37;
		} else if ((double) Static154.aFloat8 == 4.0D) {
			return 50;
		} else if ((double) Static154.aFloat8 == 6.0D) {
			return 75;
		} else if ((double) Static154.aFloat8 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIII)V")
	public static void method5237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class4_Sub5_Sub11 local14 = Static652.method8695((long) arg0 << 32 | (long) arg1, 18);
		local14.method3955();
		local14.anInt4425 = arg2;
		local14.anInt4427 = arg3;
	}
}
