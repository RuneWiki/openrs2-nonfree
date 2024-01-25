import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_186 = new Class214(44, 12);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)[Lclient!dh;")
	public static Class49[] method4978() {
		return new Class49[] { Static42.aClass49_6, Static209.aClass49_14, Static199.aClass49_2, Static289.aClass49_18, Static277.aClass49_12, Static109.aClass49_11, Static265.aClass49_16, Static66.aClass49_8, Static264.aClass49_21, Static376.aClass49_19, Static267.aClass49_17, Static413.aClass49_20, Static34.aClass49_5, Static193.aClass49_13, Static234.aClass49_15 };
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)I")
	public static int method4979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}
}
