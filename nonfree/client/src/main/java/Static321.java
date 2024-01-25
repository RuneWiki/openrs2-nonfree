import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_18 = new Class225(0, 2, 2, 1);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public static void method4522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg1, 13);
		local8.method202();
		local8.anInt214 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)I")
	public static int method4523(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method4524(@OriginalArg(0) Class109 arg0) {
		if (Static322.anInt5636 != Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 && (Static268.aClass211ArrayArrayArray4 != null && Static298.method4261(arg0, Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95))) {
			Static322.anInt5636 = Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public static void method4526() {
		Static215.aClass27_26.method566();
		Static248.aClass42_10.method1066();
		Static124.aClass42_2.method1066();
	}
}
