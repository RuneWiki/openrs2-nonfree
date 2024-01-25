import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
	public static int anInt7978;

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!fp;")
	public static Class102 aClass102_3 = new Class102();

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
	public static int anInt7979 = -1;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_56 = new Class10(64);

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "Z")
	public static boolean aBoolean625 = false;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Lclient!pr;")
	public static Class265 method6751(@OriginalArg(0) int arg0) {
		@Pc(8) Class265[] local8 = Static535.method7035();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class265 local16 = local8[local10];
			if (arg0 == local16.anInt6963) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
	public static void method6752() {
		for (@Pc(12) int local12 = 0; local12 < Static49.anInt1058; local12++) {
			@Pc(18) int local18 = Static480.anIntArray603[local12];
			@Pc(27) Class3_Sub39 local27 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local18);
			if (local27 != null) {
				@Pc(32) Class9_Sub1_Sub1_Sub2_Sub1 local32 = local27.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				Static321.method4999(local32.aClass294_1.anInt7615, local32);
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)I")
	public static int method6753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg1 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(14) int local14 = arg2;
			arg2 = arg4;
			arg4 = local14;
		}
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 + 1 - arg5 - arg2;
		} else if (local7 == 2) {
			return 7 + 1 - arg0 - arg4;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(III)I")
	public static int method6754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local11;
	}
}
