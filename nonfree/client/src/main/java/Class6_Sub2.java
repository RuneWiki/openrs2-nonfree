import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "Lclient!bfa;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	public int anInt554;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	public int anInt556;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
	public int anInt557;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "Lclient!ag;")
	public Class11_Sub1_Sub1_Sub1 aClass11_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!ofa;")
	public Class6_Sub37 aClass6_Sub37_1;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "Lclient!wb;")
	public Class6_Sub12_Sub1 aClass6_Sub12_Sub1_1;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Lclient!wb;")
	public Class6_Sub12_Sub1 aClass6_Sub12_Sub1_2;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
	public int anInt560;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "Lclient!gg;")
	public Class6_Sub10_Sub2 aClass6_Sub10_Sub2_1;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "Z")
	public boolean aBoolean34;

	@OriginalMember(owner = "client!aj", name = "B", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "Lclient!ofa;")
	public Class6_Sub37 aClass6_Sub37_2;

	@OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
	public int anInt562;

	@OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
	public int anInt564;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "Lclient!gg;")
	public Class6_Sub10_Sub2 aClass6_Sub10_Sub2_2;

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
	public int anInt565;

	@OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "[I")
	public int[] anIntArray45;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
	public int anInt568;

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "Lclient!pi;")
	public Class11_Sub1_Sub1_Sub2 aClass11_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
	public int anInt563 = 0;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
	public void method636() {
		@Pc(8) int local8 = this.anInt568;
		@Pc(11) boolean local11 = this.aBoolean33;
		if (this.aClass31_1 != null) {
			@Pc(116) Class31 local116 = this.aClass31_1.method1029(Static435.aClass234_1);
			if (local116 == null) {
				this.aBoolean33 = false;
				this.anInt560 = 0;
				this.anInt556 = 0;
				this.aBoolean34 = false;
				this.anInt568 = -1;
				this.anInt555 = 0;
				this.anInt557 = 0;
				this.anIntArray45 = null;
			} else {
				this.anIntArray45 = local116.anIntArray70;
				this.aBoolean33 = local116.aBoolean88;
				this.anInt560 = local116.anInt1105;
				this.anInt556 = local116.anInt1083;
				this.aBoolean34 = local116.aBoolean89;
				this.anInt555 = local116.anInt1072;
				this.anInt568 = local116.anInt1075;
				this.anInt557 = local116.anInt1087 << 9;
			}
		} else if (this.aClass11_Sub1_Sub1_Sub1_1 != null) {
			@Pc(56) int local56 = Static421.method6532(this.aClass11_Sub1_Sub1_Sub1_1);
			if (local8 != local56) {
				this.anInt568 = local56;
				@Pc(70) Class222 local70 = this.aClass11_Sub1_Sub1_Sub1_1.aClass222_1;
				if (local70.anIntArray464 != null) {
					local70 = local70.method5329(Static435.aClass234_1);
				}
				if (local70 == null) {
					this.aBoolean33 = this.aClass11_Sub1_Sub1_Sub1_1.aClass222_1.aBoolean467;
					this.anInt556 = this.anInt557 = 0;
				} else {
					this.anInt557 = local70.anInt6233 << 9;
					this.anInt556 = local70.anInt6235;
					this.aBoolean33 = local70.aBoolean467;
				}
			}
		} else if (this.aClass11_Sub1_Sub1_Sub2_1 != null) {
			this.anInt568 = Static325.method5248(this.aClass11_Sub1_Sub1_Sub2_1);
			this.anInt557 = this.aClass11_Sub1_Sub1_Sub2_1.anInt7439 << 9;
			this.aBoolean33 = this.aClass11_Sub1_Sub1_Sub2_1.aBoolean547;
			this.anInt556 = this.aClass11_Sub1_Sub1_Sub2_1.anInt7436;
		}
		if (local8 == this.anInt568 && this.aBoolean33 == local11) {
			return;
		}
		if (this.aClass6_Sub10_Sub2_1 == null) {
			return;
		}
		Static35.aClass6_Sub10_Sub3_1.method4742(this.aClass6_Sub10_Sub2_1);
		this.aClass6_Sub37_1 = null;
		this.aClass6_Sub12_Sub1_2 = null;
		this.aClass6_Sub10_Sub2_1 = null;
	}
}
