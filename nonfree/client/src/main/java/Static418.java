import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
	public static int anInt7279 = 1;

	@OriginalMember(owner = "client!rn", name = "S", descriptor = "[I")
	public static final int[] anIntArray575 = new int[14];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!n;Ljava/awt/Canvas;BI)Lclient!qa;")
	public static Class9 method6214(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class9_Sub3(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public static void method6217() {
		@Pc(8) int local8 = Static89.aClass1_Sub28_Sub1_1.method4271(Static526.anInt8926);
		if (local8 == 0) {
			Static388.aByteArrayArrayArray16 = null;
			Static384.method5806(0);
		} else if (local8 == 1) {
			Static446.method6423((byte) 0);
			Static384.method5806(512);
			if (Static542.aByteArrayArrayArray17 != null) {
				Static231.method6243();
			}
		} else {
			Static446.method6423((byte) (Static15.anInt833 - 4 & 0xFF));
			Static384.method5806(2);
		}
		Static485.anInt8266 = Static245.anInt4747;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
	public static void method6218() {
		@Pc(5) int local5 = 0;
		if (Static89.aClass1_Sub28_Sub1_1.method4260(Static526.anInt8926)) {
			local5 = 55;
		}
		if (!Static89.aClass1_Sub28_Sub1_1.aBoolean323) {
			local5 |= 0x40;
		}
		Static388.method5855(local5);
		Static365.aClass194_6.method5080(local5);
		Static454.aClass153_2.method4006(local5);
		Static345.aClass222_1.method5588(local5);
		Static529.aClass90_2.method2959(local5);
		Static275.method4676(local5);
		Static120.method2686(local5);
		Static90.method2167(local5);
		Static299.method3937(local5);
		Static215.method3855();
	}
}
