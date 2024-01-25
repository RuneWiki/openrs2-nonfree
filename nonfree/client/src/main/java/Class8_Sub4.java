import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!vc;")
	public Class352 aClass352_1;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "Z")
	public boolean aBoolean99;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "Z")
	public boolean aBoolean100;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "I")
	public int anInt1045;

	@OriginalMember(owner = "client!at", name = "p", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!at", name = "q", descriptor = "Lclient!cr;")
	public Class8_Sub13 aClass8_Sub13_1;

	@OriginalMember(owner = "client!at", name = "r", descriptor = "Lclient!cr;")
	public Class8_Sub13 aClass8_Sub13_2;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "I")
	public int anInt1047;

	@OriginalMember(owner = "client!at", name = "t", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "I")
	public int anInt1049;

	@OriginalMember(owner = "client!at", name = "v", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "I")
	public int anInt1050;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "I")
	public int anInt1051;

	@OriginalMember(owner = "client!at", name = "z", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!at", name = "A", descriptor = "I")
	public int anInt1054;

	@OriginalMember(owner = "client!at", name = "B", descriptor = "Lclient!efa;")
	public Class15_Sub1_Sub2_Sub2_Sub1 aClass15_Sub1_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!at", name = "C", descriptor = "I")
	public int anInt1055;

	@OriginalMember(owner = "client!at", name = "D", descriptor = "Lclient!ps;")
	public Class8_Sub16_Sub3 aClass8_Sub16_Sub3_1;

	@OriginalMember(owner = "client!at", name = "E", descriptor = "Lclient!cba;")
	public Class8_Sub9_Sub1 aClass8_Sub9_Sub1_1;

	@OriginalMember(owner = "client!at", name = "F", descriptor = "Lclient!pk;")
	public Class15_Sub1_Sub2_Sub2_Sub2 aClass15_Sub1_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!at", name = "G", descriptor = "Z")
	public boolean aBoolean101;

	@OriginalMember(owner = "client!at", name = "H", descriptor = "I")
	public int anInt1056;

	@OriginalMember(owner = "client!at", name = "I", descriptor = "Lclient!cba;")
	public Class8_Sub9_Sub1 aClass8_Sub9_Sub1_2;

	@OriginalMember(owner = "client!at", name = "M", descriptor = "I")
	public int anInt1058;

	@OriginalMember(owner = "client!at", name = "N", descriptor = "I")
	public int anInt1059;

	@OriginalMember(owner = "client!at", name = "O", descriptor = "Lclient!ps;")
	public Class8_Sub16_Sub3 aClass8_Sub16_Sub3_2;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "I")
	public int anInt1044 = 0;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public void method976() {
		@Pc(14) int local14 = this.anInt1055;
		@Pc(17) boolean local17 = this.aBoolean101;
		if (this.aClass352_1 != null) {
			@Pc(132) Class352 local132 = this.aClass352_1.method8164(Static420.aClass77_1);
			if (local132 == null) {
				this.aBoolean101 = false;
				this.anIntArray31 = null;
				this.anInt1048 = 0;
				this.anInt1051 = 256;
				this.anInt1045 = 0;
				this.anInt1053 = 256;
				this.anInt1058 = 0;
				this.aBoolean99 = false;
				this.anInt1055 = -1;
				this.anInt1050 = 0;
			} else {
				this.anInt1051 = local132.anInt10089;
				this.anInt1055 = local132.anInt10113;
				this.aBoolean101 = local132.aBoolean722;
				this.anIntArray31 = local132.anIntArray589;
				this.anInt1058 = local132.anInt10133;
				this.anInt1053 = local132.anInt10085;
				this.aBoolean99 = local132.aBoolean721;
				this.anInt1045 = local132.anInt10083 << 9;
				this.anInt1048 = local132.anInt10114;
				this.anInt1050 = local132.anInt10123;
			}
		} else if (this.aClass15_Sub1_Sub2_Sub2_Sub2_1 != null) {
			@Pc(28) int local28 = Static627.method8455(this.aClass15_Sub1_Sub2_Sub2_Sub2_1);
			if (local28 != local14) {
				this.anInt1055 = local28;
				@Pc(38) Class300 local38 = this.aClass15_Sub1_Sub2_Sub2_Sub2_1.aClass300_1;
				if (local38.anIntArray498 != null) {
					local38 = local38.method7306(Static420.aClass77_1);
				}
				if (local38 == null) {
					this.aBoolean101 = this.aClass15_Sub1_Sub2_Sub2_Sub2_1.aClass300_1.aBoolean632;
					this.anInt1053 = 256;
					this.anInt1048 = this.anInt1045 = 0;
					this.anInt1051 = 256;
				} else {
					this.anInt1045 = local38.anInt8904 << 9;
					this.anInt1053 = local38.anInt8902;
					this.anInt1048 = local38.anInt8889;
					this.aBoolean101 = local38.aBoolean632;
					this.anInt1051 = local38.anInt8897;
				}
			}
		} else if (this.aClass15_Sub1_Sub2_Sub2_Sub1_1 != null) {
			this.anInt1055 = Static122.method2760(this.aClass15_Sub1_Sub2_Sub2_Sub1_1);
			this.anInt1053 = 256;
			this.anInt1045 = this.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt3307 << 9;
			this.anInt1048 = this.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt3285;
			this.anInt1051 = 256;
			this.aBoolean101 = this.aClass15_Sub1_Sub2_Sub2_Sub1_1.aBoolean250;
		}
		if (local14 == this.anInt1055 && this.aBoolean101 == local17) {
			return;
		}
		if (this.aClass8_Sub16_Sub3_2 == null) {
			return;
		}
		Static15.aClass8_Sub16_Sub5_1.method7443(this.aClass8_Sub16_Sub3_2);
		this.aClass8_Sub9_Sub1_1 = null;
		this.aClass8_Sub13_1 = null;
		this.aClass8_Sub16_Sub3_2 = null;
	}
}
