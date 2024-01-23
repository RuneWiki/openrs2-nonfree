import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "D", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!af", name = "G", descriptor = "Z")
	public static boolean aBoolean13;

	@OriginalMember(owner = "client!af", name = "N", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "[Lclient!lj;")
	public static Class60[] aClass60Array3;

	@OriginalMember(owner = "client!af", name = "I", descriptor = "I")
	public static int anInt309 = 0;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "Lclient!i;")
	public static Class41 aClass41_59 = Static184.method2923("sl_stars");

	@OriginalMember(owner = "client!af", name = "S", descriptor = "[S")
	public static short[] aShortArray9 = new short[256];

	@OriginalMember(owner = "client!af", name = "U", descriptor = "I")
	public static int anInt315 = 0;

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array3 = new Class41[1000];

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
	public static void method238() {
		Static214.aClass16_11.method436();
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	public static void method240() {
		Static141.anIntArray337 = null;
		Static196.anIntArray463 = null;
		Static208.aByteArrayArrayArray13 = null;
		Static196.anIntArray462 = null;
		Static120.anIntArrayArrayArray15 = null;
		Static136.anIntArray332 = null;
		Static97.aByteArrayArrayArray6 = null;
		Static7.aByteArrayArrayArray2 = null;
		Static147.aByteArrayArrayArray9 = null;
		Static95.aByteArrayArrayArray5 = null;
		Static74.anIntArray194 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
	public static void method243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass35_1 = null;
		}
	}
}
