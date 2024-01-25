import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!pt;")
	public static Class263 aClass263_2;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "[Lclient!ica;")
	public static Class136[] aClass136Array1;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_111 = new Class287(70, 7);

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_112 = new Class287(38, 4);

	@OriginalMember(owner = "client!of", name = "l", descriptor = "I")
	public static int anInt6641 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z")
	public static boolean method5342(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class3_Sub13 local15 = (Class3_Sub13) Static260.aClass244_40.method5572(); local15 != null; local15 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
			if (Static55.method6551(local15.anInt2364) && (long) arg0 == local15.aLong42) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)I")
	public static int method5344(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)Lclient!mh;")
	public static Class205 method5345(@OriginalArg(0) int arg0) {
		@Pc(10) Class205 local10 = (Class205) Static121.aClass342_49.method7684((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static197.aClass284_62.method6331(1, arg0);
		local10 = new Class205();
		local10.anInt6029 = arg0;
		if (local20 != null) {
			local10.method4884(new Class3_Sub26(local20));
		}
		local10.method4887();
		if (local10.anInt6012 == 2 && Static136.aClass297_11.method6531((long) arg0) == null) {
			Static136.aClass297_11.method6537((long) arg0, new Class3_Sub2(Static242.anInt4755));
			Static309.aClass205Array1[Static242.anInt4755++] = local10;
		}
		Static121.aClass342_49.method7683(local10, (long) arg0);
		return local10;
	}
}
