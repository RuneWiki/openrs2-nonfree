import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "Lclient!pc;")
	public Class4_Sub6_Sub4 aClass4_Sub6_Sub4_2;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "Lclient!pc;")
	public Class4_Sub6_Sub4 aClass4_Sub6_Sub4_3;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
	public int anInt2119;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "Z")
	public boolean aBoolean146;

	@OriginalMember(owner = "client!gn", name = "I", descriptor = "Lclient!p;")
	public Class53_Sub1_Sub2 aClass53_Sub1_Sub2_1;

	@OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
	public int anInt2123;

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
	public int anInt2124;

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "Lclient!f;")
	public Class53_Sub1_Sub1 aClass53_Sub1_Sub1_1;

	@OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
	public int anInt2125;

	@OriginalMember(owner = "client!gn", name = "N", descriptor = "Lclient!vh;")
	public Class184 aClass184_1;

	@OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
	public int anInt2127;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	public int anInt2111 = 0;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public void method1652() {
		@Pc(9) int local9 = this.anInt2115;
		if (this.aClass184_1 != null) {
			@Pc(96) Class184 local96 = this.aClass184_1.method4490();
			if (local96 == null) {
				this.anInt2119 = 0;
				this.anInt2123 = 0;
				this.anIntArray172 = null;
				this.anInt2127 = 0;
				this.anInt2115 = -1;
				this.anInt2116 = 0;
			} else {
				this.anInt2115 = local96.anInt5522;
				this.anInt2119 = local96.anInt5556;
				this.anInt2116 = local96.anInt5531;
				this.anInt2123 = local96.anInt5520 * 128;
				this.anInt2127 = local96.anInt5526;
				this.anIntArray172 = local96.anIntArray632;
			}
		} else if (this.aClass53_Sub1_Sub2_1 != null) {
			@Pc(21) int local21 = Static28.method395(this.aClass53_Sub1_Sub2_1);
			if (local9 != local21) {
				this.anInt2115 = local21;
				@Pc(36) Class171 local36 = this.aClass53_Sub1_Sub2_1.aClass171_1;
				if (local36.anIntArray590 != null) {
					local36 = local36.method4302();
				}
				if (local36 == null) {
					this.anInt2127 = this.anInt2123 = 0;
				} else {
					this.anInt2123 = local36.anInt5250 * 128;
					this.anInt2127 = local36.anInt5236;
				}
			}
		} else if (this.aClass53_Sub1_Sub1_1 != null) {
			this.anInt2115 = Static28.method396(this.aClass53_Sub1_Sub1_1);
			this.anInt2123 = this.aClass53_Sub1_Sub1_1.anInt1582 * 128;
			this.anInt2127 = this.aClass53_Sub1_Sub1_1.anInt1587;
		}
		if (this.anInt2115 != local9 && this.aClass4_Sub6_Sub4_3 != null) {
			Static211.aClass4_Sub6_Sub3_2.method2683(this.aClass4_Sub6_Sub4_3);
			this.aClass4_Sub6_Sub4_3 = null;
		}
	}
}
