import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!vt", name = "y", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_103 = new Class183(64, 7);

	@OriginalMember(owner = "client!vt", name = "yb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[5];

	@OriginalMember(owner = "client!vt", name = "Eb", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_104 = new Class183(71, -1);

	@OriginalMember(owner = "client!vt", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray569 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIII)V")
	public static void method5739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(4, arg1);
		local8.method1198();
		local8.anInt1462 = arg3;
		local8.anInt1465 = arg2;
		local8.anInt1468 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B[S)[S")
	public static short[] method5749(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static394.method2442(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IILclient!td;I)J")
	public static long method5750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface8 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(18) Class47 local18 = Static230.aClass96_4.method2303(arg2.method6034());
		@Pc(39) long local39 = (long) ((arg0 | 0x800000) << 7 | arg1 | arg2.method6027() << 14 | arg2.method6031() << 20);
		if (local18.anInt1274 == 0) {
			local39 |= local9;
		}
		if (local18.anInt1246 == 1) {
			local39 |= local5;
		}
		if (local18.aBoolean105) {
			local39 |= local7;
		}
		return local39 | (long) arg2.method6034() << 32;
	}
}
