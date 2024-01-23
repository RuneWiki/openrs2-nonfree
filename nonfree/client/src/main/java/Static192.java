import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
	public static int anInt3770 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)Lclient!dc;")
	public static Class3_Sub4_Sub4 method3195(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub4 local10 = (Class3_Sub4_Sub4) Static126.aClass33_4.method828((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static23.aClass155_18.method4121(Static60.method593(arg0), Static272.method2767(arg0));
		local10 = new Class3_Sub4_Sub4();
		if (local26 != null) {
			local10.method780(new Class3_Sub26(local26));
		}
		Static126.aClass33_4.method827(local10, (long) arg0);
		return local10;
	}
}
