import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
	public static int anInt7883;

	@OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
	public static int anInt7884;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_189 = new Class169(7, 16);

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "([I[IZ)V")
	public static void method7039(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static606.anIntArray556 = null;
			Static59.aByteArrayArrayArray8 = null;
			Static488.anIntArray441 = null;
			return;
		}
		Static488.anIntArray441 = arg0;
		Static606.anIntArray556 = new int[arg0.length];
		Static59.aByteArrayArrayArray8 = new byte[arg0.length][][];
		for (@Pc(32) int local32 = 0; local32 < Static488.anIntArray441.length; local32++) {
			Static59.aByteArrayArrayArray8[local32] = new byte[arg1[local32]][];
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(JJ)J")
	public static long method7040(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V")
	public static void method7042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(1, (long) arg1);
		local9.method2486();
		local9.anInt2680 = arg0;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIII)V")
	public static void method7043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg1 < arg3) {
			for (local18 = arg1; local18 < arg3; local18++) {
				Static186.anIntArrayArray12[local18][arg2] = arg0;
			}
		} else {
			for (local18 = arg3; local18 < arg1; local18++) {
				Static186.anIntArrayArray12[local18][arg2] = arg0;
			}
		}
	}
}
