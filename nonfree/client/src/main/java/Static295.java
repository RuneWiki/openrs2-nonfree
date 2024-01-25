import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!laa", name = "K", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_82 = new Class349(33, 4);

	@OriginalMember(owner = "client!laa", name = "N", descriptor = "Lclient!nb;")
	public static final Class232 aClass232_12 = new Class232("WTWIP", 3);

	@OriginalMember(owner = "client!laa", name = "O", descriptor = "[I")
	public static final int[] anIntArray338 = new int[2048];

	@OriginalMember(owner = "client!laa", name = "P", descriptor = "I")
	public static int anInt4972 = 0;

	@OriginalMember(owner = "client!laa", name = "Q", descriptor = "I")
	public static int anInt4973 = 0;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4257(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub34 local16 = Static555.method7264(Static336.aClass154_71, Static551.aClass64_2);
		local16.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(arg0) + 1);
		local16.aClass2_Sub7_Sub2_2.method4456(arg1);
		local16.aClass2_Sub7_Sub2_2.method4481(arg0);
		Static100.method1508(local16);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!lr;I)V")
	public static void method4258(@OriginalArg(0) Class2_Sub7_Sub2 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static179.anInt2668; local15++) {
			@Pc(21) int local21 = Static302.anIntArray350[local15];
			@Pc(25) Class12_Sub2_Sub1_Sub4_Sub1 local25 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local21];
			@Pc(29) int local29 = arg0.method4464();
			if ((local29 & 0x1) != 0) {
				local29 += arg0.method4464() << 8;
			}
			if ((local29 & 0x2000) != 0) {
				local29 += arg0.method4464() << 16;
			}
			Static6.method119(local21, local25, local29, arg0);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!uca;IIII)Lclient!ei;")
	public static Class3_Sub1_Sub1 method4259(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		if (arg0.aBoolean739 || Static259.method3656(arg2) && Static259.method3656(arg1)) {
			return new Class3_Sub1_Sub1(arg0, 3553, 6408, arg2, arg1);
		} else if (arg0.aBoolean735) {
			return new Class3_Sub1_Sub1(arg0, 34037, 6408, arg2, arg1);
		} else {
			return new Class3_Sub1_Sub1(arg0, 6408, arg2, arg1, Static355.method5078(arg2), Static355.method5078(arg1));
		}
	}
}
