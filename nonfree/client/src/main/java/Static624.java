import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	public static int anInt10013;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "[I")
	public static int[] anIntArray572;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_99 = new Class187(68, 4);

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_318 = new Class196(46, 1);

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
	public static int anInt10014 = 0;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IBIIIII)V")
	public static void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 + arg5;
		@Pc(13) int local13 = arg4 - arg1;
		for (@Pc(15) int local15 = arg5; local15 < local9; local15++) {
			Static343.method5202(arg3, Static286.anIntArrayArray42[local15], arg2, arg0);
		}
		@Pc(34) int local34 = arg0 - arg1;
		for (@Pc(36) int local36 = arg4; local36 > local13; local36--) {
			Static343.method5202(arg3, Static286.anIntArrayArray42[local36], arg2, arg0);
		}
		@Pc(58) int local58 = arg1 + arg3;
		for (@Pc(69) int local69 = local9; local69 <= local13; local69++) {
			@Pc(75) int[] local75 = Static286.anIntArrayArray42[local69];
			Static343.method5202(arg3, local75, arg2, local58);
			Static343.method5202(local34, local75, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIILclient!ks;)Lclient!mha;")
	public static Class5_Sub2_Sub12 method8336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class209 arg2) {
		@Pc(10) int local10 = arg2.anInt5604 | arg0 << 10;
		@Pc(19) Class5_Sub2_Sub12 local19 = (Class5_Sub2_Sub12) Static584.aClass252_3.method5973((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static427.aClass50_189.method915(Static427.aClass50_189.method924(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 10 | arg2.anInt5604;
			local19 = (Class5_Sub2_Sub12) Static584.aClass252_3.method5973((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static427.aClass50_189.method915(Static427.aClass50_189.method924(local10));
			if (local31 == null) {
				local10 = arg2.anInt5604 | 0x3FFFC00;
				local19 = (Class5_Sub2_Sub12) Static584.aClass252_3.method5973((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static427.aClass50_189.method915(Static427.aClass50_189.method924(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static72.method7644(local31);
					} catch (@Pc(190) Exception local190) {
						throw new RuntimeException(local190.getMessage() + " S: " + local10);
					}
					local19.aClass209_9 = arg2;
					Static584.aClass252_3.method5974(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static72.method7644(local31);
				} catch (@Pc(122) Exception local122) {
					throw new RuntimeException(local122.getMessage() + " S: " + local10);
				}
				local19.aClass209_9 = arg2;
				Static584.aClass252_3.method5974(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static72.method7644(local31);
			} catch (@Pc(45) Exception local45) {
				throw new RuntimeException(local45.getMessage() + " S: " + local10);
			}
			local19.aClass209_9 = arg2;
			Static584.aClass252_3.method5974(local19, (long) local10 << 16);
			return local19;
		}
	}
}
