import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Lclient!ct;")
	public Class2_Sub14_Sub1 aClass2_Sub14_Sub1_2;

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	public int anInt5402;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public int anInt5403;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "Z")
	public boolean aBoolean400;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "Lclient!cc;")
	public Class16_Sub1_Sub1_Sub3_Sub1 aClass16_Sub1_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "I")
	public int anInt5404;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "I")
	public int anInt5406;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	public int anInt5407;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "I")
	public int anInt5408;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "I")
	public int anInt5409;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "I")
	public int anInt5412;

	@OriginalMember(owner = "client!km", name = "y", descriptor = "I")
	public int anInt5413;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "Lclient!ac;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!km", name = "A", descriptor = "I")
	public int anInt5414;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!km", name = "C", descriptor = "I")
	public int anInt5415;

	@OriginalMember(owner = "client!km", name = "E", descriptor = "Lclient!gs;")
	public Class2_Sub11_Sub4 aClass2_Sub11_Sub4_2;

	@OriginalMember(owner = "client!km", name = "F", descriptor = "Lclient!rm;")
	public Class2_Sub38 aClass2_Sub38_1;

	@OriginalMember(owner = "client!km", name = "G", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!km", name = "H", descriptor = "I")
	public int anInt5418;

	@OriginalMember(owner = "client!km", name = "I", descriptor = "Lclient!rm;")
	public Class2_Sub38 aClass2_Sub38_2;

	@OriginalMember(owner = "client!km", name = "J", descriptor = "Z")
	public boolean aBoolean402;

	@OriginalMember(owner = "client!km", name = "K", descriptor = "I")
	public int anInt5419;

	@OriginalMember(owner = "client!km", name = "L", descriptor = "Lclient!ct;")
	public Class2_Sub14_Sub1 aClass2_Sub14_Sub1_3;

	@OriginalMember(owner = "client!km", name = "M", descriptor = "Lclient!gs;")
	public Class2_Sub11_Sub4 aClass2_Sub11_Sub4_3;

	@OriginalMember(owner = "client!km", name = "N", descriptor = "Lclient!rl;")
	public Class16_Sub1_Sub1_Sub3_Sub2 aClass16_Sub1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "I")
	public int anInt5410 = 0;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public void method4738() {
		@Pc(6) int local6 = this.anInt5417;
		@Pc(9) boolean local9 = this.aBoolean402;
		if (this.aClass5_1 != null) {
			@Pc(137) Class5 local137 = this.aClass5_1.method77(Static382.aClass282_1);
			if (local137 == null) {
				this.aBoolean400 = false;
				this.anInt5403 = 0;
				this.anInt5402 = 0;
				this.aBoolean402 = false;
				this.anInt5407 = 0;
				this.anInt5417 = -1;
				this.anInt5413 = 0;
				this.anInt5406 = 256;
				this.anInt5419 = 256;
				this.anIntArray344 = null;
				this.anInt5412 = 0;
			} else {
				this.anInt5417 = local137.anInt107;
				this.anInt5413 = local137.anInt103;
				this.anInt5419 = local137.anInt94;
				this.anInt5407 = local137.anInt92;
				this.aBoolean402 = local137.aBoolean15;
				this.anInt5412 = local137.anInt80;
				this.anIntArray344 = local137.anIntArray12;
				this.anInt5406 = local137.anInt75;
				this.anInt5403 = local137.anInt99 << 9;
				this.aBoolean400 = local137.aBoolean13;
			}
		} else if (this.aClass16_Sub1_Sub1_Sub3_Sub1_1 != null) {
			@Pc(20) int local20 = Static317.method4870(this.aClass16_Sub1_Sub1_Sub3_Sub1_1);
			if (local6 != local20) {
				this.anInt5417 = local20;
				@Pc(34) Class113 local34 = this.aClass16_Sub1_Sub1_Sub3_Sub1_1.aClass113_1;
				if (local34.anIntArray213 != null) {
					local34 = local34.method2752(Static382.aClass282_1);
				}
				if (local34 == null) {
					this.anInt5419 = 256;
					this.anInt5412 = this.anInt5403 = this.anInt5402 = 0;
					this.aBoolean402 = this.aClass16_Sub1_Sub1_Sub3_Sub1_1.aClass113_1.aBoolean251;
					this.anInt5406 = 256;
				} else {
					this.aBoolean402 = local34.aBoolean251;
					this.anInt5412 = local34.anInt3217;
					this.anInt5402 = local34.anInt3204 << 9;
					this.anInt5403 = local34.anInt3220 << 9;
					this.anInt5419 = local34.anInt3205;
					this.anInt5406 = local34.anInt3216;
				}
			}
		} else if (this.aClass16_Sub1_Sub1_Sub3_Sub2_2 != null) {
			this.anInt5417 = Static84.method1794(this.aClass16_Sub1_Sub1_Sub3_Sub2_2);
			this.anInt5419 = 256;
			this.anInt5406 = 256;
			this.aBoolean402 = this.aClass16_Sub1_Sub1_Sub3_Sub2_2.aBoolean594;
			this.anInt5402 = 0;
			this.anInt5403 = this.aClass16_Sub1_Sub1_Sub3_Sub2_2.anInt8153 << 9;
			this.anInt5412 = this.aClass16_Sub1_Sub1_Sub3_Sub2_2.anInt8141;
		}
		if (local6 == this.anInt5417 && local9 == this.aBoolean402) {
			return;
		}
		if (this.aClass2_Sub11_Sub4_3 == null) {
			return;
		}
		Static622.aClass2_Sub11_Sub2_2.method2950(this.aClass2_Sub11_Sub4_3);
		this.aClass2_Sub38_1 = null;
		this.aClass2_Sub14_Sub1_2 = null;
		this.aClass2_Sub11_Sub4_3 = null;
	}
}
