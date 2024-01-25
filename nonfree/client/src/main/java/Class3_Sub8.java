import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	public int anInt945;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "Lclient!pu;")
	public Class277 aClass277_1;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "Z")
	public boolean aBoolean68;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Lclient!mk;")
	public Class3_Sub41 aClass3_Sub41_1;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public int anInt947;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Lclient!ks;")
	public Class3_Sub35_Sub1 aClass3_Sub35_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
	public int anInt949;

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "Z")
	public boolean aBoolean69;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	public int anInt950;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!mk;")
	public Class3_Sub41 aClass3_Sub41_2;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "Lclient!wc;")
	public Class28_Sub1_Sub1_Sub1_Sub1 aClass28_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "Lclient!ab;")
	public Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
	public int anInt955;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "Lclient!ab;")
	public Class3_Sub1_Sub1 aClass3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "Lclient!wp;")
	public Class28_Sub1_Sub1_Sub1_Sub2 aClass28_Sub1_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "Lclient!ks;")
	public Class3_Sub35_Sub1 aClass3_Sub35_Sub1_2;

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "Z")
	public boolean aBoolean70;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
	public int anInt963;

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	public int anInt951 = 0;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
	public void method1055() {
		@Pc(8) int local8 = this.anInt945;
		@Pc(17) boolean local17 = this.aBoolean68;
		if (this.aClass277_1 != null) {
			@Pc(144) Class277 local144 = this.aClass277_1.method6815(Static131.aClass66_1);
			if (local144 == null) {
				this.anInt949 = 0;
				this.anInt963 = 0;
				this.anIntArray80 = null;
				this.anInt946 = 0;
				this.anInt953 = 0;
				this.anInt954 = 256;
				this.anInt956 = 256;
				this.anInt945 = -1;
				this.anInt959 = 0;
				this.aBoolean69 = false;
				this.aBoolean68 = false;
			} else {
				this.anIntArray80 = local144.anIntArray661;
				this.aBoolean69 = local144.aBoolean589;
				this.anInt963 = local144.anInt7749;
				this.anInt954 = local144.anInt7748;
				this.anInt949 = local144.anInt7741;
				this.anInt946 = local144.anInt7740;
				this.aBoolean68 = local144.aBoolean578;
				this.anInt959 = local144.anInt7767 << 9;
				this.anInt956 = local144.anInt7746;
				this.anInt945 = local144.anInt7747;
			}
		} else if (this.aClass28_Sub1_Sub1_Sub1_Sub2_2 != null) {
			@Pc(28) int local28 = Static576.method8133(this.aClass28_Sub1_Sub1_Sub1_Sub2_2);
			if (local28 != local8) {
				this.anInt945 = local28;
				@Pc(38) Class300 local38 = this.aClass28_Sub1_Sub1_Sub1_Sub2_2.aClass300_1;
				if (local38.anIntArray696 != null) {
					local38 = local38.method7258(Static131.aClass66_1);
				}
				if (local38 == null) {
					this.anInt954 = 256;
					this.anInt946 = this.anInt959 = this.anInt953 = 0;
					this.aBoolean68 = this.aClass28_Sub1_Sub1_Sub1_Sub2_2.aClass300_1.aBoolean633;
					this.anInt956 = 256;
				} else {
					this.anInt956 = local38.anInt8325;
					this.anInt954 = local38.anInt8305;
					this.anInt959 = local38.anInt8315 << 9;
					this.anInt953 = local38.anInt8327 << 9;
					this.aBoolean68 = local38.aBoolean633;
					this.anInt946 = local38.anInt8303;
				}
			}
		} else if (this.aClass28_Sub1_Sub1_Sub1_Sub1_1 != null) {
			this.anInt945 = Static296.method4575(this.aClass28_Sub1_Sub1_Sub1_Sub1_1);
			this.anInt956 = 256;
			this.anInt959 = this.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10522 << 9;
			this.anInt946 = this.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10531;
			this.aBoolean68 = this.aClass28_Sub1_Sub1_Sub1_Sub1_1.aBoolean794;
			this.anInt953 = 0;
			this.anInt954 = 256;
		}
		if (this.anInt945 == local8 && local17 == this.aBoolean68) {
			return;
		}
		if (this.aClass3_Sub1_Sub1_1 == null) {
			return;
		}
		Static313.aClass3_Sub1_Sub2_1.method931(this.aClass3_Sub1_Sub1_1);
		this.aClass3_Sub41_1 = null;
		this.aClass3_Sub35_Sub1_1 = null;
		this.aClass3_Sub1_Sub1_1 = null;
	}
}
