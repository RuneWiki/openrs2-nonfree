import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class4_Sub36 extends Class4 {

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
	public int anInt8119;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
	public int anInt8120;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
	public int anInt8121;

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	public int anInt8122;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "[I")
	public int[] anIntArray423;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "Lclient!ep;")
	public Class4_Sub16_Sub1 aClass4_Sub16_Sub1_1;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	public int anInt8123;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
	public int anInt8125;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "Lclient!pp;")
	public Class4_Sub7_Sub4 aClass4_Sub7_Sub4_1;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
	public int anInt8126;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Lclient!ep;")
	public Class4_Sub16_Sub1 aClass4_Sub16_Sub1_2;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "Z")
	public boolean aBoolean563;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
	public int anInt8127;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "Z")
	public boolean aBoolean564;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "Lclient!uca;")
	public Class4_Sub47 aClass4_Sub47_1;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Lclient!pp;")
	public Class4_Sub7_Sub4 aClass4_Sub7_Sub4_2;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
	public int anInt8129;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "Lclient!kfa;")
	public Class1_Sub4_Sub2_Sub1_Sub1 aClass1_Sub4_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "Lclient!uca;")
	public Class4_Sub47 aClass4_Sub47_2;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "Lclient!fga;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	public int anInt8131;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "Lclient!rda;")
	public Class1_Sub4_Sub2_Sub1_Sub2 aClass1_Sub4_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "Z")
	public boolean aBoolean565;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
	public int anInt8132;

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
	public int anInt8133;

	@OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
	public int anInt8134;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
	public int anInt8118 = 0;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	public void method6756() {
		@Pc(8) int local8 = this.anInt8133;
		@Pc(11) boolean local11 = this.aBoolean564;
		if (this.aClass101_1 != null) {
			@Pc(20) Class101 local20 = this.aClass101_1.method2710(Static45.aClass148_1);
			if (local20 == null) {
				this.anInt8121 = 256;
				this.anInt8127 = 0;
				this.anInt8134 = 0;
				this.aBoolean565 = false;
				this.anInt8122 = 0;
				this.anInt8120 = 0;
				this.anIntArray423 = null;
				this.anInt8133 = -1;
				this.aBoolean564 = false;
				this.anInt8126 = 256;
			} else {
				this.anInt8120 = local20.anInt2967;
				this.aBoolean565 = local20.aBoolean224;
				this.aBoolean564 = local20.aBoolean227;
				this.anInt8121 = local20.anInt2957;
				this.anInt8127 = local20.anInt2954 << 9;
				this.anInt8134 = local20.anInt2927;
				this.anIntArray423 = local20.anIntArray139;
				this.anInt8126 = local20.anInt2965;
				this.anInt8133 = local20.anInt2973;
				this.anInt8122 = local20.anInt2961;
			}
		} else if (this.aClass1_Sub4_Sub2_Sub1_Sub1_2 != null) {
			@Pc(140) int local140 = Static533.method7755(this.aClass1_Sub4_Sub2_Sub1_Sub1_2);
			if (local8 != local140) {
				this.anInt8133 = local140;
				@Pc(154) Class283 local154 = this.aClass1_Sub4_Sub2_Sub1_Sub1_2.aClass283_1;
				if (local154.anIntArray453 != null) {
					local154 = local154.method6834(Static45.aClass148_1);
				}
				if (local154 == null) {
					this.anInt8122 = this.anInt8127 = 0;
					this.aBoolean564 = this.aClass1_Sub4_Sub2_Sub1_Sub1_2.aClass283_1.aBoolean572;
					this.anInt8121 = 256;
					this.anInt8126 = 256;
				} else {
					this.anInt8121 = local154.anInt8237;
					this.anInt8122 = local154.anInt8243;
					this.anInt8127 = local154.anInt8231 << 9;
					this.anInt8126 = local154.anInt8272;
					this.aBoolean564 = local154.aBoolean572;
				}
			}
		} else if (this.aClass1_Sub4_Sub2_Sub1_Sub2_2 != null) {
			this.anInt8133 = Static434.method6771(this.aClass1_Sub4_Sub2_Sub1_Sub2_2);
			this.anInt8122 = this.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8485;
			this.aBoolean564 = this.aClass1_Sub4_Sub2_Sub1_Sub2_2.aBoolean597;
			this.anInt8127 = this.aClass1_Sub4_Sub2_Sub1_Sub2_2.anInt8454 << 9;
			this.anInt8126 = 256;
			this.anInt8121 = 256;
		}
		if (local8 == this.anInt8133 && this.aBoolean564 == local11) {
			return;
		}
		if (this.aClass4_Sub7_Sub4_1 == null) {
			return;
		}
		Static444.aClass4_Sub7_Sub1_2.method400(this.aClass4_Sub7_Sub4_1);
		this.aClass4_Sub47_2 = null;
		this.aClass4_Sub16_Sub1_1 = null;
		this.aClass4_Sub7_Sub4_1 = null;
	}
}
