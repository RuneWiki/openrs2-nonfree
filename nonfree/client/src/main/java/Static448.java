import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "Lclient!tc;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public static final int anInt7744 = 1339;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[100];

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Lclient!aw;")
	public static Class18 method5970(@OriginalArg(1) int arg0) {
		@Pc(10) Class18 local10 = (Class18) Static74.aClass151_41.method3288((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static185.aClass109_50.method2349(1, arg0);
		local10 = new Class18();
		local10.anInt321 = arg0;
		if (local22 != null) {
			local10.method258(new Class1_Sub14(local22));
		}
		local10.method260();
		if (local10.anInt314 == 2 && Static365.aClass51_30.method930((long) arg0) == null) {
			Static365.aClass51_30.method931(new Class1_Sub37(Static359.anInt6553), (long) arg0);
			Static341.aClass18Array1[Static359.anInt6553++] = local10;
		}
		Static74.aClass151_41.method3291((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZI)I")
	public static int method5972(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub13 local14 = Static379.method5347(arg0, false);
		if (local14 == null) {
			return Static308.aClass197_3.method4730(arg0).anInt4593;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local14.anIntArray82.length; local34++) {
			if (local14.anIntArray82[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static308.aClass197_3.method4730(arg0).anInt4593 - local14.anIntArray82.length;
	}
}
