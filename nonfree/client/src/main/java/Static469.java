import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "F")
	public static float aFloat126 = 0.25F;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!via;")
	public static final Class386 aClass386_9 = new Class386("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "[F")
	public static final float[] aFloatArray55 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)[I")
	public static int[] method6731() {
		return new int[] { Static609.anInt9447, Static212.anInt3397, Static59.anInt1028 };
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BII)V")
	public static void method6733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(17, (long) arg1);
		local14.method6239();
		local14.anInt6936 = arg0;
	}
}
