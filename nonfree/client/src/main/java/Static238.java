import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!hq", name = "vc", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZZ)V")
	public static void method3722(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static666.anInt10679++;
			Static592.method8119();
		}
		if (arg0) {
			Static205.anInt1048++;
			Static194.method3229();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIII)V")
	public static void method3724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(15) int local15 = arg3 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static312.method4929(arg2, arg0, arg1, arg3);
			}
		} else if (local15 == 0) {
			Static450.method6502(arg2, arg4, arg1, arg0);
		} else {
			@Pc(44) int local44 = (local15 << 12) / local10;
			@Pc(53) int local53 = arg1 - (arg0 * local44 >> 12);
			@Pc(69) int local69;
			@Pc(78) int local78;
			if (Static106.anInt2266 > arg4) {
				local69 = Static106.anInt2266;
				local78 = local53 + (Static106.anInt2266 * local44 >> 12);
			} else if (arg4 > Static669.anInt10712) {
				local69 = Static669.anInt10712;
				local78 = local53 + (Static669.anInt10712 * local44 >> 12);
			} else {
				local78 = arg3;
				local69 = arg4;
			}
			@Pc(120) int local120;
			@Pc(118) int local118;
			if (arg0 < Static106.anInt2266) {
				local120 = Static106.anInt2266;
				local118 = (local44 * Static106.anInt2266 >> 12) + local53;
			} else if (arg0 > Static669.anInt10712) {
				local118 = (local44 * Static669.anInt10712 >> 12) + local53;
				local120 = Static669.anInt10712;
			} else {
				local120 = arg0;
				local118 = arg1;
			}
			if (Static639.anInt10384 > local118) {
				local120 = (Static639.anInt10384 - local53 << 12) / local44;
				local118 = Static639.anInt10384;
			} else if (local118 > Static496.anInt8305) {
				local120 = (Static496.anInt8305 - local53 << 12) / local44;
				local118 = Static496.anInt8305;
			}
			if (local78 < Static639.anInt10384) {
				local69 = (Static639.anInt10384 - local53 << 12) / local44;
				local78 = Static639.anInt10384;
			} else if (local78 > Static496.anInt8305) {
				local78 = Static496.anInt8305;
				local69 = (Static496.anInt8305 - local53 << 12) / local44;
			}
			Static666.method8874(local69, local120, arg2, local78, local118);
		}
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(III)Z")
	public static boolean method3726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "(I)Z")
	public static boolean method3729() {
		try {
			@Pc(15) Class222 local15 = new Class222();
			@Pc(20) byte[] local20 = local15.method5416(Static524.aByteArray83);
			Static67.method916(local20);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}
}
