import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Lclient!ip;")
	public static final Class165 aClass165_1 = new Class165();

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Z")
	public static boolean aBoolean437 = false;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
	public static final int anInt5958 = 0;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
	public static final int anInt5959 = 1;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	public static void method5129() {
		if (Static71.anInt1424 == 5) {
			Static71.anInt1424 = 6;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[I[JII)V")
	public static void method5130(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg0; local56 < arg3; local56++) {
			if (local20 + (long) (local54 & local56) > arg2[local56]) {
				@Pc(74) long local74 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16] = local74;
				@Pc(88) int local88 = arg1[local56];
				arg1[local56] = arg1[local16];
				arg1[local16++] = local88;
			}
		}
		arg2[arg3] = arg2[local16];
		arg2[local16] = local20;
		arg1[arg3] = arg1[local16];
		arg1[local16] = local34;
		method5130(arg0, arg1, arg2, local16 - 1);
		method5130(local16 + 1, arg1, arg2, arg3);
	}
}
