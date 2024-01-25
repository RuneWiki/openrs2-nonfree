import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class315 implements Interface23 {

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[ILclient!fa;J)Ljava/lang/String;")
	@Override
	public String method7898(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class89 arg1, @OriginalArg(3) long arg2) {
		if (Static98.aClass89_10 == arg1) {
			@Pc(18) Class281 local18 = Static443.aClass59_1.method1520(arg0[0]);
			return local18.method7164((int) arg2);
		} else if (Static618.aClass89_32 == arg1 || arg1 == Static52.aClass89_8) {
			@Pc(36) Class347 local36 = Static266.aClass138_1.method3730((int) arg2);
			return local36.aString109;
		} else if (Static28.aClass89_17 == arg1 || Static387.aClass89_27 == arg1 || arg1 == Static128.aClass89_11) {
			return Static443.aClass59_1.method1520(arg0[0]).method7164((int) arg2);
		} else {
			return null;
		}
	}
}
