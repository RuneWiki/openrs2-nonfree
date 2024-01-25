import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
	public static int anInt8722 = 0;

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_256 = new Class363(104, -1);

	@OriginalMember(owner = "client!uba", name = "s", descriptor = "[I")
	public static int[] anIntArray632 = new int[1];

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILjava/lang/String;)Lclient!qc;")
	public static Class160 method7280(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class160 local8;
		try {
			local8 = (Class160) Class.forName("Class160_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class160_Sub2();
		}
		local8.anInt5967 = arg0;
		local8.aString50 = arg1;
		return local8;
	}
}
