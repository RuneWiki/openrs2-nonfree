import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class2_Sub46 extends Class2 {

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "Lclient!or;")
	public Class2_Sub12_Sub3 aClass2_Sub12_Sub3_3;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
	public int anInt8975;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
	public int anInt8976;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
	public int anInt8977;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
	public int anInt8978;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "Lclient!lk;")
	public Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
	public int anInt8979;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "Lclient!or;")
	public Class2_Sub12_Sub3 aClass2_Sub12_Sub3_4;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
	public int anInt8980;

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "Z")
	public boolean aBoolean645;

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "Lclient!ih;")
	public Class129 aClass129_1;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
	public int anInt8984;

	@OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
	public int anInt8987;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	public int anInt8988;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
	public int anInt8990;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "[I")
	public int[] anIntArray690;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
	public int anInt8991;

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "Lclient!hca;")
	public Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
	public int anInt8986 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public void method7509() {
		@Pc(8) int local8 = this.anInt8977;
		if (this.aClass129_1 != null) {
			@Pc(17) Class129 local17 = this.aClass129_1.method3276(Static84.aClass302_1);
			if (local17 == null) {
				this.anInt8988 = 0;
				this.anInt8987 = 0;
				this.anInt8980 = 0;
				this.anIntArray690 = null;
				this.anInt8975 = 0;
				this.anInt8977 = -1;
			} else {
				this.anInt8988 = local17.anInt3683 << 7;
				this.anIntArray690 = local17.anIntArray395;
				this.anInt8987 = local17.anInt3698;
				this.anInt8977 = local17.anInt3691;
				this.anInt8975 = local17.anInt3667;
				this.anInt8980 = local17.anInt3681;
			}
		} else if (this.aClass1_Sub1_Sub2_Sub2_2 != null) {
			@Pc(75) int local75 = Static148.method2582(this.aClass1_Sub1_Sub2_Sub2_2);
			if (local8 != local75) {
				this.anInt8977 = local75;
				@Pc(89) Class12 local89 = this.aClass1_Sub1_Sub2_Sub2_2.aClass12_1;
				if (local89.anIntArray21 != null) {
					local89 = local89.method455(Static84.aClass302_1);
				}
				if (local89 == null) {
					this.anInt8980 = this.anInt8988 = 0;
				} else {
					this.anInt8988 = local89.anInt328 << 7;
					this.anInt8980 = local89.anInt343;
				}
			}
		} else if (this.aClass1_Sub1_Sub2_Sub1_2 != null) {
			this.anInt8977 = Static215.method6796(this.aClass1_Sub1_Sub2_Sub1_2);
			this.anInt8988 = this.aClass1_Sub1_Sub2_Sub1_2.anInt3255 << 7;
			this.anInt8980 = this.aClass1_Sub1_Sub2_Sub1_2.anInt3269;
		}
		if (local8 != this.anInt8977 && this.aClass2_Sub12_Sub3_4 != null) {
			Static288.aClass2_Sub12_Sub2_5.method2088(this.aClass2_Sub12_Sub3_4);
			this.aClass2_Sub12_Sub3_4 = null;
		}
	}
}
