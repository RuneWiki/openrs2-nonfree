import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	public int anInt5419;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
	public int anInt5420;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public int anInt5421;

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
	public int anInt5423;

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	public int anInt5424;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	public int anInt5426;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
	public int anInt5427;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
	public int anInt5428;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
	public int anInt5430;

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
	public int anInt5431;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
	public int anInt5432;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
	public int anInt5433;

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
	public int anInt5434;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
	public int anInt5435;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	public Class17 method4186(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		@Pc(8) int local8 = Static461.anIntArray727[this.anInt5434];
		if (local8 == 0) {
			@Pc(116) Class30_Sub3 local116 = Static232.method3536(this.anInt5424, this.anInt5419, this.anInt5433);
			if (local116 instanceof Class30_Sub3_Sub1) {
				@Pc(122) Class30_Sub3_Sub1 local122 = (Class30_Sub3_Sub1) local116;
				if (local122.aClass30_Sub3_1 != null) {
					return ((Interface5) local122.aClass30_Sub3_1).method5733(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(23) Class30_Sub2 local23 = Static392.method5433(this.anInt5424, this.anInt5419, this.anInt5433);
			if (local23 instanceof Class30_Sub2_Sub1) {
				@Pc(29) Class30_Sub2_Sub1 local29 = (Class30_Sub2_Sub1) local23;
				if (local29.aClass30_Sub2_1 != null) {
					return ((Interface5) local29.aClass30_Sub2_1).method5733(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(91) Class30_Sub1 local91 = Static461.method5974(this.anInt5424, this.anInt5419, this.anInt5433, jg.class);
			if (local91 instanceof Class30_Sub1_Sub5) {
				@Pc(97) Class30_Sub1_Sub5 local97 = (Class30_Sub1_Sub5) local91;
				if (local97.aClass30_Sub1_2 != null) {
					return ((Interface5) local97.aClass30_Sub1_2).method5733(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(56) Class30_Sub4 local56 = Static454.method6163(this.anInt5424, this.anInt5419, this.anInt5433);
			if (local56 instanceof Class30_Sub4_Sub2) {
				@Pc(62) Class30_Sub4_Sub2 local62 = (Class30_Sub4_Sub2) local56;
				if (local62.aClass30_Sub4_1 != null) {
					return ((Interface5) local62.aClass30_Sub4_1).method5733(arg0, arg1);
				}
			}
		}
		return null;
	}
}
