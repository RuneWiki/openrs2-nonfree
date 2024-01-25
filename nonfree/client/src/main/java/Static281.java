import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static int anInt5700 = 2;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[B")
	public static final byte[] aByteArray68 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I")
	public static int method5073(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIBIII)V")
	public static void method5074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0 + arg4;
		@Pc(14) int local14 = arg5 - arg4;
		for (@Pc(16) int local16 = arg0; local16 < local9; local16++) {
			Static205.method3670(arg2, arg3, Static146.anIntArrayArray91[local16], arg6);
		}
		for (@Pc(32) int local32 = arg5; local32 > local14; local32--) {
			Static205.method3670(arg2, arg3, Static146.anIntArrayArray91[local32], arg6);
		}
		@Pc(62) int local62 = arg3 - arg4;
		@Pc(66) int local66 = arg6 + arg4;
		for (@Pc(68) int local68 = local9; local68 <= local14; local68++) {
			@Pc(74) int[] local74 = Static146.anIntArrayArray91[local68];
			Static205.method3670(arg2, local66, local74, arg6);
			Static205.method3670(arg1, local62, local74, local66);
			Static205.method3670(arg2, arg3, local74, local62);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method5075() {
		@Pc(1) Class119 local1 = Static322.aClass119_196;
		synchronized (Static322.aClass119_196) {
			Static322.aClass119_196.method3304();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(BI)V")
	public static void method5076(@OriginalArg(1) int arg0) {
		Static335.aClass119_205 = new Class119(arg0);
	}
}
