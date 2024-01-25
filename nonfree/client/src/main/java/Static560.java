import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
	public static int anInt10211;

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "[Lclient!pi;")
	public static Class262[] aClass262Array4;

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "Lclient!tw;")
	public static final Class322 aClass322_5 = new Class322();

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "[S")
	public static final short[] aShortArray137 = new short[] { 9, 58, 47, 20, 5, 15, 8, 3 };

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V")
	public static void method7937() {
		Static227.aClass221_10.method5078();
		Static457.aClass120_9.method2665();
		Static238.aClass120_5.method2665();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lclient!ko;")
	public static Class182 method7938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static571.aClass182ArrayArrayArray3[0][arg1][arg2] != null && Static571.aClass182ArrayArrayArray3[0][arg1][arg2].aClass182_1 != null;
			if (local28 && arg0 >= Static218.anInt4559 - 1) {
				return null;
			}
			Static20.method828(arg0, arg1, arg2);
		}
		return Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!ek;)Lclient!jf;")
	public static Class1_Sub1 method7940(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(15) Class1 local15 = Static577.method8119(arg0);
		@Pc(19) int local19 = arg0.method7000();
		return new Class1_Sub1(local15.anInt5012, local15.aClass347_6, local15.aClass214_8, local15.anInt5016, local15.anInt5010, local19);
	}
}
