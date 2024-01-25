import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!si", name = "B", descriptor = "I")
	public static int anInt7071;

	@OriginalMember(owner = "client!si", name = "D", descriptor = "I")
	public static int anInt7073;

	@OriginalMember(owner = "client!si", name = "G", descriptor = "J")
	public static long aLong210;

	@OriginalMember(owner = "client!si", name = "z", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_42 = new Class238();

	@OriginalMember(owner = "client!si", name = "F", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_209 = new Class208(77, 8);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZII)I")
	public static int method6089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static329.aByteArrayArrayArray17[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static329.aByteArrayArrayArray17[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
