import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[[Lclient!ba;")
	public static Class11[][] aClass11ArrayArray1;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] aClass1_Sub3_Sub1_Sub5Array9;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
	public static final int anInt4212 = 50;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
	public static final int[] anIntArray336 = new int[anInt4212];

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1976 = Static187.method3089("b12_full");

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
	public static final int[] anIntArray337 = new int[anInt4212];

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
	public static final int[] anIntArray338 = new int[anInt4212];

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
	public static final int[] anIntArray339 = new int[anInt4212];

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1977 = Static187.method3089("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array30 = new Class92[anInt4212];

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
	public static final int[] anIntArray340 = new int[anInt4212];

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	public static final int[] anIntArray341 = new int[anInt4212];

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
	public static final int[] anIntArray342 = new int[anInt4212];

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1978 = Static187.method3089("::gc");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[Lclient!ba;B)V")
	public static void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) Class11[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class11 local20 = arg1[local14];
			if (local20 != null) {
				if (local20.anInt326 == 0) {
					if (local20.aClass11Array1 != null) {
						method3187(arg0, local20.aClass11Array1);
					}
					@Pc(41) Class1_Sub4 local41 = (Class1_Sub4) Static183.aClass97_21.method3375((long) local20.anInt275);
					if (local41 != null) {
						Static7.method125(local41.anInt490, arg0);
					}
				}
				@Pc(57) Class1_Sub24 local57;
				if (arg0 == 0 && local20.anObjectArray13 != null) {
					local57 = new Class1_Sub24();
					local57.anObjectArray28 = local20.anObjectArray13;
					local57.aClass11_18 = local20;
					Static45.method810(local57);
				}
				if (arg0 == 1 && local20.anObjectArray4 != null) {
					if (local20.anInt272 >= 0) {
						@Pc(86) Class11 local86 = Static9.method2342(local20.anInt275);
						if (local86 == null || local86.aClass11Array1 == null || local20.anInt272 >= local86.aClass11Array1.length || local20 != local86.aClass11Array1[local20.anInt272]) {
							continue;
						}
					}
					local57 = new Class1_Sub24();
					local57.aClass11_18 = local20;
					local57.anObjectArray28 = local20.anObjectArray4;
					Static45.method810(local57);
				}
			}
		}
	}
}
