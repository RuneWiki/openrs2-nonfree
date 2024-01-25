import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
	public int anInt2489;

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
	public int anInt2491;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
	public int anInt2492;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	public int anInt2493;

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
	public int anInt2495;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
	public int anInt2496;

	@OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
	public int anInt2498;

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
	public int anInt2499;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
	public int anInt2501;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
	public int anInt2502;

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
	public int anInt2503;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
	public int anInt2505;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	public Class7 method1860(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static76.anIntArray111[this.anInt2502];
		if (local8 == 0) {
			@Pc(119) Class6_Sub1 local119 = Static138.method1998(this.anInt2499, this.anInt2495, this.anInt2492);
			if (local119 instanceof Class6_Sub1_Sub3) {
				@Pc(125) Class6_Sub1_Sub3 local125 = (Class6_Sub1_Sub3) local119;
				if (local125.aClass6_Sub1_3 != null) {
					return ((Interface11) local125.aClass6_Sub1_3).method5646(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(26) Class6_Sub3 local26 = Static351.method4929(this.anInt2499, this.anInt2495, this.anInt2492);
			if (local26 instanceof Class6_Sub3_Sub3) {
				@Pc(32) Class6_Sub3_Sub3 local32 = (Class6_Sub3_Sub3) local26;
				if (local32.aClass6_Sub3_3 != null) {
					return ((Interface11) local32.aClass6_Sub3_3).method5646(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(64) Class6_Sub2 local64 = Static134.method1950(this.anInt2499, this.anInt2495, this.anInt2492, ou.class);
			if (local64 instanceof Class6_Sub2_Sub2) {
				@Pc(70) Class6_Sub2_Sub2 local70 = (Class6_Sub2_Sub2) local64;
				if (local70.aClass6_Sub2_1 != null) {
					return ((Interface11) local70.aClass6_Sub2_1).method5646(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(94) Class6_Sub4 local94 = Static40.method729(this.anInt2499, this.anInt2495, this.anInt2492);
			if (local94 instanceof Class6_Sub4_Sub3) {
				@Pc(100) Class6_Sub4_Sub3 local100 = (Class6_Sub4_Sub3) local94;
				if (local100.aClass6_Sub4_2 != null) {
					return ((Interface11) local100.aClass6_Sub4_2).method5646(arg1, arg0);
				}
			}
		}
		return null;
	}
}
