import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "[Lclient!ch;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_2 = new Class152(8, 1);

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Lclient!tv;")
	public static Class2_Sub6_Sub21 method2816() {
		return Static90.aClass2_Sub6_Sub21_2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[S)[S")
	public static short[] method2818(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static728.method271(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
