import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt790;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public int anInt796;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	public int anInt798;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLclient!qa;)Lclient!c;")
	public Class37 method728(@OriginalArg(0) int arg0, @OriginalArg(2) Class109 arg1) {
		@Pc(16) int local16 = Static127.anIntArray286[this.anInt795];
		if (local16 == 0) {
			@Pc(26) Class26_Sub1 local26 = Static259.method5039(this.anInt799, this.anInt796, this.anInt802);
			if (local26 instanceof Class26_Sub1_Sub3) {
				@Pc(32) Class26_Sub1_Sub3 local32 = (Class26_Sub1_Sub3) local26;
				if (local32.aClass26_Sub1_1 != null) {
					return ((Interface6) local32.aClass26_Sub1_1).method4669(arg0, arg1);
				}
			}
		} else if (local16 == 1) {
			@Pc(54) Class26_Sub3 local54 = Static81.method1400(this.anInt799, this.anInt796, this.anInt802);
			if (local54 instanceof Class26_Sub3_Sub3) {
				@Pc(60) Class26_Sub3_Sub3 local60 = (Class26_Sub3_Sub3) local54;
				if (local60.aClass26_Sub3_1 != null) {
					return ((Interface6) local60.aClass26_Sub3_1).method4669(arg0, arg1);
				}
			}
		} else if (local16 == 2) {
			@Pc(90) Class26_Sub2 local90 = Static278.method5819(this.anInt799, this.anInt796, this.anInt802, jv.class);
			if (local90 instanceof Class26_Sub2_Sub6) {
				@Pc(96) Class26_Sub2_Sub6 local96 = (Class26_Sub2_Sub6) local90;
				if (local96.aClass26_Sub2_2 != null) {
					return ((Interface6) local96.aClass26_Sub2_2).method4669(arg0, arg1);
				}
			}
		} else if (local16 == 3) {
			@Pc(118) Class26_Sub4 local118 = Static366.method4342(this.anInt799, this.anInt796, this.anInt802);
			if (local118 instanceof Class26_Sub4_Sub2) {
				@Pc(124) Class26_Sub4_Sub2 local124 = (Class26_Sub4_Sub2) local118;
				if (local124.aClass26_Sub4_1 != null) {
					return ((Interface6) local124.aClass26_Sub4_1).method4669(arg0, arg1);
				}
			}
		}
		return null;
	}
}
