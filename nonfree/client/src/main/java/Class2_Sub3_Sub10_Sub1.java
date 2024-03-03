import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class2_Sub3_Sub10_Sub1 extends Class2_Sub3_Sub10 {

	@OriginalMember(owner = "client!uq", name = "db", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_137 = new Class79("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!uq", name = "fb", descriptor = "[Z")
	public static final boolean[] aBooleanArray59 = new boolean[100];

	@OriginalMember(owner = "client!uq", name = "gb", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_138 = new Class79("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!uq", name = "hb", descriptor = "[J")
	public static final long[] aLongArray12 = new long[32];

	@OriginalMember(owner = "client!uq", name = "ib", descriptor = "I")
	public static int anInt6670 = 0;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IB)[[I", line = 25)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478 && this.method5984()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = arg0 % super.anInt6667 * super.anInt6667;
			for (@Pc(46) int local46 = 0; local46 < Static211.anInt4031; local46++) {
				@Pc(58) int local58 = super.anIntArray463[local46 % super.anInt6659 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
