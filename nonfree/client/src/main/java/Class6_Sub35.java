import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class6_Sub35 extends Class6 {

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "Z")
	public boolean aBoolean375;

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
	public int anInt5736;

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "Lclient!wu;")
	public Class6_Sub8_Sub5 aClass6_Sub8_Sub5_2;

	@OriginalMember(owner = "client!lea", name = "o", descriptor = "Lclient!fk;")
	public Class6_Sub21_Sub1 aClass6_Sub21_Sub1_2;

	@OriginalMember(owner = "client!lea", name = "q", descriptor = "I")
	public int anInt5738;

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
	public int anInt5739;

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "Z")
	public boolean aBoolean376;

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
	public int anInt5740;

	@OriginalMember(owner = "client!lea", name = "u", descriptor = "Lclient!kf;")
	public Class2_Sub1_Sub1_Sub3_Sub2 aClass2_Sub1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "Lclient!ib;")
	public Class2_Sub1_Sub1_Sub3_Sub1 aClass2_Sub1_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
	public int anInt5741;

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
	public int anInt5742;

	@OriginalMember(owner = "client!lea", name = "y", descriptor = "Lclient!ro;")
	public Class308 aClass308_1;

	@OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
	public int anInt5743;

	@OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
	public int anInt5744;

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!lea", name = "E", descriptor = "Lclient!fk;")
	public Class6_Sub21_Sub1 aClass6_Sub21_Sub1_3;

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
	public int anInt5746;

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "Z")
	public boolean aBoolean377;

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "I")
	public int anInt5747;

	@OriginalMember(owner = "client!lea", name = "I", descriptor = "Lclient!qw;")
	public Class6_Sub46 aClass6_Sub46_1;

	@OriginalMember(owner = "client!lea", name = "K", descriptor = "Lclient!wu;")
	public Class6_Sub8_Sub5 aClass6_Sub8_Sub5_3;

	@OriginalMember(owner = "client!lea", name = "L", descriptor = "Lclient!qw;")
	public Class6_Sub46 aClass6_Sub46_2;

	@OriginalMember(owner = "client!lea", name = "M", descriptor = "I")
	public int anInt5749;

	@OriginalMember(owner = "client!lea", name = "N", descriptor = "I")
	public int anInt5750;

	@OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
	public int anInt5751;

	@OriginalMember(owner = "client!lea", name = "P", descriptor = "I")
	public int anInt5752;

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
	public int anInt5737 = 0;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
	public void method4895() {
		@Pc(8) int local8 = this.anInt5742;
		@Pc(11) boolean local11 = this.aBoolean375;
		if (this.aClass308_1 != null) {
			@Pc(26) Class308 local26 = this.aClass308_1.method7297(Static659.aClass363_3);
			if (local26 == null) {
				this.anInt5743 = 256;
				this.anInt5750 = 0;
				this.aBoolean376 = false;
				this.anInt5749 = 0;
				this.anInt5746 = 0;
				this.anInt5747 = 0;
				this.aBoolean375 = false;
				this.anInt5739 = 256;
				this.anInt5738 = 0;
				this.anIntArray335 = null;
				this.anInt5742 = -1;
			} else {
				this.anIntArray335 = local26.anIntArray567;
				this.anInt5739 = local26.anInt8595;
				this.anInt5742 = local26.anInt8592;
				this.anInt5750 = local26.anInt8603;
				this.anInt5747 = local26.anInt8582;
				this.anInt5746 = local26.anInt8584 << 9;
				this.aBoolean376 = local26.aBoolean601;
				this.anInt5738 = local26.anInt8613;
				this.aBoolean375 = local26.aBoolean594;
				this.anInt5743 = local26.anInt8602;
			}
		} else if (this.aClass2_Sub1_Sub1_Sub3_Sub2_1 != null) {
			@Pc(115) int local115 = Static639.method8742(this.aClass2_Sub1_Sub1_Sub3_Sub2_1);
			if (local115 != local8) {
				this.anInt5742 = local115;
				@Pc(129) Class91 local129 = this.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass91_1;
				if (local129.anIntArray140 != null) {
					local129 = local129.method2036(Static659.aClass363_3);
				}
				if (local129 == null) {
					this.aBoolean375 = this.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass91_1.aBoolean148;
					this.anInt5739 = 256;
					this.anInt5738 = this.anInt5746 = this.anInt5749 = 0;
					this.anInt5743 = 256;
				} else {
					this.anInt5739 = local129.anInt2365;
					this.aBoolean375 = local129.aBoolean148;
					this.anInt5743 = local129.anInt2352;
					this.anInt5749 = local129.anInt2341 << 9;
					this.anInt5738 = local129.anInt2369;
					this.anInt5746 = local129.anInt2334 << 9;
				}
			}
		} else if (this.aClass2_Sub1_Sub1_Sub3_Sub1_1 != null) {
			this.anInt5742 = Static120.method1886(this.aClass2_Sub1_Sub1_Sub3_Sub1_1);
			this.anInt5739 = 256;
			this.anInt5743 = 256;
			this.anInt5749 = 0;
			this.aBoolean375 = this.aClass2_Sub1_Sub1_Sub3_Sub1_1.aBoolean256;
			this.anInt5746 = this.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt4177 << 9;
			this.anInt5738 = this.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt4174;
		}
		if (local8 == this.anInt5742 && this.aBoolean375 == local11) {
			return;
		}
		if (this.aClass6_Sub8_Sub5_2 == null) {
			return;
		}
		Static106.aClass6_Sub8_Sub3_2.method4258(this.aClass6_Sub8_Sub5_2);
		this.aClass6_Sub8_Sub5_2 = null;
		this.aClass6_Sub46_1 = null;
		this.aClass6_Sub21_Sub1_3 = null;
	}
}
