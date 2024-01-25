import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray49;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "I")
	public static int anInt7294;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_163 = new Class7("K", "T", "K", "K");

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IJII)V")
	public static void method5967(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(24) int local24 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static394.method5261(arg0, true, 0, local10, 0, 0, arg2, local17);
			return;
		}
		@Pc(59) Class129 local59 = Static349.aClass115_4.method2766(local24);
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (local17 == 0 || local17 == 2) {
			local70 = local59.anInt3507;
			local73 = local59.anInt3517;
		} else {
			local70 = local59.anInt3517;
			local73 = local59.anInt3507;
		}
		@Pc(83) int local83 = local59.anInt3522;
		if (local17 != 0) {
			local83 = (local83 << local17 & 0xF) + (local83 >> 4 - local17);
		}
		Static394.method5261(arg0, true, local70, 0, local73, local83, arg2, 0);
	}
}
