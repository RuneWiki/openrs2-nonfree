import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public static void method2278() {
		@Pc(5) int local5 = 0;
		if (Static336.aClass3_Sub41_18.aClass14_Sub17_1.method5487() == 1) {
			local5 = 55;
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub8_1.method2916() == 0) {
			local5 |= 0x40;
		}
		Static614.method8323(local5);
		Static466.aClass340_6.method7667(local5);
		Static117.aClass197_2.method4522(local5);
		Static267.aClass196_1.method4476(local5);
		Static366.aClass182_2.method4105(local5);
		Static582.method7718(local5);
		Static262.method3913(local5);
		Static437.method5970(local5);
		Static399.method5514(local5);
		Static364.method5249();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(JJ)J")
	public static long method2279(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
