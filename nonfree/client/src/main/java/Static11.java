import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!al", name = "c", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_36 = new Class18(66, 6);

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!ei;")
	public static final Class44 aClass44_4 = new Class44(64);

	@OriginalMember(owner = "client!al", name = "f", descriptor = "[Lclient!th;")
	public static final Class196[] aClass196Array2 = new Class196[4];

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_31 = new Class217(7, -2);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lclient!al;")
	public static Class8 method911() {
		try {
			return (Class8) Class.forName("Class8_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)I")
	public static int method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > arg0) {
			return arg2;
		} else if (arg0 > arg1) {
			return arg1;
		} else {
			return arg0;
		}
	}
}
