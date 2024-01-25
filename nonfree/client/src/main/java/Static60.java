import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!cb;)V")
	public static void method1326(@OriginalArg(1) Class6_Sub4 arg0) {
		arg0.aBoolean457 = false;
		if (arg0.aClass6_Sub17_5 != null) {
			arg0.aClass6_Sub17_5.anInt3085 = 0;
		}
		for (@Pc(21) Class6_Sub4 local21 = arg0.method5904(); local21 != null; local21 = arg0.method5901()) {
			method1326(local21);
		}
	}
}
