import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static392 {

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	public static int anInt6751;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "Lclient!vh;")
	public static Class7 aClass7_3;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_44 = new Class229();

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	public static final int anInt6754 = 1;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_250 = new Class184(106, 6);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIB)I")
	public static int method5294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static288.anIntArray406[arg0 & 0x3] : Static132.anIntArray234[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLclient!eo;)V")
	public static void method5298(@OriginalArg(1) Class68 arg0) {
		if (Static440.anInt7509 != arg0.anInt2211) {
			return;
		}
		if (Static113.aClass1_Sub3_Sub3_Sub1_4.aString47 == null) {
			arg0.anInt2146 = 0;
			arg0.anInt2190 = 0;
			return;
		}
		arg0.anInt2141 = 150;
		arg0.anInt2195 = (int) (Math.sin((double) Static290.anInt5325 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2146 = Static177.anInt3617;
		arg0.anInt2173 = 5;
		arg0.anInt2190 = Static298.method4383(Static113.aClass1_Sub3_Sub3_Sub1_4.aString47);
		arg0.anInt2152 = 0;
		arg0.anInt2205 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6080;
		arg0.anInt2139 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6056;
		arg0.anInt2216 = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6086;
	}
}
