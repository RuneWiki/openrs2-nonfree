import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	public static int anInt1705;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Z")
	public static boolean aBoolean142 = true;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!df", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!df", name = "G", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_50 = new Class189("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	public static int anInt1722 = 0;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method1323() {
		if (Static111.aBoolean220) {
			return;
		}
		if (Static374.aClass20_Sub1_1.aBoolean186) {
			Static252.aFloat47 = (int) Static252.aFloat47 - 65 & 0xFFFFFF80;
		} else {
			Static352.aFloat67 += (-Static352.aFloat67 - 24.0F) / 2.0F;
		}
		Static224.aBoolean359 = true;
		Static111.aBoolean220 = true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!mq;B)Lclient!mq;")
	public static Class156 method1324(@OriginalArg(0) Class156 arg0) {
		@Pc(14) Class156 local14 = Static53.method1119(arg0);
		if (local14 == null) {
			local14 = arg0.aClass156_10;
		}
		return local14;
	}
}
