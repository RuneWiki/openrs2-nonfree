import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array10;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "[I")
	public static final int[] anIntArray399 = new int[1];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLclient!vv;)Lclient!pb;")
	public static Class273 method5906(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		@Pc(15) Class273 local15;
		if (Static362.aClass273_168 == null) {
			local15 = new Class273();
		} else {
			local15 = Static362.aClass273_168;
			Static362.aClass273_168 = Static362.aClass273_168.aClass273_114;
			Static137.anInt2258--;
			local15.aClass273_114 = null;
		}
		local15.aClass8_Sub1_Sub3_1 = arg0;
		return local15;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!la;Z)V")
	public static void method5907(@OriginalArg(0) Class208 arg0) {
		Static411.aClass208_96 = arg0;
	}
}
