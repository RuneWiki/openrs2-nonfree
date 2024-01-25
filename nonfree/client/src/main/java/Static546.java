import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!th", name = "H", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_16 = new Class222(13, 0, 1, 0);

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	public static int anInt8995 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([BB)V")
	public static void method7541(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class2_Sub22 local14 = new Class2_Sub22(arg0);
		while (true) {
			@Pc(18) int local18 = local14.method8547();
			if (local18 == 0) {
				return;
			}
			if (local18 == 2) {
				Static410.anInt6377 = local14.method8546();
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
	public static void method7542() {
		Static500.anInt8131 = -1;
		Static507.anInt8408 = 1;
		if (Static435.aString32 == null) {
			Static63.method8324(35);
		} else {
			@Pc(26) Class2_Sub22 local26 = new Class2_Sub22(Static620.method8307(Static504.method6915(Static435.aString32)));
			@Pc(30) long local30 = local26.method8506();
			Static630.aLong277 = local26.method8506();
			Static575.method7863(true, Static309.method4208(local30), "");
		}
	}
}
