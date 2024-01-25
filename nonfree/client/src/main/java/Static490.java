import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_82 = new Class286(66, 1);

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "Lclient!av;")
	public static Class20 aClass20_15 = null;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
	public static final int[] anIntArray463 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)V")
	public static void method7105(@OriginalArg(0) int arg0) {
		Static124.anInt2384 = arg0;
		@Pc(12) Class338 local12 = Static30.aClass338_1;
		synchronized (Static30.aClass338_1) {
			Static30.aClass338_1.method8051();
		}
		local12 = Static381.aClass338_35;
		synchronized (Static381.aClass338_35) {
			Static381.aClass338_35.method8051();
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)I")
	public static int method7106() {
		return Static284.anInt5151;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!kr;IILclient!qk;IIIIBIII)V")
	public static void method7107(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class304 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static188.anInt3326 = arg6;
		Static294.anInt5250 = arg5;
		Static6.anInt103 = arg8;
		Static201.anInt3514 = arg7;
		Static713.anInt11126 = arg2;
		Static200.aClass304_10 = arg3;
		Static451.anInt7960 = arg1;
		Static552.aClass194_1 = null;
		Static79.anInt1238 = arg10;
		Static130.anInt2443 = arg4;
		Static713.aClass194_3 = null;
		Static702.aClass194_2 = null;
		Static54.anInt9752 = arg9;
		Static417.aClass216_10 = arg0;
		Static5.method84();
		Static6.aBoolean4 = true;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(JZ)V")
	public static void method7108(@OriginalArg(0) long arg0) {
		Static321.aCalendar10.setTime(new Date(arg0));
	}
}
