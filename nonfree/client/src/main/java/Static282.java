import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!dja;II)V")
	public static void method3898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class5_Sub38 local12 = (Class5_Sub38) Static351.aClass124_58.method2572(); local12 != null; local12 = (Class5_Sub38) Static351.aClass124_58.method2569()) {
			if (local12.anInt6688 == arg1 && arg0 << 9 == local12.anInt6691 && local12.anInt6680 == arg3 << 9 && local12.aClass81_1.anInt1883 == arg2.anInt1883) {
				if (local12.aClass5_Sub14_Sub1_3 != null) {
					Static229.aClass5_Sub14_Sub3_1.method2294(local12.aClass5_Sub14_Sub1_3);
					local12.aClass5_Sub14_Sub1_3 = null;
				}
				if (local12.aClass5_Sub14_Sub1_2 != null) {
					Static229.aClass5_Sub14_Sub3_1.method2294(local12.aClass5_Sub14_Sub1_2);
					local12.aClass5_Sub14_Sub1_2 = null;
				}
				local12.method8829();
				return;
			}
		}
	}
}
