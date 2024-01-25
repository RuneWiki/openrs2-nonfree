import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
	public static final int[] anIntArray98 = new int[5];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!uu;I)V")
	public static void method1822(@OriginalArg(0) Class250 arg0) {
		Static298.anInt5158 = 0;
		Static188.anInt3444 = 0;
		Static77.aClass194_2 = new Class194();
		Static380.aClass23_Sub1_Sub2_Sub1Array2 = new Class23_Sub1_Sub2_Sub1[1024];
		Static265.method3695(arg0);
		Static139.method2136(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Lclient!jw;")
	public static Class1_Sub4 method1824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static389.aClass227ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass1_Sub4_2 == null ? null : local7.aClass1_Sub4_2;
	}
}
