import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "S")
	public static short aShort95 = 32767;

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "Lclient!an;")
	public static final Class20 aClass20_14 = new Class20(7, 5);

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)V")
	public static void method5965(@OriginalArg(0) int arg0) {
		Static618.anInt10216 = arg0;
		@Pc(12) Class112 local12 = Static185.aClass112_20;
		synchronized (Static185.aClass112_20) {
			Static185.aClass112_20.method3638();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
	public static void method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static513.anInt9000 = arg1;
		Static190.anInt4448 = arg4;
		Static552.anInt9439 = arg3;
		Static184.anInt4365 = arg0;
		Static227.anInt5145 = arg2;
		if (Static513.anInt9000 >= 100) {
			@Pc(29) int local29 = Static227.anInt5145 * 512 + 256;
			@Pc(35) int local35 = Static184.anInt4365 * 512 + 256;
			@Pc(43) int local43 = Static202.method3958(local35, Static552.anInt9440, local29) - Static552.anInt9439;
			@Pc(48) int local48 = local29 - Static465.anInt8425;
			@Pc(52) int local52 = local43 - Static641.anInt10516;
			@Pc(57) int local57 = local35 - Static289.anInt5908;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local57 * local57 + local48 * local48));
			Static299.anInt8877 = (int) (Math.atan2((double) local52, (double) local68) * 2607.5945876176133D) & 0x3FFF;
			Static166.anInt3989 = (int) (Math.atan2((double) local48, (double) local57) * -2607.5945876176133D) & 0x3FFF;
			if (Static299.anInt8877 < 1024) {
				Static299.anInt8877 = 1024;
			}
			Static136.anInt3505 = 0;
			if (Static299.anInt8877 > 3072) {
				Static299.anInt8877 = 3072;
			}
		}
		Static155.anInt3810 = -1;
		Static531.anInt9157 = -1;
		Static516.anInt9019 = 2;
	}
}
