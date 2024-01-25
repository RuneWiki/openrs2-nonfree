import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public static int anInt6537 = 0;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_98 = new Class96("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public static int anInt6539 = 0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
	public static final int[] anIntArray477 = new int[25];

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public static int anInt6540 = -1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[Lclient!f;)V")
	public static void method5116(@OriginalArg(1) Class78[] arg0) {
		Static169.anInt3023 = arg0.length;
		Static13.aClass78Array1 = new Class78[Static169.anInt3023 + 10];
		Static275.anIntArray364 = new int[Static169.anInt3023 + 10];
		Static459.method1551(arg0, 0, Static13.aClass78Array1, 0, Static169.anInt3023);
		for (@Pc(30) int local30 = 0; local30 < Static169.anInt3023; local30++) {
			Static275.anIntArray364[local30] = Static13.aClass78Array1[local30].JA();
		}
		for (@Pc(45) int local45 = Static169.anInt3023; local45 < Static13.aClass78Array1.length; local45++) {
			Static275.anIntArray364[local45] = 12;
		}
	}
}
