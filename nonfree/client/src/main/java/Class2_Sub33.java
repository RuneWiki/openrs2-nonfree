import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	public int anInt5973;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	public int anInt5974;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Lclient!am;")
	public Class13_Sub1_Sub1_Sub1_Sub1 aClass13_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!lu;")
	public Class2_Sub13_Sub2 aClass2_Sub13_Sub2_2;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
	public int anInt5975;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "Lclient!qv;")
	public Class2_Sub39 aClass2_Sub39_2;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
	public int anInt5976;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "Lclient!aaa;")
	public Class2_Sub1_Sub1 aClass2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
	public int anInt5978;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	public int anInt5979;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "Lclient!lu;")
	public Class2_Sub13_Sub2 aClass2_Sub13_Sub2_3;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "[I")
	public int[] anIntArray438;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "Z")
	public boolean aBoolean433;

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "Lclient!kha;")
	public Class191 aClass191_1;

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
	public int anInt5981;

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
	public boolean aBoolean434;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
	public int anInt5984;

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "Z")
	public boolean aBoolean435;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
	public int anInt5985;

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
	public int anInt5987;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "Lclient!kc;")
	public Class13_Sub1_Sub1_Sub1_Sub2 aClass13_Sub1_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "Lclient!aaa;")
	public Class2_Sub1_Sub1 aClass2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
	public int anInt5988;

	@OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
	public int anInt5989;

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
	public int anInt5990;

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "Lclient!qv;")
	public Class2_Sub39 aClass2_Sub39_3;

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
	public int anInt5986 = 0;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	public void method5117() {
		@Pc(8) int local8 = this.anInt5976;
		@Pc(15) boolean local15 = this.aBoolean433;
		if (this.aClass191_1 != null) {
			@Pc(24) Class191 local24 = this.aClass191_1.method4057(Static431.aClass205_1);
			if (local24 == null) {
				this.anInt5973 = 0;
				this.anInt5984 = 0;
				this.anInt5978 = 256;
				this.aBoolean435 = false;
				this.aBoolean433 = false;
				this.anIntArray438 = null;
				this.anInt5975 = 0;
				this.anInt5976 = -1;
				this.anInt5979 = 256;
				this.anInt5989 = 0;
			} else {
				this.anInt5978 = local24.anInt4783;
				this.anInt5976 = local24.anInt4785;
				this.anInt5975 = local24.anInt4825;
				this.aBoolean433 = local24.aBoolean348;
				this.aBoolean435 = local24.aBoolean337;
				this.anInt5973 = local24.anInt4778 << 9;
				this.anIntArray438 = local24.anIntArray321;
				this.anInt5984 = local24.lb;
				this.anInt5989 = local24.anInt4811;
				this.anInt5979 = local24.anInt4787;
			}
		} else if (this.aClass13_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(144) int local144 = Static15.method228(this.aClass13_Sub1_Sub1_Sub1_Sub1_1);
			if (local8 != local144) {
				this.anInt5976 = local144;
				@Pc(154) Class150 local154 = this.aClass13_Sub1_Sub1_Sub1_Sub1_1.aClass150_1;
				if (local154.anIntArray262 != null) {
					local154 = local154.method3196(Static431.aClass205_1);
				}
				if (local154 == null) {
					this.anInt5979 = 256;
					this.aBoolean433 = this.aClass13_Sub1_Sub1_Sub1_Sub1_1.aClass150_1.aBoolean274;
					this.anInt5978 = 256;
					this.anInt5984 = this.anInt5973 = 0;
				} else {
					this.anInt5984 = local154.anInt3805;
					this.aBoolean433 = local154.aBoolean274;
					this.anInt5978 = local154.anInt3811;
					this.anInt5973 = local154.anInt3780 << 9;
					this.anInt5979 = local154.anInt3815;
				}
			}
		} else if (this.aClass13_Sub1_Sub1_Sub1_Sub2_2 != null) {
			this.anInt5976 = Static210.method2941(this.aClass13_Sub1_Sub1_Sub1_Sub2_2);
			this.anInt5984 = this.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4642;
			this.anInt5973 = this.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4674 << 9;
			this.anInt5978 = 256;
			this.anInt5979 = 256;
			this.aBoolean433 = this.aClass13_Sub1_Sub1_Sub1_Sub2_2.aBoolean324;
		}
		if (local8 == this.anInt5976 && this.aBoolean433 == local15) {
			return;
		}
		if (this.aClass2_Sub13_Sub2_3 == null) {
			return;
		}
		Static586.aClass2_Sub13_Sub4_2.method7226(this.aClass2_Sub13_Sub2_3);
		this.aClass2_Sub39_2 = null;
		this.aClass2_Sub13_Sub2_3 = null;
		this.aClass2_Sub1_Sub1_3 = null;
	}
}
