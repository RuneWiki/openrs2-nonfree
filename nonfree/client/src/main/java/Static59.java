import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_26 = new Class265(15, 2);

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_32 = new Class209("M", "M", "M", "M");

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public static int anInt1327 = 0;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!mg;IBII)V")
	public static void method1150(@OriginalArg(1) Class160 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static263.aBoolean350 = false;
		Static436.anInt7186 = 0;
		Static237.anInt4548 = 1;
		Static332.anInt5719 = 10000;
		Static237.anInt4547 = arg2;
		Static74.aClass160_9 = arg0;
		Static71.anInt1577 = arg1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[Ljava/lang/String;B[SI)V")
	public static void method1151(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg3) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) short local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg3; local46++) {
			if (local20 == null || arg1[local46] != null && arg1[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(67) String local67 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local67;
				@Pc(81) short local81 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local81;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method1151(arg0, arg1, arg2, local16 - 1);
		method1151(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILclient!em;)V")
	public static void method1152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2) {
		@Pc(12) Class73 local12 = arg2.method1751(Static33.aClass49_1);
		if (local12 == null) {
			return;
		}
		Static33.aClass49_1.OA(arg0, arg1, arg2.anInt2188 + arg0, arg2.anInt2252 + arg1);
		if (Static393.anInt6568 >= 3) {
			Static33.aClass49_1.ca(-16777216, local12, arg0, arg1);
		} else {
			Static147.aClass17_50.method5769((float) arg0 + (float) arg2.anInt2188 / 2.0F, (float) arg2.anInt2252 / 2.0F + (float) arg1, ((int) -Static202.aFloat62 & 0x3FFF) << 2, local12, arg0, arg1);
		}
	}
}
