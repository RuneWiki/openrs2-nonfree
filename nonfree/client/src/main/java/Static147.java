import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public static int anInt2652;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "[I")
	public static final int[] anIntArray182 = new int[1024];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Z")
	public static boolean method2209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static199.method2845(arg0, arg1) | Static471.method6342(arg1, arg0) | Static4.method97(arg1, arg0)) & Static628.method8428(arg1, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ow;ZI)Lclient!nfa;")
	public static Class2_Sub2_Sub16 method2210(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg1.anInt6560;
		@Pc(19) Class2_Sub2_Sub16 local19 = (Class2_Sub2_Sub16) Static596.aClass47_4.method912((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static210.aClass380_53.method8616(Static210.aClass380_53.method8637(local10));
		if (local36 == null) {
			local10 = arg1.anInt6560 | arg2 + 65536 << 10;
			local19 = (Class2_Sub2_Sub16) Static596.aClass47_4.method912((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static210.aClass380_53.method8616(Static210.aClass380_53.method8637(local10));
			if (local36 == null) {
				local10 = arg1.anInt6560 | 0x3FFFC00;
				local19 = (Class2_Sub2_Sub16) Static596.aClass47_4.method912((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static210.aClass380_53.method8616(Static210.aClass380_53.method8637(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static94.method1465(local36);
					} catch (@Pc(194) Exception local194) {
						throw new RuntimeException(local194.getMessage() + " S: " + local10);
					}
					local19.aClass260_7 = arg1;
					Static596.aClass47_4.method915((long) local10 << 16, local19);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static94.method1465(local36);
				} catch (@Pc(126) Exception local126) {
					throw new RuntimeException(local126.getMessage() + " S: " + local10);
				}
				local19.aClass260_7 = arg1;
				Static596.aClass47_4.method915((long) local10 << 16, local19);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static94.method1465(local36);
			} catch (@Pc(52) Exception local52) {
				throw new RuntimeException(local52.getMessage() + " S: " + local10);
			}
			local19.aClass260_7 = arg1;
			Static596.aClass47_4.method915((long) local10 << 16, local19);
			return local19;
		}
	}
}
