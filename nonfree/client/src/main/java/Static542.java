import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_161 = new Class73(89, 0);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!vha;IIII)V")
	public static void method7642(@OriginalArg(0) Class356 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class6_Sub45 local10 = (Class6_Sub45) Static590.aClass163_60.method4966(); local10 != null; local10 = (Class6_Sub45) Static590.aClass163_60.method4965()) {
			if (arg2 == local10.anInt8274 && arg3 << 9 == local10.anInt8283 && local10.anInt8280 == arg1 << 9 && arg0.anInt10211 == local10.aClass356_1.anInt10211) {
				if (local10.aClass6_Sub4_Sub5_3 != null) {
					Static152.aClass6_Sub4_Sub3_2.method5197(local10.aClass6_Sub4_Sub5_3);
					local10.aClass6_Sub4_Sub5_3 = null;
				}
				if (local10.aClass6_Sub4_Sub5_2 != null) {
					Static152.aClass6_Sub4_Sub3_2.method5197(local10.aClass6_Sub4_Sub5_2);
					local10.aClass6_Sub4_Sub5_2 = null;
				}
				local10.method8792();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
	public static boolean method7645(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
