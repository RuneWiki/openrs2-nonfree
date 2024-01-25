import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "Lclient!sn;")
	public static Class81 aClass81_4;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(JII)Lclient!dka;")
	public static Class6_Sub2_Sub4 method8315(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Class6_Sub2_Sub4 local22 = (Class6_Sub2_Sub4) Static619.aClass74_69.method1401((long) arg1 << 56 | arg0);
		if (local22 == null) {
			local22 = new Class6_Sub2_Sub4(arg1, arg0);
			Static619.aClass74_69.method1399(local22, local22.aLong346);
		}
		return local22;
	}
}
