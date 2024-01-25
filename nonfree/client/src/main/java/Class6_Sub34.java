import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	public int anInt6873;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "[I")
	public int[] anIntArray485;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "Lclient!qr;")
	public Class6_Sub6_Sub1 aClass6_Sub6_Sub1_3;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
	public int anInt6875;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	public int anInt6876;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "Lclient!ju;")
	public Class6_Sub23 aClass6_Sub23_2;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
	public int anInt6877;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "Lclient!kw;")
	public Class15_Sub2_Sub4_Sub1 aClass15_Sub2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
	public int anInt6879;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
	public int anInt6880;

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
	public int anInt6881;

	@OriginalMember(owner = "client!oo", name = "A", descriptor = "Lclient!lt;")
	public Class192 aClass192_1;

	@OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
	public int anInt6882;

	@OriginalMember(owner = "client!oo", name = "C", descriptor = "I")
	public int anInt6883;

	@OriginalMember(owner = "client!oo", name = "F", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!oo", name = "G", descriptor = "I")
	public int anInt6886;

	@OriginalMember(owner = "client!oo", name = "H", descriptor = "Lclient!ji;")
	public Class6_Sub15_Sub2 aClass6_Sub15_Sub2_3;

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "Lclient!qr;")
	public Class6_Sub6_Sub1 aClass6_Sub6_Sub1_4;

	@OriginalMember(owner = "client!oo", name = "J", descriptor = "Lclient!ji;")
	public Class6_Sub15_Sub2 aClass6_Sub15_Sub2_4;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "Lclient!ju;")
	public Class6_Sub23 aClass6_Sub23_3;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "Lclient!uea;")
	public Class15_Sub2_Sub4_Sub2 aClass15_Sub2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!oo", name = "M", descriptor = "Z")
	public boolean aBoolean473;

	@OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
	public int anInt6887;

	@OriginalMember(owner = "client!oo", name = "O", descriptor = "Z")
	public boolean aBoolean474;

	@OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
	public int anInt6885 = 0;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public void method5517() {
		@Pc(8) int local8 = this.anInt6877;
		@Pc(15) boolean local15 = this.aBoolean473;
		if (this.aClass192_1 != null) {
			@Pc(24) Class192 local24 = this.aClass192_1.method4585(Static65.aClass51_1);
			if (local24 == null) {
				this.anIntArray485 = null;
				this.anInt6881 = 0;
				this.anInt6877 = -1;
				this.anInt6882 = 0;
				this.aBoolean474 = false;
				this.aBoolean473 = false;
				this.anInt6876 = 0;
				this.anInt6883 = 0;
			} else {
				this.anInt6876 = local24.anInt5613 << 9;
				this.anInt6883 = local24.anInt5605;
				this.anInt6877 = local24.anInt5572;
				this.aBoolean474 = local24.aBoolean399;
				this.anInt6882 = local24.anInt5599;
				this.aBoolean473 = local24.aBoolean395;
				this.anInt6881 = local24.anInt5601;
				this.anIntArray485 = local24.anIntArray427;
			}
		} else if (this.aClass15_Sub2_Sub4_Sub1_1 != null) {
			@Pc(126) int local126 = Static276.method4135(this.aClass15_Sub2_Sub4_Sub1_1);
			if (local126 != local8) {
				this.anInt6877 = local126;
				@Pc(140) Class88 local140 = this.aClass15_Sub2_Sub4_Sub1_1.aClass88_1;
				if (local140.anIntArray182 != null) {
					local140 = local140.method1940(Static65.aClass51_1);
				}
				if (local140 == null) {
					this.anInt6882 = this.anInt6876 = 0;
					this.aBoolean473 = this.aClass15_Sub2_Sub4_Sub1_1.aClass88_1.aBoolean147;
				} else {
					this.anInt6876 = local140.anInt2152 << 9;
					this.anInt6882 = local140.anInt2169;
					this.aBoolean473 = local140.aBoolean147;
				}
			}
		} else if (this.aClass15_Sub2_Sub4_Sub2_1 != null) {
			this.anInt6877 = Static69.method979(this.aClass15_Sub2_Sub4_Sub2_1);
			this.aBoolean473 = this.aClass15_Sub2_Sub4_Sub2_1.aBoolean583;
			this.anInt6882 = this.aClass15_Sub2_Sub4_Sub2_1.anInt9006;
			this.anInt6876 = this.aClass15_Sub2_Sub4_Sub2_1.anInt9025 << 9;
		}
		if (local8 == this.anInt6877 && this.aBoolean473 == local15) {
			return;
		}
		if (this.aClass6_Sub15_Sub2_3 == null) {
			return;
		}
		Static204.aClass6_Sub15_Sub1_1.method2421(this.aClass6_Sub15_Sub2_3);
		this.aClass6_Sub6_Sub1_4 = null;
		this.aClass6_Sub15_Sub2_3 = null;
		this.aClass6_Sub23_2 = null;
	}
}
