import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
	public static int anInt7959;

	@OriginalMember(owner = "client!qj", name = "J", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_255 = new Class194(82, -1);

	@OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
	public static int anInt7960 = 0;

	@OriginalMember(owner = "client!qj", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString71 = "";

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(JJ)J")
	public static long method6887(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6888(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static651.method749(arg0, 0, local14, 0, local11);
		return local14;
	}
}
