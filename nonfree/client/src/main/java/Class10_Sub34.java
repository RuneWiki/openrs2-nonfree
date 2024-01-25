import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class10_Sub34 extends Class10 {

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public int anInt5316;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public int anInt5317;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public int anInt5318;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public int anInt5319;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public int anInt5320;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public int anInt5321;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
	public int anInt5322;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	public int anInt5324;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	public int anInt5325;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public int anInt5326;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
	public int anInt5327;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public int anInt5328;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	public int anInt5329;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
	public int anInt5330;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
	public int anInt5331;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILclient!za;)Lclient!e;")
	public Class63 method4260(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(13) int local13 = Static164.anIntArray417[this.anInt5328];
		if (local13 == 0) {
			@Pc(126) Class24_Sub5 local126 = Static96.method1755(this.anInt5317, this.anInt5320, this.anInt5327);
			if (local126 instanceof Class24_Sub5_Sub1) {
				@Pc(132) Class24_Sub5_Sub1 local132 = (Class24_Sub5_Sub1) local126;
				if (local132.aClass24_Sub5_3 != null) {
					return ((Interface10) local132.aClass24_Sub5_3).method5703(arg1, arg0);
				}
			}
		} else if (local13 == 1) {
			@Pc(31) Class24_Sub1 local31 = Static137.method2391(this.anInt5317, this.anInt5320, this.anInt5327);
			if (local31 instanceof Class24_Sub1_Sub2) {
				@Pc(37) Class24_Sub1_Sub2 local37 = (Class24_Sub1_Sub2) local31;
				if (local37.aClass24_Sub1_3 != null) {
					return ((Interface10) local37.aClass24_Sub1_3).method5703(arg1, arg0);
				}
			}
		} else if (local13 == 2) {
			@Pc(101) Class24_Sub3 local101 = Static106.method1867(this.anInt5317, this.anInt5320, this.anInt5327, rj.class);
			if (local101 instanceof Class24_Sub3_Sub3) {
				@Pc(107) Class24_Sub3_Sub3 local107 = (Class24_Sub3_Sub3) local101;
				if (local107.aClass24_Sub3_2 != null) {
					return ((Interface10) local107.aClass24_Sub3_2).method5703(arg1, arg0);
				}
			}
		} else if (local13 == 3) {
			@Pc(66) Class24_Sub4 local66 = Static447.method5138(this.anInt5317, this.anInt5320, this.anInt5327);
			if (local66 instanceof Class24_Sub4_Sub3) {
				@Pc(72) Class24_Sub4_Sub3 local72 = (Class24_Sub4_Sub3) local66;
				if (local72.aClass24_Sub4_2 != null) {
					return ((Interface10) local72.aClass24_Sub4_2).method5703(arg1, arg0);
				}
			}
		}
		return null;
	}
}
