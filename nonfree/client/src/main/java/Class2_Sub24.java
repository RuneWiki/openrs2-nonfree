import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	public int anInt3883;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	public int anInt3884;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	public int anInt3885;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	public int anInt3886;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public int anInt3887;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	public int anInt3888;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public int anInt3889;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	public int anInt3890;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public int anInt3891;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public int anInt3892;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	public int anInt3894;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	public int anInt3895;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	public int anInt3896;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	public int anInt3897;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	public int anInt3898;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	public Class32 method3138(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static104.anIntArray128[this.anInt3883];
		if (local8 == 0) {
			@Pc(28) Class4_Sub4 local28 = Static334.method4742(this.anInt3889, this.anInt3888, this.anInt3885);
			if (local28 instanceof Class4_Sub4_Sub1) {
				@Pc(34) Class4_Sub4_Sub1 local34 = (Class4_Sub4_Sub1) local28;
				if (local34.aClass4_Sub4_3 != null) {
					return ((Interface9) local34.aClass4_Sub4_3).method5906(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(56) Class4_Sub1 local56 = Static242.method3661(this.anInt3889, this.anInt3888, this.anInt3885);
			if (local56 instanceof Class4_Sub1_Sub1) {
				@Pc(62) Class4_Sub1_Sub1 local62 = (Class4_Sub1_Sub1) local56;
				if (local62.aClass4_Sub1_1 != null) {
					return ((Interface9) local62.aClass4_Sub1_1).method5906(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(122) Class4_Sub2 local122 = Static80.method1405(this.anInt3889, this.anInt3888, this.anInt3885, np.class);
			if (local122 instanceof Class4_Sub2_Sub4) {
				@Pc(128) Class4_Sub2_Sub4 local128 = (Class4_Sub2_Sub4) local122;
				if (local128.aClass4_Sub2_2 != null) {
					return ((Interface9) local128.aClass4_Sub2_2).method5906(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(89) Class4_Sub3 local89 = Static325.method4667(this.anInt3889, this.anInt3888, this.anInt3885);
			if (local89 instanceof Class4_Sub3_Sub2) {
				@Pc(95) Class4_Sub3_Sub2 local95 = (Class4_Sub3_Sub2) local89;
				if (local95.aClass4_Sub3_2 != null) {
					return ((Interface9) local95.aClass4_Sub3_2).method5906(arg0, arg1);
				}
			}
		}
		return null;
	}
}
