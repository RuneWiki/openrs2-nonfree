import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "[Lclient!on;")
	public static Class120_Sub1[] aClass120_Sub1Array5;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!wl;")
	public static Class221 aClass221_135;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array31;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!iq;II)Lclient!oq;")
	public static Class2_Sub28 method3540(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2758(arg1);
		return local8 == null ? null : new Class2_Sub28(local8);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!iq;B)V")
	public static void method3542(@OriginalArg(0) Class104 arg0) {
		Static18.aClass104_13 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!mf;IIII)V")
	public static void method3543(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static140.method2709(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static344.anInt6692) {
			Static140.method2709(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static140.method2709(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static63.anInt1129) {
			Static140.method2709(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static63.anInt1129) {
			Static140.method2709(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static344.anInt6692 && arg4 <= Static63.anInt1129) {
			Static140.method2709(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static140.method2709(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static344.anInt6692 && arg4 > 0) {
			Static140.method2709(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILclient!kp;Lclient!kp;)V")
	public static void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub3 arg3, @OriginalArg(4) Class1_Sub3 arg4) {
		@Pc(4) Class51 local4 = Static261.method4461(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub3_2 = arg3;
			local4.aClass1_Sub3_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIZZI)Lclient!iq;")
	public static Class104 method3547(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class204 local14 = null;
		if (Static36.aClass10_1 != null) {
			local14 = new Class204(arg1, Static36.aClass10_1, Static190.aClass10Array5[arg1], 1000000);
		}
		Static219.aClass138_Sub1Array1[arg1] = Static60.aClass220_1.method5728(Static247.aClass204_3, arg1, local14);
		if (arg0) {
			Static219.aClass138_Sub1Array1[arg1].method4073();
		}
		return new Class104(Static219.aClass138_Sub1Array1[arg1], arg2, 1);
	}
}
