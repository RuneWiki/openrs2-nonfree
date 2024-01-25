import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ct", name = "T", descriptor = "Lclient!ae;")
	public static Class4 aClass4_4;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_47 = new Class217(63, -1);

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)Lclient!sf;")
	public static Class189 method1146(@OriginalArg(1) int arg0) {
		@Pc(10) Class189 local10 = (Class189) Static193.aClass21_107.method854((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static346.aClass30_102.method1161(arg0, 1);
		local10 = new Class189();
		if (local25 != null) {
			local10.method5077(arg0, new Class1_Sub7(local25));
		}
		Static193.aClass21_107.method843(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
	public static void method1147() {
		@Pc(7) Class183 local7 = null;
		try {
			@Pc(11) Class121 local11 = Static227.aClass75_5.method2353();
			while (local11.anInt3693 == 0) {
				Static135.method2737(1L);
			}
			if (local11.anInt3693 == 1) {
				local7 = (Class183) local11.anObject2;
				@Pc(36) byte[] local36 = new byte[(int) local7.method4932()];
				@Pc(51) int local51;
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38 += local51) {
					local51 = local7.method4936(local38, local36, local36.length - local38);
					if (local51 == -1) {
						throw new IOException("EOF");
					}
				}
				Static121.method2548(new Class1_Sub7(local36));
			}
		} catch (@Pc(84) Exception local84) {
		}
		try {
			if (local7 != null) {
				local7.method4934();
			}
		} catch (@Pc(91) Exception local91) {
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZI)Z")
	public static boolean method1155(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!fp;I)V")
	public static void method1167(@OriginalArg(0) Class63 arg0) {
		if (Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 != Static236.anInt4782 && (Static105.aClass155ArrayArrayArray3 != null && Static287.method5074(arg0, Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79))) {
			Static236.anInt4782 = Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method1168(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static97.aCharArray13[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)Lclient!jr;")
	public static Class1_Sub4_Sub15 method1172() {
		return Static269.aClass1_Sub4_Sub15_2;
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(B)V")
	public static void method1174() {
		Static152.method2919();
		Static31.method825();
		Static284.method5720();
		Static71.method1585();
		Static34.method882();
		Static243.aClass220_2.method5982();
		Static342.method5734();
		Static41.method958();
		Static75.method3008();
		Static134.method2733();
		Static177.method3443();
		Static189.method3559();
		Static66.method1505();
		Static161.method3067();
		Static5.method273();
		Static21.method558();
		Static267.method4816();
		Static14.method4536();
		Static239.method4427();
		Static282.method5025();
		Static92.method1933();
		Static94.method2040();
		Static139.method2813();
		Static328.aClass21_165.method851();
		Static217.aClass21_116.method851();
		Static219.aClass21_119.method851();
		Static359.aClass21_176.method851();
		Static302.aClass21_155.method851();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)Z")
	public static boolean method1175(@OriginalArg(1) int arg0) {
		@Pc(12) Class135_Sub1 local12 = Static265.method4811(arg0);
		if (local12 == null) {
			return false;
		} else if (Static111.anInt2479 == 3) {
			@Pc(44) String local44 = "";
			if (Static195.anInt3950 != 0) {
				local44 = ":" + (local12.anInt4037 + 7000);
			}
			@Pc(62) String local62 = "";
			if (Static220.aString43 != null) {
				local62 = "/p=" + Static220.aString43;
			}
			@Pc(111) String local111 = "http://" + local12.aString40 + local44 + "/l=" + Static254.anInt5172 + "/a=" + Static180.anInt3698 + local62 + "/j" + (Static71.aBoolean115 ? "1" : "0") + ",o" + (Static230.aBoolean144 ? "1" : "0") + ",a2";
			try {
				Static48.aClient2.getAppletContext().showDocument(new URL(local111), "_self");
				return true;
			} catch (@Pc(121) Exception local121) {
				return false;
			}
		} else {
			Static239.anInt4853 = local12.anInt4037;
			Static306.aString53 = local12.aString40;
			if (Static195.anInt3950 != 0) {
				Static29.anInt680 = Static239.anInt4853 + 40000;
				Static270.anInt5271 = Static239.anInt4853 + 50000;
				Static201.anInt4056 = Static29.anInt680;
			}
			return true;
		}
	}
}
