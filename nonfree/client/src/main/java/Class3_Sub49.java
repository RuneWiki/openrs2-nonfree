import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "Lclient!gja;")
	public Class19_Sub1_Sub3_Sub2_Sub1 aClass19_Sub1_Sub3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Lclient!ob;")
	public Class3_Sub36 aClass3_Sub36_2;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "[I")
	public int[] anIntArray548;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public int anInt9897;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
	public int anInt9898;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "Lclient!mca;")
	public Class3_Sub33_Sub1 aClass3_Sub33_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "Z")
	public boolean aBoolean719;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public int anInt9899;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Lclient!ob;")
	public Class3_Sub36 aClass3_Sub36_3;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	public int anInt9900;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "Lclient!mca;")
	public Class3_Sub33_Sub1 aClass3_Sub33_Sub1_4;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	public int anInt9901;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
	public int anInt9902;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!hca;")
	public Class144 aClass144_1;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
	public int anInt9904;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public int anInt9905;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public int anInt9906;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	public int anInt9907;

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lclient!hn;")
	public Class3_Sub22_Sub1 aClass3_Sub22_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "Lclient!oba;")
	public Class19_Sub1_Sub3_Sub2_Sub2 aClass19_Sub1_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public int anInt9910;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "Z")
	public boolean aBoolean720;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "Lclient!hn;")
	public Class3_Sub22_Sub1 aClass3_Sub22_Sub1_4;

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
	public int anInt9911;

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
	public int anInt9912;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
	public int anInt9913;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Z")
	public boolean aBoolean721;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
	public int anInt9903 = 0;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
	public void method8352() {
		@Pc(8) int local8 = this.anInt9910;
		@Pc(11) boolean local11 = this.aBoolean720;
		if (this.aClass144_1 != null) {
			@Pc(168) Class144 local168 = this.aClass144_1.method3629(Static334.anInt5845 == 3 ? Static536.anInterface10_3 : Static577.aClass362_1);
			if (local168 == null) {
				this.anInt9898 = 0;
				this.anInt9901 = 0;
				this.anIntArray548 = null;
				this.anInt9910 = -1;
				this.aBoolean720 = false;
				this.anInt9913 = 256;
				this.aBoolean721 = false;
				this.anInt9902 = 256;
				this.anInt9912 = 0;
				this.anInt9900 = 0;
				this.anInt9907 = 0;
			} else {
				this.aBoolean720 = local168.aBoolean383;
				this.anInt9913 = local168.anInt4438;
				this.anInt9898 = local168.anInt4391 << 9;
				this.anInt9910 = local168.anInt4442;
				this.anInt9912 = local168.anInt4441;
				this.aBoolean721 = local168.aBoolean381;
				this.anIntArray548 = local168.anIntArray240;
				this.anInt9902 = local168.anInt4404;
				this.anInt9907 = local168.anInt4428;
				this.anInt9900 = local168.anInt4434;
			}
		} else if (this.aClass19_Sub1_Sub3_Sub2_Sub1_3 != null) {
			@Pc(75) int local75 = Static168.method8930(this.aClass19_Sub1_Sub3_Sub2_Sub1_3);
			if (local8 != local75) {
				this.anInt9910 = local75;
				@Pc(85) Class18 local85 = this.aClass19_Sub1_Sub3_Sub2_Sub1_3.aClass18_1;
				if (local85.anIntArray23 != null) {
					local85 = local85.method407(Static577.aClass362_1);
				}
				if (local85 == null) {
					this.anInt9902 = 256;
					this.anInt9907 = this.anInt9898 = this.anInt9901 = 0;
					this.anInt9913 = 256;
					this.aBoolean720 = this.aClass19_Sub1_Sub3_Sub2_Sub1_3.aClass18_1.aBoolean24;
				} else {
					this.aBoolean720 = local85.aBoolean24;
					this.anInt9901 = local85.anInt474 << 9;
					this.anInt9913 = local85.anInt472;
					this.anInt9902 = local85.anInt433;
					this.anInt9898 = local85.anInt470 << 9;
					this.anInt9907 = local85.anInt445;
				}
			}
		} else if (this.aClass19_Sub1_Sub3_Sub2_Sub2_3 != null) {
			this.anInt9910 = Static681.method8984(this.aClass19_Sub1_Sub3_Sub2_Sub2_3, -11542);
			this.anInt9913 = 256;
			this.aBoolean720 = this.aClass19_Sub1_Sub3_Sub2_Sub2_3.aBoolean598;
			this.anInt9907 = this.aClass19_Sub1_Sub3_Sub2_Sub2_3.anInt7846;
			this.anInt9901 = 0;
			this.anInt9898 = this.aClass19_Sub1_Sub3_Sub2_Sub2_3.anInt7856 << 9;
			this.anInt9902 = 256;
		}
		if (local8 == this.anInt9910 && local11 == this.aBoolean720) {
			return;
		}
		if (this.aClass3_Sub22_Sub1_3 == null) {
			return;
		}
		Static155.aClass3_Sub22_Sub4_1.method9062(this.aClass3_Sub22_Sub1_3);
		this.aClass3_Sub36_2 = null;
		this.aClass3_Sub33_Sub1_3 = null;
		this.aClass3_Sub22_Sub1_3 = null;
	}
}
