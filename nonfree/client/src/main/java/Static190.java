import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Lclient!ma;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!al;")
	public static final Class11 aClass11_84 = new Class11(64);

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!al;")
	public static Class11 aClass11_85 = new Class11(64);

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public static final int anInt3903 = 12;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)I")
	public static int method3621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 - 1 & arg0 >> 31;
		return local17 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method3624() {
		if (Static65.aClass43_3 != null) {
			@Pc(7) Class43 local7 = Static65.aClass43_3;
			synchronized (Static65.aClass43_3) {
				Static65.aClass43_3 = null;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public static void method3626(@OriginalArg(1) int arg0) {
		@Pc(13) Class14_Sub2_Sub13 local13 = Static1.method5711(7, arg0);
		local13.method3539();
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method3627() {
		Static164.aClass14_Sub4_Sub2_3.method2557(155);
		Static164.aClass14_Sub4_Sub2_3.method2509(Static313.anInt6041);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method3628(@OriginalArg(1) Class143 arg0) {
		Static159.aClass143_66 = arg0;
	}
}
