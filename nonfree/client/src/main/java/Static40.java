import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public static int anInt4550;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Lclient!gw;")
	public static final Class123 aClass123_9 = new Class123();

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "[B")
	public static final byte[] aByteArray41 = new byte[520];

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZI)I")
	public static int method4036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}
}
