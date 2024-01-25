import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class104 implements Interface3 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	@Override
	public String method2922(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 == 0) {
			@Pc(11) Class1_Sub1_Sub19 local11 = Static307.method5167(arg2[0]);
			return local11.method5403((int) arg0);
		} else if (arg1 == 1 || arg1 == 10) {
			@Pc(32) Class61 local32 = Static241.method4285((int) arg0);
			return local32.aString74;
		} else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
			return Static307.method5167(arg2[0]).method5403((int) arg0);
		} else {
			return null;
		}
	}
}
