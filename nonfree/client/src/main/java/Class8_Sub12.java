import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class8_Sub12 extends Class8 {

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "Lclient!he;")
	public Class70 aClass70_1;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
	public int anInt2183;

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "Lclient!ph;")
	public Class36_Sub3_Sub2 aClass36_Sub3_Sub2_1;

	@OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
	public int anInt2186;

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "Z")
	public boolean aBoolean171;

	@OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
	public int anInt2187;

	@OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
	public int anInt2189;

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
	public int anInt2190;

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "Lclient!t;")
	public Class8_Sub8_Sub4 aClass8_Sub8_Sub4_2;

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "Lclient!pf;")
	public Class36_Sub3_Sub1 aClass36_Sub3_Sub1_2;

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
	public int anInt2193;

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
	public int anInt2194;

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "Lclient!t;")
	public Class8_Sub8_Sub4 aClass8_Sub8_Sub4_3;

	@OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
	public int anInt2195;

	@OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
	public int anInt2196;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
	public int anInt2182 = 0;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public void method1700() {
		@Pc(17) int local17 = this.anInt2196;
		if (this.aClass70_1 != null) {
			@Pc(96) Class70 local96 = this.aClass70_1.method1575();
			if (local96 == null) {
				this.anInt2183 = 0;
				this.anInt2177 = 0;
				this.anInt2190 = 0;
				this.anInt2196 = -1;
				this.anInt2187 = 0;
				this.anIntArray156 = null;
			} else {
				this.anIntArray156 = local96.anIntArray143;
				this.anInt2183 = local96.anInt2058;
				this.anInt2177 = local96.anInt2079 * 128;
				this.anInt2190 = local96.anInt2083;
				this.anInt2187 = local96.anInt2068;
				this.anInt2196 = local96.anInt2053;
			}
		} else if (this.aClass36_Sub3_Sub2_1 != null) {
			@Pc(28) int local28 = Static151.method3108(this.aClass36_Sub3_Sub2_1);
			if (local28 != local17) {
				@Pc(35) Class173 local35 = this.aClass36_Sub3_Sub2_1.aClass173_1;
				this.anInt2196 = local28;
				if (local35.anIntArray491 != null) {
					local35 = local35.method4245();
				}
				if (local35 == null) {
					this.anInt2190 = this.anInt2177 = 0;
				} else {
					this.anInt2177 = local35.anInt5620 * 128;
					this.anInt2190 = local35.anInt5630;
				}
			}
		} else if (this.aClass36_Sub3_Sub1_2 != null) {
			this.anInt2196 = Static298.method256(this.aClass36_Sub3_Sub1_2);
			this.anInt2177 = this.aClass36_Sub3_Sub1_2.anInt4045 * 128;
			this.anInt2190 = this.aClass36_Sub3_Sub1_2.anInt4030;
		}
		if (this.anInt2196 != local17 && this.aClass8_Sub8_Sub4_3 != null) {
			Static84.aClass8_Sub8_Sub1_1.method837(this.aClass8_Sub8_Sub4_3);
			this.aClass8_Sub8_Sub4_3 = null;
		}
	}
}
