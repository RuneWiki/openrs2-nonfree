import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "[B")
	public static byte[] aByteArray78;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_172 = new Class221("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	public static int anInt4956 = 0;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!dh;)V")
	public static void method4316(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		Static17.aClass33Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIII)V")
	public static void method4317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6;
		if (arg3 >= arg1) {
			for (local6 = arg1; local6 < arg3; local6++) {
				Static267.anIntArrayArray38[local6][arg0] = arg2;
			}
		} else {
			for (local6 = arg3; local6 < arg1; local6++) {
				Static267.anIntArrayArray38[local6][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)B")
	public static byte method4319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
