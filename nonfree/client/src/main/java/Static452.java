import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "Lclient!rda;")
	public static Class300 aClass300_33 = new Class300(8);

	@OriginalMember(owner = "client!pja", name = "f", descriptor = "[F")
	public static final float[] aFloatArray76 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)V")
	public static void method6513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(7, (long) arg0);
		local9.method7286();
		local9.anInt8546 = arg1;
	}
}
