import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ow", name = "Pb", descriptor = "Lclient!wp;")
	public static Class273 aClass273_2;

	@OriginalMember(owner = "client!ow", name = "Mb", descriptor = "[I")
	public static final int[] anIntArray451 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ow", name = "Nb", descriptor = "Z")
	public static final boolean aBoolean392 = false;

	@OriginalMember(owner = "client!ow", name = "Qb", descriptor = "I")
	public static int anInt5551 = 0;

	@OriginalMember(owner = "client!ow", name = "Rb", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_87 = new Class21("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!ow", name = "Ub", descriptor = "[B")
	public static final byte[] aByteArray78 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "([BIB)[B")
	public static byte[] method4625(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static474.method3327(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
