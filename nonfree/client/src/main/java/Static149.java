import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
	public static int anInt2725;

	@OriginalMember(owner = "client!fca", name = "B", descriptor = "Lclient!nh;")
	public static Class92 aClass92_2;

	@OriginalMember(owner = "client!fca", name = "w", descriptor = "I")
	public static int anInt2728 = 0;

	@OriginalMember(owner = "client!fca", name = "z", descriptor = "Z")
	public static final boolean aBoolean199 = false;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method2598(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static211.method8993(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(40) int local40;
			do {
				local40 = arg0.nextInt();
			} while (local37 <= local40);
			return Static130.method2322(local40, arg1);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BLclient!qh;)V")
	public static void method2599(@OriginalArg(1) Class4_Sub5_Sub17 arg0) {
		if (Static333.aBoolean400) {
			return;
		}
		arg0.method9000();
		Static574.anInt8895--;
		if (!arg0.aBoolean600) {
			@Pc(82) long local82 = arg0.aLong225;
			@Pc(88) Class4_Sub5_Sub12 local88;
			for (local88 = (Class4_Sub5_Sub12) Static205.aClass66_16.method1994(local82); local88 != null && !local88.aString45.equals(arg0.aString97); local88 = (Class4_Sub5_Sub12) Static205.aClass66_16.method1991()) {
			}
			if (local88 != null && local88.method4192(arg0)) {
				Static506.method6898(local88);
			}
			return;
		}
		for (@Pc(27) Class4_Sub5_Sub12 local27 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8308(); local27 != null; local27 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8309()) {
			if (local27.aString45.equals(arg0.aString97)) {
				@Pc(37) boolean local37 = false;
				for (@Pc(43) Class4_Sub5_Sub17 local43 = (Class4_Sub5_Sub17) local27.aClass367_5.method8308(); local43 != null; local43 = (Class4_Sub5_Sub17) local27.aClass367_5.method8309()) {
					if (arg0 == local43) {
						if (local27.method4192(arg0)) {
							Static506.method6898(local27);
						}
						local37 = true;
						break;
					}
				}
				if (local37) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(JIBZ)Ljava/lang/String;")
	public static String method2600(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static367.method4842(arg0);
		@Pc(10) Calendar local10 = Static33.aCalendar25;
		@Pc(21) int local21 = local10.get(5);
		@Pc(27) int local27 = local10.get(2) + 1;
		@Pc(31) int local31 = local10.get(1);
		@Pc(44) int local44 = local10.get(11);
		@Pc(48) int local48 = local10.get(12);
		return Integer.toString(local21 / 10) + local21 % 10 + "/" + local27 / 10 + local27 % 10 + "/" + local31 % 100 / 10 + local31 % 10 + " " + local44 / 10 + local44 % 10 + ":" + local48 / 10 + local48 % 10;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIB)Z")
	public static boolean method2602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)V")
	public static void method2603() {
		Static518.anInt10290 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static57.aClass4_Sub11Array1[local9] = null;
			Static175.aByteArray38[local9] = 1;
			Static58.aClass228Array1[local9] = null;
		}
	}
}
