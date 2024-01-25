import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "[[Lclient!ub;")
	public static Class1_Sub4[][] aClass1_Sub4ArrayArray3;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "[[Lclient!n;")
	public static Class225[][] aClass225ArrayArray1;

	@OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
	public static int anInt6653;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
	public static int anInt6644 = 0;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V")
	public static void method5576() {
		@Pc(7) int local7 = Static413.anInt8212;
		@Pc(9) int[] local9 = Static229.anIntArray201;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class1_Sub4_Sub2_Sub1_Sub2 local19 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt8399 > 0) {
				local19.anInt8399--;
				if (local19.anInt8399 == 0) {
					local19.aString76 = null;
				}
			}
		}
		for (@Pc(46) int local46 = 0; local46 < Static418.anInt7866; local46++) {
			@Pc(53) long local53 = (long) Static43.anIntArray23[local46];
			@Pc(59) Class4_Sub4 local59 = (Class4_Sub4) Static585.aClass350_41.method8207(local53);
			if (local59 != null) {
				@Pc(64) Class1_Sub4_Sub2_Sub1_Sub1 local64 = local59.aClass1_Sub4_Sub2_Sub1_Sub1_1;
				if (local64.anInt8399 > 0) {
					local64.anInt8399--;
					if (local64.anInt8399 == 0) {
						local64.aString76 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(II)I")
	public static int method5578(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V")
	public static void method5579() {
		Static285.method5604(11);
		Static139.method2733();
		System.gc();
	}
}
