import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
	public static int anInt4797 = 0;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)Z")
	public static boolean method4382() {
		return Static190.method673("jaclib") ? Static190.method673("hw3d") : false;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBIIII)V")
	public static void method4383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static627.aClass5_Sub46_31.aClass11_Sub17_2.method5908() != 0 && arg4 != 0 && Static44.anInt730 < 50 && arg1 != -1) {
			Static113.aClass59Array1[Static44.anInt730++] = new Class59((byte) 1, arg1, arg4, arg2, arg3, 0, arg0, (Class14_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)J")
	public static long method4384(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
