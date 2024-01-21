import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "J")
	public static volatile long aLong134 = 0L;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public static int anInt4029 = -1;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
	public static int anInt4031 = 1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method2784(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static106.aBoolean111) {
			try {
				@Pc(26) Class45 local26 = (Class45) Class.forName("Class45_Sub1").getDeclaredConstructor().newInstance();
				local26.method2581(arg0);
				return local26;
			} catch (@Pc(33) Throwable local33) {
				Static106.aBoolean111 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!pb;IZILclient!pb;)Lclient!ud;")
	public static Class2_Sub1_Sub24 method2785(@OriginalArg(0) Class71 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class71 arg2) {
		@Pc(10) int[] local10 = arg2.method2123(arg1);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg2.method2131(local10[local14], arg1);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg0.method2131(0, local44);
				if (local60 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub24(arg2, arg0, arg1, false);
		} catch (@Pc(82) Exception local82) {
			return null;
		}
	}
}
