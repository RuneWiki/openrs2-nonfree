import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_56 = new Class96("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "Lclient!nc;")
	public static final Class171 aClass171_2 = new Class171(0);

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
	public static int anInt3545 = -2;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Z")
	public static boolean aBoolean276 = false;

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "[Lclient!dn;")
	public static final Class58[] aClass58Array1 = new Class58[14];

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIZILclient!hh;)V")
	public static void method3033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class109 arg2) {
		Static85.anInt1527 = 0;
		Static105.anInt2081 = arg0;
		Static428.anInt7488 = arg1;
		Static25.anInt424 = 1;
		Static289.aClass109_67 = arg2;
		Static386.anInt6855 = 10000;
		Static67.aBoolean107 = false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIB)Z")
	public static boolean method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static228.aByteArrayArrayArray8[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public static void method3035(@OriginalArg(0) int arg0) {
		Static360.anInt6590 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static251.anInt4344; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static219.anInt3872; local6++) {
				if (Static131.aClass137ArrayArrayArray2[arg0][local3][local6] == null) {
					Static131.aClass137ArrayArrayArray2[arg0][local3][local6] = new Class137(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	public static void method3036() {
		Static119.anInt2296 = 0;
		Static251.aClass142_26.method3206();
		Static378.aBoolean549 = false;
	}
}
