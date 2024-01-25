import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!mga;")
	public static final Class220 aClass220_12 = new Class220("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!st;")
	public static final Class314 aClass314_140 = new Class314(33, -1);

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray75 = new String[200];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
	public static int method8033(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static376.anInt10191 - 1; local3++) {
			if (arg0 < Static127.anIntArray170[local3] + Static48.anIntArray589[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static376.anInt10191 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public static void method8035() {
		for (@Pc(8) int local8 = 0; local8 < Static154.anInt3152; local8++) {
			@Pc(14) Class130 local14 = Static110.aClass130Array1[local8];
			if (local14.aByte59 == 3) {
				if (local14.aClass3_Sub3_Sub5_2 == null) {
					local14.anInt3531 = Integer.MIN_VALUE;
				} else {
					Static304.aClass3_Sub3_Sub3_3.method2976(local14.aClass3_Sub3_Sub5_2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public static void method8036() {
		if (Static82.anInt1653 == 3) {
			Static206.method3226(4);
		} else if (Static82.anInt1653 == 7) {
			Static206.method3226(8);
		} else if (Static82.anInt1653 == 10) {
			Static206.method3226(11);
			return;
		}
	}
}
