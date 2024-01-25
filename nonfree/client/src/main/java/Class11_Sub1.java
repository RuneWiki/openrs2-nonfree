import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Lclient!qa;")
	public Class67_Sub3_Sub3_Sub2 aClass67_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
	public int anInt85;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	public int anInt86;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public int anInt87;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "Lclient!gm;")
	public Class84 aClass84_1;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "Lclient!dd;")
	public Class11_Sub10_Sub1 aClass11_Sub10_Sub1_1;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Lclient!dd;")
	public Class11_Sub10_Sub1 aClass11_Sub10_Sub1_2;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "Lclient!km;")
	public Class67_Sub3_Sub3_Sub1 aClass67_Sub3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
	public int anInt88;

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
	public int anInt91;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
	public int anInt92;

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
	public int anInt93;

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
	public int anInt95;

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
	public int anInt97;

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
	public int anInt98;

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
	public int anInt100;

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
	public int anInt96 = 0;

	static {
		new Class117("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
	public void method78() {
		@Pc(16) int local16 = this.anInt91;
		if (this.aClass84_1 != null) {
			@Pc(98) Class84 local98 = this.aClass84_1.method1635();
			if (local98 == null) {
				this.anIntArray11 = null;
				this.anInt86 = 0;
				this.anInt93 = 0;
				this.anInt95 = 0;
				this.anInt91 = -1;
				this.anInt87 = 0;
			} else {
				this.anInt95 = local98.anInt2024;
				this.anInt86 = local98.anInt2022 * 128;
				this.anInt91 = local98.anInt2021;
				this.anInt93 = local98.anInt2020;
				this.anIntArray11 = local98.anIntArray143;
				this.anInt87 = local98.anInt2015;
			}
		} else if (this.aClass67_Sub3_Sub3_Sub1_1 != null) {
			@Pc(27) int local27 = Static112.method1686(this.aClass67_Sub3_Sub3_Sub1_1);
			if (local16 != local27) {
				this.anInt91 = local27;
				@Pc(41) Class82 local41 = this.aClass67_Sub3_Sub3_Sub1_1.aClass82_1;
				if (local41.anIntArray134 != null) {
					local41 = local41.method1569();
				}
				if (local41 == null) {
					this.anInt93 = this.anInt86 = 0;
				} else {
					this.anInt93 = local41.anInt1891;
					this.anInt86 = local41.anInt1890 * 128;
				}
			}
		} else if (this.aClass67_Sub3_Sub3_Sub2_1 != null) {
			this.anInt91 = Static269.method4630(this.aClass67_Sub3_Sub3_Sub2_1);
			this.anInt93 = this.aClass67_Sub3_Sub3_Sub2_1.anInt5085;
			this.anInt86 = this.aClass67_Sub3_Sub3_Sub2_1.anInt5079 * 128;
		}
		if (this.anInt91 != local16 && this.aClass11_Sub10_Sub1_2 != null) {
			Static341.aClass11_Sub10_Sub3_2.method3737(this.aClass11_Sub10_Sub1_2);
			this.aClass11_Sub10_Sub1_2 = null;
		}
	}
}
