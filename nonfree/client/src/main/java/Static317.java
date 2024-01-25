import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kka", name = "i", descriptor = "Lclient!lga;")
	public static Class223 aClass223_71;

	@OriginalMember(owner = "client!kka", name = "g", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!jc;I)Lclient!tc;")
	public static Class134_Sub4 method5002(@OriginalArg(0) Class6_Sub15 arg0) {
		return new Class134_Sub4(arg0.method2989(), arg0.method2989(), arg0.method2989(), arg0.method2989(), arg0.method2987(), arg0.method3030());
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lclient!jc;B)Lclient!sm;")
	public static Class58_Sub2_Sub1 method5008(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(13) Class58_Sub2 local13 = Static497.method7324(arg0);
		@Pc(17) int local17 = arg0.method2989();
		return new Class58_Sub2_Sub1(local13.aClass318_20, local13.aClass238_13, local13.anInt10051, local13.anInt10055, local13.anInt10052, local13.anInt10050, local13.anInt10053, local13.anInt10054, local13.anInt10056, local13.anInt9131, local13.anInt9129, local13.anInt9130, local13.anInt9126, local13.anInt9125, local13.anInt9124, local17);
	}
}
