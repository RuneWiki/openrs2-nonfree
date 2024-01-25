import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_61 = new Class214(28, 4);

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public static final int anInt1662 = -1;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!og;)V")
	public static void method1515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub4 arg4) {
		@Pc(4) Class162 local4 = Static408.method5689(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1658 = (arg1 << Static391.anInt6797) + Static423.anInt7318;
		arg4.anInt1663 = arg3;
		arg4.anInt1659 = (arg2 << Static391.anInt6797) + Static423.anInt7318;
		for (@Pc(28) Class199 local28 = local4.aClass199_1; local28 != null; local28 = local28.aClass199_2) {
			if (local28.aClass11_Sub5_1.aBoolean553) {
				@Pc(38) int local38 = local28.aClass11_Sub5_1.method6044();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1663 += local8;
			arg4.aBoolean121 = true;
		} else if (local4.aClass11_Sub1_2 != null) {
			arg4.anInt1663 -= local4.aClass11_Sub1_2.aShort107;
		}
		local4.aClass11_Sub4_1 = arg4;
	}
}
