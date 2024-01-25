import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_184 = new Class73(110, -1);

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!haa;")
	public static final Class127 aClass127_19 = new Class127();

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_61 = new Class163();

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "Z")
	public static boolean aBoolean810 = true;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "[I")
	public static final int[] anIntArray551 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public static void method8366() {
		Static255.anIntArray230 = Static322.method5350(0.4F);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(18) Class356 local18 = Static249.aClass310_1.method7474(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local18.method8323(arg0);
	}
}
