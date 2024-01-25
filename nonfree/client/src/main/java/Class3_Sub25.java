import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
	public int anInt4606;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
	public int anInt4607;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
	public int anInt4608;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
	public int anInt4609;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
	public int anInt4610;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
	public int anInt4611;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	public int anInt4612;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
	public int anInt4613;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	public int anInt4614;

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
	public int anInt4615;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
	public int anInt4617;

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
	public int anInt4618;

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
	public int anInt4619;

	@OriginalMember(owner = "client!ip", name = "E", descriptor = "I")
	public int anInt4621;

	@OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
	public int anInt4623;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZILclient!oa;)Lclient!ba;")
	public Class21 method3884(@OriginalArg(1) int arg0, @OriginalArg(2) Class15 arg1) {
		@Pc(8) int local8 = Static85.anIntArray92[this.anInt4612];
		@Pc(10) Class21 local10 = null;
		if (local8 == 0) {
			@Pc(23) Class2_Sub4 local23 = Static496.method7511(this.anInt4614, this.anInt4611, this.anInt4621);
			if (local23 instanceof Class2_Sub4_Sub3) {
				@Pc(29) Class2_Sub4_Sub3 local29 = (Class2_Sub4_Sub3) local23;
				if (local29.aClass2_Sub4_3 != null) {
					local10 = ((Interface22) local29.aClass2_Sub4_3).method8400(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(52) Class2_Sub3 local52 = Static563.method8123(this.anInt4614, this.anInt4611, this.anInt4621);
			if (local52 instanceof Class2_Sub3_Sub1) {
				@Pc(58) Class2_Sub3_Sub1 local58 = (Class2_Sub3_Sub1) local52;
				if (local58.aClass2_Sub3_3 != null) {
					local10 = ((Interface22) local58.aClass2_Sub3_3).method8400(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(120) Class2_Sub2 local120 = Static200.method3364(this.anInt4614, this.anInt4611, this.anInt4621, ut.class);
			if (local120 instanceof Class2_Sub2_Sub6) {
				@Pc(126) Class2_Sub2_Sub6 local126 = (Class2_Sub2_Sub6) local120;
				if (local126.aClass2_Sub2_2 != null) {
					local10 = ((Interface22) local126.aClass2_Sub2_2).method8400(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(86) Class2_Sub1 local86 = Static86.method1922(this.anInt4614, this.anInt4611, this.anInt4621);
			if (local86 instanceof Class2_Sub1_Sub3) {
				@Pc(92) Class2_Sub1_Sub3 local92 = (Class2_Sub1_Sub3) local86;
				if (local92.aClass2_Sub1_2 != null) {
					local10 = ((Interface22) local92.aClass2_Sub1_2).method8400(arg1, arg0);
				}
			}
		}
		return local10 == null ? null : local10.method7131((byte) 0, arg0, true);
	}
}
