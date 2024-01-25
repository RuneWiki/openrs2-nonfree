import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!sd;")
	public static final Class309 aClass309_1 = new Class309();

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "[I")
	public static final int[] anIntArray7 = new int[13];

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[128][128];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)Z")
	public static boolean method116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ff;IIILclient!ke;Lclient!iv;I)V")
	public static void method117(@OriginalArg(1) Class3_Sub1_Sub3_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub1_Sub3_Sub3_Sub2 arg4, @OriginalArg(6) Class161 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class2_Sub21 local12 = new Class2_Sub21();
		local12.anInt4682 = arg3 << 9;
		local12.anInt4690 = arg1;
		local12.anInt4688 = arg2 << 9;
		if (arg5 != null) {
			local12.aClass161_1 = arg5;
			@Pc(163) int local163 = arg5.anInt5411;
			@Pc(166) int local166 = arg5.anInt5389;
			if (arg6 == 1 || arg6 == 3) {
				local163 = arg5.anInt5389;
				local166 = arg5.anInt5411;
			}
			local12.anInt4687 = local166 + arg2 << 9;
			local12.anInt4683 = arg5.anInt5412;
			local12.anInt4686 = arg5.anInt5370;
			local12.anInt4684 = arg5.anInt5385;
			local12.anIntArray235 = arg5.anIntArray285;
			local12.anInt4692 = arg5.anInt5366;
			local12.aBoolean345 = arg5.aBoolean401;
			local12.anInt4691 = arg5.anInt5371 << 9;
			local12.anInt4675 = arg5.anInt5395;
			local12.anInt4693 = local163 + arg3 << 9;
			local12.anInt4681 = arg5.anInt5394;
			local12.aBoolean343 = arg5.aBoolean397;
			if (arg5.anIntArray288 != null) {
				local12.aBoolean344 = true;
				local12.method4085();
			}
			if (local12.anIntArray235 != null) {
				local12.anInt4677 = local12.anInt4683 + (int) ((double) (local12.anInt4675 - local12.anInt4683) * Math.random());
			}
			Static501.aClass341_59.method8528(local12);
			return;
		}
		if (arg0 != null) {
			local12.aClass3_Sub1_Sub3_Sub3_Sub1_1 = arg0;
			@Pc(35) Class27 local35 = arg0.aClass27_1;
			if (local35.anIntArray43 != null) {
				local12.aBoolean344 = true;
				local35 = local35.method727(Static286.aClass263_3);
			}
			if (local35 != null) {
				local12.anInt4693 = arg3 + local35.anInt666 << 9;
				local12.anInt4687 = arg2 + local35.anInt666 << 9;
				local12.anInt4686 = Static193.method3947(arg0);
				local12.anInt4692 = local35.anInt635;
				local12.anInt4691 = local35.anInt662 << 9;
				local12.anInt4681 = local35.anInt642;
				local12.anInt4684 = local35.anInt647;
				local12.aBoolean343 = local35.aBoolean53;
			}
			Static76.aClass341_25.method8528(local12);
			return;
		}
		if (arg4 == null) {
			return;
		}
		local12.aClass3_Sub1_Sub3_Sub3_Sub2_1 = arg4;
		local12.anInt4693 = arg4.method5214() + arg3 << 9;
		local12.anInt4687 = arg4.method5214() + arg2 << 9;
		local12.anInt4686 = Static73.method2125(arg4);
		local12.anInt4684 = 256;
		local12.anInt4691 = arg4.anInt6134 << 9;
		local12.anInt4681 = arg4.anInt6137;
		local12.anInt4692 = 256;
		local12.aBoolean343 = arg4.aBoolean457;
		Static458.aClass99_62.method3059((long) arg4.anInt6083, local12);
		return;
	}
}
