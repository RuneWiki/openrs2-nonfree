import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "[Lclient!af;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "Lclient!an;")
	public static Class16 aClass16_116;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "[Lclient!ld;")
	public static final Class184[] aClass184Array1 = new Class184[4];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILclient!an;)Lclient!ln;")
	public static Class192 method7591(@OriginalArg(2) int arg0, @OriginalArg(3) Class16 arg1) {
		@Pc(14) byte[] local14 = arg1.method408(arg0, 0);
		return local14 == null ? null : new Class192(local14);
	}
}
