import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BII)Z")
	public static boolean method5701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	public static void method5702() {
		Static209.anInt8184 = 1;
		Static490.anInt7979 = -1;
		if (Static148.aString42 == null) {
			Static337.method5148(35);
		} else {
			@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(Static143.method6946(Static270.method4389(Static148.aString42)));
			@Pc(30) long local30 = local24.method3128();
			Static381.aLong186 = local24.method3128();
			Static536.method7048(true, Static180.method3145(local30), "");
		}
	}
}
