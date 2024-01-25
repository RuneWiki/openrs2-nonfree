import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vla")
public final class Class3_Sub56 extends Class3 {

	@OriginalMember(owner = "client!vla", name = "u", descriptor = "Lclient!hb;")
	public Class3_Sub27 aClass3_Sub27_1;

	@OriginalMember(owner = "client!vla", name = "L", descriptor = "Lclient!hb;")
	public Class3_Sub27 aClass3_Sub27_2;

	@OriginalMember(owner = "client!vla", name = "D", descriptor = "I")
	public int anInt10739;

	@OriginalMember(owner = "client!vla", name = "v", descriptor = "I")
	public int anInt10740;

	@OriginalMember(owner = "client!vla", name = "F", descriptor = "Lclient!uv;")
	public Class3_Sub33_Sub5 aClass3_Sub33_Sub5_1;

	@OriginalMember(owner = "client!vla", name = "z", descriptor = "I")
	public int anInt10741;

	@OriginalMember(owner = "client!vla", name = "x", descriptor = "I")
	public int anInt10742;

	@OriginalMember(owner = "client!vla", name = "p", descriptor = "I")
	public int anInt10743;

	@OriginalMember(owner = "client!vla", name = "I", descriptor = "I")
	public int anInt10744;

	@OriginalMember(owner = "client!vla", name = "w", descriptor = "Lclient!wha;")
	public Class3_Sub34_Sub1 aClass3_Sub34_Sub1_1;

	@OriginalMember(owner = "client!vla", name = "o", descriptor = "Z")
	public boolean aBoolean729;

	@OriginalMember(owner = "client!vla", name = "r", descriptor = "I")
	public int anInt10745;

	@OriginalMember(owner = "client!vla", name = "E", descriptor = "Lclient!uv;")
	public Class3_Sub33_Sub5 aClass3_Sub33_Sub5_2;

	@OriginalMember(owner = "client!vla", name = "M", descriptor = "Lclient!afa;")
	public Class9_Sub1_Sub1_Sub2_Sub1 aClass9_Sub1_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!vla", name = "C", descriptor = "I")
	public int anInt10746;

	@OriginalMember(owner = "client!vla", name = "K", descriptor = "[I")
	public int[] anIntArray770;

	@OriginalMember(owner = "client!vla", name = "y", descriptor = "Z")
	public boolean aBoolean730;

	@OriginalMember(owner = "client!vla", name = "B", descriptor = "Z")
	public boolean aBoolean731;

	@OriginalMember(owner = "client!vla", name = "t", descriptor = "I")
	public int anInt10748;

	@OriginalMember(owner = "client!vla", name = "G", descriptor = "I")
	public int anInt10749;

	@OriginalMember(owner = "client!vla", name = "J", descriptor = "I")
	public int anInt10751;

	@OriginalMember(owner = "client!vla", name = "s", descriptor = "I")
	public int anInt10752;

	@OriginalMember(owner = "client!vla", name = "A", descriptor = "Lclient!mf;")
	public Class247 aClass247_1;

	@OriginalMember(owner = "client!vla", name = "l", descriptor = "I")
	public int anInt10753;

	@OriginalMember(owner = "client!vla", name = "q", descriptor = "Lclient!rw;")
	public Class9_Sub1_Sub1_Sub2_Sub2 aClass9_Sub1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!vla", name = "i", descriptor = "Lclient!wha;")
	public Class3_Sub34_Sub1 aClass3_Sub34_Sub1_2;

	@OriginalMember(owner = "client!vla", name = "H", descriptor = "I")
	public int anInt10755;

	@OriginalMember(owner = "client!vla", name = "m", descriptor = "I")
	public int anInt10747 = 0;

	@OriginalMember(owner = "client!vla", name = "b", descriptor = "(I)V")
	public void method9129() {
		@Pc(8) int local8 = this.anInt10749;
		@Pc(11) boolean local11 = this.aBoolean731;
		if (this.aClass247_1 != null) {
			@Pc(37) Class247 local37 = this.aClass247_1.method5442(Static103.anInt2245 == 3 ? Static229.anInterface12_3 : Static380.aClass127_1);
			if (local37 == null) {
				this.anInt10746 = 0;
				this.anInt10739 = 0;
				this.aBoolean731 = false;
				this.anInt10755 = 0;
				this.anIntArray770 = null;
				this.aBoolean730 = false;
				this.anInt10752 = 0;
				this.anInt10749 = -1;
				this.anInt10745 = 0;
				this.anInt10751 = 256;
				this.anInt10740 = 256;
			} else {
				this.anInt10755 = local37.anInt6271;
				this.anInt10751 = local37.anInt6268;
				this.anInt10745 = local37.anInt6288;
				this.anInt10746 = local37.anInt6252;
				this.anInt10739 = local37.anInt6264 << 9;
				this.aBoolean731 = local37.aBoolean414;
				this.aBoolean730 = local37.aBoolean412;
				this.anIntArray770 = local37.anIntArray481;
				this.anInt10749 = local37.anInt6273;
				this.anInt10740 = local37.anInt6254;
			}
		} else if (this.aClass9_Sub1_Sub1_Sub2_Sub2_3 != null) {
			@Pc(173) int local173 = Static642.method8456(this.aClass9_Sub1_Sub1_Sub2_Sub2_3);
			if (local173 != local8) {
				this.anInt10749 = local173;
				@Pc(183) Class219 local183 = this.aClass9_Sub1_Sub1_Sub2_Sub2_3.aClass219_1;
				if (local183.anIntArray405 != null) {
					local183 = local183.method5035(Static380.aClass127_1);
				}
				if (local183 == null) {
					this.anInt10740 = 256;
					this.anInt10751 = 256;
					this.aBoolean731 = this.aClass9_Sub1_Sub1_Sub2_Sub2_3.aClass219_1.aBoolean368;
					this.anInt10746 = this.anInt10739 = this.anInt10752 = 0;
				} else {
					this.anInt10740 = local183.anInt5717;
					this.anInt10746 = local183.anInt5689;
					this.anInt10739 = local183.anInt5679 << 9;
					this.aBoolean731 = local183.aBoolean368;
					this.anInt10751 = local183.anInt5712;
					this.anInt10752 = local183.anInt5695 << 9;
				}
			}
		} else if (this.aClass9_Sub1_Sub1_Sub2_Sub1_3 != null) {
			this.anInt10749 = Static157.method2548(this.aClass9_Sub1_Sub1_Sub2_Sub1_3);
			this.anInt10739 = this.aClass9_Sub1_Sub1_Sub2_Sub1_3.anInt549 << 9;
			this.anInt10740 = 256;
			this.aBoolean731 = this.aClass9_Sub1_Sub1_Sub2_Sub1_3.aBoolean35;
			this.anInt10746 = this.aClass9_Sub1_Sub1_Sub2_Sub1_3.anInt519;
			this.anInt10751 = 256;
			this.anInt10752 = 0;
		}
		if (local8 == this.anInt10749 && local11 == this.aBoolean731) {
			return;
		}
		if (this.aClass3_Sub33_Sub5_1 == null) {
			return;
		}
		Static391.aClass3_Sub33_Sub4_1.method8544(this.aClass3_Sub33_Sub5_1);
		this.aClass3_Sub34_Sub1_1 = null;
		this.aClass3_Sub27_1 = null;
		this.aClass3_Sub33_Sub5_1 = null;
	}
}
