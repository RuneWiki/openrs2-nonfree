import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!af", name = "W", descriptor = "I")
	public static int anInt179;

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "Lclient!km;")
	public static Class91 aClass91_8;

	@OriginalMember(owner = "client!af", name = "N", descriptor = "I")
	public static int anInt174 = -1;

	@OriginalMember(owner = "client!af", name = "X", descriptor = "[I")
	public static int[] anIntArray20 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(III)Lclient!co;")
	public static Class25 method197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4090; local13++) {
			@Pc(22) Class25 local22 = local7.aClass25Array4[local13];
			if ((local22.aLong39 >> 29 & 0x3L) == 2L && local22.anInt1003 == arg1 && local22.anInt1000 == arg2) {
				Static181.method3040(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method199(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub2_Sub18 local16 = Static130.method2227(arg1, 3);
		local16.method3905();
		local16.aString296 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fi;")
	public static RuntimeException_Sub1 method201(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString95 = local9.aString95 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Z")
	public static boolean method202(@OriginalArg(0) int arg0) {
		@Pc(3) Class41_Sub1 local3 = Static192.method3167(arg0);
		if (local3 == null) {
			return false;
		} else if (Static288.anInt5481 == 1 || Static288.anInt5481 == 2 || Static111.anInt2557 == 2) {
			Static1.aString252 = local3.aString86;
			Static33.anInt764 = local3.anInt1452;
			if (Static111.anInt2557 != 0) {
				Static101.anInt2402 = Static33.anInt764 + 50000;
				Static61.anInt1297 = Static33.anInt764 + 40000;
				Static240.anInt4769 = Static61.anInt1297;
			}
			return true;
		} else {
			@Pc(47) String local47 = "";
			if (Static111.anInt2557 != 0) {
				local47 = ":" + (local3.anInt1452 + 7000);
			}
			@Pc(63) String local63 = "";
			if (Static253.aString292 != null) {
				local63 = "/p=" + Static253.aString292;
			}
			@Pc(125) String local125 = "http://" + local3.aString86 + local47 + "/l=" + Static202.anInt4089 + "/a=" + Static98.anInt2315 + local63 + "/j" + (Static55.aBoolean85 ? "1" : "0") + ",o" + (Static183.aBoolean344 ? "1" : "0") + ",a2,m" + (Static87.aBoolean139 ? "1" : "0");
			try {
				Static237.aClient1.getAppletContext().showDocument(new URL(local125), "_self");
				return true;
			} catch (@Pc(135) Exception local135) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!lb;ZZIII)Lclient!pn;")
	public static Class1_Sub2_Sub11 method203(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = (arg5 << 19) + (arg3 << 17) + arg0 + (arg2 ? 65536 : 0);
		@Pc(31) long local31 = (long) local15 * 3849834839L + (long) arg4 * 3147483667L;
		@Pc(37) Class1_Sub2_Sub11 local37 = (Class1_Sub2_Sub11) Static55.aClass135_3.method3316(local31);
		if (local37 != null) {
			return local37;
		}
		Static110.aBoolean183 = false;
		local37 = Static56.method1054(arg2, arg0, arg5, arg1, false, arg4, arg3, false);
		if (local37 != null && !Static110.aBoolean183) {
			Static55.aClass135_3.method3321(local31, local37);
		}
		return local37;
	}
}
