import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt2803;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "[Lclient!ge;")
	public static final Class69[] aClass69Array1 = new Class69[29];

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!qj;ILclient!qj;)V")
	public static void method2716(@OriginalArg(0) Class165 arg0, @OriginalArg(2) Class165 arg1) {
		Static24.aClass165_7 = arg0;
		Static172.aClass165_90 = arg1;
		Static229.anInt1683 = Static24.aClass165_7.method4499(3);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)I")
	public static int method2718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg1 & arg2 - 1;
		@Pc(33) int local33 = Static11.method4795(local7, local17);
		@Pc(40) int local40 = Static11.method4795(local7 + 1, local17);
		@Pc(47) int local47 = Static11.method4795(local7, local17 + 1);
		@Pc(56) int local56 = Static11.method4795(local7 + 1, local17 + 1);
		@Pc(63) int local63 = Static207.method3717(local33, arg2, local40, local13);
		@Pc(70) int local70 = Static207.method3717(local47, arg2, local56, local13);
		return Static207.method3717(local63, arg2, local70, local23);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Lclient!dq;")
	public static Class43 method2719(@OriginalArg(1) int arg0) {
		@Pc(5) Class140 local5 = Static44.aClass140_25;
		@Pc(14) Class43 local14;
		synchronized (Static44.aClass140_25) {
			local14 = (Class43) Static44.aClass140_25.method3816((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static62.aClass165_23.method4508(arg0, 16);
		local14 = new Class43();
		if (local30 != null) {
			local14.method1392(new Class1_Sub7(local30));
		}
		@Pc(45) Class140 local45 = Static44.aClass140_25;
		synchronized (Static44.aClass140_25) {
			Static44.aClass140_25.method3817((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLclient!sh;)V")
	public static void method2720(@OriginalArg(0) int arg0, @OriginalArg(2) Class186 arg1) {
		if (Static105.aBoolean182) {
			Static105.aBoolean182 = false;
			arg0 = 0;
		}
		if (Static145.aClass186_2 != null && Static145.aClass186_2.method4879(arg1)) {
			return;
		}
		Static145.aClass186_2 = arg1;
		Static350.aLong214 = Static349.method5647();
		Static223.anInt4434 = arg0;
		Static48.anInt1103 = arg0;
		if (Static48.anInt1103 != 0) {
			Static79.aFloat77 = Static55.aFloat24;
			Static57.aFloat26 = Static137.aFloat66;
			Static86.aFloat33 = Static207.aFloat82;
			Static7.anInt159 = Static20.anInt413;
			Static315.aFloat114 = Static96.aFloat120;
			Static88.anInt1744 = Static276.anInt5378;
			Static113.aFloat41 = Static25.aFloat6;
			Static261.aClass113_3 = Static56.aClass113_1;
			Static86.aFloat34 = Static332.aFloat116;
			Static62.anInt1356 = Static172.anInt5801;
			return;
		}
		Static11.method4796();
	}
}
