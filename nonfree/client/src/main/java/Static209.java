import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString150;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!gl;")
	public static Class2 aClass2_17;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
	public static final int[] anIntArray376 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBII)V")
	public static void method3809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static32.anInt750 && arg2 <= Static112.anInt2485) {
			@Pc(15) int local15 = Static222.method3991(arg1, Static275.anInt5244, Static6.anInt136);
			@Pc(21) int local21 = Static222.method3991(arg3, Static275.anInt5244, Static6.anInt136);
			Static176.method3605(arg2, local15, arg0, local21);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
	public static void method3810() {
		Static308.aClass11_96.method215(5);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)Lclient!js;")
	public static Class14_Sub2_Sub11 method3811(@OriginalArg(1) int arg0) {
		@Pc(10) Class14_Sub2_Sub11 local10 = (Class14_Sub2_Sub11) Static72.aClass178_4.method4772((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 >= 32768) {
			local25 = Static111.aClass143_56.method3745(1, arg0 & 0x7FFF);
		} else {
			local25 = Static233.aClass143_87.method3745(1, arg0);
		}
		local10 = new Class14_Sub2_Sub11();
		if (local25 != null) {
			local10.method3068(new Class14_Sub4(local25));
		}
		if (arg0 >= 32768) {
			local10.method3076();
		}
		Static72.aClass178_4.method4767(local10, (long) arg0);
		return local10;
	}
}
