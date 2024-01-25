import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Lclient!mm;")
	public Class1_Sub17_Sub1 aClass1_Sub17_Sub1_3;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "I")
	public int anInt6095;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Z")
	public boolean aBoolean482;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "I")
	public int anInt6097;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "I")
	public int anInt6099;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "I")
	public int anInt6100;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "Lclient!re;")
	public Class1_Sub7_Sub4 aClass1_Sub7_Sub4_3;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "Lclient!wj;")
	public Class1_Sub50 aClass1_Sub50_2;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	public int anInt6101;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "I")
	public int anInt6102;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "I")
	public int anInt6103;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "I")
	public int anInt6104;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "Z")
	public boolean aBoolean483;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "I")
	public int anInt6105;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
	public boolean aBoolean484;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Lclient!mm;")
	public Class1_Sub17_Sub1 aClass1_Sub17_Sub1_4;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "Lclient!et;")
	public Class95 aClass95_1;

	@OriginalMember(owner = "client!o", name = "H", descriptor = "Lclient!paa;")
	public Class8_Sub3_Sub3_Sub1_Sub2 aClass8_Sub3_Sub3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	public int anInt6108;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "Lclient!wj;")
	public Class1_Sub50 aClass1_Sub50_3;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Lclient!de;")
	public Class8_Sub3_Sub3_Sub1_Sub1 aClass8_Sub3_Sub3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "Lclient!re;")
	public Class1_Sub7_Sub4 aClass1_Sub7_Sub4_4;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	public int anInt6110;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "I")
	public int anInt6106 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public void method4951() {
		@Pc(13) int local13 = this.anInt6097;
		@Pc(16) boolean local16 = this.aBoolean482;
		if (this.aClass95_1 != null) {
			@Pc(111) Class95 local111 = this.aClass95_1.method1922(Static430.aClass321_1);
			if (local111 == null) {
				this.anInt6097 = -1;
				this.aBoolean484 = false;
				this.anInt6095 = 0;
				this.anIntArray497 = null;
				this.anInt6105 = 0;
				this.anInt6103 = 0;
				this.aBoolean482 = false;
				this.anInt6100 = 0;
			} else {
				this.anInt6095 = local111.anInt2383;
				this.anInt6097 = local111.anInt2426;
				this.anInt6103 = local111.anInt2386;
				this.anInt6105 = local111.anInt2401;
				this.anInt6100 = local111.anInt2404 << 9;
				this.aBoolean484 = local111.aBoolean187;
				this.anIntArray497 = local111.anIntArray210;
				this.aBoolean482 = local111.aBoolean175;
			}
		} else if (this.aClass8_Sub3_Sub3_Sub1_Sub2_1 != null) {
			@Pc(27) int local27 = Static185.method2594(this.aClass8_Sub3_Sub3_Sub1_Sub2_1);
			if (local27 != local13) {
				this.anInt6097 = local27;
				@Pc(37) Class20 local37 = this.aClass8_Sub3_Sub3_Sub1_Sub2_1.aClass20_1;
				if (local37.anIntArray40 != null) {
					local37 = local37.method284(Static430.aClass321_1);
				}
				if (local37 == null) {
					this.aBoolean482 = this.aClass8_Sub3_Sub3_Sub1_Sub2_1.aClass20_1.aBoolean37;
					this.anInt6103 = this.anInt6100 = 0;
				} else {
					this.aBoolean482 = local37.aBoolean37;
					this.anInt6103 = local37.anInt325;
					this.anInt6100 = local37.anInt319 << 9;
				}
			}
		} else if (this.aClass8_Sub3_Sub3_Sub1_Sub1_2 != null) {
			this.anInt6097 = Static449.method6211(this.aClass8_Sub3_Sub3_Sub1_Sub1_2);
			this.aBoolean482 = this.aClass8_Sub3_Sub3_Sub1_Sub1_2.aBoolean136;
			this.anInt6100 = this.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt1747 << 9;
			this.anInt6103 = this.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt1755;
		}
		if (local13 == this.anInt6097 && this.aBoolean482 == local16) {
			return;
		}
		if (this.aClass1_Sub7_Sub4_4 == null) {
			return;
		}
		Static309.aClass1_Sub7_Sub1_2.method477(this.aClass1_Sub7_Sub4_4);
		this.aClass1_Sub7_Sub4_4 = null;
		this.aClass1_Sub17_Sub1_3 = null;
		this.aClass1_Sub50_3 = null;
	}
}
