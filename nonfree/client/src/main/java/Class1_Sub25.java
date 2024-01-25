import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "[J")
	public static final long[] aLongArray5 = new long[256];

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "Lclient!gk;")
	public Class1_Sub5_Sub2 aClass1_Sub5_Sub2_2;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	public int anInt3561;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "Lclient!bo;")
	public Class29 aClass29_1;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
	public int anInt3562;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
	public int anInt3563;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "Lclient!kh;")
	public Class47_Sub1_Sub5_Sub1 aClass47_Sub1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
	public int anInt3565;

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "Lclient!gk;")
	public Class1_Sub5_Sub2 aClass1_Sub5_Sub2_3;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
	public int anInt3566;

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
	public int anInt3567;

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "I")
	public int anInt3568;

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
	public int anInt3570;

	@OriginalMember(owner = "client!ju", name = "D", descriptor = "Z")
	public boolean aBoolean288;

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
	public int anInt3571;

	@OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
	public int anInt3573;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "Lclient!ps;")
	public Class47_Sub1_Sub5_Sub2 aClass47_Sub1_Sub5_Sub2_1;

	@OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
	public int anInt3575;

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
	public int anInt3569 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray5[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
	public void method3052() {
		@Pc(8) int local8 = this.anInt3567;
		if (this.aClass29_1 != null) {
			@Pc(94) Class29 local94 = this.aClass29_1.method475(Static237.aClass80_1);
			if (local94 == null) {
				this.anIntArray290 = null;
				this.anInt3575 = 0;
				this.anInt3567 = -1;
				this.anInt3561 = 0;
				this.anInt3563 = 0;
				this.anInt3570 = 0;
			} else {
				this.anInt3570 = local94.anInt548;
				this.anInt3563 = local94.anInt530 << 7;
				this.anInt3561 = local94.anInt553;
				this.anInt3567 = local94.anInt554;
				this.anIntArray290 = local94.anIntArray32;
				this.anInt3575 = local94.anInt538;
			}
		} else if (this.aClass47_Sub1_Sub5_Sub1_1 != null) {
			@Pc(48) int local48 = Static277.method3835(this.aClass47_Sub1_Sub5_Sub1_1);
			if (local48 != local8) {
				this.anInt3567 = local48;
				@Pc(58) Class196 local58 = this.aClass47_Sub1_Sub5_Sub1_1.aClass196_1;
				if (local58.anIntArray419 != null) {
					local58 = local58.method4412(Static237.aClass80_1);
				}
				if (local58 == null) {
					this.anInt3570 = this.anInt3563 = 0;
				} else {
					this.anInt3570 = local58.anInt5536;
					this.anInt3563 = local58.anInt5546 << 7;
				}
			}
		} else if (this.aClass47_Sub1_Sub5_Sub2_1 != null) {
			this.anInt3567 = Static43.method575(this.aClass47_Sub1_Sub5_Sub2_1);
			this.anInt3570 = this.aClass47_Sub1_Sub5_Sub2_1.anInt5427;
			this.anInt3563 = this.aClass47_Sub1_Sub5_Sub2_1.anInt5441 << 7;
		}
		if (this.anInt3567 != local8 && this.aClass1_Sub5_Sub2_3 != null) {
			Static292.aClass1_Sub5_Sub1_2.method423(this.aClass1_Sub5_Sub2_3);
			this.aClass1_Sub5_Sub2_3 = null;
		}
	}
}
