import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "Lclient!om;")
	public static Class265 aClass265_1;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_18 = new Class22(50);

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!in;")
	public static final Class169 aClass169_111 = new Class169(80, 3);

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Z")
	public static boolean aBoolean327 = true;

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_6 = new Class146(12, 0, 1, 0);

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
	public static int anInt4309 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
	public static void method3924(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub1_Sub5 local13 = Static653.method9595(4, (long) arg0);
		local13.method2489();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)Lclient!mb;")
	public static Class15_Sub3_Sub1 method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub3_Sub1_1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
	public static int method3926() {
		return Static255.anInt4904 == 1 ? Static590.anInt10296 : 0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIB)V")
	public static void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(19) Class2_Sub1_Sub5 local19 = Static653.method9595(19, (long) arg0 | (long) arg2 << 32);
		local19.method2486();
		local19.anInt2680 = arg3;
		local19.anInt2674 = arg1;
	}
}
