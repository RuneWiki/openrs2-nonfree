import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "[F")
	public static final float[] aFloatArray86 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
	public static int method9091() {
		return 16;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!cea;I)Lclient!vr;")
	public static Class362 method9092(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method8326();
		@Pc(14) Class309 local14 = Static409.method6629()[arg0.method8383()];
		@Pc(21) Class86 local21 = Static277.method5088()[arg0.method8383()];
		@Pc(32) int local32 = arg0.method8368();
		@Pc(36) int local36 = arg0.method8368();
		return new Class362(local7, local14, local21, local32, local36);
	}
}
