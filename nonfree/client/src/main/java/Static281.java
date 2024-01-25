import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!hf;")
	public static Class105 aClass105_10;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!l;")
	public static Class17 aClass17_58;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray41;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Lclient!rm;")
	public static final Class216 aClass216_16 = new Class216(0);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)V")
	public static void method5820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub5_Sub13 local10 = Static208.method3306(arg2, 9);
		local10.method4547();
		local10.anInt5643 = arg1;
		local10.anInt5641 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	public static void method5823() {
		if (Static410.anInt6841 == -1) {
			return;
		}
		@Pc(12) int local12 = Static109.aClass1_2.method702();
		@Pc(16) int local16 = Static109.aClass1_2.method698();
		@Pc(21) Class2_Sub15 local21 = (Class2_Sub15) Static360.aClass14_47.method309();
		if (local21 != null) {
			local12 = local21.method2334();
			local16 = local21.method2336();
		}
		Static13.method292(Static86.anInt4394, Static395.anInt6582, 0, 0, Static410.anInt6841, 0, 0, local12, local16);
		if (Static193.aClass68_8 != null) {
			Static249.method3797(local16, local12);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!si;B)Lclient!ql;")
	public static Class206 method5826(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(12) Class206 local12 = new Class206();
		local12.anInt5626 = arg0.method5500();
		local12.aClass2_Sub5_Sub10_1 = Static181.aClass71_1.method1830(local12.anInt5626);
		return local12;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
	public static boolean method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	public static void method5828() {
		Static308.aClass163_35.method3767();
		Static142.aClass163_14.method3767();
	}
}
