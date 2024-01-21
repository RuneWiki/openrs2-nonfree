import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_6;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!df;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public static int anInt919 = 0;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean60 = false;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Lclient!rd;")
	private static Class64 aClass64_605 = Static69.method1153("Loaded textures");

	@OriginalMember(owner = "client!h", name = "m", descriptor = "I")
	public static int anInt925 = 0;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!rd;")
	private static Class64 aClass64_609 = Static69.method1153("Please remove ");

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_606 = aClass64_609;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Lclient!rd;")
	private static Class64 aClass64_607 = Static69.method1153("Loaded gamescreen");

	@OriginalMember(owner = "client!h", name = "q", descriptor = "I")
	public static int anInt927 = 0;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_608 = aClass64_609;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Lclient!rd;")
	public static Class64 aClass64_610 = aClass64_607;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_611 = aClass64_605;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "Lclient!rd;")
	public static Class64 aClass64_612 = null;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!hf;")
	public static Class1_Sub1_Sub7 method689(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub7 local10 = (Class1_Sub1_Sub7) Static55.aClass19_109.method410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static57.aClass41_33.method1062(4, arg0);
		local10 = new Class1_Sub1_Sub7();
		if (local25 != null) {
			local10.method800(new Class1_Sub6(local25), arg0);
		}
		local10.method802();
		Static55.aClass19_109.method409(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V")
	public static void method690(@OriginalArg(1) int arg0) {
		if (Static79.aClass17_1 == null) {
			return;
		}
		if (Static90.anInt560 == 0) {
			if (Static28.anInt2362 < 0) {
				return;
			}
			Static28.anInt2362 = arg0;
			Static79.aClass17_1.method2000(0, arg0);
		} else if (Static53.aByteArray9 != null) {
			Static15.anInt472 = arg0;
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public static void method694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub14 local8 = (Class1_Sub14) Static110.aClass58_8.method1380((long) arg0);
		if (local8 == null) {
			local8 = new Class1_Sub14();
			Static110.aClass58_8.method1378((long) arg0, local8);
		}
		if (local8.anIntArray385.length <= arg3) {
			@Pc(38) int[] local38 = new int[arg3 + 1];
			@Pc(43) int[] local43 = new int[arg3 + 1];
			for (@Pc(45) int local45 = 0; local45 < local8.anIntArray385.length; local45++) {
				local38[local45] = local8.anIntArray385[local45];
				local43[local45] = local8.anIntArray384[local45];
			}
			for (@Pc(71) int local71 = local8.anIntArray385.length; local71 < arg3; local71++) {
				local38[local71] = -1;
				local43[local71] = 0;
			}
			local8.anIntArray384 = local43;
			local8.anIntArray385 = local38;
		}
		local8.anIntArray385[arg3] = arg2;
		local8.anIntArray384[arg3] = arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method695() {
		aClass64_607 = null;
		aClass64_606 = null;
		aClass64_609 = null;
		aClass64_608 = null;
		aClass1_Sub1_Sub5_Sub3_6 = null;
		aClass20_1 = null;
		aClass64_610 = null;
		aClass64_612 = null;
		aClass64_605 = null;
		aClass64_611 = null;
	}
}
