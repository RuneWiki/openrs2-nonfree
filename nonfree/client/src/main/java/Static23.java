import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public static int anInt543;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array6;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_178 = Static120.method1824("Prepared sound engine");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!rd;")
	public static Class80 aClass80_174 = aClass80_178;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_175 = Static120.method1824("Select a world");

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!rd;")
	public static Class80 aClass80_176 = aClass80_175;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	public static int anInt545 = 0;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_177 = Static120.method1824("(Udns");

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!qf;")
	public static Class77 aClass77_1 = null;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!qf;)Lclient!qf;")
	public static Class77 method368(@OriginalArg(1) Class77 arg0) {
		@Pc(18) int local18 = Static197.method3177(Static71.method1062(arg0));
		if (local18 == 0) {
			return null;
		}
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			arg0 = Static92.method2208(arg0.anInt3201);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
