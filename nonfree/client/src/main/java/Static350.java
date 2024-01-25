import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rj", name = "nb", descriptor = "Z")
	public static boolean aBoolean478;

	@OriginalMember(owner = "client!rj", name = "jb", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_209 = new Class214(70, -1);

	@OriginalMember(owner = "client!rj", name = "kb", descriptor = "[I")
	public static final int[] anIntArray344 = new int[500];

	@OriginalMember(owner = "client!rj", name = "mb", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_83 = new Class167(10);

	@OriginalMember(owner = "client!rj", name = "ob", descriptor = "I")
	public static int anInt5712 = -2;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(JI)V")
	public static void method4428(@OriginalArg(0) long arg0) {
		if (Static159.aClass82ArrayArrayArray2 != null) {
			if (Static100.anInt1781 == 1 || Static100.anInt1781 == 5) {
				Static221.method2942(arg0);
			} else if (Static100.anInt1781 == 4) {
				Static346.method4404(arg0);
			}
		}
		Static244.method3192((long) Static368.anInt6250, Static213.aClass128_22);
		if (Static169.anInt2522 != -1) {
			Static56.method860(Static169.anInt2522);
		}
		for (@Pc(47) int local47 = 0; local47 < Static193.anInt7328; local47++) {
			if (Static145.aBooleanArray15[local47]) {
				Static308.aBooleanArray24[local47] = true;
			}
			Static219.aBooleanArray11[local47] = Static145.aBooleanArray15[local47];
			Static145.aBooleanArray15[local47] = false;
		}
		anInt5712 = Static368.anInt6250;
		if (Static213.aClass128_22.method3569()) {
			Static346.aBoolean457 = true;
		}
		if (Static169.anInt2522 != -1) {
			Static193.anInt7328 = 0;
			Static436.method5463();
		}
		Static213.aClass128_22.va();
		Static454.method5612(Static213.aClass128_22);
		@Pc(93) int local93 = Static171.method2326();
		if (local93 == -1) {
			local93 = Static258.anInt4103;
		}
		if (local93 == -1) {
			local93 = Static453.anInt7417;
		}
		Static425.method5304(local93);
		Static190.method2501(Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, Static239.anInt3853, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613);
		Static239.anInt3853 = 0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!rb;IZ)V")
	public static void method4432(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1) {
		if (Static214.aBoolean611) {
			arg1 = 0;
			Static214.aBoolean611 = false;
		}
		if (Static34.aClass210_1 != null && Static34.aClass210_1.method4347(arg0)) {
			return;
		}
		Static34.aClass210_1 = arg0;
		Static326.aLong162 = Static232.method3058();
		Static296.anInt4979 = arg1;
		Static359.anInt5969 = arg1;
		if (Static359.anInt5969 != 0) {
			Static368.aFloat88 = Static453.aFloat102;
			Static316.aFloat77 = Static320.aFloat78;
			Static103.aClass9_1 = Static252.aClass9_3;
			Static380.anInt6319 = Static354.anInt5870;
			Static177.aFloat39 = Static109.aFloat28;
			Static149.aFloat101 = Static84.aFloat24;
			Static237.anInt3845 = Static121.anInt2075;
			Static14.aFloat1 = Static85.aFloat74;
			Static171.aFloat37 = Static22.aFloat4;
			Static137.anInt2326 = Static308.anInt5126;
			return;
		}
		Static283.method3694();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	public static void method4433() {
		Static23.aClass167_7.method3389();
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V")
	public static void method4434() {
		if (Static124.aClass128_14 != null) {
			Static124.aClass128_14.method3596();
			Static124.aClass128_14 = null;
			Static292.aClass16_3 = null;
		}
	}
}
