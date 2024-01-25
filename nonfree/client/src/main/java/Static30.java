import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_18 = new Class45("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public static int anInt788 = 0;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!ui;")
	public static Class295 aClass295_6 = new Class295();

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
	public static int method809(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method810(@OriginalArg(0) Class4 arg0) {
		for (@Pc(10) Class46_Sub7 local10 = (Class46_Sub7) Static448.aClass184_36.method5138(); local10 != null; local10 = (Class46_Sub7) Static448.aClass184_36.method5145()) {
			local10.method7407(arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method811() {
		Static96.method2001();
	}
}
