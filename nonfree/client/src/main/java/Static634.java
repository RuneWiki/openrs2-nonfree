import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_189 = new Class73(51, 3);

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
	public static int anInt10666 = 0;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "Z")
	public static boolean aBoolean840 = false;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "[S")
	public static short[] aShortArray182 = new short[256];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!ha;ZLclient!sba;)V")
	public static void method8698(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class302 arg1) {
		@Pc(35) boolean local35 = Static356.aClass221_1.method5919(arg1.anInt8901, arg1.anInt8899, arg0, arg1.aBoolean713 ? Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 : null, arg1.anInt8931, arg1.anInt8902, arg1.anInt8937 | 0xFF000000) == null;
		if (local35) {
			Static631.aClass163_63.method4967(new Class6_Sub18(arg1.anInt8899, arg1.anInt8931, arg1.anInt8901, arg1.anInt8937 | 0xFF000000, arg1.anInt8902, arg1.aBoolean713));
			Static580.method8049(arg1);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILclient!jga;Lclient!ni;IIZ)V")
	public static void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub4_Sub2 arg1, @OriginalArg(3) Class223 arg2, @OriginalArg(4) int arg3) {
		Static406.method6373(arg2, arg3, arg0);
		Static214.aClass6_Sub4_Sub2_2 = arg1;
	}
}
