import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "Z")
	public boolean aBoolean65;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "Z")
	public boolean aBoolean66;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "Lclient!ws;")
	public Class2_Sub26_Sub5 aClass2_Sub26_Sub5_1;

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
	public int anInt1195;

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "Lclient!rw;")
	public Class2_Sub46 aClass2_Sub46_1;

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
	public int anInt1197;

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "Z")
	public boolean aBoolean67;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
	public int anInt1199;

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
	public int anInt1200;

	@OriginalMember(owner = "client!bv", name = "A", descriptor = "Lclient!gh;")
	public Class15_Sub3_Sub3_Sub1_Sub2 aClass15_Sub3_Sub3_Sub1_Sub2_2;

	@OriginalMember(owner = "client!bv", name = "B", descriptor = "Lclient!ud;")
	public Class2_Sub44_Sub1 aClass2_Sub44_Sub1_1;

	@OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
	public int anInt1201;

	@OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
	public int anInt1202;

	@OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
	public int anInt1204;

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
	public int anInt1206;

	@OriginalMember(owner = "client!bv", name = "I", descriptor = "Lclient!rw;")
	public Class2_Sub46 aClass2_Sub46_2;

	@OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
	public int anInt1207;

	@OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
	public int anInt1208;

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "Lclient!sea;")
	public Class331 aClass331_1;

	@OriginalMember(owner = "client!bv", name = "N", descriptor = "Lclient!ea;")
	public Class15_Sub3_Sub3_Sub1_Sub1 aClass15_Sub3_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bv", name = "P", descriptor = "I")
	public int anInt1209;

	@OriginalMember(owner = "client!bv", name = "Q", descriptor = "I")
	public int anInt1210;

	@OriginalMember(owner = "client!bv", name = "R", descriptor = "I")
	public int anInt1211;

	@OriginalMember(owner = "client!bv", name = "S", descriptor = "Lclient!ws;")
	public Class2_Sub26_Sub5 aClass2_Sub26_Sub5_2;

	@OriginalMember(owner = "client!bv", name = "T", descriptor = "I")
	public int anInt1212;

	@OriginalMember(owner = "client!bv", name = "V", descriptor = "Lclient!ud;")
	public Class2_Sub44_Sub1 aClass2_Sub44_Sub1_2;

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
	public int anInt1196 = 0;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
	public void method1170() {
		@Pc(8) int local8 = this.anInt1211;
		@Pc(11) boolean local11 = this.aBoolean65;
		if (this.aClass331_1 != null) {
			@Pc(138) Class331 local138 = this.aClass331_1.method8304(Static113.aClass282_1);
			if (local138 == null) {
				this.anIntArray64 = null;
				this.anInt1204 = 0;
				this.anInt1208 = 0;
				this.aBoolean65 = false;
				this.anInt1197 = 0;
				this.anInt1211 = -1;
				this.aBoolean66 = false;
				this.anInt1199 = 256;
				this.anInt1206 = 0;
				this.anInt1195 = 256;
				this.anInt1212 = 0;
			} else {
				this.anInt1195 = local138.anInt9458;
				this.anInt1212 = local138.anInt9460 << 9;
				this.anInt1199 = local138.anInt9404;
				this.anInt1206 = local138.anInt9445;
				this.anInt1204 = local138.anInt9409;
				this.aBoolean65 = local138.aBoolean699;
				this.anInt1211 = local138.anInt9412;
				this.anInt1197 = local138.anInt9401;
				this.aBoolean66 = local138.aBoolean686;
				this.anIntArray64 = local138.anIntArray485;
			}
		} else if (this.aClass15_Sub3_Sub3_Sub1_Sub2_2 != null) {
			@Pc(59) int local59 = Static623.method9262(this.aClass15_Sub3_Sub3_Sub1_Sub2_2);
			if (local59 != local8) {
				this.anInt1211 = local59;
				@Pc(69) Class312 local69 = this.aClass15_Sub3_Sub3_Sub1_Sub2_2.aClass312_1;
				if (local69.anIntArray458 != null) {
					local69 = local69.method7953(Static113.aClass282_1);
				}
				if (local69 == null) {
					this.aBoolean65 = this.aClass15_Sub3_Sub3_Sub1_Sub2_2.aClass312_1.aBoolean660;
					this.anInt1195 = 256;
					this.anInt1199 = 256;
					this.anInt1206 = this.anInt1212 = this.anInt1208 = 0;
				} else {
					this.anInt1195 = local69.anInt9061;
					this.anInt1212 = local69.anInt9084 << 9;
					this.aBoolean65 = local69.aBoolean660;
					this.anInt1208 = local69.anInt9076 << 9;
					this.anInt1199 = local69.anInt9101;
					this.anInt1206 = local69.anInt9059;
				}
			}
		} else if (this.aClass15_Sub3_Sub3_Sub1_Sub1_1 != null) {
			this.anInt1211 = Static170.method3354(this.aClass15_Sub3_Sub3_Sub1_Sub1_1);
			this.anInt1208 = 0;
			this.anInt1199 = 256;
			this.aBoolean65 = this.aClass15_Sub3_Sub3_Sub1_Sub1_1.aBoolean177;
			this.anInt1206 = this.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt2380;
			this.anInt1212 = this.aClass15_Sub3_Sub3_Sub1_Sub1_1.anInt2390 << 9;
			this.anInt1195 = 256;
		}
		if (this.anInt1211 == local8 && local11 == this.aBoolean65) {
			return;
		}
		if (this.aClass2_Sub26_Sub5_1 == null) {
			return;
		}
		Static270.aClass2_Sub26_Sub4_2.method7390(this.aClass2_Sub26_Sub5_1);
		this.aClass2_Sub44_Sub1_2 = null;
		this.aClass2_Sub26_Sub5_1 = null;
		this.aClass2_Sub46_2 = null;
	}
}
