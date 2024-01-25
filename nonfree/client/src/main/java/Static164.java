import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!hu", name = "N", descriptor = "Lclient!nc;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!hu", name = "M", descriptor = "I")
	public static int anInt3507 = 0;

	@OriginalMember(owner = "client!hu", name = "P", descriptor = "[I")
	public static final int[] anIntArray262 = new int[3];

	@OriginalMember(owner = "client!hu", name = "S", descriptor = "Lclient!qd;")
	public static Class190 aClass190_5 = null;

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(II)I")
	public static int method2883(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V")
	public static void method2884(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static210.aClass3_Sub3_Sub5_3 != null) {
			Static79.anInt1714 = Static210.aClass3_Sub3_Sub5_3.anInt1177;
		} else {
			Static79.anInt1714 = -1;
		}
		Static281.anInt5171 = 0;
		Static210.aClass3_Sub3_Sub5_3 = null;
		Static118.aClass68_3 = null;
		Static316.aClass229_35 = null;
		Static210.method5878();
		Static210.aClass229_48.method5326();
		Static286.aClass244_14 = null;
		Static273.aClass22_14 = null;
		Static336.anInt6190 = -1;
		Static192.aClass244_7 = null;
		Static353.aClass244_15 = null;
		Static265.aClass244_12 = null;
		Static20.aClass244_3 = null;
		Static140.aClass244_6 = null;
		Static210.aClass226_3 = null;
		Static255.aClass244_9 = null;
		Static293.anInt3444 = -1;
		Static451.aClass244_16 = null;
		Static210.aClass61_4.method1424();
		Static210.aClass123_4.method3177(64, 64);
		Static210.aClass61_4.method1422(64, 128);
		Static210.aClass25_4.method856(64);
		Static35.aClass227_2.method5295(64);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIII)V")
	public static void method2885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static336.anIntArrayArray50 != null) {
			Static336.anIntArrayArray50[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static215.aByteArrayArray13 != null) {
			Static215.aByteArrayArray13[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static44.aByteArrayArray21 != null) {
			Static44.aByteArrayArray21[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(ZI)V")
	public static void method2887() {
		@Pc(1) Class5 local1 = Static142.aClass5_26;
		synchronized (Static142.aClass5_26) {
			Static142.aClass5_26.method106(5);
		}
	}
}
