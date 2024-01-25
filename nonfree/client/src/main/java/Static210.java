import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_51 = new Class200(37, 7);

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_61 = new Class130(74, 2);

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[2];

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	public static void method3566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class16 local16 = Static401.aClass16ArrayArray1[arg1][arg0];
		if (local16 != null) {
			Static87.anInt2112 = local16.anInt818;
			Static46.anInt1329 = local16.anInt820;
			Static427.anInt7692 = local16.anInt819;
		}
		Static477.method7146();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZBI)Lclient!jt;")
	public static Class3_Sub32 method3568(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub32) Static334.aClass280_27.method7107(local17);
	}
}
