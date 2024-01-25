import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "J")
	public static final long aLong137 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
	public static final int anInt4607 = 52;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ei;)I")
	public static int method4148(@OriginalArg(1) Class91 arg0) {
		if (arg0 == Static489.aClass91_4) {
			return 7681;
		} else if (arg0 == Static435.aClass91_3) {
			return 8448;
		} else if (Static586.aClass91_5 == arg0) {
			return 34165;
		} else if (Static228.aClass91_2 == arg0) {
			return 260;
		} else if (arg0 == Static214.aClass91_1) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Lclient!de;")
	public static Class60 method4149(@OriginalArg(1) int arg0) {
		@Pc(13) Class60[] local13 = Static412.method5193();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class60 local21 = local13[local15];
			if (arg0 == local21.anInt1812) {
				return local21;
			}
		}
		return null;
	}
}
