import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
	public static int anInt3371;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[4];

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)[Lclient!kr;")
	public static Class216[] method2912() {
		return new Class216[] { Static639.aClass216_13, Static110.aClass216_6, Static613.aClass216_12 };
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BB)[B")
	public static byte[] method2921(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub28 local8 = new Class3_Sub28(arg0);
		@Pc(12) int local12 = local8.method5322(-70);
		@Pc(24) int local24 = local8.method5312();
		if (local24 < 0 || Static229.anInt4349 != 0 && local24 > Static229.anInt4349) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(111) byte[] local111 = new byte[local24];
			local8.method5271(local111, local24, 0);
			return local111;
		} else {
			@Pc(53) int local53 = local8.method5312();
			if (local53 < 0 || Static229.anInt4349 != 0 && Static229.anInt4349 < local53) {
				throw new RuntimeException();
			}
			@Pc(75) byte[] local75 = new byte[local53];
			if (local12 == 1) {
				Static279.method4253(local75, local53, arg0, local24);
			} else {
				@Pc(93) Class306 local93 = Static571.aClass306_1;
				synchronized (Static571.aClass306_1) {
					Static571.aClass306_1.method7468(local75, local8);
				}
			}
			return local75;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[BIIII)V")
	public static void method2922(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(21) int local21 = arg3 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local21--;
			if (local21 < 0) {
				local21 = arg3 - arg1 & 0x3;
				while (true) {
					local21--;
					if (local21 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(39) int local39 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg0[local39] = 1;
			@Pc(49) int local49 = local44 + 1;
			arg0[local44] = 1;
			arg2 = local49 + 1;
			arg0[local49] = 1;
		}
	}
}
