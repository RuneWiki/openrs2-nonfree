import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	public static int anInt2616;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "[Lclient!na;")
	public static Class64[] aClass64Array1;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
	public static int anInt2614 = 0;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "[I")
	public static final int[] anIntArray218 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_10 = new Class87(5, 7);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
	public static void method2157() {
		@Pc(10) int local10 = Static207.anInt4136;
		@Pc(12) int[] local12 = Static322.anIntArray436;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) Class1_Sub3_Sub3_Sub1 local21 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local12[local14]];
			if (local21 != null && local21.anInt6119 > 0) {
				local21.anInt6119--;
				if (local21.anInt6119 == 0) {
					local21.aString57 = null;
				}
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static453.anInt7682; local50++) {
			@Pc(55) int local55 = Static29.anIntArray56[local50];
			@Pc(59) Class1_Sub3_Sub3_Sub2 local59 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local55];
			if (local59 != null && local59.anInt6119 > 0) {
				local59.anInt6119--;
				if (local59.anInt6119 == 0) {
					local59.aString57 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
	public static void method2158() {
		Static191.aClass5_33.method106(50);
		Static229.aClass5_36.method106(50);
		Static281.aClass5_46.method106(50);
		Static248.aClass5_39.method106(50);
		Static420.aClass5_56.method106(50);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)Lclient!vs;")
	public static Class13_Sub7 method2160(@OriginalArg(0) int arg0) {
		@Pc(7) Class40[] local7 = Class3_Sub4_Sub7.aClass40Array1;
		synchronized (Class3_Sub4_Sub7.aClass40Array1) {
			@Pc(32) Class13_Sub7 local32;
			if (Class3_Sub4_Sub7.aClass40Array1.length <= arg0 || Class3_Sub4_Sub7.aClass40Array1[arg0].method1196()) {
				local32 = new Class13_Sub7();
				local32.aClass13_Sub1Array1 = new Class13_Sub1[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass13_Sub1Array1[local38] = new Class13_Sub1();
				}
			} else {
				local32 = (Class13_Sub7) Class3_Sub4_Sub7.aClass40Array1[arg0].method1189();
				local32.method5934();
				@Pc(71) int local71 = Static251.anIntArray365[arg0]--;
			}
			return local32;
		}
	}
}
