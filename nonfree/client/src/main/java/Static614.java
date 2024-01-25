import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!um", name = "e", descriptor = "I")
	public static int anInt10205;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "[I")
	public static int[] anIntArray542;

	@OriginalMember(owner = "client!um", name = "j", descriptor = "I")
	public static int anInt10208 = -1;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIJILclient!aa;Lclient!ofa;II)V")
	public static void method8320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) Class265 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg3 * arg3;
		if ((long) local11 > arg2) {
			return;
		}
		@Pc(27) int local27 = Math.min(arg5.anInt7024 / 2, arg5.anInt6997 / 2);
		if (local27 * local27 >= local11) {
			Static429.method5923(arg0, arg3, arg6, arg1, arg5, arg4, Static656.aClass6Array14[arg7]);
			return;
		}
		local27 -= 10;
		@Pc(68) int local68;
		if (Static451.anInt7263 == 4) {
			local68 = (int) Static318.aFloat81 & 0x3FFF;
		} else {
			local68 = Static234.anInt4142 + (int) Static318.aFloat81 & 0x3FFF;
		}
		@Pc(81) int local81 = Class94.anIntArray561[local68];
		@Pc(85) int local85 = Class94.anIntArray560[local68];
		if (Static451.anInt7263 != 4) {
			local81 = local81 * 256 / (Static30.anInt1549 + 256);
			local85 = local85 * 256 / (Static30.anInt1549 + 256);
		}
		@Pc(116) int local116 = local85 * arg3 + local81 * arg0 >> 14;
		@Pc(127) int local127 = arg0 * local85 - arg3 * local81 >> 14;
		@Pc(133) double local133 = Math.atan2((double) local116, (double) local127);
		@Pc(140) int local140 = (int) ((double) local27 * Math.sin(local133));
		@Pc(147) int local147 = (int) ((double) local27 * Math.cos(local133));
		Static35.aClass6Array2[arg7].method5126((float) arg5.anInt7024 / 2.0F + (float) arg6 + (float) local140, (float) -local147 + (float) arg1 + (float) arg5.anInt6997 / 2.0F, 4096, (int) (-local133 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Z")
	public static boolean method8321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	public static void method8323(@OriginalArg(1) int arg0) {
		Static678.anInt10941 = arg0;
		Static145.aClass295_11.method6464();
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
	public static int method8324() {
		return Static471.anInt7481 == 1 ? Static212.anInt3685 : 0;
	}
}
