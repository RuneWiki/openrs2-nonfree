import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
	public static int anInt2102;

	@OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
	public static int anInt2103;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_61 = new Class119(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public static void method1777() {
		if (Static353.aClass125_1 != null) {
			Static353.aClass125_1.method5857();
		}
		if (Static356.aClass125_2 != null) {
			Static356.aClass125_2.method5857();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method1778(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) Class1_Sub5_Sub11 local12 = Static188.method2688(arg0, 3);
		local12.method2661();
		local12.aString38 = arg1;
	}
}
