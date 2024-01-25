import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public static int anInt7174;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
	public static final int[] anIntArray605 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_160 = new Class209("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "S")
	public static short aShort95 = 32767;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_58 = new Class171(64);

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt7180 = -1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	public static String method5673(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg2); local14 != -1; local14 = arg1.indexOf(arg2, local14 + arg0.length())) {
			arg1 = arg1.substring(0, local14) + arg0 + arg1.substring(local14 + arg2.length());
		}
		return arg1;
	}
}
