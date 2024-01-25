import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_212 = new Class67(37, 8);

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	public static int anInt5529 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!wm;II)Ljava/lang/String;")
	public static String method4436(@OriginalArg(0) Class1_Sub19 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2883();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local7];
			arg0.anInt3698 += Static304.aClass189_2.method4077(0, arg0.aByteArray38, arg0.anInt3698, local7, local27);
			return Static244.method236(local7, 0, local27);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}
}
