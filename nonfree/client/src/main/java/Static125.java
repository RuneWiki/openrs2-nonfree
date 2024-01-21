import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_15;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "Z")
	public static final boolean aBoolean192 = false;

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Lclient!b;")
	public static Class7 aClass7_20 = new Class7(64);

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
	public static int anInt2896 = 0;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array19 = new Class73[100];

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)I")
	public static int method2122() {
		return 6;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	public static void method2123() {
		aClass73Array19 = null;
		anIntArray309 = null;
		aClass13_Sub1_15 = null;
		aClass7_20 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method2124(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static142.method2364(local13) : local13;
		} else if (arg1 instanceof Class14) {
			@Pc(27) Class14 local27 = (Class14) arg1;
			return local27.method488();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
