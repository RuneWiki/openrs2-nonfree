import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	public static int anInt1703 = 0;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_64 = new Class184(83, 8);

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_65 = new Class184(7, 12);

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Z")
	public static boolean method1395() {
		return Static347.anInt6319 == 0 ? Static408.aClass3_Sub5_Sub1_118.method3634() : true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)I")
	public static int method1396(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >>> 1;
		@Pc(20) int local20 = local14 | local14 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 2;
		@Pc(32) int local32 = local26 | local26 >>> 4;
		@Pc(38) int local38 = local32 | local32 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return ~local44 & arg0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method1397(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static287.anInt5248 = 7;
		Static122.anInt2633 = 0x1 << Static287.anInt5248;
		Static340.anInt6290 = Static122.anInt2633 >> 1;
		Static262.anInt4964 = (int) Math.sqrt((double) (Static340.anInt6290 * Static340.anInt6290 + Static340.anInt6290 * Static340.anInt6290));
		Static237.anInt4556 = Static122.anInt2633 >> 2;
		Static126.anInt3501 = Static122.anInt2633;
		Static177.anInt3621 = arg0;
		Static57.anInt1411 = arg1;
		Static251.anInt4730 = arg2;
		Static9.aClass217ArrayArrayArray1 = new Class217[4][Static177.anInt3621][Static57.anInt1411];
		Static205.aClass64Array2 = new Class64[4];
		if (arg3) {
			Static336.anIntArrayArray50 = new int[Static177.anInt3621][Static57.anInt1411];
			Static44.aByteArrayArray21 = new byte[Static177.anInt3621][Static57.anInt1411];
			Static215.aByteArrayArray13 = new byte[Static177.anInt3621][Static57.anInt1411];
			Static93.aClass217ArrayArrayArray2 = new Class217[1][Static177.anInt3621][Static57.anInt1411];
			Static401.aClass64Array3 = new Class64[1];
		} else {
			Static336.anIntArrayArray50 = null;
			Static44.aByteArrayArray21 = null;
			Static215.aByteArrayArray13 = null;
			Static93.aClass217ArrayArrayArray2 = null;
			Static401.aClass64Array3 = null;
		}
		if (arg4) {
			Static341.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static303.aClass54Array1 = new Class54[65535];
			Static35.aBooleanArray19 = new boolean[65535];
			Static298.anInt5454 = 0;
		} else {
			Static341.aLongArrayArrayArray1 = null;
			Static303.aClass54Array1 = null;
			Static35.aBooleanArray19 = null;
			Static298.anInt5454 = 0;
		}
		Static41.method922(false);
		Static35.aClass70Array3 = new Class70[1000];
		Static396.anInt6816 = 0;
		Static201.aClass70Array2 = new Class70[1000];
		Static127.anInt2697 = 0;
		Static92.anIntArrayArrayArray9 = new int[4][Static177.anInt3621 + 1][Static57.anInt1411 + 1];
		Static36.aClass1_Sub3Array1 = new Class1_Sub3[5000];
		Static389.anInt6739 = 0;
		Static200.aBooleanArrayArray2 = new boolean[Static251.anInt4730 + Static251.anInt4730 + 1][Static251.anInt4730 + Static251.anInt4730 + 1];
		Static435.aBooleanArrayArray6 = new boolean[Static251.anInt4730 + Static251.anInt4730 + 2][Static251.anInt4730 + Static251.anInt4730 + 2];
		Static137.aClass6_1 = null;
	}
}
