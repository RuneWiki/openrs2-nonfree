import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	public static int anInt7065;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	public static int anInt7067;

	@OriginalMember(owner = "client!od", name = "H", descriptor = "[I")
	public static int[] anIntArray443;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Z")
	public static final boolean aBoolean534 = false;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!gj;Lclient!gj;Lclient!pt;Lclient!lv;Lclient!gj;)Z")
	public static boolean method5980(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) Class3_Sub9_Sub5 arg2, @OriginalArg(4) Class232 arg3, @OriginalArg(5) Class143 arg4) {
		Static272.aClass143_65 = arg0;
		Static311.aClass143_78 = arg4;
		Static136.aClass143_35 = arg1;
		Static256.aClass232_3 = arg3;
		Static426.anIntArray450 = new int[16];
		Static402.aClass3_Sub9_Sub5_2 = arg2;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static426.anIntArray450[local25] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qj;I)[I")
	public static int[] method5981(@OriginalArg(0) Class3_Sub44 arg0) {
		@Pc(10) Class3_Sub17 local10 = new Class3_Sub17(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method4849(10);
		local10.method4854(local13[0]);
		local10.method4854(local13[1]);
		local10.method4854(local13[2]);
		local10.method4854(local13[3]);
		for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
			local10.method4854((int) (Math.random() * 9.9999999E7D));
		}
		local10.method4876((int) (Math.random() * 9.9999999E7D));
		local10.method4882(Static546.aBigInteger5, Static192.aBigInteger1);
		arg0.aClass3_Sub17_Sub2_3.method4838(0, local10.lb, local10.aByteArray59);
		return local13;
	}
}
