import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "[[[Lclient!dv;")
	public static Class89[][][] aClass89ArrayArrayArray2;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "Lclient!fia;")
	public static Class45 aClass45_20;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!uda;B)V")
	public static void method5926(@OriginalArg(0) Class14_Sub2_Sub20 arg0) {
		if (Static455.aBoolean533) {
			return;
		}
		arg0.method9513();
		Static638.anInt10454--;
		if (!arg0.aBoolean689) {
			@Pc(89) long local89 = arg0.aLong280;
			@Pc(95) Class14_Sub2_Sub17 local95;
			for (local95 = (Class14_Sub2_Sub17) Static468.aClass125_32.method2630(local89); local95 != null && !local95.aString104.equals(arg0.aString113); local95 = (Class14_Sub2_Sub17) Static468.aClass125_32.method2635()) {
			}
			if (local95 != null && local95.method8022(arg0)) {
				Static118.method1850(local95);
			}
			return;
		}
		for (@Pc(29) Class14_Sub2_Sub17 local29 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6494(); local29 != null; local29 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6491()) {
			if (local29.aString104.equals(arg0.aString113)) {
				@Pc(38) boolean local38 = false;
				for (@Pc(44) Class14_Sub2_Sub20 local44 = (Class14_Sub2_Sub20) local29.aClass269_142.method6494(); local44 != null; local44 = (Class14_Sub2_Sub20) local29.aClass269_142.method6491()) {
					if (local44 == arg0) {
						if (local29.method8022(arg0)) {
							Static118.method1850(local29);
						}
						local38 = true;
						break;
					}
				}
				if (local38) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public static void method5928(@OriginalArg(1) int arg0) {
		Static381.anInt6704 = arg0;
		Static19.anInt249 = -1;
		Static19.anInt249 = -1;
		Static23.method331();
	}
}
