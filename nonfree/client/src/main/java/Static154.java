import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fha", name = "B", descriptor = "I")
	public static int anInt7074;

	@OriginalMember(owner = "client!fha", name = "C", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_39 = new Class169(64);

	@OriginalMember(owner = "client!fha", name = "H", descriptor = "Lclient!kf;")
	public static final Class177 aClass177_4 = new Class177();

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
	public static void method6048() {
		@Pc(7) Class320 local7 = null;
		try {
			local7 = Static623.method9066("2");
			@Pc(20) Class2_Sub11 local20 = new Class2_Sub11(Static110.anInt3009 * 6 + 3);
			local20.method8374(1);
			local20.method8333(Static110.anInt3009);
			for (@Pc(38) int local38 = 0; local38 < Static306.anIntArray372.length; local38++) {
				if (Static544.aBooleanArray25[local38]) {
					local20.method8333(local38);
					local20.method8387(Static306.anIntArray372[local38]);
				}
			}
			local7.method7906(0, local20.anInt10066, local20.aByteArray128);
		} catch (@Pc(73) Exception local73) {
		}
		try {
			if (local7 != null) {
				local7.method7905();
			}
		} catch (@Pc(80) Exception local80) {
		}
		Static232.aLong107 = Static277.method5091();
		Static453.aBoolean599 = false;
	}
}
