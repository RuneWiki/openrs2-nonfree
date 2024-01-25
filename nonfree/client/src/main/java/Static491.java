import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!rha", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!rha", name = "u", descriptor = "I")
	public static int anInt8078;

	@OriginalMember(owner = "client!rha", name = "w", descriptor = "Lclient!cw;")
	public static Class61 aClass61_27;

	@OriginalMember(owner = "client!rha", name = "x", descriptor = "I")
	public static int anInt8079;

	@OriginalMember(owner = "client!rha", name = "m", descriptor = "I")
	public static final int anInt8075 = -1;

	@OriginalMember(owner = "client!rha", name = "r", descriptor = "Lclient!ow;")
	public static final Class260 aClass260_9 = new Class260("", 16);

	@OriginalMember(owner = "client!rha", name = "s", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_275 = new Class288(4, -2);

	@OriginalMember(owner = "client!rha", name = "t", descriptor = "Z")
	public static boolean aBoolean605 = false;

	@OriginalMember(owner = "client!rha", name = "v", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_276 = new Class288(76, -1);

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIIILclient!ad;)V")
	public static void method6843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub4 arg3) {
		@Pc(16) long local16 = (long) (arg2 | arg0 << 28 | arg1 << 14);
		@Pc(22) Class2_Sub11 local22 = (Class2_Sub11) Static41.aClass118_6.method2595(local16);
		if (local22 == null) {
			local22 = new Class2_Sub11();
			Static41.aClass118_6.method2601(local22, local16);
			local22.aClass109_23.method2323(arg3);
			return;
		}
		@Pc(50) Class34 local50 = Static72.aClass225_2.method4789(arg3.anInt69);
		@Pc(53) int local53 = local50.anInt867;
		if (local50.anInt858 == 1) {
			local53 *= arg3.anInt71 + 1;
		}
		for (@Pc(70) Class2_Sub4 local70 = (Class2_Sub4) local22.aClass109_23.method2325(); local70 != null; local70 = (Class2_Sub4) local22.aClass109_23.method2318()) {
			local50 = Static72.aClass225_2.method4789(local70.anInt69);
			@Pc(81) int local81 = local50.anInt867;
			if (local50.anInt858 == 1) {
				local81 *= local70.anInt71 + 1;
			}
			if (local53 > local81) {
				Static451.method2192(arg3, local70);
				return;
			}
		}
		local22.aClass109_23.method2323(arg3);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZI)Lclient!jl;")
	public static Class13_Sub6 method6848(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) Class171[] local7 = Class169.aClass171Array1;
		synchronized (Class169.aClass171Array1) {
			@Pc(30) Class13_Sub6 local30;
			if (arg0 >= Class169.aClass171Array1.length || Class169.aClass171Array1[arg0].method3750()) {
				local30 = new Class13_Sub6();
				local30.aClass13_Sub2Array1 = new Class13_Sub2[arg0];
				for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
					local30.aClass13_Sub2Array1[local52] = new Class13_Sub2();
				}
			} else {
				local30 = (Class13_Sub6) Class169.aClass171Array1[arg0].method3749();
				local30.method8394();
				@Pc(37) int local37 = Static470.anIntArray544[arg0]--;
			}
			local30.aBoolean298 = arg1;
			return local30;
		}
	}
}
