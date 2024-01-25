import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
	public static int anInt727;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I")
	public static int method622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static157.anIntArray285[arg1 & 0x3] : Static378.anIntArray546[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!co;I)V")
	public static void method624(@OriginalArg(0) Class3_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class3_Sub2_Sub1_Sub1) {
			@Pc(35) Class3_Sub2_Sub1_Sub1 local35 = (Class3_Sub2_Sub1_Sub1) arg0;
			if (local35.aClass65_1 == null) {
				return;
			}
			Static163.method5139(local35, local35.aByte89 != Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89);
		} else if (arg0 instanceof Class3_Sub2_Sub1_Sub2) {
			@Pc(16) Class3_Sub2_Sub1_Sub2 local16 = (Class3_Sub2_Sub1_Sub2) arg0;
			Static412.method5428(local16, local16.aByte89 != Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89);
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!em;I)V")
	public static void method625(@OriginalArg(0) Class68 arg0) {
		if (arg0.anInt2236 != Static348.anInt4695) {
			return;
		}
		if (Static375.aClass3_Sub2_Sub1_Sub2_7.aString56 == null) {
			arg0.anInt2185 = 0;
			arg0.anInt2203 = 0;
			return;
		}
		arg0.anInt2228 = 150;
		arg0.anInt2205 = (int) (Math.sin((double) Static131.anInt2821 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2203 = Static399.anInt6656;
		arg0.anInt2238 = 5;
		arg0.anInt2185 = Static375.method4698(Static375.aClass3_Sub2_Sub1_Sub2_7.aString56);
		arg0.anInt2210 = 0;
		arg0.anInt2224 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6190;
		arg0.anInt2222 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6177;
		arg0.anInt2231 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6192;
	}
}
