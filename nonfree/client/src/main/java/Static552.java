import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public static int anInt9133;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "Lclient!li;")
	public static Class5_Sub4_Sub14 aClass5_Sub4_Sub14_3;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
	public static int anInt9135 = 0;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_32 = new Class148(0, 4);

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[16];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ee;I)Lclient!kca;")
	public static Class183 method7798(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(7) String local7 = arg0.method8617();
		@Pc(14) Class204 local14 = Static194.method3068()[arg0.method8645()];
		@Pc(21) Class288 local21 = Static609.method8474()[arg0.method8645()];
		@Pc(30) int local30 = arg0.method8595();
		@Pc(34) int local34 = arg0.method8595();
		@Pc(38) int local38 = arg0.method8645();
		@Pc(42) int local42 = arg0.method8645();
		@Pc(46) int local46 = arg0.method8645();
		@Pc(50) int local50 = arg0.method8631();
		@Pc(56) int local56 = arg0.method8631();
		@Pc(60) int local60 = arg0.method8623();
		@Pc(64) int local64 = arg0.method8623();
		@Pc(68) int local68 = arg0.method8623();
		return new Class183(local7, local14, local21, local30, local34, local38, local42, local46, local50, local56, local60, local64, local68);
	}
}
