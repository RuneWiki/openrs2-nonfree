import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class6_Sub29 extends Class6 {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public int anInt5263;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	public int anInt5264;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public int anInt5265;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public int anInt5266;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public int anInt5267;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public int anInt5268;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public int anInt5269;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public int anInt5272;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public int anInt5273;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
	public int anInt5275;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
	public int anInt5276;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	public int anInt5277;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	public int anInt5278;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
	public int anInt5279;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
	public int anInt5280;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	public Class20 method4565(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1) {
		@Pc(13) int local13 = Static279.anIntArray399[this.anInt5277];
		@Pc(15) Class20 local15 = null;
		if (local13 == 0) {
			@Pc(122) Class4_Sub5 local122 = Static162.method2962(this.anInt5280, this.anInt5279, this.anInt5263);
			if (local122 instanceof Class4_Sub5_Sub2) {
				@Pc(128) Class4_Sub5_Sub2 local128 = (Class4_Sub5_Sub2) local122;
				if (local128.aClass4_Sub5_1 != null) {
					local15 = ((Interface18) local128.aClass4_Sub5_1).method6269(arg1, arg0);
				}
			}
		} else if (local13 == 1) {
			@Pc(30) Class4_Sub2 local30 = Static401.method5859(this.anInt5280, this.anInt5279, this.anInt5263);
			if (local30 instanceof Class4_Sub2_Sub3) {
				@Pc(36) Class4_Sub2_Sub3 local36 = (Class4_Sub2_Sub3) local30;
				if (local36.aClass4_Sub2_1 != null) {
					local15 = ((Interface18) local36.aClass4_Sub2_1).method6269(arg1, arg0);
				}
			}
		} else if (local13 == 2) {
			@Pc(96) Class4_Sub1 local96 = Static117.method2480(this.anInt5280, this.anInt5279, this.anInt5263, pba.class);
			if (local96 instanceof Class4_Sub1_Sub4) {
				@Pc(102) Class4_Sub1_Sub4 local102 = (Class4_Sub1_Sub4) local96;
				if (local102.aClass4_Sub1_1 != null) {
					local15 = ((Interface18) local102.aClass4_Sub1_1).method6269(arg1, arg0);
				}
			}
		} else if (local13 == 3) {
			@Pc(62) Class4_Sub3 local62 = Static300.method4758(this.anInt5280, this.anInt5279, this.anInt5263);
			if (local62 instanceof Class4_Sub3_Sub1) {
				@Pc(68) Class4_Sub3_Sub1 local68 = (Class4_Sub3_Sub1) local62;
				if (local68.aClass4_Sub3_1 != null) {
					local15 = ((Interface18) local68.aClass4_Sub3_1).method6269(arg1, arg0);
				}
			}
		}
		return local15 == null ? null : local15.method7264((byte) 0, arg0, true);
	}
}
