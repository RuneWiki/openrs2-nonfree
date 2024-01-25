import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!un", name = "c", descriptor = "I")
	public static int anInt9711;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	public static void method8025() {
		Static174.aClass33_7.method6182(Static117.aFloat99, Static136.aFloat125, Static609.aFloat275);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ha;IIIIB)V")
	public static void method8026(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		Static67.aClass33_5 = arg0;
		Static449.aClass47_8 = Static67.aClass33_5.method6223();
		Static364.aClass47_4 = Static67.aClass33_5.method6223();
		Static269.aClass47_2 = Static67.aClass33_5.method6223();
		Static293.anInt5936 = 100;
		Static156.anInt3814 = 100;
		Static235.anInterface16Array1 = null;
		Static295.anIntArray349 = null;
		Static178.anInt4220 = 0;
		Static207.method4083(arg1, arg2);
		Static556.anInt9465 = -1;
		Static134.anInt3477 = -1;
		Static5.anInt62 = -1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([IIIII)V")
	public static void method8027(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(12) int local12 = arg1 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (arg2 < local16) {
			@Pc(20) int local20 = arg2 + 1;
			arg0[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg3;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg3;
			arg2 = local50 + 1;
			arg0[arg2] = arg3;
		}
		while (local12 > arg2) {
			arg2++;
			arg0[arg2] = arg3;
		}
	}
}
