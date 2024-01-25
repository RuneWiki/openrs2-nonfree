import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
	public static int anInt5973;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!nq;")
	public static Class144 aClass144_96;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
	public static int anInt5975 = 0;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "S")
	public static short aShort83 = 32767;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	public static int anInt5976 = -1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method5136() {
		Static18.aClass26_2.method333();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIB)V")
	public static void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg0 * Static249.anInt4975 >> 8;
		if (local5 != 0 && arg2 != -1) {
			Static7.method65(local5, Static32.aClass144_9, arg2);
			Static120.aBoolean103 = true;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!wn;")
	public static Class216 method5139(@OriginalArg(0) int arg0) {
		@Pc(10) Class216 local10 = (Class216) Static261.aClass26_46.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static202.aClass144_60.method3896(arg0, 30);
		local10 = new Class216();
		if (local20 != null) {
			local10.method5678(new Class11_Sub25(local20), arg0);
		}
		Static261.aClass26_46.method330((long) arg0, local10);
		return local10;
	}
}
