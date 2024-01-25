import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static370 {

	@OriginalMember(owner = "client!su", name = "M", descriptor = "I")
	public static int anInt6355;

	@OriginalMember(owner = "client!su", name = "H", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_142 = new Class265(82, 6);

	@OriginalMember(owner = "client!su", name = "I", descriptor = "[I")
	public static final int[] anIntArray540 = new int[100];

	@OriginalMember(owner = "client!su", name = "J", descriptor = "I")
	public static int anInt6352 = 2;

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(II)I")
	public static int method5036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static360.aByteArrayArray56 == null ? 0 : Static360.aByteArrayArray56[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!ju;B)V")
	public static void method5037(@OriginalArg(0) Class2_Sub22 arg0) {
		if (!Static123.aBoolean212) {
			arg0.method5866();
			Static373.anInt4900--;
		}
	}
}
