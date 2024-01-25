import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "Lclient!da;")
	public static Class38 aClass38_3;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!mea;Z)V")
	public static void method2629(@OriginalArg(1) Class230 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt6711 == 0 ? arg0.anInt6703 : arg0.anInt6711;
		@Pc(27) int local27 = arg0.anInt6638 == 0 ? arg0.anInt6701 : arg0.anInt6638;
		Static138.method2198(Static559.aClass230ArrayArray2[arg0.anInt6663 >> 16], local15, arg0.anInt6663, arg1, local27);
		if (arg0.aClass230Array2 != null) {
			Static138.method2198(arg0.aClass230Array2, local15, arg0.anInt6663, arg1, local27);
		}
		@Pc(60) Class14_Sub32 local60 = (Class14_Sub32) Static547.aClass187_69.method4078((long) arg0.anInt6663);
		if (local60 != null) {
			Static91.method1715(local27, local60.anInt6351, arg1, local15);
		}
	}
}
