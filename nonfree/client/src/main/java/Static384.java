import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!or", name = "x", descriptor = "Lclient!vo;")
	public static Class348 aClass348_92;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	public static int anInt7552 = -1;

	@OriginalMember(owner = "client!or", name = "A", descriptor = "I")
	public static int anInt7556 = 0;

	@OriginalMember(owner = "client!or", name = "J", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_7 = new Class357();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public static void method5949(@OriginalArg(1) int arg0) {
		Static496.anInt9330 = arg0;
		@Pc(7) Class167 local7 = Static580.aClass167_36;
		synchronized (Static580.aClass167_36) {
			Static580.aClass167_36.method3961();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lclient!ep;")
	public static Class4_Sub6_Sub5 method5950() {
		@Pc(14) Class4_Sub6_Sub5 local14 = (Class4_Sub6_Sub5) Static238.aClass120_5.method2674();
		if (local14 != null) {
			local14.method8193();
			local14.method7880();
			return local14;
		}
		do {
			local14 = (Class4_Sub6_Sub5) Static457.aClass120_9.method2674();
			if (local14 == null) {
				return null;
			}
			if (local14.method2305() > Static112.method2047()) {
				return null;
			}
			local14.method8193();
			local14.method7880();
		} while ((Long.MIN_VALUE & local14.aLong286) == 0L);
		return local14;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(II)I")
	public static int method5951(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(IB)V")
	public static void method5952(@OriginalArg(0) int arg0) {
		Static303.anInt6100 = arg0;
		@Pc(12) Class167 local12 = Static526.aClass167_59;
		synchronized (Static526.aClass167_59) {
			Static526.aClass167_59.method3961();
		}
		local12 = Static461.aClass167_48;
		synchronized (Static461.aClass167_48) {
			Static461.aClass167_48.method3961();
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(IB)V")
	public static void method5953() {
		Static228.aClass167_18.method3964(5);
	}
}
