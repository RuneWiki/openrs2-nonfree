import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vq", name = "O", descriptor = "Lclient!bs;")
	public static Class30 aClass30_4;

	@OriginalMember(owner = "client!vq", name = "Z", descriptor = "I")
	public static int anInt7308 = 0;

	@OriginalMember(owner = "client!vq", name = "kb", descriptor = "Lclient!ht;")
	public static Class3_Sub7_Sub2 aClass3_Sub7_Sub2_3 = new Class3_Sub7_Sub2(8192);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)Lclient!mq;")
	public static Class156 method5705(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static178.aClass156ArrayArray2[local7] == null || Static178.aClass156ArrayArray2[local7][local11] == null) {
			@Pc(31) boolean local31 = Static55.method1137(local7);
			if (!local31) {
				return null;
			}
		}
		return Static178.aClass156ArrayArray2[local7][local11];
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(BZ)V")
	public static void method5708(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static226.anInt4225 != -1) {
				Static192.method3072(Static226.anInt4225);
			}
			for (@Pc(16) Class3_Sub9 local16 = (Class3_Sub9) Static318.aClass11_42.method313(); local16 != null; local16 = (Class3_Sub9) Static318.aClass11_42.method316()) {
				if (!local16.method5978()) {
					local16 = (Class3_Sub9) Static318.aClass11_42.method313();
					if (local16 == null) {
						break;
					}
				}
				Static434.method5676(true, false, local16);
			}
			Static226.anInt4225 = -1;
			Static318.aClass11_42 = new Class11(8);
			Static298.method4485();
			Static226.anInt4225 = Static446.anInt7545;
			Static430.method2668(false);
			Static36.method725();
			Static285.method4057(Static226.anInt4225);
		}
		Static9.method116();
		Static25.anInt849 = -1;
		Static31.method4739(Static58.anInt1564);
		Static379.aClass7_Sub2_Sub3_Sub2_2 = new Class7_Sub2_Sub3_Sub2();
		Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0] = Static40.anInt1089 / 2;
		Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 = Static44.anInt7276 * 128 / 2;
		Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 = Static40.anInt1089 * 128 / 2;
		Static265.anInt5008 = 0;
		Static276.anInt5105 = 0;
		Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0] = Static44.anInt7276 / 2;
		if (Static161.anInt3316 == 2) {
			Static276.anInt5105 = Static194.anInt3883 << 7;
			Static265.anInt5008 = Static57.anInt5083 << 7;
		} else {
			Static124.method5962();
		}
		Static214.method3288();
		if (Static276.anInt5105 == 0 || Static265.anInt5008 == 0) {
			Static230.method3465(10);
		} else {
			Static21.method464();
			Static230.method3465(28);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
