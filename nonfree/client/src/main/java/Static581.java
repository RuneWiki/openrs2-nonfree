import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!te", name = "v", descriptor = "I")
	public static int anInt9272;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[8];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ha;IIILclient!vo;)V")
	public static void method8102(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class381 arg4) {
		for (@Pc(3) int local3 = 7; local3 >= 0; local3--) {
			for (@Pc(9) int local9 = 127; local9 >= 0; local9--) {
				Static529.method7605(true, false);
				@Pc(33) int local33 = (local3 & 0x7) << 7 | (arg0 & 0x3F) << 10 | local9 & 0x7F;
				@Pc(37) int local37 = Static229.anIntArray228[local33];
				Static217.method3969(false, true);
				arg1.aa(arg3 + (arg4.anInt10159 * local9 >> 7), arg2 + (arg4.anInt10131 * (-local3 + 7) >> 3), (arg4.anInt10159 >> 7) + 1, (arg4.anInt10131 >> 3) + 1, local37, 0);
			}
		}
		if (8 != 8) {
			method8104();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V")
	public static void method8103(@OriginalArg(0) int arg0) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 9);
		local9.method2038();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public static void method8104() {
		Static523.method7525();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!vo;III)V")
	public static void method8106(@OriginalArg(0) Class381 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static178.anInt8756 = arg2;
		Static57.aClass381_1 = arg0;
		Static150.anInt3128 = arg1;
	}
}
