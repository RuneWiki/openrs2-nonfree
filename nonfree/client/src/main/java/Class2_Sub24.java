import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
	public int anInt4276;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
	public int anInt4277;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lclient!dw;")
	public Class3_Sub2_Sub1_Sub1 aClass3_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public int anInt4279;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Lclient!hn;")
	public Class2_Sub3_Sub3 aClass2_Sub3_Sub3_1;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
	public int anInt4282;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	public int anInt4283;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
	public int anInt4285;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
	public int anInt4286;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "Z")
	public boolean aBoolean311;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "Lclient!sk;")
	public Class3_Sub2_Sub1_Sub2 aClass3_Sub2_Sub1_Sub2_5;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	public int anInt4289;

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "Lclient!hn;")
	public Class2_Sub3_Sub3 aClass2_Sub3_Sub3_2;

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
	public int anInt4290;

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
	public int anInt4291;

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "Lclient!jo;")
	public Class134 aClass134_1;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
	public int anInt4288 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public void method3466() {
		@Pc(14) int local14 = this.anInt4286;
		if (this.aClass134_1 != null) {
			@Pc(23) Class134 local23 = this.aClass134_1.method2969(Static344.aClass108_1);
			if (local23 == null) {
				this.anInt4286 = -1;
				this.anInt4289 = 0;
				this.anInt4278 = 0;
				this.anIntArray360 = null;
				this.anInt4282 = 0;
				this.anInt4290 = 0;
			} else {
				this.anInt4286 = local23.anInt3625;
				this.anInt4278 = local23.anInt3659;
				this.anInt4289 = local23.anInt3667;
				this.anInt4282 = local23.anInt3645 << 7;
				this.anInt4290 = local23.anInt3620;
				this.anIntArray360 = local23.anIntArray320;
			}
		} else if (this.aClass3_Sub2_Sub1_Sub1_1 != null) {
			@Pc(83) int local83 = Static283.method1318(this.aClass3_Sub2_Sub1_Sub1_1);
			if (local14 != local83) {
				this.anInt4286 = local83;
				@Pc(93) Class65 local93 = this.aClass3_Sub2_Sub1_Sub1_1.aClass65_1;
				if (local93.anIntArray155 != null) {
					local93 = local93.method1710(Static344.aClass108_1);
				}
				if (local93 == null) {
					this.anInt4289 = this.anInt4282 = 0;
				} else {
					this.anInt4282 = local93.anInt2140 << 7;
					this.anInt4289 = local93.anInt2144;
				}
			}
		} else if (this.aClass3_Sub2_Sub1_Sub2_5 != null) {
			this.anInt4286 = Static200.method4291(this.aClass3_Sub2_Sub1_Sub2_5);
			this.anInt4282 = this.aClass3_Sub2_Sub1_Sub2_5.anInt6226 << 7;
			this.anInt4289 = this.aClass3_Sub2_Sub1_Sub2_5.anInt6243;
		}
		if (this.anInt4286 != local14 && this.aClass2_Sub3_Sub3_2 != null) {
			Static260.aClass2_Sub3_Sub1_2.method1826(this.aClass2_Sub3_Sub3_2);
			this.aClass2_Sub3_Sub3_2 = null;
		}
	}
}
