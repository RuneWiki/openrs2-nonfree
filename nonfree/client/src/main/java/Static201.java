import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!vn;")
	public static Class255 aClass255_2 = new Class255();

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Z")
	public static boolean aBoolean441 = false;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	public static final int anInt6625 = 12;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public static void method5144(@OriginalArg(1) int arg0) {
		if (Static142.anInt2689 == 0) {
			Static67.aClass4_Sub18_Sub4_2.method5758(arg0);
		} else {
			Static325.anInt5778 = arg0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ns;BLclient!ns;)I")
	public static int method5152(@OriginalArg(0) Class166 arg0, @OriginalArg(2) Class166 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method3670(Static240.anInt4396)) {
			local5++;
		}
		if (arg0.method3670(Static68.anInt4584)) {
			local5++;
		}
		if (arg0.method3670(Static220.anInt5563)) {
			local5++;
		}
		if (arg1.method3670(Static240.anInt4396)) {
			local5++;
		}
		if (arg1.method3670(Static68.anInt4584)) {
			local5++;
		}
		if (arg1.method3670(Static220.anInt5563)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public static void method5154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub1_Sub8 local12 = Static416.method5456(arg1, 5);
		local12.method2762();
		local12.anInt3611 = arg0;
	}
}
