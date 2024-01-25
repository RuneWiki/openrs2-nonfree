import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!tia", name = "Hb", descriptor = "Lclient!oq;")
	public static Class268 aClass268_5;

	@OriginalMember(owner = "client!tia", name = "Pb", descriptor = "I")
	public static int anInt9300;

	@OriginalMember(owner = "client!tia", name = "Wb", descriptor = "Lclient!wm;")
	public static Class390 aClass390_113;

	@OriginalMember(owner = "client!tia", name = "Zb", descriptor = "Lclient!wm;")
	public static Class390 aClass390_114;

	@OriginalMember(owner = "client!tia", name = "ac", descriptor = "I")
	public static int anInt9309;

	@OriginalMember(owner = "client!tia", name = "Jb", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_90 = new Class305(42, 0);

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II[JB[Ljava/lang/Object;)V")
	public static void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(13) int local13 = (arg0 + arg1) / 2;
		@Pc(15) int local15 = arg0;
		@Pc(19) long local19 = arg2[local13];
		arg2[local13] = arg2[arg1];
		arg2[arg1] = local19;
		@Pc(33) Object local33 = arg3[local13];
		arg3[local13] = arg3[arg1];
		arg3[arg1] = local33;
		@Pc(51) int local51 = local19 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg0; local53 < arg1; local53++) {
			if (arg2[local53] < local19 + (long) (local53 & local51)) {
				@Pc(69) long local69 = arg2[local53];
				arg2[local53] = arg2[local15];
				arg2[local15] = local69;
				@Pc(83) Object local83 = arg3[local53];
				arg3[local53] = arg3[local15];
				arg3[local15++] = local83;
			}
		}
		arg2[arg1] = arg2[local15];
		arg2[local15] = local19;
		arg3[arg1] = arg3[local15];
		arg3[local15] = local33;
		method7864(arg0, local15 - 1, arg2, arg3);
		method7864(local15 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(III)Lclient!pa;")
	public static Class28_Sub1_Sub2 method7867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass28_Sub1_Sub2_1 == null ? null : local7.aClass28_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(III)I")
	public static int method7872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = 0;
		while (arg0 > 0) {
			local5 = arg1 & 0x1 | local5 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tia", name = "o", descriptor = "(II)I")
	public static int method7873(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
