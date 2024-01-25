import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!be", name = "Mb", descriptor = "Lclient!om;")
	public static Class246 aClass246_28;

	@OriginalMember(owner = "client!be", name = "Nb", descriptor = "I")
	public static int anInt839;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_2 = new Class187(14, 3);

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!be", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray82 = new int[14];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Lclient!bh;")
	public static Class25 method620() {
		try {
			return (Class25) Class.forName("Class25_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class25_Sub2();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;B)Lclient!bv;")
	public static Class32 method622(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class32 local13;
		try {
			local13 = (Class32) Class.forName("Class32_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class32_Sub1();
		}
		local13.aString76 = arg1;
		local13.anInt5576 = arg0;
		return local13;
	}

	@OriginalMember(owner = "client!be", name = "k", descriptor = "(I)I")
	public static int method625() {
		return Static565.anInt9104;
	}
}
