import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
	public static int anInt5552;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Lclient!jm;")
	public static final Class160 aClass160_6 = new Class160(1);

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "Lclient!jm;")
	public static final Class160 aClass160_7 = new Class160(2);

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "Lclient!jm;")
	public static final Class160 aClass160_8 = new Class160(4);

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Lclient!jm;")
	public static final Class160 aClass160_9 = new Class160(1);

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Lclient!jm;")
	public static final Class160 aClass160_10 = new Class160(2);

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Lclient!jm;")
	public static final Class160 aClass160_11 = new Class160(4);

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Lclient!jm;")
	public static final Class160 aClass160_12 = new Class160(2);

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!jm;")
	public static final Class160 aClass160_13 = new Class160(4);

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	public static int anInt5551 = -1;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
	public static int anInt5553 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)V")
	public static void method4552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > arg2) {
			Static36.method1264(Static632.anIntArrayArray65[arg3], arg2, arg1, arg0);
		} else {
			Static36.method1264(Static632.anIntArrayArray65[arg3], arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!oh;Lclient!nc;Lclient!oh;Lclient!oh;BLclient!dia;)Z")
	public static boolean method4553(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Class237 arg3, @OriginalArg(5) Class8_Sub16_Sub1 arg4) {
		Static26.anIntArray32 = new int[16];
		Static505.aClass80_2 = arg1;
		Static423.aClass237_110 = arg0;
		Static56.aClass237_17 = arg2;
		Static370.aClass237_100 = arg3;
		Static608.aClass8_Sub16_Sub1_4 = arg4;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static26.anIntArray32[local25] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
	public static int method4554(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIBII)V")
	public static void method4556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg6 - arg2;
		@Pc(14) int local14 = arg2 + arg1;
		for (@Pc(16) int local16 = arg1; local16 < local14; local16++) {
			Static36.method1264(Static632.anIntArrayArray65[local16], arg0, arg5, arg3);
		}
		@Pc(38) int local38 = arg0 + arg2;
		@Pc(43) int local43 = arg3 - arg2;
		for (@Pc(45) int local45 = arg6; local45 > local10; local45--) {
			Static36.method1264(Static632.anIntArrayArray65[local45], arg0, arg5, arg3);
		}
		for (@Pc(65) int local65 = local14; local65 <= local10; local65++) {
			@Pc(71) int[] local71 = Static632.anIntArrayArray65[local65];
			Static36.method1264(local71, arg0, arg5, local38);
			Static36.method1264(local71, local38, arg4, local43);
			Static36.method1264(local71, local43, arg5, arg3);
		}
	}
}
