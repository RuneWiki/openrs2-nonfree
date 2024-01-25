import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!to", name = "N", descriptor = "I")
	public static int anInt9404;

	@OriginalMember(owner = "client!to", name = "V", descriptor = "[I")
	public static final int[] anIntArray810 = new int[4];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!gga;II)V")
	public static void method8239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub27 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg1 << 28 | arg0 << 14);
		@Pc(24) Class3_Sub16 local24 = (Class3_Sub16) Static98.aClass83_6.method2368(local16);
		if (local24 == null) {
			local24 = new Class3_Sub16();
			Static98.aClass83_6.method2377(local16, local24);
			local24.aClass338_44.method8171(arg2);
			return;
		}
		@Pc(49) Class374 local49 = Static170.aClass370_1.method8900(arg2.anInt3843);
		@Pc(57) int local57 = local49.anInt10279;
		if (local49.anInt10300 == 1) {
			local57 *= arg2.anInt3845 + 1;
		}
		for (@Pc(74) Class3_Sub27 local74 = (Class3_Sub27) local24.aClass338_44.method8177(); local74 != null; local74 = (Class3_Sub27) local24.aClass338_44.method8168()) {
			local49 = Static170.aClass370_1.method8900(local74.anInt3843);
			@Pc(87) int local87 = local49.anInt10279;
			if (local49.anInt10300 == 1) {
				local87 *= local74.anInt3845 + 1;
			}
			if (local87 < local57) {
				Static610.method8666(arg2, local74);
				return;
			}
		}
		local24.aClass338_44.method8171(arg2);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIILclient!ha;)V")
	public static void method8242(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class13 arg4) {
		arg4.method8452(arg1, arg0, arg2, arg3, -10660793);
		arg4.method8452(arg1 - 2, arg0 + 1, 16, arg3 + 1, -16777216);
		arg4.method8460(arg0 + 18, arg2 + -19, -16777216, arg3 + 1, arg1 - 2);
	}

	@OriginalMember(owner = "client!to", name = "p", descriptor = "(I)V")
	public static void method8243() {
		@Pc(10) Class3_Sub23 local10;
		for (local10 = (Class3_Sub23) Static482.aClass338_192.method8177(); local10 != null; local10 = (Class3_Sub23) Static482.aClass338_192.method8168()) {
			if (local10.aBoolean246) {
				local10.method9380();
			} else {
				local10.aBoolean247 = true;
				if (local10.anInt3189 >= 0 && local10.anInt3188 >= 0 && Static158.anInt927 > local10.anInt3189 && Static515.anInt8292 > local10.anInt3188) {
					Static282.method4523(local10);
				}
			}
		}
		for (local10 = (Class3_Sub23) Static165.aClass338_227.method8177(); local10 != null; local10 = (Class3_Sub23) Static165.aClass338_227.method8168()) {
			if (local10.aBoolean246) {
				local10.method9380();
			} else {
				local10.aBoolean247 = true;
			}
		}
	}
}
