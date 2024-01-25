import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "Lclient!ip;")
	public Class4_Sub1_Sub1_Sub2_Sub1 aClass4_Sub1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ffa", name = "B", descriptor = "Lclient!gga;")
	public Class5_Sub22 aClass5_Sub22_1;

	@OriginalMember(owner = "client!ffa", name = "D", descriptor = "Lclient!it;")
	public Class5_Sub4_Sub4 aClass5_Sub4_Sub4_1;

	@OriginalMember(owner = "client!ffa", name = "q", descriptor = "I")
	public int anInt2968;

	@OriginalMember(owner = "client!ffa", name = "F", descriptor = "[I")
	public int[] anIntArray139;

	@OriginalMember(owner = "client!ffa", name = "N", descriptor = "Lclient!gga;")
	public Class5_Sub22 aClass5_Sub22_2;

	@OriginalMember(owner = "client!ffa", name = "A", descriptor = "Z")
	public boolean aBoolean221;

	@OriginalMember(owner = "client!ffa", name = "J", descriptor = "Lclient!ns;")
	public Class4_Sub1_Sub1_Sub2_Sub2 aClass4_Sub1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ffa", name = "L", descriptor = "Z")
	public boolean aBoolean222;

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "Lclient!tk;")
	public Class354 aClass354_1;

	@OriginalMember(owner = "client!ffa", name = "x", descriptor = "Lclient!jg;")
	public Class5_Sub27_Sub1 aClass5_Sub27_Sub1_1;

	@OriginalMember(owner = "client!ffa", name = "Q", descriptor = "I")
	public int anInt2971;

	@OriginalMember(owner = "client!ffa", name = "u", descriptor = "I")
	public int anInt2972;

	@OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
	public int anInt2973;

	@OriginalMember(owner = "client!ffa", name = "P", descriptor = "I")
	public int anInt2974;

	@OriginalMember(owner = "client!ffa", name = "o", descriptor = "I")
	public int anInt2975;

	@OriginalMember(owner = "client!ffa", name = "s", descriptor = "Z")
	public boolean aBoolean223;

	@OriginalMember(owner = "client!ffa", name = "y", descriptor = "I")
	public int anInt2976;

	@OriginalMember(owner = "client!ffa", name = "p", descriptor = "I")
	public int anInt2977;

	@OriginalMember(owner = "client!ffa", name = "M", descriptor = "Lclient!it;")
	public Class5_Sub4_Sub4 aClass5_Sub4_Sub4_2;

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "I")
	public int anInt2979;

	@OriginalMember(owner = "client!ffa", name = "C", descriptor = "Lclient!jg;")
	public Class5_Sub27_Sub1 aClass5_Sub27_Sub1_2;

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "I")
	public int anInt2980;

	@OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
	public int anInt2981;

	@OriginalMember(owner = "client!ffa", name = "O", descriptor = "I")
	public int anInt2982;

	@OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
	public int anInt2983;

	@OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
	public int anInt2984;

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
	public int anInt2969 = 0;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V")
	public void method2784() {
		@Pc(8) int local8 = this.anInt2979;
		@Pc(16) boolean local16 = this.aBoolean222;
		if (this.aClass354_1 != null) {
			@Pc(153) Class354 local153 = this.aClass354_1.method8024(Static23.aClass247_1);
			if (local153 == null) {
				this.anInt2974 = 0;
				this.anIntArray139 = null;
				this.anInt2976 = 0;
				this.aBoolean223 = false;
				this.anInt2977 = 0;
				this.anInt2979 = -1;
				this.aBoolean222 = false;
				this.anInt2980 = 0;
				this.anInt2981 = 256;
				this.anInt2973 = 0;
				this.anInt2971 = 256;
			} else {
				this.aBoolean223 = local153.aBoolean639;
				this.anInt2981 = local153.anInt9409;
				this.anInt2971 = local153.anInt9377;
				this.anInt2974 = local153.anInt9411;
				this.anInt2980 = local153.anInt9425;
				this.anInt2976 = local153.anInt9432 << 9;
				this.anInt2977 = local153.anInt9416;
				this.anIntArray139 = local153.anIntArray525;
				this.aBoolean222 = local153.aBoolean645;
				this.anInt2979 = local153.anInt9428;
			}
		} else if (this.aClass4_Sub1_Sub1_Sub2_Sub2_2 != null) {
			@Pc(70) int local70 = Static649.method8960(this.aClass4_Sub1_Sub1_Sub2_Sub2_2);
			if (local8 != local70) {
				this.anInt2979 = local70;
				@Pc(80) Class105 local80 = this.aClass4_Sub1_Sub1_Sub2_Sub2_2.aClass105_1;
				if (local80.anIntArray134 != null) {
					local80 = local80.method2622(Static23.aClass247_1);
				}
				if (local80 == null) {
					this.anInt2971 = 256;
					this.anInt2974 = this.anInt2976 = this.anInt2973 = 0;
					this.anInt2981 = 256;
					this.aBoolean222 = this.aClass4_Sub1_Sub1_Sub2_Sub2_2.aClass105_1.aBoolean210;
				} else {
					this.anInt2971 = local80.anInt2812;
					this.anInt2976 = local80.anInt2801 << 9;
					this.anInt2981 = local80.anInt2837;
					this.anInt2974 = local80.anInt2800;
					this.aBoolean222 = local80.aBoolean210;
					this.anInt2973 = local80.anInt2814 << 9;
				}
			}
		} else if (this.aClass4_Sub1_Sub1_Sub2_Sub1_1 != null) {
			this.anInt2979 = Static75.method1251(this.aClass4_Sub1_Sub1_Sub2_Sub1_1);
			this.anInt2976 = this.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt4545 << 9;
			this.anInt2973 = 0;
			this.anInt2971 = 256;
			this.aBoolean222 = this.aClass4_Sub1_Sub1_Sub2_Sub1_1.aBoolean305;
			this.anInt2981 = 256;
			this.anInt2974 = this.aClass4_Sub1_Sub1_Sub2_Sub1_1.anInt4554;
		}
		if (local8 == this.anInt2979 && local16 == this.aBoolean222) {
			return;
		}
		if (this.aClass5_Sub4_Sub4_1 == null) {
			return;
		}
		Static265.aClass5_Sub4_Sub1_2.method332(this.aClass5_Sub4_Sub4_1);
		this.aClass5_Sub22_1 = null;
		this.aClass5_Sub27_Sub1_2 = null;
		this.aClass5_Sub4_Sub4_1 = null;
	}
}
