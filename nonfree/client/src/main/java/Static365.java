import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!v", name = "i", descriptor = "I")
	public static int anInt5876;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_153 = new Class211(61, 2);

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!o;")
	public static final Class169 aClass169_322 = new Class169("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	public static int anInt5877 = 2;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	public static int anInt5878 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!je;I)V")
	public static void method5064(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(12) int local12 = arg1.anInt3056 == 0 ? arg1.anInt3074 : arg1.anInt3056;
		@Pc(24) int local24 = arg1.anInt3078 == 0 ? arg1.anInt3071 : arg1.anInt3078;
		Static230.method5275(local12, arg1.anInt3093, local24, arg0, Static137.aClass117ArrayArray1[arg1.anInt3093 >> 16]);
		if (arg1.aClass117Array1 != null) {
			Static230.method5275(local12, arg1.anInt3093, local24, arg0, arg1.aClass117Array1);
		}
		@Pc(59) Class1_Sub38 local59 = (Class1_Sub38) Static22.aClass77_29.method1368((long) arg1.anInt3093);
		if (local59 != null) {
			Static336.method4812(local24, arg0, local59.anInt5050, local12);
		}
	}
}
