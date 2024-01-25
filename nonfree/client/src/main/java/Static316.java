import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static316 {

	@OriginalMember(owner = "client!lda", name = "q", descriptor = "Lclient!kd;")
	public static Class6 aClass6_24;

	@OriginalMember(owner = "client!lda", name = "u", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array8;

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "[B")
	public static final byte[] aByteArray59 = new byte[2048];

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "[[F")
	public static final float[][] aFloatArrayArray9 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
	public static void method4779(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static97.anInt1908 = arg0;
		Static73.aClass11_Sub4Array1 = new Class11_Sub4[Static304.anIntArray381[Static97.anInt1908] + 1];
		Static208.anInt4358 = 0;
		Static308.anInt5657 = 0;
	}
}
