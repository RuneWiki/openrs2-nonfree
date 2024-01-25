import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "B")
	public static byte aByte78;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!uq;")
	public static Class362 aClass362_66;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public static int anInt5431 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBZ)Lclient!pia;")
	public static Class34_Sub8 method4658(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class317[] local7 = Class3_Sub46.aClass317Array1;
		synchronized (Class3_Sub46.aClass317Array1) {
			@Pc(26) Class34_Sub8 local26;
			if (Class3_Sub46.aClass317Array1.length <= arg0 || Class3_Sub46.aClass317Array1[arg0].method6889()) {
				local26 = new Class34_Sub8();
				local26.aClass34_Sub6Array1 = new Class34_Sub6[arg0];
				for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
					local26.aClass34_Sub6Array1[local48] = new Class34_Sub6();
				}
			} else {
				local26 = (Class34_Sub8) Class3_Sub46.aClass317Array1[arg0].method6886();
				local26.method8764();
				@Pc(33) int local33 = Static38.anIntArray31[arg0]--;
			}
			local26.aBoolean527 = arg1;
			return local26;
		}
	}
}
