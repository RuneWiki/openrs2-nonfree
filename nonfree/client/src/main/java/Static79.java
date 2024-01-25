import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	public static int anInt1760;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_63 = new Class106("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_58 = new Class18(51, -1);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public static void method1689() {
		for (@Pc(7) int local7 = 0; local7 < Static264.aByteArrayArrayArray7.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static264.aByteArrayArrayArray7[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static264.aByteArrayArrayArray7[0][0].length; local15++) {
					Static264.aByteArrayArrayArray7[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)I")
	public static int method1692() {
		return Static85.anInt1913;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!wc;IB)V")
	public static void method1695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub2_Sub6_Sub1 arg2) {
		@Pc(33) int local33 = Static279.method4985(-4, 0, 0, true, arg0, 0, 0, arg2.anIntArray505[0], Static133.anIntArray215, Static11.aClass196Array2[arg2.aByte79], arg2.anIntArray504[0], arg1, Static191.aClass11_Sub2_Sub6_Sub1_4.method5894(), Static15.anIntArray27);
		if (local33 >= 1) {
			for (@Pc(39) int local39 = 0; local39 < local33 - 1; local39++) {
				arg2.method5861((byte) 2, Static15.anIntArray27[local39], Static133.anIntArray215[local39]);
			}
		}
	}
}
