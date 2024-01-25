import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class43 implements Interface6 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([IJBI)Ljava/lang/String;")
	@Override
	public String method937(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			@Pc(11) Class2_Sub9_Sub1 local11 = Static359.method5731(arg0[0]);
			return local11.method1271((int) arg1);
		} else if (arg2 == 1 || arg2 == 10) {
			@Pc(31) Class122 local31 = Static310.aClass184_2.method5040((int) arg1);
			return local31.aString37;
		} else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
			return Static359.method5731(arg0[0]).method1271((int) arg1);
		} else {
			return null;
		}
	}
}
