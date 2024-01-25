import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_27 = new Class183(62, 4);

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "[I")
	public static final int[] anIntArray191 = new int[50];

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "Z")
	public static boolean aBoolean168 = true;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!gt;")
	public static Class91 method1849(@OriginalArg(2) Component arg0) {
		return new Class91_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!wc;III)V")
	public static void method1853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub41 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt6936 == -1 && arg2.anIntArray581 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg2.anInt6931 * Static107.anInt2388 >> 8;
		if (arg3 > arg2.anInt6939) {
			local15 = arg3 - arg2.anInt6939;
		} else if (arg3 < arg2.anInt6938) {
			local15 = arg2.anInt6938 - arg3;
		}
		if (arg1 > arg2.anInt6941) {
			local15 += arg1 - arg2.anInt6941;
		} else if (arg1 < arg2.anInt6932) {
			local15 += arg2.anInt6932 - arg1;
		}
		if (arg2.anInt6942 == 0 || arg2.anInt6942 < local15 - 64 || Static107.anInt2388 == 0 || arg2.anInt6930 != arg0) {
			if (arg2.aClass2_Sub11_Sub2_3 != null) {
				Static192.aClass2_Sub11_Sub4_1.method4879(arg2.aClass2_Sub11_Sub2_3);
				arg2.aClass2_Sub11_Sub2_3 = null;
			}
			if (arg2.aClass2_Sub11_Sub2_2 != null) {
				Static192.aClass2_Sub11_Sub4_1.method4879(arg2.aClass2_Sub11_Sub2_2);
				arg2.aClass2_Sub11_Sub2_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(144) int local144 = local22 * (arg2.anInt6942 - local15) / arg2.anInt6942;
		if (arg2.aClass2_Sub11_Sub2_3 != null) {
			arg2.aClass2_Sub11_Sub2_3.method3013(local144);
		} else if (arg2.anInt6936 >= 0) {
			@Pc(165) Class80 local165 = Static393.method1856(Static141.aClass83_59, arg2.anInt6936, 0);
			if (local165 != null) {
				@Pc(172) Class2_Sub20_Sub1 local172 = local165.method1857().method2918(Static322.aClass113_1);
				@Pc(177) Class2_Sub11_Sub2 local177 = Static397.method2997(local172, local144);
				local177.method2991(-1);
				Static192.aClass2_Sub11_Sub4_1.method4878(local177);
				arg2.aClass2_Sub11_Sub2_3 = local177;
			}
		}
		if (arg2.aClass2_Sub11_Sub2_2 != null) {
			arg2.aClass2_Sub11_Sub2_2.method3013(local144);
			if (arg2.aClass2_Sub11_Sub2_2.method6126()) {
				return;
			}
			arg2.aClass2_Sub11_Sub2_2 = null;
		} else if (arg2.anIntArray581 != null && (arg2.anInt6943 -= arg4) <= 0) {
			@Pc(208) int local208 = (int) (Math.random() * (double) arg2.anIntArray581.length);
			@Pc(216) Class80 local216 = Static393.method1856(Static141.aClass83_59, arg2.anIntArray581[local208], 0);
			if (local216 != null) {
				@Pc(223) Class2_Sub20_Sub1 local223 = local216.method1857().method2918(Static322.aClass113_1);
				@Pc(228) Class2_Sub11_Sub2 local228 = Static397.method2997(local223, local144);
				local228.method2991(0);
				Static192.aClass2_Sub11_Sub4_1.method4878(local228);
				arg2.aClass2_Sub11_Sub2_2 = local228;
				arg2.anInt6943 = (int) (Math.random() * (double) (arg2.anInt6945 - arg2.anInt6934)) + arg2.anInt6934;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)I")
	public static int method1854(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
