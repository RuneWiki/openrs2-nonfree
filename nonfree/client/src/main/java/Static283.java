import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_42 = new Class305(25, 8);

	@OriginalMember(owner = "client!jga", name = "m", descriptor = "I")
	public static int anInt5420 = -1;

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V")
	public static void method4543() {
		for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
			Static57.aBooleanArray2[local5] = true;
		}
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(I)V")
	public static void method4545() {
		@Pc(5) Class340 local5 = Static483.aClass340_45;
		synchronized (Static483.aClass340_45) {
			Static483.aClass340_45.method7987();
		}
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Ljava/lang/String;")
	public static String method4546() {
		if (Static493.aBoolean702 || Static355.aClass5_Sub3_Sub20_3 == null) {
			return "";
		} else if ((Static355.aClass5_Sub3_Sub20_3.aString101 == null || Static355.aClass5_Sub3_Sub20_3.aString101.length() == 0) && Static355.aClass5_Sub3_Sub20_3.aString102 != null && Static355.aClass5_Sub3_Sub20_3.aString102.length() > 0) {
			return Static355.aClass5_Sub3_Sub20_3.aString102;
		} else {
			return Static355.aClass5_Sub3_Sub20_3.aString101;
		}
	}
}
