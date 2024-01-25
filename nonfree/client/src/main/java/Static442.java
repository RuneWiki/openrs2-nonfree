import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
	public static int anInt7406;

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_104 = new Class208(65, 11);

	@OriginalMember(owner = "client!vv", name = "v", descriptor = "Lclient!of;")
	public static final Class188 aClass188_57 = new Class188(8);

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "[Lclient!nb;")
	public static final Class2_Sub1_Sub12[] aClass2_Sub1_Sub12Array9 = new Class2_Sub1_Sub12[14];

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!wq;B)I")
	public static int method5943(@OriginalArg(0) Class11_Sub5_Sub2_Sub2 arg0) {
		@Pc(6) Class82 local6 = arg0.aClass82_1;
		if (local6.anIntArray149 != null) {
			local6 = local6.method1888(Static63.aClass120_2);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local6.anInt1942;
		@Pc(32) Class101 local32 = arg0.method6218();
		if (arg0.aBoolean514) {
			local21 = local6.anInt1961;
		} else if (local32.anInt2614 == arg0.anInt7663 || arg0.anInt7663 == local32.anInt2629 || arg0.anInt7663 == local32.anInt2627 || arg0.anInt7663 == local32.anInt2643) {
			local21 = local6.anInt1940;
		} else if (local32.anInt2608 == arg0.anInt7663 || local32.anInt2619 == arg0.anInt7663 || arg0.anInt7663 == local32.anInt2651 || local32.anInt2654 == arg0.anInt7663) {
			local21 = local6.anInt1957;
		}
		return local21;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IILclient!hw;)Ljava/lang/String;")
	public static String method5945(@OriginalArg(2) Class2_Sub17 arg0) {
		try {
			@Pc(15) int local15 = arg0.method6174();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local15];
			arg0.anInt7523 += Static342.aClass186_1.method4074(0, local23, arg0.aByteArray94, arg0.anInt7523, local15);
			return Static186.method2710(local23, 0, local15);
		} catch (@Pc(49) Exception local49) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(III)Lclient!or;")
	public static Class11_Sub2 method5946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub2_2;
	}
}
