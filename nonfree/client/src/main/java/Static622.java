import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	public static int anInt10138;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!ae;")
	public static Class8 aClass8_138;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!ig;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_355 = new Class179(50, 4);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method8567() {
		if (!Static191.aBoolean194) {
			Static191.aBoolean194 = true;
			Static70.aBoolean70 = true;
			Static591.aFloat182 += (12.0F - Static591.aFloat182) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8568(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)C")
	public static char method8571(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static454.aCharArray6[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}
}
