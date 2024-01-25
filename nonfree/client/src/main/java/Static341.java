import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public static int anInt6374;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!rb;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString366 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "[B")
	public static final byte[] aByteArray92 = new byte[520];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)I")
	public static int method5649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class5_Sub19 local18 = (Class5_Sub19) Static331.aClass42_54.method1052((long) arg1);
		if (local18 == null) {
			return -1;
		} else if (arg0 >= 0 && local18.anIntArray135.length > arg0) {
			return local18.anIntArray135[arg0];
		} else {
			return -1;
		}
	}
}
