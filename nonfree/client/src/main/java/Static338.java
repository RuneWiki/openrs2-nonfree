import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!kla", name = "w", descriptor = "I")
	public static int anInt5226;

	@OriginalMember(owner = "client!kla", name = "v", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_102 = new Class225(142, 1);

	@OriginalMember(owner = "client!kla", name = "p", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_81 = new Class349(7, 7);

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(II)Lclient!dca;")
	public static Class76 method4700(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static90.aFloat43 == 3.0D) {
				return Static204.aClass76_4;
			}
			if ((double) Static90.aFloat43 == 4.0D) {
				return Static58.aClass76_1;
			}
			if ((double) Static90.aFloat43 == 6.0D) {
				return Static173.aClass76_3;
			}
			if ((double) Static90.aFloat43 >= 8.0D) {
				return Static586.aClass76_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static90.aFloat43 == 3.0D) {
				return Static173.aClass76_3;
			}
			if ((double) Static90.aFloat43 == 4.0D) {
				return Static586.aClass76_8;
			}
			if ((double) Static90.aFloat43 == 6.0D) {
				return Static321.aClass76_6;
			}
			if ((double) Static90.aFloat43 >= 8.0D) {
				return Static134.aClass76_2;
			}
		} else if (arg0 == 2) {
			if ((double) Static90.aFloat43 == 3.0D) {
				return Static321.aClass76_6;
			}
			if ((double) Static90.aFloat43 == 4.0D) {
				return Static134.aClass76_2;
			}
			if ((double) Static90.aFloat43 == 6.0D) {
				return Static424.aClass76_7;
			}
			if ((double) Static90.aFloat43 >= 8.0D) {
				return Static281.aClass76_5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kla", name = "a", descriptor = "(Lclient!ha;ZIIZ)Lclient!ida;")
	public static Class173 method4701(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == -1) {
			return null;
		}
		if (Static167.anIntArray217 != null) {
			for (@Pc(16) int local16 = 0; local16 < Static167.anIntArray217.length; local16++) {
				if (arg2 == Static167.anIntArray217[local16]) {
					return Static497.aClass173Array1[local16];
				}
			}
		}
		@Pc(53) Class173 local53 = (Class173) Static419.aClass85_45.method1737((long) (arg2 << 1 | (arg3 ? 1 : 0)));
		if (local53 != null) {
			if (arg1 && local53.aClass289_7 == null) {
				@Pc(71) Class289 local71 = Static597.method8191(Static246.aClass254_84, arg2);
				if (local71 == null) {
					return null;
				}
				local53.aClass289_7 = local71;
			}
			return local53;
		}
		@Pc(85) Class355[] local85 = Static737.method8361(Static695.aClass254_165, arg2);
		if (local85 == null) {
			return null;
		}
		@Pc(95) Class289 local95 = Static597.method8191(Static246.aClass254_84, arg2);
		if (local95 == null) {
			return null;
		}
		if (arg1) {
			local53 = new Class173(arg0.method9707(local95, local85, arg3), local95);
		} else {
			local53 = new Class173(arg0.method9707(local95, local85, arg3));
		}
		Static419.aClass85_45.method1745((long) ((arg3 ? 1 : 0) | arg2 << 1), 16383, local53);
		return local53;
	}
}
