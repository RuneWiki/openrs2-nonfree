import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "I")
	public int anInt151;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "I")
	public int anInt152;

	@OriginalMember(owner = "client!af", name = "y", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!af", name = "A", descriptor = "I")
	public int anInt155;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!af", name = "C", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!af", name = "D", descriptor = "I")
	public int anInt158;

	@OriginalMember(owner = "client!af", name = "F", descriptor = "I")
	public int anInt159;

	@OriginalMember(owner = "client!af", name = "H", descriptor = "I")
	public int anInt160;

	@OriginalMember(owner = "client!af", name = "I", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!af", name = "J", descriptor = "I")
	public int anInt162;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLclient!km;)Lclient!ab;")
	public Class3 method187(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(13) int local13 = Static223.anIntArray504[this.anInt151];
		if (local13 == 0) {
			@Pc(23) Class12_Sub2 local23 = Static252.method4000(this.anInt157, this.anInt149, this.anInt156);
			if (local23 instanceof Class12_Sub2_Sub3) {
				@Pc(29) Class12_Sub2_Sub3 local29 = (Class12_Sub2_Sub3) local23;
				if (local29.aClass12_Sub2_1 != null) {
					return ((Interface11) local29.aClass12_Sub2_1).method5023(arg1, arg0);
				}
			}
		} else if (local13 == 1) {
			@Pc(119) Class12_Sub4 local119 = Static221.method3733(this.anInt157, this.anInt149, this.anInt156);
			if (local119 instanceof Class12_Sub4_Sub3) {
				@Pc(125) Class12_Sub4_Sub3 local125 = (Class12_Sub4_Sub3) local119;
				if (local125.aClass12_Sub4_1 != null) {
					return ((Interface11) local125.aClass12_Sub4_1).method5023(arg1, arg0);
				}
			}
		} else if (local13 == 2) {
			@Pc(66) Class12_Sub1 local66 = Static86.method4712(this.anInt157, this.anInt149, this.anInt156, wk.class);
			if (local66 instanceof Class12_Sub1_Sub3) {
				@Pc(72) Class12_Sub1_Sub3 local72 = (Class12_Sub1_Sub3) local66;
				if (local72.aClass12_Sub1_1 != null) {
					return ((Interface11) local72.aClass12_Sub1_1).method5023(arg1, arg0);
				}
			}
		} else if (local13 == 3) {
			@Pc(94) Class12_Sub5 local94 = Static240.method3889(this.anInt157, this.anInt149, this.anInt156);
			if (local94 instanceof Class12_Sub5_Sub3) {
				@Pc(100) Class12_Sub5_Sub3 local100 = (Class12_Sub5_Sub3) local94;
				if (local100.aClass12_Sub5_1 != null) {
					return ((Interface11) local100.aClass12_Sub5_1).method5023(arg1, arg0);
				}
			}
		}
		return null;
	}
}
