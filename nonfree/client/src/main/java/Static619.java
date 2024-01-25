import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
	public static int anInt10271;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_110 = new Class240(74, 2);

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "[I")
	public static final int[] anIntArray543 = new int[14];

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	public static int anInt10270 = 0;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_150 = new Class171(55, 2);

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "[I")
	public static final int[] anIntArray544 = new int[8];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([J[Ljava/lang/Object;ZII)V")
	public static void method8377(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg2];
		arg0[arg2] = local16;
		@Pc(30) Object local30 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg3; local50 < arg2; local50++) {
			if (arg0[local50] < local16 + (long) (local48 & local50)) {
				@Pc(67) long local67 = arg0[local50];
				arg0[local50] = arg0[local12];
				arg0[local12] = local67;
				@Pc(81) Object local81 = arg1[local50];
				arg1[local50] = arg1[local12];
				arg1[local12++] = local81;
			}
		}
		arg0[arg2] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg2] = arg1[local12];
		arg1[local12] = local30;
		method8377(arg0, arg1, local12 - 1, arg3);
		method8377(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Z")
	public static boolean method8378() {
		if (Static484.aClass3_Sub5_Sub18_4 == null) {
			return false;
		} else {
			if (Static484.aClass3_Sub5_Sub18_4.anInt9217 >= 2000) {
				Static484.aClass3_Sub5_Sub18_4.anInt9217 -= 2000;
			}
			return Static484.aClass3_Sub5_Sub18_4.anInt9217 == 1002;
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
	public static void method8380() {
		@Pc(7) Class312 local7 = null;
		try {
			@Pc(13) Class338 local13 = Static566.aClass92_6.method1880("2");
			while (local13.anInt9321 == 0) {
				Static26.method592(1L);
			}
			if (local13.anInt9321 == 1) {
				local7 = (Class312) local13.anObject18;
				@Pc(37) byte[] local37 = new byte[(int) local7.method6844()];
				@Pc(52) int local52;
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39 += local52) {
					local52 = local7.method6839(local37.length - local39, local39, local37);
					if (local52 == -1) {
						throw new IOException("EOF");
					}
				}
				Static668.method8917(new Class3_Sub4(local37));
			}
		} catch (@Pc(76) Exception local76) {
		}
		try {
			if (local7 != null) {
				local7.method6838();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}
}
