import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_34 = new Class242(68, 1);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)V")
	public static void method1476(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub3_Sub1 local14 = Static427.method5426(arg0, 8);
		local14.method385();
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(BI)V")
	public static void method1483(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg0, 10);
		local8.method385();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIB)V")
	public static void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static427.method5426(arg1, 13);
		local8.method384();
		local8.anInt381 = arg0;
	}
}
