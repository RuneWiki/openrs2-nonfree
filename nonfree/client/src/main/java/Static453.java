import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!oh", name = "W", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!oh", name = "rc", descriptor = "I")
	public static int anInt7382;

	@OriginalMember(owner = "client!oh", name = "Dc", descriptor = "[I")
	public static int[] anIntArray534;

	@OriginalMember(owner = "client!oh", name = "ld", descriptor = "Lclient!vl;")
	public static final Class388 aClass388_8 = new Class388();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIZI)Lclient!fka;")
	public static Class2_Sub26 method6603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub26 local7 = new Class2_Sub26();
		local7.anInt3020 = arg0;
		local7.anInt3019 = arg3;
		Static463.aClass218_36.method5099(local7, (long) arg1);
		Static68.method1030(arg0);
		@Pc(32) Class273 local32 = Static417.method6111(arg1);
		if (local32 != null) {
			Static371.method5299(local32);
		}
		if (Static13.aClass273_1 != null) {
			Static371.method5299(Static13.aClass273_1);
			Static13.aClass273_1 = null;
		}
		Static513.method7268();
		if (local32 != null) {
			Static243.method3436(local32, !arg2);
		}
		if (!arg2) {
			Static484.method6921(arg0);
		}
		if (!arg2 && Static542.anInt8552 != -1) {
			Static627.method8472(Static542.anInt8552, 1);
		}
		return local7;
	}
}
