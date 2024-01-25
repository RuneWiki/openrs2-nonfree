import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
	public static final int[] anIntArray501 = new int[3];

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Z")
	public static boolean aBoolean642 = false;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7383(@OriginalArg(0) long arg0) {
		Static494.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static494.aCalendar2.get(7);
		@Pc(17) int local17 = Static494.aCalendar2.get(5);
		@Pc(21) int local21 = Static494.aCalendar2.get(2);
		@Pc(25) int local25 = Static494.aCalendar2.get(1);
		@Pc(29) int local29 = Static494.aCalendar2.get(11);
		@Pc(38) int local38 = Static494.aCalendar2.get(12);
		@Pc(42) int local42 = Static494.aCalendar2.get(13);
		return Static481.aStringArray27[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static41.aStringArray4[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLclient!lba;)V")
	public static void method7386(@OriginalArg(1) Class15_Sub7 arg0) {
		arg0.aClass15_Sub1_14 = null;
		@Pc(12) int local12 = arg0.aClass15_Sub6Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass15_Sub6Array1[local14].aBoolean394 = false;
		}
		@Pc(37) Class123[] local37 = Class20_Sub2.aClass123Array1;
		synchronized (Class20_Sub2.aClass123Array1) {
			if (local12 < Class20_Sub2.aClass123Array1.length && Static237.anIntArray314[local12] < 200) {
				Class20_Sub2.aClass123Array1[local12].method3539(arg0);
				@Pc(60) int local60 = Static237.anIntArray314[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lclient!caa;")
	public static Class48 method7387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class48 local7 = new Class48();
		local7.anInt1890 = arg1 + 5 + 1;
		local7.anInt1884 = -1;
		local7.anInt1886 = -1;
		local7.anInt1892 = arg0 + 6;
		local7.anIntArrayArray3 = new int[local7.anInt1890][local7.anInt1892];
		local7.method1636();
		return local7;
	}
}
