import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static545 {

	@OriginalMember(owner = "client!si", name = "y", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_127 = new Class376(5, 1);

	@OriginalMember(owner = "client!si", name = "E", descriptor = "I")
	public static int anInt8886 = -1;

	@OriginalMember(owner = "client!si", name = "K", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_128 = new Class376(32, 16);

	@OriginalMember(owner = "client!si", name = "L", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_180 = new Class126(126, 8);

	@OriginalMember(owner = "client!si", name = "M", descriptor = "I")
	public static int anInt8892 = 0;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(I)I")
	public static int method7549() {
		if (Static153.aFrame3 == null) {
			return Static83.aBoolean177 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIB)Z")
	public static boolean method7550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
