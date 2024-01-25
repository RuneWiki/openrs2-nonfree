import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!gq;")
	public static Class89 aClass89_2;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!co;")
	public static final Class41 aClass41_40 = new Class41(5);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method2778() {
		for (@Pc(10) Class2_Sub43 local10 = (Class2_Sub43) Static262.aClass238_29.method5795(); local10 != null; local10 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
			if (Static191.method4405(local10.anInt7126)) {
				Static259.method4448(local10);
			}
		}
		if (Static233.anInt4642 == 1) {
			Static214.aBoolean313 = false;
			Static330.method5311(Static30.anInt453, Static392.anInt7142, Static92.anInt1974, Static10.anInt6517);
			return;
		}
		Static330.method5311(Static30.anInt453, Static392.anInt7142, Static92.anInt1974, Static10.anInt6517);
		@Pc(49) int local49 = Static121.aClass24_10.method325(Static148.aClass62_108.method1389(Static200.anInt4144));
		for (@Pc(54) Class2_Sub43 local54 = (Class2_Sub43) Static262.aClass238_29.method5795(); local54 != null; local54 = (Class2_Sub43) Static262.aClass238_29.method5799()) {
			@Pc(60) int local60 = Static310.method5033(local54);
			if (local49 < local60) {
				local49 = local60;
			}
		}
		Static10.anInt6517 = (Static127.aBoolean191 ? 26 : 22) + Static233.anInt4642 * 16;
		Static392.anInt7142 = local49 + 8;
	}
}
