import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Z")
	public static boolean aBoolean518 = false;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[Lclient!gba;")
	public static final Class3_Sub4_Sub8[] aClass3_Sub4_Sub8Array3 = new Class3_Sub4_Sub8[14];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V")
	public static void method6339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub4_Sub12 local16 = Static556.method8018(6, arg0);
		local16.method3608();
		local16.anInt4062 = arg1;
	}
}
