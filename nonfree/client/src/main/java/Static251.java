import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public static int anInt3169;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
	public static int anInt3170;

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "Z")
	public static boolean aBoolean207 = true;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "[Lclient!ih;")
	public static final Class91[] aClass91Array2 = new Class91[50];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method2944(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I")
	public static int method2945(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local27 >> 12) + 40960;
		return local13 * local35 >> 12;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIII)V")
	public static void method2947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = Static222.method3991(arg3, Static112.anInt2485, Static32.anInt750);
		@Pc(15) int local15 = Static222.method3991(arg0, Static112.anInt2485, Static32.anInt750);
		@Pc(21) int local21 = Static222.method3991(arg4, Static275.anInt5244, Static6.anInt136);
		@Pc(27) int local27 = Static222.method3991(arg2, Static275.anInt5244, Static6.anInt136);
		for (@Pc(34) int local34 = local9; local34 <= local15; local34++) {
			Static27.method690(local27, Static104.anIntArrayArray31[local34], arg1, local21);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!sn;III)V")
	public static void method2948(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static162.aClass188ArrayArray1[arg2][arg1] = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)I")
	public static int method2949(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
