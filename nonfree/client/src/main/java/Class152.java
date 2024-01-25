import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class152 implements Interface9 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z[IIJ)Ljava/lang/String;")
	@Override
	public String method3952(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (arg1 == 0) {
			@Pc(19) Class6_Sub2_Sub3 local19 = Static39.method685(arg0[0]);
			return local19.method662((int) arg2);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(38) Class147 local38 = Static211.method3762((int) arg2);
			return local38.aString170;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static39.method685(arg0[0]).method662((int) arg2);
		} else {
			return null;
		}
	}
}
