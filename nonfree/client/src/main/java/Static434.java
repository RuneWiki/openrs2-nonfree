import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "Lclient!m;")
	public static Class78 aClass78_5;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIBI)V")
	public static void method6199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static398.anInt7144 && arg2 <= Static71.anInt4958) {
			@Pc(15) int local15 = Static418.method6023(Static4.anInt6709, arg3, Static492.anInt8451);
			@Pc(21) int local21 = Static418.method6023(Static4.anInt6709, arg1, Static492.anInt8451);
			Static236.method4051(local15, arg2, local21, arg0);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIILclient!id;)Lclient!ah;")
	public static Class5_Sub2_Sub1 method6200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class142 arg2) {
		@Pc(10) int local10 = arg1 << 8 | arg2.anInt3879;
		@Pc(21) Class5_Sub2_Sub1 local21 = (Class5_Sub2_Sub1) Static58.aClass291_1.method6850((long) local10 << 16);
		if (local21 != null) {
			return local21;
		}
		@Pc(35) byte[] local35 = Static497.aClass117_234.method2964(Static497.aClass117_234.method2965(local10));
		if (local35 == null) {
			local10 = arg0 + 65536 << 8 | arg2.anInt3879;
			local21 = (Class5_Sub2_Sub1) Static58.aClass291_1.method6850((long) local10 << 16);
			if (local21 != null) {
				return local21;
			}
			local35 = Static497.aClass117_234.method2964(Static497.aClass117_234.method2965(local10));
			if (local35 == null) {
				local10 = arg2.anInt3879 | 0xFFFF00;
				local21 = (Class5_Sub2_Sub1) Static58.aClass291_1.method6850((long) local10 << 16);
				if (local21 != null) {
					return local21;
				}
				local35 = Static497.aClass117_234.method2964(Static497.aClass117_234.method2965(local10));
				if (local35 == null) {
					return null;
				} else if (local35.length <= 1) {
					return null;
				} else {
					local21 = Static409.method5946(local35);
					local21.aClass142_1 = arg2;
					Static58.aClass291_1.method6851((long) local10 << 16, local21);
					return local21;
				}
			} else if (local35.length <= 1) {
				return null;
			} else {
				local21 = Static409.method5946(local35);
				local21.aClass142_1 = arg2;
				Static58.aClass291_1.method6851((long) local10 << 16, local21);
				return local21;
			}
		} else if (local35.length <= 1) {
			return null;
		} else {
			local21 = Static409.method5946(local35);
			local21.aClass142_1 = arg2;
			Static58.aClass291_1.method6851((long) local10 << 16, local21);
			return local21;
		}
	}
}
