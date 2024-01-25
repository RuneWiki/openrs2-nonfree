import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public int anInt6208;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
	public int anInt6209;

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
	public int anInt6210;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
	public int anInt6211;

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
	public int anInt6212;

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
	public int anInt6213;

	@OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
	public int anInt6214;

	@OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
	public int anInt6215;

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
	public int anInt6216;

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
	public int anInt6219;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
	public int anInt6220;

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
	public int anInt6222;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
	public int anInt6223;

	@OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
	public int anInt6225;

	@OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
	public int anInt6226;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!eq;I)Lclient!va;")
	public Class224 method5183(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static414.anIntArray487[this.anInt6209];
		if (local8 == 0) {
			@Pc(23) Class3_Sub3 local23 = Static86.method825(this.anInt6210, this.anInt6208, this.anInt6216);
			if (local23 instanceof Class3_Sub3_Sub2) {
				@Pc(29) Class3_Sub3_Sub2 local29 = (Class3_Sub3_Sub2) local23;
				if (local29.aClass3_Sub3_3 != null) {
					return ((Interface10) local29.aClass3_Sub3_3).method5323(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(53) Class3_Sub1 local53 = Static273.method4127(this.anInt6210, this.anInt6208, this.anInt6216);
			if (local53 instanceof Class3_Sub1_Sub2) {
				@Pc(59) Class3_Sub1_Sub2 local59 = (Class3_Sub1_Sub2) local53;
				if (local59.aClass3_Sub1_1 != null) {
					return ((Interface10) local59.aClass3_Sub1_1).method5323(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(121) Class3_Sub2 local121 = Static415.method6101(this.anInt6210, this.anInt6208, this.anInt6216, sq.class);
			if (local121 instanceof Class3_Sub2_Sub2) {
				@Pc(127) Class3_Sub2_Sub2 local127 = (Class3_Sub2_Sub2) local121;
				if (local127.aClass3_Sub2_1 != null) {
					return ((Interface10) local127.aClass3_Sub2_1).method5323(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(88) Class3_Sub5 local88 = Static109.method4308(this.anInt6210, this.anInt6208, this.anInt6216);
			if (local88 instanceof Class3_Sub5_Sub3) {
				@Pc(94) Class3_Sub5_Sub3 local94 = (Class3_Sub5_Sub3) local88;
				if (local94.aClass3_Sub5_2 != null) {
					return ((Interface10) local94.aClass3_Sub5_2).method5323(arg1, arg0);
				}
			}
		}
		return null;
	}
}
