import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!lt;")
	public static Class157 aClass157_3;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_36 = new Class14();

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_18 = new Class214(10, -1);

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_95 = new Class265(0, -2);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!rc;)V")
	public static void method3867(@OriginalArg(1) Class8_Sub7 arg0) {
		arg0.aClass3_Sub2_Sub1_1 = null;
		if (Static252.anInt4750 < 20) {
			Static258.aClass112_5.method2546(arg0);
			Static252.anInt4750++;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z")
	public static boolean method3868(@OriginalArg(0) int arg0) {
		Static354.aBoolean421 = true;
		Static25.anInt589 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!mg;IIIZ)V")
	public static void method3869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(5) int arg3) {
		Static237.anInt4548 = 1;
		Static74.aClass160_9 = arg2;
		Static436.anInt7186 = 0;
		Static237.anInt4547 = arg0;
		Static263.aBoolean350 = false;
		Static71.anInt1577 = arg3;
		Static332.anInt5719 = Static335.aClass2_Sub3_Sub4_2.method4641() / arg1;
		if (Static332.anInt5719 < 1) {
			Static332.anInt5719 = 1;
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public static void method3870() {
		@Pc(10) int local10 = Static12.aClass79_Sub1_1.method3962(Static399.anInt6653);
		if (local10 == 0) {
			Static231.aByteArrayArrayArray9 = null;
			Static380.method5090(0);
		} else if (local10 == 1) {
			Static334.method4659((byte) 0);
			Static380.method5090(512);
			if (Static227.aByteArrayArrayArray8 != null) {
				Static77.method1434();
			}
		} else {
			Static334.method4659((byte) (Static356.anInt6044 - 4 & 0xFF));
			Static380.method5090(2);
		}
		Static34.anInt676 = Static383.anInt6436;
	}
}
