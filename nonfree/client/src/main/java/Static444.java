import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!we", name = "x", descriptor = "Lclient!um;")
	public static Class247 aClass247_5;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "Z")
	public static final boolean aBoolean493 = false;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_145 = new Class55("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!we", name = "B", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_160 = new Class253(22, -1);

	@OriginalMember(owner = "client!we", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[128][128];

	@OriginalMember(owner = "client!we", name = "D", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_111 = new Class2(8, 2);

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)I")
	public static int method5654(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(35) int local35 = local22 | local22 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}
}
