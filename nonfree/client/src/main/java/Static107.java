import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
	public static int anInt3145;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_35;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "Lclient!rc;")
	public static Class66 aClass66_13 = new Class66(64);

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	public static int anInt3144 = 0;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "Lclient!ea;")
	public static Class18 aClass18_798 = Static8.method128("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
	public static void method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static17.aClass14_8.method569((long) arg2);
		if (local12 == null) {
			local12 = new Class1_Sub14();
			Static17.aClass14_8.method570(local12, (long) arg2);
		}
		if (arg1 >= local12.anIntArray248.length) {
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(44) int[] local44 = new int[arg1 + 1];
			for (@Pc(46) int local46 = 0; local46 < local12.anIntArray248.length; local46++) {
				local39[local46] = local12.anIntArray248[local46];
				local44[local46] = local12.anIntArray247[local46];
			}
			for (@Pc(72) int local72 = local12.anIntArray248.length; local72 < arg1; local72++) {
				local39[local72] = -1;
				local44[local72] = 0;
			}
			local12.anIntArray248 = local39;
			local12.anIntArray247 = local44;
		}
		local12.anIntArray248[arg1] = arg3;
		local12.anIntArray247[arg1] = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIBII)I")
	public static int method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg5;
			arg5 = local6;
		}
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg1;
		} else if (local18 == 1) {
			return 8 - arg4 - arg2;
		} else if (local18 == 2) {
			return 1 + 7 - arg5 - arg1;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public static void method2201() {
		aClass18_798 = null;
		aClass66_13 = null;
		anIntArray277 = null;
		aByteArrayArrayArray4 = null;
		aClass16_Sub1_35 = null;
	}
}
