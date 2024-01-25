import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_64 = new Class140(2);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!mh;BLclient!mh;)V")
	public static void method2081(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_248 != null) {
			arg1.method5710();
		}
		arg1.aClass1_248 = arg0.aClass1_248;
		arg1.aClass1_247 = arg0;
		arg1.aClass1_248.aClass1_247 = arg1;
		arg1.aClass1_247.aClass1_248 = arg1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!om;II)V")
	public static void method2083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub28 arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg3 << 14 | arg0 << 28);
		@Pc(22) Class1_Sub39 local22 = (Class1_Sub39) Static52.aClass26_4.method870(local16);
		if (local22 == null) {
			local22 = new Class1_Sub39();
			Static52.aClass26_4.method877(local16, local22);
			local22.aClass195_47.method5018(arg2);
			return;
		}
		@Pc(51) Class61 local51 = Static241.method4285(arg2.anInt4495);
		@Pc(54) int local54 = local51.anInt1801;
		if (local51.anInt1803 == 1) {
			local54 *= arg2.anInt4493 + 1;
		}
		for (@Pc(73) Class1_Sub28 local73 = (Class1_Sub28) local22.aClass195_47.method5029(); local73 != null; local73 = (Class1_Sub28) local22.aClass195_47.method5021()) {
			local51 = Static241.method4285(local73.anInt4495);
			@Pc(83) int local83 = local51.anInt1801;
			if (local51.anInt1803 == 1) {
				local83 *= local73.anInt4493 + 1;
			}
			if (local54 > local83) {
				method2081(local73, arg2);
				return;
			}
		}
		local22.aClass195_47.method5018(arg2);
	}
}
