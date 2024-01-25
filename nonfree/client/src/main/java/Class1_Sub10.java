import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	public int anInt1199;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	public int anInt1200;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Lclient!bu;")
	public Class36 aClass36_1;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public int anInt1202;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	public int anInt1203;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Lclient!jc;")
	public Class49_Sub2_Sub2_Sub2 aClass49_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "Z")
	public boolean aBoolean74;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
	public int anInt1208;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "Lclient!dg;")
	public Class49_Sub2_Sub2_Sub1 aClass49_Sub2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
	public int anInt1210;

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "Lclient!ju;")
	public Class1_Sub16_Sub2 aClass1_Sub16_Sub2_2;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
	public int anInt1211;

	@OriginalMember(owner = "client!cl", name = "E", descriptor = "Lclient!ju;")
	public Class1_Sub16_Sub2 aClass1_Sub16_Sub2_3;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
	public int anInt1213;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
	public int anInt1214;

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
	public int anInt1215;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	public int anInt1209 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public void method1182() {
		@Pc(14) int local14 = this.anInt1214;
		if (this.aClass36_1 != null) {
			@Pc(98) Class36 local98 = this.aClass36_1.method954(Static251.aClass119_1);
			if (local98 == null) {
				this.anInt1199 = 0;
				this.anInt1200 = 0;
				this.anInt1211 = 0;
				this.anInt1213 = 0;
				this.anIntArray150 = null;
				this.anInt1214 = -1;
			} else {
				this.anInt1200 = local98.anInt995;
				this.anInt1211 = local98.anInt954;
				this.anInt1214 = local98.anInt973;
				this.anInt1199 = local98.anInt953 << 9;
				this.anIntArray150 = local98.anIntArray125;
				this.anInt1213 = local98.anInt965;
			}
		} else if (this.aClass49_Sub2_Sub2_Sub2_1 != null) {
			@Pc(48) int local48 = Static74.method1286(this.aClass49_Sub2_Sub2_Sub2_1);
			if (local48 != local14) {
				this.anInt1214 = local48;
				@Pc(62) Class196 local62 = this.aClass49_Sub2_Sub2_Sub2_1.aClass196_1;
				if (local62.anIntArray570 != null) {
					local62 = local62.method4855(Static251.aClass119_1);
				}
				if (local62 == null) {
					this.anInt1211 = this.anInt1199 = 0;
				} else {
					this.anInt1211 = local62.anInt5694;
					this.anInt1199 = local62.anInt5695 << 9;
				}
			}
		} else if (this.aClass49_Sub2_Sub2_Sub1_2 != null) {
			this.anInt1214 = Static290.method6962(this.aClass49_Sub2_Sub2_Sub1_2);
			this.anInt1199 = this.aClass49_Sub2_Sub2_Sub1_2.anInt1763 << 9;
			this.anInt1211 = this.aClass49_Sub2_Sub2_Sub1_2.anInt1772;
		}
		if (local14 != this.anInt1214 && this.aClass1_Sub16_Sub2_2 != null) {
			Static411.aClass1_Sub16_Sub1_2.method2231(this.aClass1_Sub16_Sub2_2);
			this.aClass1_Sub16_Sub2_2 = null;
		}
	}
}
