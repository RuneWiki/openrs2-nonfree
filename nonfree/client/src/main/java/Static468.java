import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!tp", name = "s", descriptor = "Lclient!sl;")
	public static final Class266 aClass266_10 = new Class266("", 12);

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_110 = new Class186(31, 2);

	@OriginalMember(owner = "client!tp", name = "C", descriptor = "Lclient!hn;")
	public static final Class123 aClass123_5 = new Class123();

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)I")
	public static int method6833() {
		@Pc(5) Class9 local5 = Static478.aClass9_10;
		@Pc(7) boolean local7 = false;
		if (Static526.anInt8926 != 0) {
			@Pc(13) Canvas local13 = new Canvas();
			local13.setSize(100, 100);
			local5 = Static383.method7645(null, 0, 0, null, local13);
			local7 = true;
		}
		@Pc(30) long local30 = Static93.method2172();
		for (@Pc(32) int local32 = 0; local32 < 10000; local32++) {
			local5.method7595();
		}
		@Pc(58) int local58 = (int) (Static93.method2172() - local30);
		local5.method7632(0, -16777216, 100, 100, 0);
		if (local7) {
			local5.method7585();
		}
		return local58;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(Z)[Lclient!bn;")
	public static Class33[] method6834() {
		return new Class33[] { Static365.aClass33_24, Static281.aClass33_14, Static325.aClass33_15, Static437.aClass33_20, Static114.aClass33_17, Static402.aClass33_25, Static253.aClass33_22, Static75.aClass33_4, Static424.aClass33_18, Static103.aClass33_7, Static460.aClass33_21, Static430.aClass33_19, Static60.aClass33_3, Static103.aClass33_8, Static110.aClass33_9 };
	}
}
