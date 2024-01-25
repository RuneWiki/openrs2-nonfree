import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_58 = new Class129(260);

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
	public static final int[] anIntArray429 = new int[14];

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_129 = new Class256("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZLclient!cr;)V")
	public static void method5068(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class41 arg1) {
		@Pc(23) int local23 = arg1.anInt1636 == 0 ? arg1.anInt1622 : arg1.anInt1636;
		@Pc(35) int local35 = arg1.anInt1635 == 0 ? arg1.anInt1599 : arg1.anInt1635;
		Static44.method834(Static450.aClass41ArrayArray2[arg1.anInt1613 >> 16], local35, arg1.anInt1613, arg0, local23);
		if (arg1.aClass41Array1 != null) {
			Static44.method834(arg1.aClass41Array1, local35, arg1.anInt1613, arg0, local23);
		}
		@Pc(68) Class2_Sub25 local68 = (Class2_Sub25) Static398.aClass240_27.method5439((long) arg1.anInt1613);
		if (local68 != null) {
			Static90.method1519(local35, local23, local68.anInt4163, arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
	public static void method5070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 10);
		local8.method434();
		local8.anInt659 = arg2;
		local8.anInt656 = arg3;
		local8.anInt657 = arg1;
	}
}
