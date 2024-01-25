import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "Lclient!lh;")
	public static Class58 aClass58_2;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!bca;")
	public static Class20 aClass20_3;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "[Lclient!qv;")
	public static Class6_Sub7[] aClass6_Sub7Array1;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "[S")
	public static short[] aShortArray17;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Lclient!ar;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
	public static int anInt363;

	@OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
	public static int anInt364;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_11 = new Class202("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_12 = new Class202("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
	public static int anInt362 = 0;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray1 = new int[2][][];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZI)I")
	public static int method466(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub16 local19 = Static218.method3456(false, arg0);
		if (local19 == null) {
			return Static209.aClass270_1.method6979(arg0).anInt7589;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local19.anIntArray128.length; local31++) {
			if (local19.anIntArray128[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static209.aClass270_1.method6979(arg0).anInt7589 - local19.anIntArray128.length;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)V")
	public static void method469(@OriginalArg(1) int arg0) {
		Static179.aLong91 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z")
	public static boolean method470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
