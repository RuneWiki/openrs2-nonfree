import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!mda", name = "K", descriptor = "Lclient!bi;")
	public Class4_Sub2_Sub1_Sub2_Sub1 aClass4_Sub2_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
	public int anInt6453;

	@OriginalMember(owner = "client!mda", name = "J", descriptor = "I")
	public int anInt6454;

	@OriginalMember(owner = "client!mda", name = "y", descriptor = "I")
	public int anInt6455;

	@OriginalMember(owner = "client!mda", name = "L", descriptor = "I")
	public int anInt6456;

	@OriginalMember(owner = "client!mda", name = "v", descriptor = "Lclient!di;")
	public Class2_Sub17 aClass2_Sub17_2;

	@OriginalMember(owner = "client!mda", name = "T", descriptor = "[I")
	public int[] anIntArray446;

	@OriginalMember(owner = "client!mda", name = "X", descriptor = "I")
	public int anInt6457;

	@OriginalMember(owner = "client!mda", name = "E", descriptor = "Lclient!kda;")
	public Class2_Sub23_Sub2 aClass2_Sub23_Sub2_3;

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
	public int anInt6458;

	@OriginalMember(owner = "client!mda", name = "R", descriptor = "Z")
	public boolean aBoolean544;

	@OriginalMember(owner = "client!mda", name = "Q", descriptor = "I")
	public int anInt6459;

	@OriginalMember(owner = "client!mda", name = "H", descriptor = "Lclient!dga;")
	public Class81 aClass81_1;

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "Lclient!kda;")
	public Class2_Sub23_Sub2 aClass2_Sub23_Sub2_4;

	@OriginalMember(owner = "client!mda", name = "C", descriptor = "Lclient!efa;")
	public Class4_Sub2_Sub1_Sub2_Sub2 aClass4_Sub2_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!mda", name = "q", descriptor = "Z")
	public boolean aBoolean545;

	@OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
	public int anInt6460;

	@OriginalMember(owner = "client!mda", name = "B", descriptor = "I")
	public int anInt6461;

	@OriginalMember(owner = "client!mda", name = "U", descriptor = "Z")
	public boolean aBoolean546;

	@OriginalMember(owner = "client!mda", name = "M", descriptor = "I")
	public int anInt6462;

	@OriginalMember(owner = "client!mda", name = "F", descriptor = "Lclient!di;")
	public Class2_Sub17 aClass2_Sub17_3;

	@OriginalMember(owner = "client!mda", name = "N", descriptor = "I")
	public int anInt6464;

	@OriginalMember(owner = "client!mda", name = "O", descriptor = "I")
	public int anInt6465;

	@OriginalMember(owner = "client!mda", name = "S", descriptor = "Lclient!rb;")
	public Class2_Sub4_Sub1 aClass2_Sub4_Sub1_3;

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
	public int anInt6466;

	@OriginalMember(owner = "client!mda", name = "Y", descriptor = "Lclient!rb;")
	public Class2_Sub4_Sub1 aClass2_Sub4_Sub1_4;

	@OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
	public int anInt6467;

	@OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
	public int anInt6463 = 0;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
	public void method5816() {
		@Pc(8) int local8 = this.anInt6458;
		@Pc(19) boolean local19 = this.aBoolean546;
		if (this.aClass81_1 != null) {
			@Pc(38) Class81 local38 = this.aClass81_1.method1629(Static166.anInt2884 == 3 ? Static498.anInterface26_3 : Static396.aClass107_1);
			if (local38 == null) {
				this.anInt6464 = 0;
				this.anIntArray446 = null;
				this.aBoolean546 = false;
				this.anInt6466 = 0;
				this.anInt6457 = 256;
				this.aBoolean545 = false;
				this.anInt6456 = 0;
				this.anInt6458 = -1;
				this.anInt6453 = 256;
				this.anInt6459 = 0;
				this.anInt6461 = 0;
			} else {
				this.aBoolean546 = local38.aBoolean219;
				this.aBoolean545 = local38.aBoolean225;
				this.anInt6456 = local38.anInt1876;
				this.anIntArray446 = local38.anIntArray141;
				this.anInt6458 = local38.anInt1856;
				this.anInt6461 = local38.anInt1857;
				this.anInt6457 = local38.anInt1858;
				this.anInt6466 = local38.anInt1898;
				this.anInt6453 = local38.anInt1905;
				this.anInt6464 = local38.anInt1883 << 9;
			}
		} else if (this.aClass4_Sub2_Sub1_Sub2_Sub2_2 != null) {
			@Pc(174) int local174 = Static461.method6669(this.aClass4_Sub2_Sub1_Sub2_Sub2_2);
			if (local8 != local174) {
				this.anInt6458 = local174;
				@Pc(184) Class261 local184 = this.aClass4_Sub2_Sub1_Sub2_Sub2_2.aClass261_1;
				if (local184.anIntArray499 != null) {
					local184 = local184.method6272(Static396.aClass107_1);
				}
				if (local184 == null) {
					this.aBoolean546 = this.aClass4_Sub2_Sub1_Sub2_Sub2_2.aClass261_1.aBoolean591;
					this.anInt6461 = this.anInt6464 = this.anInt6459 = 0;
					this.anInt6457 = 256;
					this.anInt6453 = 256;
				} else {
					this.anInt6459 = local184.anInt7028 << 9;
					this.anInt6464 = local184.anInt7009 << 9;
					this.anInt6461 = local184.anInt7027;
					this.aBoolean546 = local184.aBoolean591;
					this.anInt6453 = local184.anInt7036;
					this.anInt6457 = local184.anInt7014;
				}
			}
		} else if (this.aClass4_Sub2_Sub1_Sub2_Sub1_3 != null) {
			this.anInt6458 = Static564.method7853(this.aClass4_Sub2_Sub1_Sub2_Sub1_3);
			this.anInt6457 = 256;
			this.anInt6459 = 0;
			this.anInt6461 = this.aClass4_Sub2_Sub1_Sub2_Sub1_3.anInt818;
			this.aBoolean546 = this.aClass4_Sub2_Sub1_Sub2_Sub1_3.aBoolean100;
			this.anInt6464 = this.aClass4_Sub2_Sub1_Sub2_Sub1_3.anInt842 << 9;
			this.anInt6453 = 256;
		}
		if (local8 == this.anInt6458 && local19 == this.aBoolean546) {
			return;
		}
		if (this.aClass2_Sub23_Sub2_3 == null) {
			return;
		}
		Static130.aClass2_Sub23_Sub3_1.method6797(this.aClass2_Sub23_Sub2_3);
		this.aClass2_Sub17_3 = null;
		this.aClass2_Sub23_Sub2_3 = null;
		this.aClass2_Sub4_Sub1_4 = null;
	}
}
