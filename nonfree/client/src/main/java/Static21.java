import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_18 = new Class288(23, 6);

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)I")
	public static int method419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)[Lclient!g;")
	public static Class113[] method420() {
		return new Class113[] { Static252.aClass113_2, Static273.aClass113_3, Static130.aClass113_1 };
	}
}
