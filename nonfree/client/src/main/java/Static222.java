import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	public static int anInt4384;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Lclient!mq;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_104 = new Class85("flash3:", "", "", "");

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	public static int anInt4381 = -60;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[100];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	public static void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass4_Sub4_1 != null) {
			local7.aClass4_Sub4_1 = null;
		}
	}
}
