import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!ic;")
	public static Class113 aClass113_59;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!tr;")
	public static Class236 aClass236_1;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_17 = new Class254();

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray22 = new byte[1000][];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!qa;Lclient!wc;B)I")
	public static int method2248(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class258 arg1) {
		if (arg1.anInt7291 != -1) {
			return arg1.anInt7291;
		}
		if (arg1.anInt7299 != -1) {
			@Pc(28) Class201 local28 = arg0.anInterface8_8.method1375(arg0.method3569() ? arg1.anInt7299 : arg1.anInt7301);
			if (!local28.aBoolean432) {
				return local28.aShort61;
			}
		}
		return arg1.anInt7302;
	}
}
