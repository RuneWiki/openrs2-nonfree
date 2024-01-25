import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class37 implements Interface5 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([IJZLclient!sq;)Ljava/lang/String;")
	@Override
	public String method1353(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class316 arg2) {
		if (arg2 == Static200.aClass316_9) {
			@Pc(13) Class315 local13 = Static592.aClass95_1.method2955(arg0[0]);
			return local13.method7453((int) arg1);
		} else if (arg2 == Static188.aClass316_8 || Static38.aClass316_4 == arg2) {
			@Pc(31) Class284 local31 = Static497.aClass258_21.method6652((int) arg1);
			return local31.aString88;
		} else if (Static298.aClass316_17 == arg2 || Static437.aClass316_15 == arg2 || arg2 == Static269.aClass316_13) {
			return Static592.aClass95_1.method2955(arg0[0]).method7453((int) arg1);
		} else {
			return null;
		}
	}
}
