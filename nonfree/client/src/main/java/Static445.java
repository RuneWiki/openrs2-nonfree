import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_179 = new Class119("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!jk;ILclient!za;)V")
	public static void method5842(@OriginalArg(0) Class124 arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(31) boolean local31 = Static342.aClass155_2.method3550(arg0.aBoolean390 ? Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1 : null, arg0.anInt3410, arg0.anInt3412 | 0xFF000000, arg0.anInt3405, arg0.anInt3351, arg1, arg0.anInt3420) == null;
		if (local31) {
			Static110.aClass227_13.method4972(new Class1_Sub34(arg0.anInt3405, arg0.anInt3351, arg0.anInt3410, arg0.anInt3412 | 0xFF000000, arg0.anInt3420, arg0.aBoolean390));
			Static160.method2323(arg0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I")
	public static int method5845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static20.anIntArray310[arg1 & 0x3] : Static312.anIntArray355[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
	public static boolean method5848(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}
}
