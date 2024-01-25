import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!mi;")
	public static Class46 aClass46_27;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public static int anInt9790 = -1;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "J")
	public static final long aLong245 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method8161(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static653.method7723(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZZ)Lclient!jda;")
	public static Class3_Sub4 method8162(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) Class325[] local7 = Class3.aClass325Array33;
		synchronized (Class3.aClass325Array33) {
			@Pc(26) Class3_Sub4 local26;
			if (Class3.aClass325Array33.length <= arg0 || Class3.aClass325Array33[arg0].method8015()) {
				local26 = new Class3_Sub4();
				local26.aClass3_Sub3Array1 = new Class3_Sub3[arg0];
				for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
					local26.aClass3_Sub3Array1[local48] = new Class3_Sub3();
				}
			} else {
				local26 = (Class3_Sub4) Class3.aClass325Array33[arg0].method8014();
				local26.method8909();
				@Pc(33) int local33 = Static102.anIntArray141[arg0]--;
			}
			local26.aBoolean419 = arg1;
			return local26;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Z")
	public static boolean method8163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static297.method5316(arg0, arg1) || Static573.method8544(arg1, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!db;Z)I")
	public static int method8164(@OriginalArg(0) Class2_Sub6_Sub3 arg0) {
		@Pc(7) String local7 = Static74.method2135(arg0);
		@Pc(9) int[] local9 = null;
		if (Static396.method6492(arg0.anInt2631)) {
			local9 = Static635.aClass336_2.method8424((int) arg0.aLong61).anIntArray602;
		} else if (arg0.anInt2626 != -1) {
			local9 = Static635.aClass336_2.method8424(arg0.anInt2626).anIntArray602;
		} else if (Static299.method5338(arg0.anInt2631)) {
			@Pc(78) Class2_Sub33 local78 = (Class2_Sub33) Static600.aClass99_79.method3056((long) arg0.aLong61);
			if (local78 != null) {
				@Pc(83) Class3_Sub1_Sub3_Sub3_Sub1 local83 = local78.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				@Pc(86) Class27 local86 = local83.aClass27_1;
				if (local86.anIntArray43 != null) {
					local86 = local86.method727(Static286.aClass263_3);
				}
				if (local86 != null) {
					local9 = local86.anIntArray42;
				}
			}
		} else if (Static613.method8966(arg0.anInt2631)) {
			@Pc(43) Class161 local43;
			if (arg0.anInt2631 == 1001) {
				local43 = Static27.aClass342_3.method8534((int) arg0.aLong61);
			} else {
				local43 = Static27.aClass342_3.method8534((int) (arg0.aLong61 >>> 32 & 0x7FFFFFFFL));
			}
			if (local43.anIntArray288 != null) {
				local43 = local43.method4606(Static286.aClass263_3);
			}
			if (local43 != null) {
				local9 = local43.anIntArray286;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static421.method6792(local9);
		}
		@Pc(135) int local135 = Static161.aClass239_14.method6485(local7, Static117.aClass46Array5);
		if (arg0.aBoolean218) {
			local135 += Static90.aClass46_10.method6210() + 4;
		}
		return local135;
	}
}
