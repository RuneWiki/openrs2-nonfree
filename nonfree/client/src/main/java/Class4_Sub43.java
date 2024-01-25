import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class4_Sub43 extends Class4 {

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
	public int anInt8721;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "Lclient!lc;")
	public Class4_Sub21_Sub2 aClass4_Sub21_Sub2_2;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
	public int anInt8722;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "[I")
	public int[] anIntArray513;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
	public int anInt8723;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "Lclient!tk;")
	public Class4_Sub42_Sub1 aClass4_Sub42_Sub1_2;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
	public int anInt8724;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
	public int anInt8725;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "Lclient!nf;")
	public Class233 aClass233_1;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
	public int anInt8726;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
	public boolean aBoolean612;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
	public int anInt8727;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
	public int anInt8728;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "Z")
	public boolean aBoolean613;

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "Lclient!ee;")
	public Class4_Sub12 aClass4_Sub12_2;

	@OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
	public int anInt8731;

	@OriginalMember(owner = "client!rj", name = "K", descriptor = "Lclient!hw;")
	public Class21_Sub1_Sub1_Sub1_Sub2 aClass21_Sub1_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
	public int anInt8732;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
	public int anInt8733;

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "Lclient!tk;")
	public Class4_Sub42_Sub1 aClass4_Sub42_Sub1_3;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
	public int anInt8735;

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "Lclient!ee;")
	public Class4_Sub12 aClass4_Sub12_3;

	@OriginalMember(owner = "client!rj", name = "S", descriptor = "Lclient!lc;")
	public Class4_Sub21_Sub2 aClass4_Sub21_Sub2_3;

	@OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
	public int anInt8736;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "Lclient!d;")
	public Class21_Sub1_Sub1_Sub1_Sub1 aClass21_Sub1_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!rj", name = "W", descriptor = "Z")
	public boolean aBoolean614;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	public int anInt8729 = 0;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
	public void method6719() {
		@Pc(8) int local8 = this.anInt8723;
		@Pc(11) boolean local11 = this.aBoolean613;
		if (this.aClass233_1 != null) {
			@Pc(20) Class233 local20 = this.aClass233_1.method5295(Static523.aClass173_1);
			if (local20 == null) {
				this.anInt8736 = 0;
				this.anInt8725 = 0;
				this.aBoolean614 = false;
				this.aBoolean613 = false;
				this.anInt8727 = 0;
				this.anInt8723 = -1;
				this.anInt8724 = 0;
				this.anIntArray513 = null;
				this.anInt8731 = 256;
				this.anInt8728 = 256;
			} else {
				this.anInt8731 = local20.anInt6696;
				this.anInt8728 = local20.anInt6667;
				this.aBoolean614 = local20.aBoolean468;
				this.anInt8736 = local20.anInt6707;
				this.aBoolean613 = local20.aBoolean459;
				this.anInt8727 = local20.anInt6719;
				this.anInt8723 = local20.anInt6698;
				this.anIntArray513 = local20.anIntArray375;
				this.anInt8725 = local20.anInt6702;
				this.anInt8724 = local20.anInt6680 << 9;
			}
		} else if (this.aClass21_Sub1_Sub1_Sub1_Sub1_2 != null) {
			@Pc(140) int local140 = Static26.method904(this.aClass21_Sub1_Sub1_Sub1_Sub1_2);
			if (local8 != local140) {
				this.anInt8723 = local140;
				@Pc(150) Class51 local150 = this.aClass21_Sub1_Sub1_Sub1_Sub1_2.aClass51_1;
				if (local150.anIntArray61 != null) {
					local150 = local150.method1371(Static523.aClass173_1);
				}
				if (local150 == null) {
					this.aBoolean613 = this.aClass21_Sub1_Sub1_Sub1_Sub1_2.aClass51_1.aBoolean129;
					this.anInt8728 = 256;
					this.anInt8731 = 256;
					this.anInt8725 = this.anInt8724 = 0;
				} else {
					this.anInt8724 = local150.anInt1597 << 9;
					this.aBoolean613 = local150.aBoolean129;
					this.anInt8728 = local150.anInt1617;
					this.anInt8731 = local150.anInt1596;
					this.anInt8725 = local150.anInt1604;
				}
			}
		} else if (this.aClass21_Sub1_Sub1_Sub1_Sub2_3 != null) {
			this.anInt8723 = Static124.method2269(this.aClass21_Sub1_Sub1_Sub1_Sub2_3);
			this.anInt8731 = 256;
			this.aBoolean613 = this.aClass21_Sub1_Sub1_Sub1_Sub2_3.aBoolean301;
			this.anInt8728 = 256;
			this.anInt8725 = this.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4297;
			this.anInt8724 = this.aClass21_Sub1_Sub1_Sub1_Sub2_3.anInt4308 << 9;
		}
		if (this.anInt8723 == local8 && local11 == this.aBoolean613) {
			return;
		}
		if (this.aClass4_Sub21_Sub2_3 == null) {
			return;
		}
		Static472.aClass4_Sub21_Sub3_2.method5931(this.aClass4_Sub21_Sub2_3);
		this.aClass4_Sub12_2 = null;
		this.aClass4_Sub42_Sub1_3 = null;
		this.aClass4_Sub21_Sub2_3 = null;
	}
}
