import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "I")
	public static int anInt4748;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt4756;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_27 = new Class16();

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	public static int anInt4755 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BZII)I")
	public static int method4260(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub19 local8 = Static274.method4804(arg1, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray248.length > arg2) {
			return local8.anIntArray248[arg2];
		} else {
			return 0;
		}
	}
}
