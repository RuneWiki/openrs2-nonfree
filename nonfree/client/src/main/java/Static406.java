import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt7056;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_20 = new Class87(0, 7);

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public static int anInt7057 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
	public static int method5476(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[[I)V")
	public static void method5482(@OriginalArg(1) int[][] arg0) {
		Static376.anIntArrayArray64 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLclient!vs;)V")
	public static void method5483(@OriginalArg(1) Class13_Sub7 arg0) {
		arg0.aClass1_1 = null;
		@Pc(12) int local12 = arg0.aClass13_Sub1Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass13_Sub1Array1[local14].aBoolean23 = false;
		}
		@Pc(28) Class40[] local28 = Class3_Sub4_Sub7.aClass40Array1;
		synchronized (Class3_Sub4_Sub7.aClass40Array1) {
			if (local12 < Class3_Sub4_Sub7.aClass40Array1.length && Static251.anIntArray365[local12] < 200) {
				Class3_Sub4_Sub7.aClass40Array1[local12].method1190(arg0);
				@Pc(53) int local53 = Static251.anIntArray365[local12]++;
			}
		}
	}
}
