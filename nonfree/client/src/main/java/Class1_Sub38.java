import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
	public int anInt6263;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	public int anInt6264;

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
	public int anInt6265;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
	public int anInt6266;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
	public int anInt6267;

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
	public int anInt6268;

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
	public int anInt6269;

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
	public int anInt6270;

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
	public int anInt6271;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
	public int anInt6272;

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
	public int anInt6273;

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
	public int anInt6274;

	@OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
	public int anInt6275;

	@OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
	public int anInt6277;

	@OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
	public int anInt6279;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	public Class33 method4823(@OriginalArg(1) int arg0, @OriginalArg(2) Class128 arg1) {
		@Pc(8) int local8 = Static8.anIntArray488[this.anInt6277];
		if (local8 == 0) {
			@Pc(23) Class20_Sub1 local23 = Static336.method4293(this.anInt6268, this.anInt6271, this.anInt6265);
			if (local23 instanceof Class20_Sub1_Sub2) {
				@Pc(29) Class20_Sub1_Sub2 local29 = (Class20_Sub1_Sub2) local23;
				if (local29.aClass20_Sub1_1 != null) {
					return ((Interface9) local29.aClass20_Sub1_1).method5127(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(121) Class20_Sub4 local121 = Static246.method3212(this.anInt6268, this.anInt6271, this.anInt6265);
			if (local121 instanceof Class20_Sub4_Sub2) {
				@Pc(127) Class20_Sub4_Sub2 local127 = (Class20_Sub4_Sub2) local121;
				if (local127.aClass20_Sub4_3 != null) {
					return ((Interface9) local127.aClass20_Sub4_3).method5127(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(96) Class20_Sub3 local96 = Static422.method5254(this.anInt6268, this.anInt6271, this.anInt6265, mq.class);
			if (local96 instanceof Class20_Sub3_Sub5) {
				@Pc(102) Class20_Sub3_Sub5 local102 = (Class20_Sub3_Sub5) local96;
				if (local102.aClass20_Sub3_2 != null) {
					return ((Interface9) local102.aClass20_Sub3_2).method5127(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(61) Class20_Sub2 local61 = Static261.method3366(this.anInt6268, this.anInt6271, this.anInt6265);
			if (local61 instanceof Class20_Sub2_Sub3) {
				@Pc(67) Class20_Sub2_Sub3 local67 = (Class20_Sub2_Sub3) local61;
				if (local67.aClass20_Sub2_2 != null) {
					return ((Interface9) local67.aClass20_Sub2_2).method5127(arg0, arg1);
				}
			}
		}
		return null;
	}
}
