import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_138 = new Class397(42, -2);

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public static int anInt8156 = 0;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	public static int anInt8157 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII[BIII[B)V")
	public static void method6980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(22) int local22 = -(arg4 & 0x3);
		for (@Pc(25) int local25 = -arg0; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg2++;
				arg3[local33] = (byte) (arg3[local33] - arg7[arg1++]);
				@Pc(46) int local46 = arg2++;
				arg3[local46] = (byte) (arg3[local46] - arg7[arg1++]);
				@Pc(59) int local59 = arg2++;
				arg3[local59] = (byte) (arg3[local59] - arg7[arg1++]);
				@Pc(72) int local72 = arg2++;
				arg3[local72] = (byte) (arg3[local72] - arg7[arg1++]);
			}
			for (@Pc(90) int local90 = local22; local90 < 0; local90++) {
				local33 = arg2++;
				arg3[local33] = (byte) (arg3[local33] - arg7[arg1++]);
			}
			arg1 += arg5;
			arg2 += arg6;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	public static void method6985() {
		@Pc(7) Class319[] local7 = Class163.aClass319Array1;
		synchronized (Class163.aClass319Array1) {
			for (@Pc(17) int local17 = 0; local17 < Class163.aClass319Array1.length; local17++) {
				Class163.aClass319Array1[local17] = new Class319();
				Static636.anIntArray711[local17] = 0;
			}
		}
	}
}
