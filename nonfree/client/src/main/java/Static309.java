import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kea", name = "w", descriptor = "I")
	public static int anInt8730;

	@OriginalMember(owner = "client!kea", name = "y", descriptor = "Lclient!vq;")
	public static final Class382 aClass382_17 = new Class382(6, 0, 4, 2);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B[B)V")
	public static void method7555(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(10) Class14_Sub21 local10 = new Class14_Sub21(arg1);
		while (true) {
			@Pc(14) int local14 = local10.method7695(94);
			if (local14 == 0) {
				if (arg0 != 57) {
					method7555((byte) -9, (byte[]) null);
					return;
				}
				return;
			}
			if (local14 == 1) {
				@Pc(23) int local23 = local10.method7717(-1978450544);
				if (Static350.anInt6000 == -1) {
					Static350.anInt6000 = local23;
				}
			}
		}
	}
}
