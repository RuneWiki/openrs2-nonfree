import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "J")
	public static long aLong138;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	public static int anInt2969;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!ih;")
	public static Class39 aClass39_3;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	public static int anInt2973;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1659 = Static122.method531("b12_full");

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Z")
	public static boolean aBoolean197 = false;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!sd;Z)V")
	public static void method2164(@OriginalArg(0) Class73 arg0) {
		if (Static139.aClass3_Sub5Array2 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(19) long local19 = arg0.method2425();
		if (local19 == 0L) {
			return;
		}
		while (local15 < Static139.aClass3_Sub5Array2.length && Static139.aClass3_Sub5Array2[local15].aLong183 != local19) {
			local15++;
		}
		if (Static139.aClass3_Sub5Array2.length > local15 && Static139.aClass3_Sub5Array2[local15] != null) {
			Static139.aClass3_Sub12_Sub1_3.method1400(113);
			Static139.aClass3_Sub12_Sub1_3.method1382(Static139.aClass3_Sub5Array2[local15].aLong183);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
	public static boolean method2165() {
		return Static137.anInt3105 == 0 ? Static147.aClass3_Sub9_Sub2_2.method916() : true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
	public static void method2166(@OriginalArg(0) int arg0) {
		if (!Static150.method2586(arg0)) {
			return;
		}
		@Pc(21) Class83[] local21 = Static57.aClass83ArrayArray1[arg0];
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(29) Class83 local29 = local21[local23];
			if (local29 != null) {
				local29.anInt3693 = 0;
				local29.anInt3688 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method2167() {
		@Pc(1) Object local1 = Static79.anObject3;
		synchronized (Static79.anObject3) {
			if (Static29.anInt759 != 0) {
				Static29.anInt759 = 1;
				try {
					Static79.anObject3.wait();
				} catch (@Pc(11) InterruptedException local11) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public static void method2168() {
		aClass39_3 = null;
		aClass73_1659 = null;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	public static void method2169() {
		while (true) {
			@Pc(9) Class72 local9 = Static124.aClass72_39;
			@Pc(16) Class3_Sub19 local16;
			synchronized (Static124.aClass72_39) {
				local16 = (Class3_Sub19) Static107.aClass72_34.method2406();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass13_Sub1_17.method373(false, local16.aClass43_4, local16.aByteArray35, (int) local16.aLong183);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBI)I")
	public static int method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return (arg2 / 4 << 10) + (arg0 / 32 << 7) + arg1 / 2;
	}
}
