import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!df", name = "N", descriptor = "Lclient!rg;")
	public static Class27 aClass27_6;

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!df", name = "U", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!df", name = "V", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_29 = new Class208(53, 1);

	@OriginalMember(owner = "client!df", name = "G", descriptor = "I")
	public static final int anInt1466 = 50;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "[I")
	public static final int[] anIntArray103 = new int[anInt1466];

	@OriginalMember(owner = "client!df", name = "D", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[1000][];

	@OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
	public static final int[] anIntArray104 = new int[anInt1466];

	@OriginalMember(owner = "client!df", name = "J", descriptor = "[I")
	public static final int[] anIntArray105 = new int[anInt1466];

	@OriginalMember(owner = "client!df", name = "M", descriptor = "[I")
	public static final int[] anIntArray106 = new int[anInt1466];

	@OriginalMember(owner = "client!df", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[anInt1466];

	@OriginalMember(owner = "client!df", name = "R", descriptor = "[I")
	public static final int[] anIntArray107 = new int[anInt1466];

	@OriginalMember(owner = "client!df", name = "S", descriptor = "[I")
	public static final int[] anIntArray108 = new int[anInt1466];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
	public static int method1195(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >>> 1;
		@Pc(20) int local20 = local14 | local14 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 2;
		@Pc(32) int local32 = local26 | local26 >>> 4;
		@Pc(38) int local38 = local32 | local32 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return arg0 & ~local44;
	}
}
