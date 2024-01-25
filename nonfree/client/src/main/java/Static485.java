import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
	public static int anInt8563 = -50;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I[ILclient!ac;I[IB)Lclient!nc;")
	public static Class1_Sub3 method7133(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class5_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg0 * arg3];
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg3 * local17 + arg1[local17];
			for (@Pc(29) int local29 = 0; local29 < arg4[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class1_Sub3(arg2, arg3, arg0, local15);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
	public static void method7134() {
		Static142.aClass4_10 = null;
		Static49.anInt1670 = -1;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIIII)V")
	public static void method7135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(20) int local20 = arg2 - arg3;
		if (local10 == 0) {
			if (local20 != 0) {
				Static624.method8537(arg4, arg3, arg2, arg1);
			}
		} else if (local20 == 0) {
			Static550.method7731(arg1, arg4, arg0, arg3);
		} else {
			@Pc(49) int local49 = (local20 << 12) / local10;
			@Pc(58) int local58 = arg3 - (local49 * arg4 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (arg0 < Static309.anInt6227) {
				local73 = local58 + (local49 * Static309.anInt6227 >> 12);
				local75 = Static309.anInt6227;
			} else if (arg0 > Static7.anInt464) {
				local75 = Static7.anInt464;
				local73 = local58 + (Static7.anInt464 * local49 >> 12);
			} else {
				local75 = arg0;
				local73 = arg2;
			}
			@Pc(110) int local110;
			@Pc(108) int local108;
			if (Static309.anInt6227 > arg4) {
				local108 = local58 + (local49 * Static309.anInt6227 >> 12);
				local110 = Static309.anInt6227;
			} else if (arg4 > Static7.anInt464) {
				local108 = local58 + (local49 * Static7.anInt464 >> 12);
				local110 = Static7.anInt464;
			} else {
				local108 = arg3;
				local110 = arg4;
			}
			if (Static633.anInt10644 > local73) {
				local73 = Static633.anInt10644;
				local75 = (Static633.anInt10644 - local58 << 12) / local49;
			} else if (Static389.anInt7300 < local73) {
				local75 = (Static389.anInt7300 - local58 << 12) / local49;
				local73 = Static389.anInt7300;
			}
			if (Static633.anInt10644 > local108) {
				local108 = Static633.anInt10644;
				local110 = (Static633.anInt10644 - local58 << 12) / local49;
			} else if (local108 > Static389.anInt7300) {
				local108 = Static389.anInt7300;
				local110 = (Static389.anInt7300 - local58 << 12) / local49;
			}
			Static164.method3158(arg1, local108, local73, local75, local110);
		}
	}
}
