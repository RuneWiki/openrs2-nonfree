import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ea", name = "kb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ea", name = "lb", descriptor = "I")
	public static int anInt906;

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_454 = Static193.method3027("Close");

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "Lclient!oc;")
	public static Class70 aClass70_455 = aClass70_454;

	@OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_456 = Static193.method3027("<col=ff0000>");

	@OriginalMember(owner = "client!ea", name = "jb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_457 = Static193.method3027("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII)V")
	public static void method707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static130.method1827(Static52.anInt1117, arg2, Static26.anInt554);
		@Pc(17) int local17 = Static130.method1827(Static52.anInt1117, arg3, Static26.anInt554);
		@Pc(23) int local23 = Static130.method1827(Static200.anInt4074, arg5, Static119.anInt2428);
		@Pc(29) int local29 = Static130.method1827(Static200.anInt4074, arg0, Static119.anInt2428);
		@Pc(37) int local37 = Static130.method1827(Static52.anInt1117, arg4 + arg2, Static26.anInt554);
		@Pc(45) int local45 = Static130.method1827(Static52.anInt1117, arg3 - arg4, Static26.anInt554);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static16.method302(arg1, local23, local29, Static157.anIntArrayArray24[local47]);
		}
		for (@Pc(63) int local63 = local17; local63 > local45; local63--) {
			Static16.method302(arg1, local23, local29, Static157.anIntArrayArray24[local63]);
		}
		@Pc(85) int local85 = Static130.method1827(Static200.anInt4074, arg5 + arg4, Static119.anInt2428);
		@Pc(94) int local94 = Static130.method1827(Static200.anInt4074, arg0 - arg4, Static119.anInt2428);
		for (@Pc(96) int local96 = local37; local96 <= local45; local96++) {
			@Pc(104) int[] local104 = Static157.anIntArrayArray24[local96];
			Static16.method302(arg1, local23, local85, local104);
			Static16.method302(arg1, local94, local29, local104);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ke;Lclient!oc;Lclient!oc;B)Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 method708(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class70 arg2) {
		@Pc(13) int local13 = arg0.method1560(arg1);
		@Pc(19) int local19 = arg0.method1554(arg2, local13);
		return Static188.method2952(arg0, local13, local19);
	}
}
