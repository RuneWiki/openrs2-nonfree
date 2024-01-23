import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!bh;")
	public Class4_Sub6_Sub1 aClass4_Sub6_Sub1_2;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
	public boolean aBoolean242;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	public int anInt3907;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "I")
	public int anInt3909;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "I")
	public int anInt3910;

	@OriginalMember(owner = "client!of", name = "v", descriptor = "I")
	public int anInt3911;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "I")
	public int anInt3912;

	@OriginalMember(owner = "client!of", name = "z", descriptor = "I")
	public int anInt3914;

	@OriginalMember(owner = "client!of", name = "A", descriptor = "Lclient!bh;")
	public Class4_Sub6_Sub1 aClass4_Sub6_Sub1_3;

	@OriginalMember(owner = "client!of", name = "B", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!of", name = "C", descriptor = "Lclient!qe;")
	public Class13_Sub5_Sub1 aClass13_Sub5_Sub1_2;

	@OriginalMember(owner = "client!of", name = "E", descriptor = "Lclient!ie;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!of", name = "G", descriptor = "Lclient!u;")
	public Class13_Sub5_Sub2 aClass13_Sub5_Sub2_1;

	@OriginalMember(owner = "client!of", name = "H", descriptor = "I")
	public int anInt3917;

	@OriginalMember(owner = "client!of", name = "J", descriptor = "I")
	public int anInt3919;

	@OriginalMember(owner = "client!of", name = "K", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "I")
	public int anInt3920;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	public int anInt3906 = 0;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public void method3178() {
		@Pc(14) int local14 = this.anInt3910;
		if (this.aClass73_1 != null) {
			@Pc(22) Class73 local22 = this.aClass73_1.method1899();
			if (local22 == null) {
				this.anInt3920 = 0;
				this.anInt3911 = 0;
				this.anInt3910 = -1;
				this.anInt3917 = 0;
				this.anInt3909 = 0;
				this.anIntArray309 = null;
			} else {
				this.anInt3917 = local22.anInt2264;
				this.anInt3910 = local22.anInt2258;
				this.anIntArray309 = local22.anIntArray193;
				this.anInt3911 = local22.anInt2271;
				this.anInt3920 = local22.anInt2249 * 128;
				this.anInt3909 = local22.anInt2251;
			}
		} else if (this.aClass13_Sub5_Sub2_1 != null) {
			@Pc(83) int local83 = Static160.method2584(this.aClass13_Sub5_Sub2_1);
			if (local83 != local14) {
				this.anInt3910 = local83;
				@Pc(98) Class185 local98 = this.aClass13_Sub5_Sub2_1.aClass185_1;
				if (local98.anIntArray466 != null) {
					local98 = local98.method4658();
				}
				if (local98 == null) {
					this.anInt3917 = this.anInt3920 = 0;
				} else {
					this.anInt3917 = local98.anInt5792;
					this.anInt3920 = local98.anInt5784 * 128;
				}
			}
		} else if (this.aClass13_Sub5_Sub1_2 != null) {
			this.anInt3910 = Static4.method66(this.aClass13_Sub5_Sub1_2);
			this.anInt3920 = this.aClass13_Sub5_Sub1_2.anInt4455 * 128;
			this.anInt3917 = this.aClass13_Sub5_Sub1_2.anInt4474;
		}
		if (local14 != this.anInt3910 && this.aClass4_Sub6_Sub1_3 != null) {
			Static10.aClass4_Sub6_Sub4_1.method3730(this.aClass4_Sub6_Sub1_3);
			this.aClass4_Sub6_Sub1_3 = null;
		}
	}
}
