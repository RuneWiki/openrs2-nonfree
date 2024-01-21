import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_6;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!ja;")
	private static Class39 aClass39_587 = Static28.method504("No reply from loginserver)3");

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_586 = aClass39_587;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!c;")
	public static Class12 aClass12_27 = new Class12(64);

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static int anInt1029 = -1;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!ja;")
	public static Class39 aClass39_588 = Static28.method504("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
	public static final int anInt1031 = 50;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "[I")
	public static int[] anIntArray108 = new int[anInt1031];

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "[I")
	public static int[] anIntArray109 = new int[anInt1031];

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
	public static int[] anIntArray110 = new int[anInt1031];

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array6 = new Class39[anInt1031];

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "[I")
	public static int[] anIntArray111 = new int[anInt1031];

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!ja;")
	public static Class39 aClass39_589 = Static28.method504("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
	public static int[] anIntArray112 = new int[anInt1031];

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "[I")
	public static int[] anIntArray113 = new int[anInt1031];

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "[I")
	public static int[] anIntArray114 = new int[anInt1031];

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "[Lclient!qb;")
	public static Class4_Sub2_Sub1_Sub4[] aClass4_Sub2_Sub1_Sub4Array1 = new Class4_Sub2_Sub1_Sub4[4];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method687() {
		aClass39_587 = null;
		aClass39_586 = null;
		aClass39Array6 = null;
		aClass12_27 = null;
		anIntArray114 = null;
		aClass39_589 = null;
		anIntArray113 = null;
		aClass20_Sub1_6 = null;
		aClass39_588 = null;
		anIntArray108 = null;
		anIntArray109 = null;
		anIntArray111 = null;
		aClass4_Sub2_Sub1_Sub4Array1 = null;
		anIntArray112 = null;
		anIntArray110 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[BII)Lclient!ja;")
	public static Class39 method688(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class39 local14 = new Class39();
		local14.anInt1481 = 0;
		local14.aByteArray10 = new byte[arg1];
		for (@Pc(23) int local23 = arg2; local23 < arg2 + arg1; local23++) {
			if (arg0[local23] != 0) {
				local14.aByteArray10[local14.anInt1481++] = arg0[local23];
			}
		}
		return local14;
	}
}
