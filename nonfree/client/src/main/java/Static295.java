import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_129 = new Class87(32);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public static void method4598() {
		for (@Pc(14) Class5_Sub44 local14 = (Class5_Sub44) Static174.aClass330_14.method7908(); local14 != null; local14 = (Class5_Sub44) Static174.aClass330_14.method7914()) {
			if (local14.anInt8641 == -1) {
				local14.anInt8648 = 0;
				if (local14.anInt8645 >= 0 && local14.anInt8639 >= 0 && Static326.anInt5541 > local14.anInt8645 && Static448.anInt7637 > local14.anInt8639) {
					Static646.method9056(local14);
				}
			} else {
				local14.method9047();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!bfa;)V")
	public static void method4599(@OriginalArg(1) Class4_Sub2_Sub1_Sub1_Sub1 arg0) {
		@Pc(16) Class5_Sub20 local16 = (Class5_Sub20) Static311.aClass273_13.method6581((long) arg0.anInt1225);
		if (local16 == null) {
			return;
		}
		if (local16.aClass5_Sub1_Sub4_2 != null) {
			Static26.aClass5_Sub1_Sub2_1.method5052(local16.aClass5_Sub1_Sub4_2);
			local16.aClass5_Sub1_Sub4_2 = null;
		}
		local16.method9047();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
	public static void method4600() {
		Static156.aClass87_85.method1801();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!jaa;")
	public static Class170 method4602(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class170_Sub1(arg0, 7500);
	}
}
