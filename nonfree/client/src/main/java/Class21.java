import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class21 implements Interface8 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!mt;[IJI)Ljava/lang/String;")
	@Override
	public String method303(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (arg0 == Static328.aClass165_13) {
			@Pc(21) Class179 local21 = Static118.aClass273_1.method5978(arg1[0]);
			return local21.method3900((int) arg2);
		} else if (Static422.aClass165_18 == arg0 || arg0 == Static407.aClass165_16) {
			@Pc(39) Class135 local39 = Static285.aClass226_2.method4788((int) arg2);
			return local39.aString41;
		} else if (arg0 == Static243.aClass165_8 || Static165.aClass165_6 == arg0 || Static155.aClass165_5 == arg0) {
			return Static118.aClass273_1.method5978(arg1[0]).method3900((int) arg2);
		} else {
			return null;
		}
	}
}
