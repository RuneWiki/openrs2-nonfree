import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lda", name = "s", descriptor = "[Lclient!kh;")
	public static Class208[] aClass208Array32;

	@OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
	public static int anInt9794 = 0;

	@OriginalMember(owner = "client!lda", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray104 = new int[6][];

	@OriginalMember(owner = "client!lda", name = "t", descriptor = "[I")
	public static final int[] anIntArray638 = new int[4096];

	@OriginalMember(owner = "client!lda", name = "u", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_141 = new Class376(50, 2);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method8338(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static429.aBoolean567) {
			try {
				@Pc(20) Class346 local20 = (Class346) Class.forName("Class346_Sub1").getDeclaredConstructor().newInstance();
				local20.method7933(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static429.aBoolean567 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)Z")
	public static boolean method8340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static631.method7935(arg0)) {
			return true;
		} else {
			return !Static631.method7935(arg1);
		}
	}
}
