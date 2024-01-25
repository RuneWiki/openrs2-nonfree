import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	public int anInt5218;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	public int anInt5220;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public int anInt5221;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	public int anInt5222;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	public int anInt5223;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public int anInt5224;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	public int anInt5225;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	public int anInt5226;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	public int anInt5227;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	public int anInt5228;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public int anInt5229;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
	public int anInt5230;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
	public int anInt5231;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
	public int anInt5234;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
	public int anInt5235;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!qq;I)Lclient!cd;")
	public Class39 method4566(@OriginalArg(1) Class28 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static125.anIntArray233[this.anInt5230];
		if (local8 == 0) {
			@Pc(24) Class3_Sub1 local24 = Static428.method5836(this.anInt5224, this.anInt5222, this.anInt5227);
			if (local24 instanceof Class3_Sub1_Sub3) {
				@Pc(30) Class3_Sub1_Sub3 local30 = (Class3_Sub1_Sub3) local24;
				if (local30.aClass3_Sub1_3 != null) {
					return ((Interface10) local30.aClass3_Sub1_3).method5808(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(122) Class3_Sub4 local122 = Static64.method1227(this.anInt5224, this.anInt5222, this.anInt5227);
			if (local122 instanceof Class3_Sub4_Sub1) {
				@Pc(128) Class3_Sub4_Sub1 local128 = (Class3_Sub4_Sub1) local122;
				if (local128.aClass3_Sub4_1 != null) {
					return ((Interface10) local128.aClass3_Sub4_1).method5808(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(97) Class3_Sub3 local97 = Static49.method903(this.anInt5224, this.anInt5222, this.anInt5227, tf.class);
			if (local97 instanceof Class3_Sub3_Sub3) {
				@Pc(103) Class3_Sub3_Sub3 local103 = (Class3_Sub3_Sub3) local97;
				if (local103.aClass3_Sub3_1 != null) {
					return ((Interface10) local103.aClass3_Sub3_1).method5808(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(64) Class3_Sub5 local64 = Static91.method1566(this.anInt5224, this.anInt5222, this.anInt5227);
			if (local64 instanceof Class3_Sub5_Sub3) {
				@Pc(70) Class3_Sub5_Sub3 local70 = (Class3_Sub5_Sub3) local64;
				if (local70.aClass3_Sub5_2 != null) {
					return ((Interface10) local70.aClass3_Sub5_2).method5808(arg0, arg1);
				}
			}
		}
		return null;
	}
}
