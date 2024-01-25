import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!tv;")
	public static final Class6_Sub48 aClass6_Sub48_1 = new Class6_Sub48(0, 0);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!pj;BLclient!e;)V")
	public static void method101(@OriginalArg(0) Class248 arg0, @OriginalArg(2) Interface2 arg1) {
		Static353.aClass248_59 = arg0;
		Static386.anInterface2_12 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)[Lclient!du;")
	public static Class79[] method102() {
		return new Class79[] { Static97.aClass79_2, Static122.aClass79_3, Static17.aClass79_1 };
	}
}
