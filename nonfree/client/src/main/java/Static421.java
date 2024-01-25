import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!oba", name = "n", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_107 = new Class171(65, 6);

	@OriginalMember(owner = "client!oba", name = "s", descriptor = "[I")
	public static final int[] anIntArray370 = new int[14];

	@OriginalMember(owner = "client!oba", name = "w", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIILclient!ofa;)V")
	public static void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class265 arg2) {
		Static572.anInt9223 = arg0;
		Static179.anInt9624 = arg1;
		Static45.aClass265_3 = arg2;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILclient!nf;IB)J")
	public static long method5797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface17 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(19) Class216 local19 = Static466.aClass340_6.method7665(arg1.method6661());
		@Pc(40) long local40 = (long) (arg1.method6662() << 14 | arg0 | arg2 << 7 | arg1.method6659() << 20 | 0x40000000);
		if (local19.anInt5978 == 0) {
			local40 |= local7;
		}
		if (local19.anInt5951 == 1) {
			local40 |= local5;
		}
		return local40 | (long) arg1.method6661() << 32;
	}
}
