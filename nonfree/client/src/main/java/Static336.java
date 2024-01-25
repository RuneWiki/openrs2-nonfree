import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_115 = new Class93("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_116 = new Class93("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray62 = new String[100];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!tq;Lclient!ul;)V")
	public static void method5825(@OriginalArg(1) Class191 arg0, @OriginalArg(2) Interface7 arg1) {
		Static326.anInterface7_8 = arg1;
		Static302.aClass191_191 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5826(@OriginalArg(1) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static359.method687(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)I")
	public static int method5827() {
		@Pc(7) Class4 local7 = Static147.aClass4_2;
		@Pc(9) boolean local9 = false;
		if (Static129.anInt2728 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static5.method4241(null, null, 0, local15, 0);
		}
		@Pc(32) long local32 = Static51.method1197();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method4286();
		}
		@Pc(59) int local59 = (int) (Static51.method1197() - local32);
		local7.method4261(0, 0, 100, 100, -16777216);
		if (local9) {
			local7.method4238();
		}
		return local59;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method5828() {
		Static122.aClass119_139.method3304();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method5829(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static292.method5189(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg0.charAt(local33) != arg1; local33++) {
			}
			local15[local17++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local15[local10] = arg0.substring(local27);
		return local15;
	}
}
