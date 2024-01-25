import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public int anInt152;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
	public int anInt158;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
	public int anInt159;

	@OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
	public int anInt164;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	public Class116 method131(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static33.anIntArray43[this.anInt147];
		if (local14 == 0) {
			@Pc(118) Class8_Sub2 local118 = Static14.method170(this.anInt155, this.anInt149, this.anInt150);
			if (local118 instanceof Class8_Sub2_Sub3) {
				@Pc(124) Class8_Sub2_Sub3 local124 = (Class8_Sub2_Sub3) local118;
				if (local124.aClass8_Sub2_3 != null) {
					return ((Interface4) local124.aClass8_Sub2_3).method5604(arg1, arg0);
				}
			}
		} else if (local14 == 1) {
			@Pc(93) Class8_Sub5 local93 = Static169.method2325(this.anInt155, this.anInt149, this.anInt150);
			if (local93 instanceof Class8_Sub5_Sub1) {
				@Pc(99) Class8_Sub5_Sub1 local99 = (Class8_Sub5_Sub1) local93;
				if (local99.aClass8_Sub5_3 != null) {
					return ((Interface4) local99.aClass8_Sub5_3).method5604(arg1, arg0);
				}
			}
		} else if (local14 == 2) {
			@Pc(40) Class8_Sub3 local40 = Static64.method926(this.anInt155, this.anInt149, this.anInt150, fw.class);
			if (local40 instanceof Class8_Sub3_Sub3) {
				@Pc(46) Class8_Sub3_Sub3 local46 = (Class8_Sub3_Sub3) local40;
				if (local46.aClass8_Sub3_1 != null) {
					return ((Interface4) local46.aClass8_Sub3_1).method5604(arg1, arg0);
				}
			}
		} else if (local14 == 3) {
			@Pc(68) Class8_Sub4 local68 = Static190.method2771(this.anInt155, this.anInt149, this.anInt150);
			if (local68 instanceof Class8_Sub4_Sub2) {
				@Pc(74) Class8_Sub4_Sub2 local74 = (Class8_Sub4_Sub2) local68;
				if (local74.aClass8_Sub4_2 != null) {
					return ((Interface4) local74.aClass8_Sub4_2).method5604(arg1, arg0);
				}
			}
		}
		return null;
	}
}
