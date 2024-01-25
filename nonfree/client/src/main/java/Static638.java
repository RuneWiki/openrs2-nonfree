import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_184 = new Class322(135, 1);

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_185 = new Class322(20, 11);

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	public static int anInt9936 = 0;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	public static void method8615() {
		for (@Pc(15) Class6_Sub33 local15 = (Class6_Sub33) Static252.aClass74_67.method1404(); local15 != null; local15 = (Class6_Sub33) Static252.aClass74_67.method1405()) {
			if (local15.aBoolean427) {
				local15.aBoolean427 = false;
			} else {
				Static277.method4643(local15.anInt5790);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZLclient!ng;)V")
	public static void method8616(@OriginalArg(2) Class6_Sub17_Sub4 arg0) {
		Static240.aClass150_2.method5493(arg0);
		Static439.method7364(Static240.aClass150_2, Static56.aClass223_9, Static322.aClass223_73, arg0, Static255.aClass223_58);
	}
}
