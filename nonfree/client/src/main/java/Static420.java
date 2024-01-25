import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!vh;")
	public static Class250 aClass250_87;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_49 = new Class266();

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_121 = new Class237(103, 6);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!a;)I")
	public static int method5636(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		@Pc(15) int local15 = arg0.method146(2);
		@Pc(30) int local30;
		if (local15 == 0) {
			local30 = 0;
		} else if (local15 == 1) {
			local30 = arg0.method146(5);
		} else if (local15 == 2) {
			local30 = arg0.method146(8);
		} else {
			local30 = arg0.method146(11);
		}
		return local30;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method5638(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static403.method5453(local13) : local13;
		} else if (arg1 instanceof Class6) {
			@Pc(27) Class6 local27 = (Class6) arg1;
			return local27.method207();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
