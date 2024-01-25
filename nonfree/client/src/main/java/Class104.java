import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public class Class104 {

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
	private int anInt10497;

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
	public int anInt10500;

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
	public int anInt10501;

	@OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
	public int anInt10503;

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
	private int anInt10507;

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "Lclient!dt;")
	public Class6_Sub2_Sub5 aClass6_Sub2_Sub5_7;

	@OriginalMember(owner = "client!qu", name = "G", descriptor = "Lclient!kn;")
	public Class212 aClass212_4;

	@OriginalMember(owner = "client!qu", name = "E", descriptor = "Lclient!dt;")
	public Class6_Sub2_Sub5 aClass6_Sub2_Sub5_8;

	@OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
	public int anInt10518;

	@OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
	private int anInt10519;

	@OriginalMember(owner = "client!qu", name = "A", descriptor = "I")
	private int anInt10523;

	@OriginalMember(owner = "client!qu", name = "s", descriptor = "Z")
	private boolean aBoolean780 = false;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
	private int anInt10526 = 0;

	@OriginalMember(owner = "client!qu", name = "I", descriptor = "Z")
	private boolean aBoolean781 = false;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Z)V")
	protected Class104(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(II)V")
	public final void method9018(@OriginalArg(0) int arg0) {
		this.anInt10501 = 0;
		this.anInt10523 = this.aClass212_4.anIntArray322.length > 1 ? 1 : -1;
		this.anInt10518 = 0;
		this.anInt10507 = arg0;
		this.anInt10519 = 0;
		this.aBoolean781 = false;
		if (this.aClass212_4 != null) {
			this.method9033(this.anInt10501, this.aClass212_4);
			this.method9027();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BILclient!ka;)V")
	public final void method9020(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1) {
		if (this.aClass212_4 != null && this.method9023()) {
			arg1.method7422(this.anInt10518, this.aClass212_4.aBoolean414, this.aClass6_Sub2_Sub5_7, arg0, this.aClass6_Sub2_Sub5_8, this.aClass212_4.anIntArray325[this.anInt10501], this.anInt10503, this.anInt10500);
		}
	}

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "(I)Z")
	public final boolean method9021() {
		return this.anInt10507 != 0;
	}

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V")
	public final void method9022() {
		this.method9018(0);
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)Z")
	public final boolean method9023() {
		if (this.aClass212_4 == null) {
			return false;
		} else if (this.aBoolean780) {
			return true;
		} else {
			this.anInt10500 = this.aClass212_4.anIntArray322[this.anInt10501];
			this.aClass6_Sub2_Sub5_8 = Static143.aClass68_2.method1285(this.anInt10500 >> 16);
			this.anInt10500 &= 0xFFFF;
			if (this.aClass6_Sub2_Sub5_8 == null) {
				return false;
			}
			if (this.aClass212_4.aBoolean416 && this.anInt10523 != -1) {
				this.anInt10503 = this.aClass212_4.anIntArray322[this.anInt10523];
				this.aClass6_Sub2_Sub5_7 = Static143.aClass68_2.method1285(this.anInt10503 >> 16);
				this.anInt10503 &= 0xFFFF;
			}
			if (this.aClass212_4.aBoolean414) {
				this.anInt10497 |= 0x200;
			}
			if (this.aClass6_Sub2_Sub5_8.method2153(this.anInt10500)) {
				this.anInt10497 |= 0x80;
			}
			if (this.aClass6_Sub2_Sub5_8.method2150(this.anInt10500)) {
				this.anInt10497 |= 0x100;
			}
			if (this.aClass6_Sub2_Sub5_8.method2152(this.anInt10500)) {
				this.anInt10497 |= 0x400;
			}
			if (this.aClass6_Sub2_Sub5_7 != null) {
				if (this.aClass6_Sub2_Sub5_7.method2153(this.anInt10503)) {
					this.anInt10497 |= 0x80;
				}
				if (this.aClass6_Sub2_Sub5_7.method2150(this.anInt10503)) {
					this.anInt10497 |= 0x100;
				}
				if (this.aClass6_Sub2_Sub5_7.method2152(this.anInt10503)) {
					this.anInt10497 |= 0x400;
				}
			}
			this.aBoolean780 = true;
			this.anInt10497 |= 0x20;
			return true;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)Z")
	public final boolean method9024() {
		@Pc(17) int local17;
		return (local17 = 1 - this.anInt10507) <= 0 | this.aClass212_4 == null ? false : local17 + this.anInt10518 > this.aClass212_4.anIntArray325[this.anInt10501] | this.aClass212_4.aBoolean416;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)I")
	public final int method9025() {
		return this.method9023() ? this.anInt10497 : 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!qu;)V")
	public final void method9026(@OriginalArg(1) Class104 arg0) {
		this.aClass212_4 = arg0.aClass212_4;
		this.aBoolean781 = arg0.aBoolean781;
		this.anInt10501 = arg0.anInt10501;
		this.anInt10518 = arg0.anInt10518;
		this.anInt10523 = arg0.anInt10523;
		this.anInt10507 = arg0.anInt10507;
		this.anInt10519 = arg0.anInt10519;
		this.method9027();
	}

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)V")
	private void method9027() {
		this.anInt10497 = 0;
		this.aClass6_Sub2_Sub5_8 = this.aClass6_Sub2_Sub5_7 = null;
		this.aBoolean780 = false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
	public final void method9028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method9042(arg0, 0, false, arg1);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!ka;)V")
	public final void method9029(@OriginalArg(1) Class54 arg0) {
		if (this.method9023()) {
			arg0.method7413(this.aClass6_Sub2_Sub5_8, this.anInt10500);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)Z")
	public final boolean method9030() {
		return this.aClass212_4 != null;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)I")
	public final int method9031() {
		return this.anInt10507;
	}

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)I")
	public final int method9032() {
		return this.aClass212_4 == null ? -1 : this.aClass212_4.anInt5515;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!kn;B)V")
	protected void method9033(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1) {
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V")
	public final void method9034() {
		this.anInt10519 = 0;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(IZ)V")
	public final void method9035(@OriginalArg(0) int arg0) {
		this.method9042(arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIILclient!ka;)V")
	public final void method9036(@OriginalArg(1) int arg0, @OriginalArg(3) Class54 arg1) {
		if (this.method9023()) {
			arg1.method7406(arg0, this.aClass6_Sub2_Sub5_7, this.aClass212_4.anIntArray325[this.anInt10501], this.anInt10503, this.aClass212_4.aBoolean414, this.anInt10518, this.anInt10500, (int[]) null, this.aClass6_Sub2_Sub5_8);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ)V")
	public final void method9037(@OriginalArg(0) int arg0) {
		this.anInt10507 = arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)Z")
	public final boolean method9038() {
		return this.aBoolean781;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)Z")
	public final boolean method9039(@OriginalArg(0) int arg0) {
		if (this.aClass212_4 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt10507 > 0) {
			if (this.anInt10507 >= arg0) {
				this.anInt10507 -= arg0;
				return false;
			}
			arg0 -= this.anInt10507;
			this.anInt10507 = 0;
			this.method9033(this.anInt10501, this.aClass212_4);
		}
		arg0 += this.anInt10518;
		@Pc(59) boolean local59 = Static640.aBoolean734 | this.aClass212_4.aBoolean416;
		if (arg0 > 100 && this.aClass212_4.anInt5513 > 0) {
			@Pc(78) int local78 = this.aClass212_4.anIntArray322.length - this.aClass212_4.anInt5513;
			while (this.anInt10501 < local78 && arg0 > this.aClass212_4.anIntArray325[this.anInt10501]) {
				arg0 -= this.aClass212_4.anIntArray325[this.anInt10501];
				this.anInt10501++;
			}
			if (local78 <= this.anInt10501) {
				@Pc(131) int local131 = 0;
				for (@Pc(133) int local133 = local78; local133 < this.aClass212_4.anIntArray322.length; local133++) {
					local131 += this.aClass212_4.anIntArray325[local133];
				}
				if (this.anInt10526 == 0) {
					this.anInt10519 += arg0 / local131;
				}
				arg0 %= local131;
			}
			this.anInt10523 = this.anInt10501 + 1;
			if (this.anInt10523 >= this.aClass212_4.anIntArray322.length) {
				this.anInt10523 -= this.aClass212_4.anInt5513;
				if (this.anInt10523 < 0 || this.anInt10523 >= this.aClass212_4.anIntArray322.length) {
					this.anInt10523 = -1;
				}
			}
			local59 = true;
		}
		while (arg0 > this.aClass212_4.anIntArray325[this.anInt10501]) {
			local59 = true;
			arg0 -= this.aClass212_4.anIntArray325[this.anInt10501++];
			if (this.anInt10501 >= this.aClass212_4.anIntArray322.length) {
				if (this.aClass212_4.anInt5513 != -1 && this.anInt10526 != 2) {
					if (this.anInt10526 == 0) {
						this.anInt10519++;
					}
					this.anInt10501 -= this.aClass212_4.anInt5513;
				}
				if (this.aClass212_4.anInt5516 <= this.anInt10519 || this.anInt10501 < 0 || this.anInt10501 >= this.aClass212_4.anIntArray322.length) {
					this.aBoolean781 = true;
					break;
				}
			}
			this.method9033(this.anInt10501, this.aClass212_4);
			this.anInt10523 = this.anInt10501 + 1;
			if (this.anInt10523 >= this.aClass212_4.anIntArray322.length) {
				this.anInt10523 -= this.aClass212_4.anInt5513;
				if (this.anInt10523 < 0 || this.aClass212_4.anIntArray322.length <= this.anInt10523) {
					this.anInt10523 = -1;
				}
			}
		}
		this.anInt10518 = arg0;
		if (local59) {
			this.method9027();
		}
		return local59;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIZ)V")
	public final void method9040() {
		this.method9042(-1, 0, false, 0);
	}

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "(I)Lclient!kn;")
	public final Class212 method9041() {
		return this.aClass212_4;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIZIB)V")
	public final void method9042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (this.method9032() == arg0) {
			return;
		}
		if (arg0 == -1) {
			this.aClass212_4 = null;
		} else {
			if (this.aClass212_4 == null || arg0 != this.aClass212_4.anInt5515) {
				this.aClass212_4 = Static143.aClass68_2.method1286(arg0);
			} else if (this.aClass212_4.anInt5520 == 0) {
				return;
			}
			this.anInt10519 = 0;
			this.anInt10507 = arg3;
			this.anInt10526 = arg1;
			if (arg2) {
				this.anInt10501 = (int) (Math.random() * (double) this.aClass212_4.anIntArray322.length);
				this.anInt10518 = (int) (Math.random() * (double) this.aClass212_4.anIntArray325[this.anInt10501]);
			} else {
				this.anInt10501 = 0;
				this.anInt10518 = 0;
			}
			this.anInt10523 = this.anInt10501 + 1;
			if (this.anInt10523 < 0 || this.aClass212_4.anIntArray322.length <= this.anInt10523) {
				this.anInt10523 = -1;
			}
			if (this.anInt10507 == 0) {
				this.method9033(this.anInt10501, this.aClass212_4);
			}
			this.aBoolean781 = false;
		}
		this.method9027();
	}
}
