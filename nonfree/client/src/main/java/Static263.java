import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
	public static int anInt4101;

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "I")
	public static int anInt4103;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
	public static int anInt4104;

	@OriginalMember(owner = "client!iaa", name = "x", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_43 = new Class144(33, 3);

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)Z")
	public static boolean method3737(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!ika;I)V")
	public static void method3738(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static169.aClass203_1 != null) {
			@Pc(22) int local22;
			try {
				Static169.aClass203_1.method4768(0L);
				Static169.aClass203_1.method4773(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(55) Exception local55) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method2068(0, 24, local8);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZIILclient!hr;I)V")
	public static void method3739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class165 arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1 || arg0 < 1 || arg1 > Static497.anInt7926 - 2 || arg0 > Static646.anInt9979 - 2) {
			return;
		}
		if (Static448.aClass364ArrayArrayArray2 == null) {
			return;
		}
		@Pc(46) Interface9 local46 = Static414.aClass114_Sub1_15.method8689(arg2, arg4, arg1, arg0);
		if (local46 == null) {
			return;
		}
		if (local46 instanceof Class9_Sub1_Sub1_Sub5) {
			((Class9_Sub1_Sub1_Sub5) local46).method9112(arg3);
			return;
		}
		if (!(local46 instanceof Class9_Sub1_Sub4_Sub1)) {
			if (local46 instanceof Class9_Sub1_Sub2_Sub2) {
				((Class9_Sub1_Sub2_Sub2) local46).method3588(arg3);
			} else if (local46 instanceof Class9_Sub1_Sub3_Sub2) {
				((Class9_Sub1_Sub3_Sub2) local46).method6743(arg3);
				return;
			}
			return;
		}
		((Class9_Sub1_Sub4_Sub1) local46).method5282(arg3);
		return;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)V")
	public static void method3740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 14);
		local9.method9256();
		local9.anInt10899 = arg1;
	}
}
