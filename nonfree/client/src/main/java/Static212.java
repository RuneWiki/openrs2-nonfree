import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!nl", name = "S", descriptor = "Lclient!nq;")
	public static Class144 aClass144_66;

	@OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
	public static int anInt4348;

	@OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
	public static int anInt4349;

	@OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
	public static int anInt4350;

	@OriginalMember(owner = "client!nl", name = "X", descriptor = "[[[Lclient!jd;")
	public static Class106[][][] aClass106ArrayArrayArray2;

	@OriginalMember(owner = "client!nl", name = "Y", descriptor = "Lclient!nq;")
	public static Class144 aClass144_67;

	@OriginalMember(owner = "client!nl", name = "K", descriptor = "Z")
	public static boolean aBoolean292 = true;

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
	public static int anInt4343 = 0;

	@OriginalMember(owner = "client!nl", name = "N", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_40 = new Class26(64);

	@OriginalMember(owner = "client!nl", name = "T", descriptor = "[I")
	public static final int[] anIntArray336 = new int[256];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V")
	public static void method3826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (aClass106ArrayArrayArray2 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg1 << 14 | arg0 << 28 | arg2);
		@Pc(25) Class11_Sub40 local25 = (Class11_Sub40) Static301.aClass58_35.method1009(local19);
		if (local25 == null) {
			Static20.method301(arg0, arg2, arg1);
			return;
		}
		@Pc(46) Class11_Sub29 local46 = (Class11_Sub29) local25.aClass16_53.method193();
		if (local46 == null) {
			Static20.method301(arg0, arg2, arg1);
			return;
		}
		@Pc(60) Class67_Sub5_Sub1 local60 = (Class67_Sub5_Sub1) Static20.method301(arg0, arg2, arg1);
		if (local60 == null) {
			local60 = new Class67_Sub5_Sub1();
		} else {
			local60.anInt5558 = local60.anInt5554 = -1;
		}
		local60.anInt5548 = local46.anInt4569;
		local60.anInt5561 = local46.anInt4574;
		label44: while (true) {
			@Pc(88) Class11_Sub29 local88 = (Class11_Sub29) local25.aClass16_53.method188();
			if (local88 == null) {
				break;
			}
			if (local88.anInt4569 != local60.anInt5548) {
				local60.anInt5557 = local88.anInt4574;
				local60.anInt5558 = local88.anInt4569;
				while (true) {
					@Pc(113) Class11_Sub29 local113 = (Class11_Sub29) local25.aClass16_53.method188();
					if (local113 == null) {
						break label44;
					}
					if (local113.anInt4569 != local60.anInt5548 && local113.anInt4569 != local60.anInt5558) {
						local60.anInt5554 = local113.anInt4569;
						local60.anInt5552 = local113.anInt4574;
					}
				}
			}
		}
		@Pc(157) int local157 = Static168.method2721((arg2 << 7) + 64, arg0, (arg1 << 7) + 64);
		Static13.method185(arg0, arg2, arg1, local157, local60);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)Lclient!be;")
	public static Class23 method3827(@OriginalArg(0) int arg0) {
		@Pc(10) Class23 local10 = (Class23) Static216.aClass26_52.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static189.aClass144_13.method3896(arg0, 36);
		local10 = new Class23();
		local10.anInt289 = arg0;
		if (local28 != null) {
			local10.method242(new Class11_Sub25(local28));
		}
		local10.method249();
		Static216.aClass26_52.method330((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V")
	public static void method3828(@OriginalArg(0) int arg0) {
		@Pc(10) Class11_Sub4_Sub12 local10 = Static35.method512(14, arg0);
		local10.method3864();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V")
	public static void method3830(@OriginalArg(0) int arg0) {
		Static130.anInt4676 = arg0;
		@Pc(7) Class26 local7 = Static114.aClass26_18;
		synchronized (Static114.aClass26_18) {
			Static114.aClass26_18.method333();
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IB)V")
	public static void method3831(@OriginalArg(0) int arg0) {
		Static235.anInt4734 = arg0;
		@Pc(7) Class26 local7 = Static281.aClass26_51;
		synchronized (Static281.aClass26_51) {
			Static281.aClass26_51.method333();
		}
		local7 = Static196.aClass26_38;
		synchronized (Static196.aClass26_38) {
			Static196.aClass26_38.method333();
		}
	}
}
