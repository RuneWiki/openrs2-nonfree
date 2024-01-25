import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public static int anInt2286;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "I")
	public static int anInt2284 = -1;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "I")
	public static int anInt2289 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IBLclient!hs;I)Lclient!co;")
	public static Class14_Sub2_Sub6 method2167(@OriginalArg(0) int arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg1.anInt4564;
		@Pc(19) Class14_Sub2_Sub6 local19 = (Class14_Sub2_Sub6) Static470.aClass378_3.method9082((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(32) byte[] local32 = Static413.aClass310_89.method7795(Static413.aClass310_89.method7802(local10));
		if (local32 == null) {
			local10 = arg2 + 65536 << 10 | arg1.anInt4564;
			local19 = (Class14_Sub2_Sub6) Static470.aClass378_3.method9082((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local32 = Static413.aClass310_89.method7795(Static413.aClass310_89.method7802(local10));
			if (local32 == null) {
				local10 = arg1.anInt4564 | 0x3FFFC00;
				local19 = (Class14_Sub2_Sub6) Static470.aClass378_3.method9082((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local32 = Static413.aClass310_89.method7795(Static413.aClass310_89.method7802(local10));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static180.method2648(local32);
					} catch (@Pc(211) Exception local211) {
						throw new RuntimeException(local211.getMessage() + " S: " + local10);
					}
					local19.aClass162_2 = arg1;
					Static470.aClass378_3.method9078(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static180.method2648(local32);
				} catch (@Pc(135) Exception local135) {
					throw new RuntimeException(local135.getMessage() + " S: " + local10);
				}
				local19.aClass162_2 = arg1;
				Static470.aClass378_3.method9078(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static180.method2648(local32);
			} catch (@Pc(51) Exception local51) {
				throw new RuntimeException(local51.getMessage() + " S: " + local10);
			}
			local19.aClass162_2 = arg1;
			Static470.aClass378_3.method9078(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Z")
	public static boolean method2168() {
		return Static638.anInt10454 > 0;
	}
}
