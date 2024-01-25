import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public static int anInt138;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "I")
	public static int anInt139;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public static final int anInt133 = -1;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!of;")
	public static final Class230 aClass230_1 = new Class230(4, 3);

	@OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
	public static final int[] anIntArray7 = new int[5];

	@OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
	public static final int[] anIntArray8 = new int[3];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBIIIIII[[[BLclient!oa;II)V")
	public static void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) Class90 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg7 = arg7 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg6 = 8;
			arg7 = arg7 + 3 & 0x3;
		}
		arg9.ma(arg2, arg11, arg0, arg3, arg10, arg5, arg8[arg6 - 1][arg7], arg4, arg1);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!wc;)V")
	public static void method132(@OriginalArg(1) Class60_Sub8 arg0) {
		arg0.aClass15_1 = null;
		@Pc(12) int local12 = arg0.aClass60_Sub6Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass60_Sub6Array1[local14].aBoolean513 = false;
		}
		@Pc(45) Class349[] local45 = Class319.aClass349Array1;
		synchronized (Class319.aClass349Array1) {
			if (local12 < Class319.aClass349Array1.length && Static231.anIntArray714[local12] < 200) {
				Class319.aClass349Array1[local12].method7893(arg0);
				@Pc(68) int local68 = Static231.anIntArray714[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z")
	public static boolean method133(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
