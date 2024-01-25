import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public int anInt2323;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public int anInt2324;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	public int anInt2328;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	public int anInt2329;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
	public int anInt2331;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	public int anInt2332;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	public int anInt2333;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
	public int anInt2334;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
	public int anInt2336;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	public int anInt2337;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
	public int anInt2340;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLclient!qa;)Lclient!c;")
	public Class9 method1800(@OriginalArg(0) int arg0, @OriginalArg(2) Class172 arg1) {
		@Pc(14) int local14 = Static196.anIntArray249[this.anInt2331];
		if (local14 == 0) {
			@Pc(120) Class7_Sub4 local120 = Static321.method4376(this.anInt2328, this.anInt2322, this.anInt2332);
			if (local120 instanceof Class7_Sub4_Sub3) {
				@Pc(126) Class7_Sub4_Sub3 local126 = (Class7_Sub4_Sub3) local120;
				if (local126.aClass7_Sub4_3 != null) {
					return ((Interface8) local126.aClass7_Sub4_3).method4805(arg1, arg0);
				}
			}
		} else if (local14 == 1) {
			@Pc(29) Class7_Sub3 local29 = Static113.method4396(this.anInt2328, this.anInt2322, this.anInt2332);
			if (local29 instanceof Class7_Sub3_Sub2) {
				@Pc(35) Class7_Sub3_Sub2 local35 = (Class7_Sub3_Sub2) local29;
				if (local35.aClass7_Sub3_1 != null) {
					return ((Interface8) local35.aClass7_Sub3_1).method4805(arg1, arg0);
				}
			}
		} else if (local14 == 2) {
			@Pc(65) Class7_Sub2 local65 = Static314.method4348(this.anInt2328, this.anInt2322, this.anInt2332, pa.class);
			if (local65 instanceof Class7_Sub2_Sub1) {
				@Pc(71) Class7_Sub2_Sub1 local71 = (Class7_Sub2_Sub1) local65;
				if (local71.aClass7_Sub2_1 != null) {
					return ((Interface8) local71.aClass7_Sub2_1).method4805(arg1, arg0);
				}
			}
		} else if (local14 == 3) {
			@Pc(95) Class7_Sub1 local95 = Static166.method2721(this.anInt2328, this.anInt2322, this.anInt2332);
			if (local95 instanceof Class7_Sub1_Sub2) {
				@Pc(101) Class7_Sub1_Sub2 local101 = (Class7_Sub1_Sub2) local95;
				if (local101.aClass7_Sub1_2 != null) {
					return ((Interface8) local101.aClass7_Sub1_2).method4805(arg1, arg0);
				}
			}
		}
		return null;
	}
}
