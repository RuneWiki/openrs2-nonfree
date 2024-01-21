import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dd", name = "lb", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array2;

	@OriginalMember(owner = "client!dd", name = "nb", descriptor = "Lclient!vd;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "Lclient!qf;")
	public static Class60 aClass60_323 = Static59.method1195("gleiten:");

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_324 = Static59.method1195("backbase1");

	@OriginalMember(owner = "client!dd", name = "bb", descriptor = "[I")
	public static int[] anIntArray86 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!dd", name = "cb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_325 = Static59.method1195("Handel akzeptieren");

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dd", name = "fb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_326 = Static59.method1195("On");

	@OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
	public static int anInt867 = 0;

	@OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
	public static final int anInt868 = 7759444;

	@OriginalMember(owner = "client!dd", name = "ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_327 = Static59.method1195("M");

	@OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
	public static int anInt869 = 0;

	@OriginalMember(owner = "client!dd", name = "kb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_328 = aClass60_326;

	@OriginalMember(owner = "client!dd", name = "mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_329 = Static59.method1195("cross");

	@OriginalMember(owner = "client!dd", name = "ob", descriptor = "Lclient!qf;")
	public static Class60 aClass60_330 = Static59.method1195("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[BI[Lclient!td;II)V")
	public static void method562(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class72[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (local7 + arg0 > 0 && arg0 + local7 < 103 && arg2 + local11 > 0 && arg2 + local11 < 103) {
						arg3[local3].anIntArrayArray78[arg0 + local7][local11 + arg2] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(90) Class3_Sub12 local90 = new Class3_Sub12(arg1);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
				for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
					Static77.method1567(0, arg4, local90, local11, arg2 + local104, arg0 + local100, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)Z")
	public static boolean method563(@OriginalArg(0) int arg0) {
		if (Static20.aBooleanArray20[arg0]) {
			return true;
		} else if (Static63.aClass25_28.method919(arg0)) {
			@Pc(34) int local34 = Static63.aClass25_28.method911(arg0);
			if (local34 == 0) {
				Static20.aBooleanArray20[arg0] = true;
				return true;
			}
			if (Static120.aClass3_Sub15ArrayArray1[arg0] == null) {
				Static120.aClass3_Sub15ArrayArray1[arg0] = new Class3_Sub15[local34];
			}
			for (@Pc(56) int local56 = 0; local56 < local34; local56++) {
				if (Static120.aClass3_Sub15ArrayArray1[arg0][local56] == null) {
					@Pc(70) byte[] local70 = Static63.aClass25_28.method931(local56, arg0);
					if (local70 != null) {
						Static120.aClass3_Sub15ArrayArray1[arg0][local56] = new Class3_Sub15();
						Static120.aClass3_Sub15ArrayArray1[arg0][local56].anInt2286 = local56 + (arg0 << 16);
						if (local70[0] == -1) {
							Static120.aClass3_Sub15ArrayArray1[arg0][local56].method1495(new Class3_Sub12(local70));
						} else {
							Static120.aClass3_Sub15ArrayArray1[arg0][local56].method1488(new Class3_Sub12(local70));
						}
					}
				}
			}
			Static20.aBooleanArray20[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!gd;BZLclient!jb;Lclient!jb;)V")
	public static void method564(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) Class25 arg3) {
		Static42.aClass25_8 = arg2;
		Static35.aClass25_6 = arg3;
		Static60.aBoolean58 = arg1;
		Static39.anInt1295 = Static35.aClass25_6.method911(10);
		Static80.aClass3_Sub1_Sub2_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V")
	public static void method565() {
		aClass60_323 = null;
		aClass60_327 = null;
		anIntArray86 = null;
		aClass60_326 = null;
		aClass60_324 = null;
		aClass60_325 = null;
		aClass79_1 = null;
		aClass60_329 = null;
		aCRC32_1 = null;
		aClass60Array2 = null;
		aClass60_330 = null;
		aClass60_328 = null;
	}
}
