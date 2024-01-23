import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class113 implements Interface5 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBJ[I)Ljava/lang/String;")
	@Override
	public String method2863(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == 0) {
			@Pc(19) Class3_Sub4_Sub4 local19 = Static192.method3195(arg2[0]);
			return local19.method777((int) arg1);
		} else if (arg0 == 1 || arg0 == 10) {
			@Pc(39) Class21 local39 = Static133.method2309((int) arg1);
			return local39.aString18;
		} else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
			return Static192.method3195(arg2[0]).method777((int) arg1);
		} else {
			return null;
		}
	}
}
