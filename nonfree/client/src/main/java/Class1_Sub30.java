import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	public int anInt5875;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Lclient!bga;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_3;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	public int anInt5877;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "Z")
	public boolean aBoolean421;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
	public int anInt5880;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "Lclient!pga;")
	public Class1_Sub38 aClass1_Sub38_2;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "Lclient!ql;")
	public Class1_Sub40_Sub1 aClass1_Sub40_Sub1_3;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	public int anInt5882;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
	public int anInt5884;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "Lclient!tc;")
	public Class306 aClass306_1;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "Z")
	public boolean aBoolean422;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	public int anInt5885;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Lclient!kba;")
	public Class20_Sub2_Sub4_Sub1_Sub1 aClass20_Sub2_Sub4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "Lclient!ql;")
	public Class1_Sub40_Sub1 aClass1_Sub40_Sub1_4;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	public int anInt5887;

	@OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
	public int anInt5888;

	@OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
	public int anInt5889;

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "Lclient!bga;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_4;

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
	public int anInt5890;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "Lclient!pga;")
	public Class1_Sub38 aClass1_Sub38_3;

	@OriginalMember(owner = "client!mk", name = "J", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
	public int anInt5891;

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "Lclient!nu;")
	public Class20_Sub2_Sub4_Sub1_Sub2 aClass20_Sub2_Sub4_Sub1_Sub2_1;

	@OriginalMember(owner = "client!mk", name = "N", descriptor = "Z")
	public boolean aBoolean423;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	public int anInt5881 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public void method4968() {
		@Pc(8) int local8 = this.anInt5877;
		@Pc(11) boolean local11 = this.aBoolean423;
		if (this.aClass306_1 != null) {
			@Pc(110) Class306 local110 = this.aClass306_1.method6966(Static121.aClass148_1);
			if (local110 == null) {
				this.anInt5887 = 0;
				this.aBoolean423 = false;
				this.anIntArray377 = null;
				this.anInt5890 = 0;
				this.aBoolean422 = false;
				this.anInt5889 = 0;
				this.anInt5882 = 0;
				this.anInt5877 = -1;
			} else {
				this.anInt5887 = local110.anInt8386;
				this.anInt5882 = local110.anInt8393 << 9;
				this.anInt5877 = local110.anInt8381;
				this.aBoolean423 = local110.aBoolean617;
				this.anIntArray377 = local110.anIntArray572;
				this.anInt5889 = local110.anInt8366;
				this.anInt5890 = local110.anInt8364;
				this.aBoolean422 = local110.aBoolean616;
			}
		} else if (this.aClass20_Sub2_Sub4_Sub1_Sub2_1 != null) {
			@Pc(22) int local22 = Static273.method4258(this.aClass20_Sub2_Sub4_Sub1_Sub2_1);
			if (local22 != local8) {
				this.anInt5877 = local22;
				@Pc(36) Class162 local36 = this.aClass20_Sub2_Sub4_Sub1_Sub2_1.aClass162_1;
				if (local36.anIntArray267 != null) {
					local36 = local36.method3802(Static121.aClass148_1);
				}
				if (local36 == null) {
					this.aBoolean423 = this.aClass20_Sub2_Sub4_Sub1_Sub2_1.aClass162_1.aBoolean351;
					this.anInt5889 = this.anInt5882 = 0;
				} else {
					this.anInt5882 = local36.anInt4422 << 9;
					this.anInt5889 = local36.anInt4410;
					this.aBoolean423 = local36.aBoolean351;
				}
			}
		} else if (this.aClass20_Sub2_Sub4_Sub1_Sub1_1 != null) {
			this.anInt5877 = Static269.method4224(this.aClass20_Sub2_Sub4_Sub1_Sub1_1);
			this.aBoolean423 = this.aClass20_Sub2_Sub4_Sub1_Sub1_1.aBoolean376;
			this.anInt5882 = this.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt4920 << 9;
			this.anInt5889 = this.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt4950;
		}
		if (this.anInt5877 == local8 && this.aBoolean423 == local11) {
			return;
		}
		if (this.aClass1_Sub8_Sub1_4 == null) {
			return;
		}
		Static298.aClass1_Sub8_Sub4_2.method6033(this.aClass1_Sub8_Sub1_4);
		this.aClass1_Sub40_Sub1_4 = null;
		this.aClass1_Sub38_3 = null;
		this.aClass1_Sub8_Sub1_4 = null;
	}
}
