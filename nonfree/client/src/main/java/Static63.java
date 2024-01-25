import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
	public static int anInt991 = 0;

	@OriginalMember(owner = "client!bu", name = "K", descriptor = "Lclient!pc;")
	public static final Class281 aClass281_1 = new Class281();

	@OriginalMember(owner = "client!bu", name = "B", descriptor = "Lclient!qk;")
	public static final Class304 aClass304_6 = new Class304();

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method794(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static28.method398(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(40) int local40 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(43) int local43;
			do {
				local43 = arg1.nextInt();
			} while (local40 <= local43);
			return Static119.method2060(local43, arg0);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIZIII)V")
	public static void method795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static537.aClass79Array4[Static629.anInt10181++] = new Class79(4, arg1, arg5, arg6, arg6, arg5, arg4, arg3, arg3, arg4, arg2, arg2, arg0, arg0);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ID)V")
	public static void method796(@OriginalArg(1) double arg0) {
		if (arg0 == Static655.aDouble25) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(21) int local21 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static359.anIntArray345[local7] = local21 > 255 ? 255 : local21;
		}
		Static655.aDouble25 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "(B)V")
	public static void method797() {
		for (@Pc(15) Class3_Sub49 local15 = (Class3_Sub49) Static352.aClass357_30.method8391(); local15 != null; local15 = (Class3_Sub49) Static352.aClass357_30.method8392()) {
			if (local15.aBoolean719) {
				local15.method8352();
			}
		}
		for (@Pc(39) Class3_Sub49 local39 = (Class3_Sub49) Static627.aClass357_58.method8391(); local39 != null; local39 = (Class3_Sub49) Static627.aClass357_58.method8392()) {
			if (local39.aBoolean719) {
				local39.method8352();
			}
		}
	}
}
