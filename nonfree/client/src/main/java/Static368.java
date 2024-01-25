import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!tga;")
	public static Class337 aClass337_5;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public static int anInt6814;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBJ)V")
	public static void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static380.method5625(0, local10, 0, arg0, true, arg1, local17, 0);
			return;
		}
		@Pc(60) Class203 local60 = Static511.aClass13_2.method86(local32);
		@Pc(76) int local76;
		@Pc(73) int local73;
		if (local17 == 0 || local17 == 2) {
			local73 = local60.anInt6028;
			local76 = local60.anInt6065;
		} else {
			local73 = local60.anInt6065;
			local76 = local60.anInt6028;
		}
		@Pc(87) int local87 = local60.anInt6054;
		if (local17 != 0) {
			local87 = (local87 << local17 & 0xF) + (local87 >> 4 - local17);
		}
		Static380.method5625(local73, 0, local76, arg0, true, arg1, 0, local87);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLclient!fb;)I")
	public static int method5530(@OriginalArg(1) Class12_Sub2_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt2981;
		@Pc(17) Class132 local17 = arg0.method2416();
		if (arg0.anInt2960 == -1 || arg0.aBoolean222) {
			local8 = arg0.anInt2998;
		} else if (local17.anInt3652 == arg0.anInt2960 || local17.anInt3656 == arg0.anInt2960 || arg0.anInt2960 == local17.anInt3648 || local17.anInt3657 == arg0.anInt2960) {
			local8 = arg0.anInt2971;
		} else if (arg0.anInt2960 == local17.anInt3663 || local17.anInt3628 == arg0.anInt2960 || arg0.anInt2960 == local17.anInt3639 || local17.anInt3651 == arg0.anInt2960) {
			local8 = arg0.anInt2973;
		}
		return local8;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public static void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static453.anInt7941 == 1) {
			Static117.aClass137_46.method7914(arg1, arg0, Static637.anInt10654, Static256.anInt4522);
		} else {
			Static117.aClass137_46.method7914(arg1, arg0, 0, 0);
		}
	}
}
