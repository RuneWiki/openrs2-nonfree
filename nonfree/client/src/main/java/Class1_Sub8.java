import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!c", name = "l", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!rc;")
	public Class1_Sub24_Sub2 aClass1_Sub24_Sub2_1;

	@OriginalMember(owner = "client!c", name = "y", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "Z")
	public boolean aBoolean20;

	@OriginalMember(owner = "client!c", name = "D", descriptor = "Lclient!rc;")
	public Class1_Sub24_Sub2 aClass1_Sub24_Sub2_2;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "Lclient!o;")
	public Class15_Sub5_Sub1 aClass15_Sub5_Sub1_1;

	@OriginalMember(owner = "client!c", name = "F", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "Lclient!wf;")
	public Class15_Sub5_Sub2 aClass15_Sub5_Sub2_1;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "Lclient!ia;")
	public Class71 aClass71_1;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	public int anInt506 = 0;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	public void method471() {
		@Pc(8) int local8 = this.anInt512;
		if (this.aClass71_1 != null) {
			@Pc(22) Class71 local22 = this.aClass71_1.method2039();
			if (local22 == null) {
				this.anInt523 = 0;
				this.anIntArray29 = null;
				this.anInt512 = -1;
				this.anInt513 = 0;
				this.anInt510 = 0;
				this.anInt515 = 0;
			} else {
				this.anInt512 = local22.anInt2351;
				this.anInt523 = local22.anInt2379;
				this.anInt513 = local22.anInt2345;
				this.anInt515 = local22.anInt2386;
				this.anInt510 = local22.anInt2355 * 128;
				this.anIntArray29 = local22.anIntArray208;
			}
		} else if (this.aClass15_Sub5_Sub1_1 != null) {
			@Pc(81) int local81 = Static210.method3344(this.aClass15_Sub5_Sub1_1);
			if (local81 != local8) {
				this.anInt512 = local81;
				@Pc(96) Class99 local96 = this.aClass15_Sub5_Sub1_1.aClass99_1;
				if (local96.anIntArray255 != null) {
					local96 = local96.method2647();
				}
				if (local96 == null) {
					this.anInt523 = this.anInt510 = 0;
				} else {
					this.anInt523 = local96.anInt3049;
					this.anInt510 = local96.anInt3075 * 128;
				}
			}
		} else if (this.aClass15_Sub5_Sub2_1 != null) {
			this.anInt512 = Static84.method1586(this.aClass15_Sub5_Sub2_1);
			this.anInt510 = this.aClass15_Sub5_Sub2_1.anInt5607 * 128;
			this.anInt523 = this.aClass15_Sub5_Sub2_1.anInt5623;
		}
		if (local8 != this.anInt512 && this.aClass1_Sub24_Sub2_1 != null) {
			Static205.aClass1_Sub24_Sub3_1.method4518(this.aClass1_Sub24_Sub2_1);
			this.aClass1_Sub24_Sub2_1 = null;
		}
	}
}
