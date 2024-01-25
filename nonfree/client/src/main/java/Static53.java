import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	public static int anInt839;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
	public static int anInt841;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_5 = new Class361(8, 1);

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "[I")
	public static int[] anIntArray42 = new int[1];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!wea;")
	public static RuntimeException_Sub1 method801(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString137 = local9.aString137 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	public static int method803(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (local26 * arg0 >> 12) + 40960;
		return local35 * local20 >> 12;
	}
}
