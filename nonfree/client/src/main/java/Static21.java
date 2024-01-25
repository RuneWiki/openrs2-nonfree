import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!au", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[5];

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_17 = new Class186(89, -2);

	@OriginalMember(owner = "client!au", name = "h", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_6 = new Class242("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!jb;IJILclient!ea;IIII)V")
	public static void method446(@OriginalArg(0) Class126 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class57 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg7 * arg7 + arg6 * arg6;
		if (arg1 < (long) local11) {
			return;
		}
		@Pc(40) int local40 = Math.min(arg0.anInt3421 / 2, arg0.anInt3442 / 2);
		if (local40 * local40 >= local11) {
			Static134.method1948(arg3, arg0, Static350.aClass3Array12[arg4], arg7, arg6, arg2, arg5);
			return;
		}
		local40 -= 10;
		@Pc(60) int local60;
		if (Static134.anInt2621 == 4) {
			local60 = (int) Static146.aFloat82 & 0x3FFF;
		} else {
			local60 = (int) Static146.aFloat82 + Static94.anInt2046 & 0x3FFF;
		}
		@Pc(71) int local71 = Class56.anIntArray119[local60];
		@Pc(75) int local75 = Class56.anIntArray120[local60];
		if (Static134.anInt2621 != 4) {
			local75 = local75 * 256 / (Static109.anInt6939 + 256);
			local71 = local71 * 256 / (Static109.anInt6939 + 256);
		}
		@Pc(105) int local105 = arg7 * local71 + arg6 * local75 >> 15;
		@Pc(115) int local115 = arg7 * local75 - local71 * arg6 >> 15;
		@Pc(121) double local121 = Math.atan2((double) local105, (double) local115);
		@Pc(128) int local128 = (int) ((double) local40 * Math.sin(local121));
		@Pc(135) int local135 = (int) ((double) local40 * Math.cos(local121));
		Static356.aClass3Array14[arg4].method5879((float) local128 + (float) arg2 + (float) arg0.anInt3421 / 2.0F, (float) -local135 + (float) arg5 + (float) arg0.anInt3442 / 2.0F, 4096, (int) (-local121 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
	public static void method447() {
		@Pc(14) int local14 = (int) ((double) Static126.anInt2569 * 34.46D);
		local14 <<= 0x0;
		if (Static16.aClass30_11.method4668()) {
			local14 += 128;
		}
		Static16.aClass30_11.JA(50, local14);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII)Z")
	public static boolean method448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface11 local11 = (Interface11) Static138.method1998(arg2, arg0, arg1);
		if (local11 != null) {
			local5 = Static450.method5794(local11) & true;
		}
		local11 = (Interface11) Static134.method1950(arg2, arg0, arg1, ou.class);
		if (local11 != null) {
			local5 &= Static450.method5794(local11);
		}
		local11 = (Interface11) Static40.method729(arg2, arg0, arg1);
		if (local11 != null) {
			local5 &= Static450.method5794(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I")
	public static int method450(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)V")
	public static void method451(@OriginalArg(0) boolean arg0) {
		Static13.method322(arg0, Static349.anInt6303, Static404.anInt6892, Static87.anInt1948);
	}
}
