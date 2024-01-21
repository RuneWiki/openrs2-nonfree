import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
	public static int anInt498;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	public static int anInt493 = 0;

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_8 = new Class8(64);

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_199 = Static161.method2452("title_mute");

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
	public static int anInt497 = 0;

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_200 = Static161.method2452("overlay)3dat");

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "[I")
	public static final int[] anIntArray34 = new int[50];

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V")
	public static void method405() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILclient!ia;IJIIII)Z")
	public static boolean method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static80.method1411(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI[II)V")
	public static void method409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (local15 > arg3) {
			@Pc(19) int local19 = arg3 + 1;
			arg2[local19] = arg1;
			@Pc(24) int local24 = local19 + 1;
			arg2[local24] = arg1;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg1;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg1;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg1;
			arg3 = local49 + 1;
			arg2[arg3] = arg1;
		}
		while (local12 > arg3) {
			arg3++;
			arg2[arg3] = arg1;
		}
	}
}
