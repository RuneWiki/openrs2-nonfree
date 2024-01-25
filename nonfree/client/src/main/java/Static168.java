import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array29;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	public static final int anInt3459 = 1337;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V")
	public static void method2961() {
		Static84.anInt1838 = -1;
		Static194.aClass83_72 = null;
		Static131.anInt2857 = -1;
		Static333.anInt6164 = 2;
		Static348.anInt6384 = 1;
		Static19.anInt320 = 0;
		Static350.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIILclient!qo;Lclient!cj;BLclient!cu;I)V")
	public static void method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2_Sub1_Sub2 arg3, @OriginalArg(4) Class1_Sub2_Sub1_Sub1 arg4, @OriginalArg(6) Class47 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub41 local7 = new Class2_Sub41();
		local7.anInt6930 = arg1;
		local7.anInt6938 = arg6 * 128;
		local7.anInt6932 = arg2 * 128;
		if (arg5 != null) {
			local7.aClass47_1 = arg5;
			@Pc(138) int local138 = arg5.anInt1247;
			@Pc(141) int local141 = arg5.anInt1241;
			if (arg0 == 1 || arg0 == 3) {
				local138 = arg5.anInt1241;
				local141 = arg5.anInt1247;
			}
			local7.anInt6934 = arg5.anInt1280;
			local7.anInt6931 = arg5.anInt1238;
			local7.anInt6936 = arg5.anInt1233;
			local7.anIntArray581 = arg5.anIntArray94;
			local7.anInt6945 = arg5.anInt1282;
			local7.anInt6939 = (arg6 + local138) * 128;
			local7.anInt6942 = arg5.anInt1242 * 128;
			local7.anInt6941 = (local141 + arg2) * 128;
			if (arg5.anIntArray95 != null) {
				local7.aBoolean486 = true;
				local7.method5986();
			}
			if (local7.anIntArray581 != null) {
				local7.anInt6943 = local7.anInt6934 + (int) (Math.random() * (double) (local7.anInt6945 - local7.anInt6934));
			}
			Static314.aClass238_34.method5796(local7);
			return;
		}
		if (arg3 != null) {
			local7.aClass1_Sub2_Sub1_Sub2_1 = arg3;
			@Pc(34) Class197 local34 = arg3.aClass197_1;
			if (local34.anIntArray468 != null) {
				local7.aBoolean486 = true;
				local34 = local34.method4832(Static179.aClass115_1);
			}
			if (local34 != null) {
				local7.anInt6939 = (arg6 + local34.anInt5486) * 128;
				local7.anInt6941 = (local34.anInt5486 + arg2) * 128;
				local7.anInt6936 = Static350.method5583(arg3);
				local7.anInt6942 = local34.anInt5500 * 128;
				local7.anInt6931 = local34.anInt5483;
			}
			Static126.aClass238_8.method5796(local7);
			return;
		}
		if (arg4 == null) {
			return;
		}
		local7.aClass1_Sub2_Sub1_Sub1_2 = arg4;
		local7.anInt6939 = (arg4.method4792() + arg6) * 128;
		local7.anInt6941 = (arg4.method4792() + arg2) * 128;
		local7.anInt6936 = Static369.method5879(arg4);
		local7.anInt6931 = arg4.anInt955;
		local7.anInt6942 = arg4.anInt964 * 128;
		Static309.aClass243_26.method5968((long) arg4.anInt5374, local7);
		return;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIB)V")
	public static void method2963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static329.aByteArrayArrayArray17 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BB)C")
	public static char method2964(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static322.aCharArray6[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)V")
	public static void method2965(@OriginalArg(0) boolean arg0) {
		Static48.aBoolean73 = arg0;
		if (Static230.aClass96_4 != null) {
			Static230.aClass96_4.method2300(!Static40.method575());
		}
	}
}
