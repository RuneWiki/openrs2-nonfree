import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bl", name = "O", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_5 = new Class222(15, 0, 1, 0);

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "[B")
	public static final byte[] aByteArray2 = new byte[2048];

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method455(@OriginalArg(0) String arg0) {
		return Static229.method3303(10, arg0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!hh;II)Lclient!jk;")
	public static Class1_Sub24 method456(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2346(arg1);
		return local13 == null ? null : new Class1_Sub24(local13);
	}
}
