import java.awt.Rectangle;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "Lclient!op;")
	public static Class250 aClass250_2;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "[I")
	public static final int[] anIntArray79 = new int[1000];

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_24 = new Class173(60, 11);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)V")
	public static void method1374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub14 local14 = Static196.method3380(Static17.aClass159_1, Static453.aClass173_105);
		local14.aClass4_Sub11_Sub1_3.method4932(arg0);
		local14.aClass4_Sub11_Sub1_3.method4915(arg1);
		Static353.method5712(local14);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
	public static void method1375() {
		Static201.aClass350_15.method8203();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1376(@OriginalArg(1) String arg0) {
		if (Static573.aStringArray70 == null) {
			Static161.method522();
		}
		Static282.aCalendar2.setTime(new Date(Static574.method8210()));
		@Pc(26) int local26 = Static282.aCalendar2.get(11);
		@Pc(30) int local30 = Static282.aCalendar2.get(12);
		@Pc(34) int local34 = Static282.aCalendar2.get(13);
		@Pc(68) String local68 = Integer.toString(local26 / 10) + local26 % 10 + ":" + local30 / 10 + local30 % 10 + ":" + local34 / 10 + local34 % 10;
		@Pc(73) String[] local73 = Static175.method3185('\n', arg0);
		for (@Pc(75) int local75 = 0; local75 < local73.length; local75++) {
			for (@Pc(78) int local78 = Static295.anInt10019; local78 > 0; local78--) {
				Static573.aStringArray70[local78] = Static573.aStringArray70[local78 - 1];
			}
			Static573.aStringArray70[0] = local68 + ": " + local73[local75];
			if (Static414.aFileOutputStream1 != null) {
				try {
					Static414.aFileOutputStream1.write(Static293.method5079(Static573.aStringArray70[0] + "\n"));
				} catch (@Pc(123) IOException local123) {
				}
			}
			if (Static573.aStringArray70.length - 1 > Static295.anInt10019) {
				Static295.anInt10019++;
				if (Static282.anInt4641 > 0) {
					Static282.anInt4641++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIII)V")
	public static void method1377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static68.anInt1112; local8++) {
			@Pc(14) Rectangle local14 = Class1_Sub4_Sub2_Sub3.aRectangleArray2[local8];
			if (local14.width + local14.x > arg3 && arg3 + arg1 > local14.x && arg0 < local14.height + local14.y && local14.y < arg2 + arg0) {
				Static261.aBooleanArray18[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1379(@OriginalArg(1) String arg0) {
		return Static569.method8148(arg0, 10);
	}
}
