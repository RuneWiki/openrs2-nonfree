import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "Lclient!uw;")
	public static final Class370 aClass370_2 = new Class370();

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "Lclient!uw;")
	public static final Class370 aClass370_5 = new Class370();

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "Lclient!uw;")
	public static final Class370 aClass370_3 = new Class370();

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "Lclient!uw;")
	public static final Class370 aClass370_4 = new Class370();

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "Z")
	public static boolean aBoolean729 = false;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
	public static int anInt9904 = 0;

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean730 = false;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)Lclient!wt;")
	public static Class399 method8589(@OriginalArg(1) int arg0) {
		@Pc(10) Class399 local10 = (Class399) Static234.aClass359_31.method8517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static118.aClass223_25.method5267(arg0, 0);
		local10 = new Class399();
		if (local21 != null) {
			local10.method9017(new Class6_Sub15(local21), arg0);
		}
		Static234.aClass359_31.method8515((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method8591(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return arg0 ? Static79.method1085(local14) : local14;
		} else if (arg1 instanceof Class56) {
			@Pc(37) Class56 local37 = (Class56) arg1;
			return local37.method972();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
