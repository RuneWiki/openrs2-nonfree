import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!di", name = "F", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_33 = new Class289(6, 2);

	@OriginalMember(owner = "client!di", name = "K", descriptor = "I")
	public static int anInt1932 = 0;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "Lclient!v;")
	public static final Class362 aClass362_10 = new Class362();

	@OriginalMember(owner = "client!di", name = "N", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_82 = new Class179(101, -2);

	@OriginalMember(owner = "client!di", name = "P", descriptor = "Lclient!qha;")
	public static final Class286 aClass286_2 = new Class286("RC", 1);

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[6][];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!gga;I)Lclient!ht;")
	public static Class63_Sub1 method1705(@OriginalArg(0) Class6_Sub23 arg0) {
		@Pc(7) Class63 local7 = Static583.method8067(arg0);
		@Pc(11) int local11 = arg0.method8363();
		@Pc(17) int local17 = arg0.method8363();
		@Pc(23) int local23 = arg0.method8363();
		@Pc(27) int local27 = arg0.method8363();
		@Pc(31) int local31 = arg0.method8363();
		@Pc(35) int local35 = arg0.method8363();
		return new Class63_Sub1(local7.aClass7_9, local7.aClass249_12, local7.anInt8533, local7.anInt8532, local7.anInt8537, local7.anInt8536, local7.anInt8538, local7.anInt8535, local7.anInt8534, local11, local17, local23, local27, local31, local35);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!laa;I)I")
	public static int method1706(@OriginalArg(0) Class6_Sub4_Sub10 arg0) {
		@Pc(15) String local15 = Static666.method9034(arg0);
		return Static173.aClass151_4.method3326(Static24.aClass9Array7, local15);
	}
}
