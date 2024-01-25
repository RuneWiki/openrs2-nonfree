import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!kt;II)V")
	public static void method7109(@OriginalArg(0) Class9_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArray641 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anIntArray641[arg1 + 1];
		if (arg0.aClass45_10.method6577() != local13) {
			arg0.aClass45_10.method6585(arg0.aClass45_10.method6570(), local13);
			arg0.anInt8816 = arg0.anInt8817;
		}
	}
}
