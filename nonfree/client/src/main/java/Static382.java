import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "[Lclient!hw;")
	public static Class153[] aClass153Array3;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)V")
	public static void method6018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub7_Sub5 local12 = Static138.method2377(1, arg0);
		local12.method1474();
		local12.anInt1728 = arg1;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(II)I")
	public static int method6019(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!uu;B)Lclient!ej;")
	public static Class93 method6021(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1) {
		@Pc(8) byte[] local8 = arg1.method8143(arg0);
		return local8 == null ? null : new Class93(local8);
	}
}
