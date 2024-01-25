import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Z")
	public static boolean aBoolean747 = false;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	public static int method8368(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public static void method8370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(6, arg1);
		local8.method3509();
		local8.anInt4321 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I")
	public static int method8373(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static355.method5610(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8374(@OriginalArg(1) String arg0) {
		if (Static29.aClass249Array1 != null) {
			@Pc(24) Class8_Sub31 local24 = Static51.method1418(Static497.aClass257_121, Static608.aClass336_1);
			local24.aClass8_Sub8_Sub2_1.method8562(Static643.method8631(arg0));
			local24.aClass8_Sub8_Sub2_1.method8582(arg0);
			Static262.method4604(local24);
		}
	}
}
