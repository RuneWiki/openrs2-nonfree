import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!bda", name = "n", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!bda", name = "q", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
	public int anInt518;

	@OriginalMember(owner = "client!bda", name = "t", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
	public int anInt526;

	@OriginalMember(owner = "client!bda", name = "C", descriptor = "I")
	public int anInt527;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!oa;I)Lclient!ba;")
	public Class22 method430(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		@Pc(8) int local8 = Static242.anIntArray431[this.anInt515];
		@Pc(18) Class22 local18 = null;
		if (local8 == 0) {
			@Pc(125) Class29_Sub5 local125 = Static120.method1814(this.anInt513, this.anInt527, this.anInt522);
			if (local125 instanceof Class29_Sub5_Sub2) {
				@Pc(131) Class29_Sub5_Sub2 local131 = (Class29_Sub5_Sub2) local125;
				if (local131.aClass29_Sub5_3 != null) {
					local18 = ((Interface6) local131.aClass29_Sub5_3).method7557(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(99) Class29_Sub1 local99 = Static178.method5953(this.anInt513, this.anInt527, this.anInt522);
			if (local99 instanceof Class29_Sub1_Sub3) {
				@Pc(105) Class29_Sub1_Sub3 local105 = (Class29_Sub1_Sub3) local99;
				if (local105.aClass29_Sub1_3 != null) {
					local18 = ((Interface6) local105.aClass29_Sub1_3).method7557(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(44) Class29_Sub2 local44 = Static134.method1995(this.anInt513, this.anInt527, this.anInt522, dda.class);
			if (local44 instanceof Class29_Sub2_Sub5) {
				@Pc(50) Class29_Sub2_Sub5 local50 = (Class29_Sub2_Sub5) local44;
				if (local50.aClass29_Sub2_2 != null) {
					local18 = ((Interface6) local50.aClass29_Sub2_2).method7557(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(73) Class29_Sub3 local73 = Static315.method4904(this.anInt513, this.anInt527, this.anInt522);
			if (local73 instanceof Class29_Sub3_Sub3) {
				@Pc(79) Class29_Sub3_Sub3 local79 = (Class29_Sub3_Sub3) local73;
				if (local79.aClass29_Sub3_2 != null) {
					local18 = ((Interface6) local79.aClass29_Sub3_2).method7557(arg0, arg1);
				}
			}
		}
		return local18 == null ? null : local18.method4699((byte) 0, arg0, true);
	}
}
