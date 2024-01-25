import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class4_Sub51 extends Class4 {

	@OriginalMember(owner = "client!wda", name = "X", descriptor = "[Lclient!ge;")
	private static final Class118[] aClass118Array1 = new Class118[32];

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
	public int anInt9594;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Lclient!jda;")
	public Class4_Sub24 aClass4_Sub24_2;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "[I")
	public int[] anIntArray710;

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "Lclient!bd;")
	public Class25 aClass25_1;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
	public int anInt9596;

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "Lclient!st;")
	public Class10_Sub1_Sub2_Sub2 aClass10_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
	public int anInt9597;

	@OriginalMember(owner = "client!wda", name = "q", descriptor = "Z")
	public boolean aBoolean676;

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
	public int anInt9598;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
	public int anInt9599;

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "Lclient!fc;")
	public Class4_Sub16_Sub1 aClass4_Sub16_Sub1_3;

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "Lclient!hfa;")
	public Class10_Sub1_Sub2_Sub1 aClass10_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
	public int anInt9600;

	@OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
	public int anInt9601;

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "I")
	public int anInt9603;

	@OriginalMember(owner = "client!wda", name = "z", descriptor = "Lclient!fc;")
	public Class4_Sub16_Sub1 aClass4_Sub16_Sub1_4;

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "Lclient!jda;")
	public Class4_Sub24 aClass4_Sub24_3;

	@OriginalMember(owner = "client!wda", name = "B", descriptor = "I")
	public int anInt9604;

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "Z")
	public boolean aBoolean677;

	@OriginalMember(owner = "client!wda", name = "D", descriptor = "Lclient!in;")
	public Class4_Sub13_Sub2 aClass4_Sub13_Sub2_3;

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "Z")
	public boolean aBoolean678;

	@OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
	public int anInt9605;

	@OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
	public int anInt9606;

	@OriginalMember(owner = "client!wda", name = "I", descriptor = "Lclient!in;")
	public Class4_Sub13_Sub2 aClass4_Sub13_Sub2_4;

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
	public int anInt9595 = 0;

	static {
		@Pc(89) Class118[] local89 = Static293.method4589();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass118Array1[local89[local91].anInt3562] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)V")
	public void method7876() {
		@Pc(8) int local8 = this.anInt9598;
		@Pc(11) boolean local11 = this.aBoolean676;
		if (this.aClass25_1 != null) {
			@Pc(108) Class25 local108 = this.aClass25_1.method578(Static511.aClass335_2);
			if (local108 == null) {
				this.aBoolean677 = false;
				this.anInt9598 = -1;
				this.anInt9603 = 0;
				this.anIntArray710 = null;
				this.anInt9600 = 0;
				this.anInt9604 = 0;
				this.aBoolean676 = false;
				this.anInt9596 = 0;
			} else {
				this.anIntArray710 = local108.anIntArray116;
				this.anInt9598 = local108.anInt624;
				this.aBoolean676 = local108.aBoolean60;
				this.aBoolean677 = local108.aBoolean50;
				this.anInt9603 = local108.anInt625;
				this.anInt9604 = local108.anInt627 << 9;
				this.anInt9596 = local108.anInt639;
				this.anInt9600 = local108.anInt623;
			}
		} else if (this.aClass10_Sub1_Sub2_Sub1_2 != null) {
			@Pc(22) int local22 = Static145.method2998(this.aClass10_Sub1_Sub2_Sub1_2);
			if (local22 != local8) {
				this.anInt9598 = local22;
				@Pc(32) Class54 local32 = this.aClass10_Sub1_Sub2_Sub1_2.aClass54_1;
				if (local32.anIntArray150 != null) {
					local32 = local32.method1118(Static511.aClass335_2);
				}
				if (local32 == null) {
					this.anInt9603 = this.anInt9604 = 0;
					this.aBoolean676 = this.aClass10_Sub1_Sub2_Sub1_2.aClass54_1.aBoolean96;
				} else {
					this.anInt9604 = local32.anInt1293 << 9;
					this.anInt9603 = local32.anInt1259;
					this.aBoolean676 = local32.aBoolean96;
				}
			}
		} else if (this.aClass10_Sub1_Sub2_Sub2_2 != null) {
			this.anInt9598 = Static385.method5690(this.aClass10_Sub1_Sub2_Sub2_2);
			this.aBoolean676 = this.aClass10_Sub1_Sub2_Sub2_2.aBoolean595;
			this.anInt9603 = this.aClass10_Sub1_Sub2_Sub2_2.anInt8541;
			this.anInt9604 = this.aClass10_Sub1_Sub2_Sub2_2.anInt8562 << 9;
		}
		if ((this.anInt9598 != local8 || local11 != this.aBoolean676) && this.aClass4_Sub13_Sub2_3 != null) {
			Static430.aClass4_Sub13_Sub1_1.method2274(this.aClass4_Sub13_Sub2_3);
			this.aClass4_Sub16_Sub1_3 = null;
			this.aClass4_Sub24_3 = null;
			this.aClass4_Sub13_Sub2_3 = null;
		}
	}
}
