import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!nca;")
	public static Class254 aClass254_69;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "[I")
	public static final int[] anIntArray244 = new int[6];

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_58 = new Class225(137, 5);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BLclient!kg;)Lclient!gma;")
	public static Class142 method2738(@OriginalArg(1) Class4_Sub2_Sub1 arg0) {
		@Pc(16) Class142 local16;
		if (Static598.aClass142_3 == null) {
			local16 = new Class142();
		} else {
			local16 = Static598.aClass142_3;
			Static598.aClass142_3 = Static598.aClass142_3.aClass142_1;
			local16.aClass142_1 = null;
			Static532.anInt8452--;
		}
		local16.aClass4_Sub2_Sub1_1 = arg0;
		return local16;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILclient!et;)Lclient!rf;")
	public static Class321_Sub1 method2740(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(7) Class321 local7 = Static46.method601(arg0);
		@Pc(11) int local11 = arg0.method8595();
		return new Class321_Sub1(local7.anInt8627, local7.aClass18_15, local7.aClass239_17, local7.anInt8626, local7.anInt8628, local11);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([SII)[S")
	public static short[] method2741(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static728.method271(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
