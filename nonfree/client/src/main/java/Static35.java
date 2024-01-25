import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ca", name = "yb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ca", name = "Cb", descriptor = "I")
	public static int anInt920;

	@OriginalMember(owner = "client!ca", name = "Db", descriptor = "I")
	public static int anInt921;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lclient!sl;")
	public static Class115 method883() {
		try {
			return new Class115_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class115) Class.forName("Class115_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class115_Sub2();
			}
		}
	}
}
