import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "Z")
	public static boolean aBoolean439;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!ss;III)Lclient!jn;")
	public static Class2_Sub1_Sub10 method5369(@OriginalArg(0) Class340 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 10 | arg0.anInt9704;
		@Pc(19) Class2_Sub1_Sub10 local19 = (Class2_Sub1_Sub10) Static646.aClass42_4.method1177((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static670.aClass124_86.method3610(Static670.aClass124_86.method3619(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 10 | arg0.anInt9704;
			local19 = (Class2_Sub1_Sub10) Static646.aClass42_4.method1177((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static670.aClass124_86.method3610(Static670.aClass124_86.method3619(local10));
			if (local31 == null) {
				local10 = arg0.anInt9704 | 0x3FFFC00;
				local19 = (Class2_Sub1_Sub10) Static646.aClass42_4.method1177((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static670.aClass124_86.method3610(Static670.aClass124_86.method3619(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static663.method9678(local31);
					} catch (@Pc(197) Exception local197) {
						throw new RuntimeException(local197.getMessage() + " S: " + local10);
					}
					local19.aClass340_8 = arg0;
					Static646.aClass42_4.method1175(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static663.method9678(local31);
				} catch (@Pc(121) Exception local121) {
					throw new RuntimeException(local121.getMessage() + " S: " + local10);
				}
				local19.aClass340_8 = arg0;
				Static646.aClass42_4.method1175(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static663.method9678(local31);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass340_8 = arg0;
			Static646.aClass42_4.method1175(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z")
	public static boolean method5371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
