import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
	public int anInt5050;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
	public int anInt5051;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
	public int anInt5052;

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
	public int anInt5053;

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
	public int anInt5055;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	public int anInt5056;

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
	public int anInt5058;

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
	public int anInt5059;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
	public int anInt5060;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
	public int anInt5061;

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
	public int anInt5062;

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
	public int anInt5063;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
	public int anInt5064;

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
	public int anInt5065;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
	public int anInt5066;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!za;II)Lclient!e;")
	public Class63 method3987(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static191.anIntArray275[this.anInt5062];
		if (local14 == 0) {
			@Pc(119) Class11_Sub1 local119 = Static45.method700(this.anInt5064, this.anInt5066, this.anInt5053);
			if (local119 instanceof Class11_Sub1_Sub1) {
				@Pc(125) Class11_Sub1_Sub1 local125 = (Class11_Sub1_Sub1) local119;
				if (local125.aClass11_Sub1_1 != null) {
					return ((Interface6) local125.aClass11_Sub1_1).method5717(arg0, arg1);
				}
			}
		} else if (local14 == 1) {
			@Pc(94) Class11_Sub2 local94 = Static130.method2044(this.anInt5064, this.anInt5066, this.anInt5053);
			if (local94 instanceof Class11_Sub2_Sub3) {
				@Pc(100) Class11_Sub2_Sub3 local100 = (Class11_Sub2_Sub3) local94;
				if (local100.aClass11_Sub2_3 != null) {
					return ((Interface6) local100.aClass11_Sub2_3).method5717(arg0, arg1);
				}
			}
		} else if (local14 == 2) {
			@Pc(41) Class11_Sub5 local41 = Static345.method4857(this.anInt5064, this.anInt5066, this.anInt5053, jq.class);
			if (local41 instanceof Class11_Sub5_Sub5) {
				@Pc(47) Class11_Sub5_Sub5 local47 = (Class11_Sub5_Sub5) local41;
				if (local47.aClass11_Sub5_2 != null) {
					return ((Interface6) local47.aClass11_Sub5_2).method5717(arg0, arg1);
				}
			}
		} else if (local14 == 3) {
			@Pc(69) Class11_Sub3 local69 = Static115.method1883(this.anInt5064, this.anInt5066, this.anInt5053);
			if (local69 instanceof Class11_Sub3_Sub3) {
				@Pc(75) Class11_Sub3_Sub3 local75 = (Class11_Sub3_Sub3) local69;
				if (local75.aClass11_Sub3_2 != null) {
					return ((Interface6) local75.aClass11_Sub3_2).method5717(arg0, arg1);
				}
			}
		}
		return null;
	}
}
