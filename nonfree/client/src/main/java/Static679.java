import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!vfa", name = "t", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!vfa", name = "s", descriptor = "D")
	public static double aDouble26;

	@OriginalMember(owner = "client!vfa", name = "l", descriptor = "Lclient!ak;")
	public static final Class13 aClass13_4 = new Class13(64);

	@OriginalMember(owner = "client!vfa", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[200];

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IBIII)V")
	public static void method8950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		if (arg3 >= arg2) {
			for (local19 = arg2; local19 < arg3; local19++) {
				Static384.anIntArrayArray38[local19][arg0] = arg1;
			}
		} else {
			for (local19 = arg3; local19 < arg2; local19++) {
				Static384.anIntArrayArray38[local19][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BILclient!pe;I)J")
	public static long method8951(@OriginalArg(1) int arg0, @OriginalArg(2) Interface19 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class144 local14 = Static70.aClass323_1.method7792(arg1.method9384());
		@Pc(35) long local35 = (long) (arg1.method9381() << 14 | arg0 | arg2 << 7 | arg1.method9385() << 20 | 0x40000000);
		if (local14.anInt4425 == 0) {
			local35 |= local7;
		}
		if (local14.anInt4421 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg1.method9384() << 32;
	}
}
