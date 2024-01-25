import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
	public static int anInt3362;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "[Lclient!vw;")
	public static Class308[] aClass308Array1;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "[I")
	public static int[] anIntArray314 = new int[1];

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!im;")
	public static final Class140 aClass140_61 = new Class140(78, -2);

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!im;")
	public static final Class140 aClass140_62 = new Class140(81, 12);

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "Lclient!nc;")
	public static final Class201 aClass201_3 = new Class201(128);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Lclient!br;")
	public static Class34 method2932() {
		try {
			return (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!jq;B)Lclient!jq;")
	public static Class156 method2934(@OriginalArg(0) Class156 arg0) {
		if (arg0.anInt4686 != -1) {
			return Static182.method2888(arg0.anInt4686);
		}
		@Pc(20) int local20 = arg0.anInt4677 >>> 16;
		@Pc(25) Class274 local25 = new Class274(Static468.aClass17_36);
		for (@Pc(30) Class1_Sub35 local30 = (Class1_Sub35) local25.method6418(); local30 != null; local30 = (Class1_Sub35) local25.method6421()) {
			if (local30.anInt6103 == local20) {
				return Static182.method2888((int) local30.aLong392);
			}
		}
		return null;
	}
}
