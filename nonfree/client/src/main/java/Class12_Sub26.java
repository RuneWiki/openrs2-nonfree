import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class12_Sub26 extends Class12 {

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
	public int anInt4784;

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
	public int anInt4785;

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
	public int anInt4786;

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
	public int anInt4787;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
	public int anInt4790;

	@OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
	public int anInt4791;

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
	public int anInt4793;

	@OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
	public int anInt4794;

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
	public int anInt4796;

	@OriginalMember(owner = "client!jba", name = "C", descriptor = "I")
	public int anInt4798;

	@OriginalMember(owner = "client!jba", name = "D", descriptor = "I")
	public int anInt4799;

	@OriginalMember(owner = "client!jba", name = "H", descriptor = "I")
	public int anInt4801;

	@OriginalMember(owner = "client!jba", name = "K", descriptor = "I")
	public int anInt4802;

	@OriginalMember(owner = "client!jba", name = "L", descriptor = "I")
	public int anInt4803;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!qa;BI)Lclient!r;")
	public Class26 method4059(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static58.anIntArray137[this.anInt4785];
		@Pc(14) Class26 local14 = null;
		if (local8 == 0) {
			@Pc(27) Class30_Sub2 local27 = Static324.method5105(this.anInt4790, this.anInt4795, this.anInt4803);
			if (local27 instanceof Class30_Sub2_Sub2) {
				@Pc(33) Class30_Sub2_Sub2 local33 = (Class30_Sub2_Sub2) local27;
				if (local33.aClass30_Sub2_3 != null) {
					local14 = ((Interface19) local33.aClass30_Sub2_3).method7917(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(58) Class30_Sub4 local58 = Static533.method7882(this.anInt4790, this.anInt4795, this.anInt4803);
			if (local58 instanceof Class30_Sub4_Sub1) {
				@Pc(64) Class30_Sub4_Sub1 local64 = (Class30_Sub4_Sub1) local58;
				if (local64.aClass30_Sub4_3 != null) {
					local14 = ((Interface19) local64.aClass30_Sub4_3).method7917(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(97) Class30_Sub1 local97 = Static531.method7866(this.anInt4790, this.anInt4795, this.anInt4803, wf.class);
			if (local97 instanceof Class30_Sub1_Sub2) {
				@Pc(103) Class30_Sub1_Sub2 local103 = (Class30_Sub1_Sub2) local97;
				if (local103.aClass30_Sub1_1 != null) {
					local14 = ((Interface19) local103.aClass30_Sub1_1).method7917(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(126) Class30_Sub3 local126 = Static160.method3298(this.anInt4790, this.anInt4795, this.anInt4803);
			if (local126 instanceof Class30_Sub3_Sub2) {
				@Pc(132) Class30_Sub3_Sub2 local132 = (Class30_Sub3_Sub2) local126;
				if (local132.aClass30_Sub3_2 != null) {
					local14 = ((Interface19) local132.aClass30_Sub3_2).method7917(arg0, arg1);
				}
			}
		}
		return local14 == null ? null : local14.method7992((byte) 0, arg1, true);
	}
}
