import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dd", name = "cb", descriptor = "Lclient!k;")
	public static Class33 aClass33_7;

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "Lclient!k;")
	public static Class33 aClass33_8;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "Lclient!wb;")
	public static Class65 aClass65_304 = Static24.method441("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Lclient!s;")
	public static Class52 aClass52_4 = new Class52();

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "Lclient!wb;")
	public static Class65 aClass65_305 = Static24.method441(" ");

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "Lclient!wb;")
	public static Class65 aClass65_306 = Static24.method441("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "Lclient!wb;")
	private static Class65 aClass65_307 = Static24.method441("Walk here");

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_308 = aClass65_307;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "[[[Lclient!s;")
	public static Class52[][][] aClass52ArrayArrayArray1 = new Class52[4][104][104];

	@OriginalMember(owner = "client!dd", name = "bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_309 = Static24.method441("(U(Y");

	@OriginalMember(owner = "client!dd", name = "eb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_310 = Static24.method441("Use");

	@OriginalMember(owner = "client!dd", name = "fb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_311 = aClass65_310;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method415() {
		aClass65_309 = null;
		aClass33_8 = null;
		aClass52ArrayArrayArray1 = null;
		aClass65_305 = null;
		aClass65_311 = null;
		aClass33_7 = null;
		aClass52_4 = null;
		aClass65_310 = null;
		aClass65_308 = null;
		aClass65_304 = null;
		aClass65_306 = null;
		aClass65_307 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[B)I")
	public static int method416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg0; local3++) {
			local1 = Class33_Sub1.anIntArray265[(local1 ^ arg2[local3]) & 0xFF] ^ local1 >>> 8;
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIII)I")
	public static int method418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = 256 - arg0;
		return ((arg2 & 0xFF00) * arg0 + local9 * (arg1 & 0xFF00) & 0xFF0000) + ((arg1 & 0xFF00FF) * local9 + arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}
}
