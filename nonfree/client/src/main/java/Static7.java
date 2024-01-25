import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	public static int anInt1914 = 0;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_6 = new Class70(12, 0, 1, 0);

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!of;")
	public static final Class174 aClass174_61 = new Class174("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "[S")
	public static short[] aShortArray31 = new short[256];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method1785() {
		Static443.method6070();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static250.aClass128Array1[local13].method3177();
		}
		Static138.method2121();
		Static342.method4772();
		System.gc();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!uu;Lclient!uu;)I")
	public static int method1786(@OriginalArg(1) Class250 arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method5813(Static200.anInt3583)) {
			local5++;
		}
		if (arg0.method5813(Static110.anInt1951)) {
			local5++;
		}
		if (arg0.method5813(Static339.anInt5693)) {
			local5++;
		}
		if (arg1.method5813(Static200.anInt3583)) {
			local5++;
		}
		if (arg1.method5813(Static110.anInt1951)) {
			local5++;
		}
		if (arg1.method5813(Static339.anInt5693)) {
			local5++;
		}
		return local5;
	}
}
