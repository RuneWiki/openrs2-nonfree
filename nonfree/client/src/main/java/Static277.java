import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
	public static final int[] anIntArray341 = new int[3];

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!fq;")
	public static final Class104 aClass104_10 = new Class104(13, 0, 1, 0);

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
	public static final int[] anIntArray342 = new int[2];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
	public static int method4946(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) double local15 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(30) double local30 = (local15 - local22) * Math.random() + local22;
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)Lclient!mw;")
	public static Class116 method4949() {
		try {
			return new Class116_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class116) Class.forName("Class116_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class116_Sub2();
			}
		}
	}
}
