import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class1_Sub4_Sub2_Sub2 extends Class1_Sub4_Sub2 {

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!kh", name = "S", descriptor = "Lclient!au;")
	private Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!kh", name = "U", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!kh", name = "db", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!kh", name = "eb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!kh", name = "kb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!kh", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!kh", name = "yb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!kh", name = "Bb", descriptor = "I")
	private int anInt5568;

	@OriginalMember(owner = "client!kh", name = "Gb", descriptor = "I")
	private int anInt5572;

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
	private int anInt5542 = 0;

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
	private int anInt5546 = 0;

	@OriginalMember(owner = "client!kh", name = "vb", descriptor = "I")
	private int anInt5563 = 0;

	@OriginalMember(owner = "client!kh", name = "xb", descriptor = "I")
	private int anInt5565 = 0;

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!kh", name = "Ib", descriptor = "I")
	private int anInt5574 = -1;

	@OriginalMember(owner = "client!kh", name = "wb", descriptor = "I")
	public final int anInt5564;

	@OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
	private final int anInt5544;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
	public final int anInt5547;

	@OriginalMember(owner = "client!kh", name = "ob", descriptor = "I")
	public final int anInt5557;

	@OriginalMember(owner = "client!kh", name = "Fb", descriptor = "I")
	private final int anInt5571;

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "I")
	public final int anInt5551;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
	private final int anInt5545;

	@OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
	private final int anInt5554;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "Z")
	private final boolean aBoolean420;

	@OriginalMember(owner = "client!kh", name = "Db", descriptor = "Lclient!wt;")
	private final Class365 aClass365_1;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class1_Sub4_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static501.method5641(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt5564 = arg6;
		this.anInt5544 = arg8;
		this.anInt5547 = arg7;
		this.anInt5557 = arg10;
		this.anInt5571 = arg9;
		this.anInt5551 = arg11;
		this.anInt5545 = arg0;
		this.anInt5554 = arg5;
		this.aBoolean419 = false;
		this.aBoolean420 = arg12;
		@Pc(85) int local85 = Static569.aClass213_2.method5291(this.anInt5545).anInt5925;
		if (local85 == -1) {
			this.aClass365_1 = null;
		} else {
			this.aClass365_1 = Static61.aClass48_1.method1016(local85);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public void method4713() {
		if (this.aClass1_Sub2_3 != null) {
			this.aClass1_Sub2_3.method337();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public void method4714(@OriginalArg(1) int arg0) {
		this.aDouble7 += this.lb * (double) arg0;
		this.aDouble3 += this.aDouble4 * (double) arg0;
		this.aBoolean419 = true;
		if (this.aBoolean420) {
			this.aDouble1 = Static501.method5641((int) this.aDouble7, super.aByte126, (int) this.aDouble3) - this.anInt5554;
		} else if (this.anInt5544 == -1) {
			this.aDouble1 += (double) arg0 * this.aDouble6;
		} else {
			this.aDouble1 += this.aDouble2 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble6;
			this.aDouble6 += (double) arg0 * this.aDouble2;
		}
		this.anInt5568 = (int) (Math.atan2(this.lb, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5572 = (int) (Math.atan2(this.aDouble6, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass365_1 == null) {
			return;
		}
		this.anInt5546 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt5546 <= this.aClass365_1.anIntArray552[this.anInt5565]) {
						return;
					}
					this.anInt5546 -= this.aClass365_1.anIntArray552[this.anInt5565];
					this.anInt5565++;
					if (this.aClass365_1.anIntArray551.length <= this.anInt5565) {
						this.anInt5565 -= this.aClass365_1.anInt10217;
						if (this.anInt5565 < 0 || this.anInt5565 >= this.aClass365_1.anIntArray551.length) {
							this.anInt5565 = 0;
						}
					}
					this.anInt5574 = this.anInt5565 + 1;
				} while (this.aClass365_1.anIntArray551.length > this.anInt5574);
				this.anInt5574 -= this.aClass365_1.anInt10217;
			} while (this.anInt5574 >= 0 && this.aClass365_1.anIntArray551.length > this.anInt5574);
			this.anInt5574 = -1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!da;Lclient!r;Lclient!q;)V")
	private void method4715(@OriginalArg(1) Class57 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) Class8 arg2) {
		arg0.method7926(arg2);
		@Pc(15) Class227[] local15 = arg0.method7915();
		@Pc(18) Class103[] local18 = arg0.method7920();
		if ((this.aClass1_Sub2_3 == null || this.aClass1_Sub2_3.aBoolean21) && (local15 != null || local18 != null)) {
			this.aClass1_Sub2_3 = Static25.method339(Static106.anInt2418, true);
		}
		if (this.aClass1_Sub2_3 != null) {
			this.aClass1_Sub2_3.method333(arg1, (long) Static106.anInt2418, local15, local18);
			this.aClass1_Sub2_3.method338(super.aByte126, super.aShort121, super.aShort122, super.aShort120, super.aShort119);
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
		@Pc(9) Class57 local9 = this.method4717(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class8 local15 = arg0.method5007();
		local15.oa(this.anInt5572);
		local15.ZA(this.anInt5568);
		local15.U((int) this.aDouble7, (int) this.aDouble1, (int) this.aDouble3);
		this.anInt5542 = local9.J();
		this.anInt5563 = local9.RA();
		this.method4715(local9, arg0, local15);
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
	@Override
	public void method8120() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "(I)V")
	@Override
	public void method8132() {
		super.aShort120 = super.aShort119 = (short) (this.aDouble3 / 512.0D);
		super.aShort121 = super.aShort122 = (short) (this.aDouble7 / 512.0D);
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aBoolean421;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;BI)Lclient!da;")
	private Class57 method4717(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class200 local15 = Static569.aClass213_2.method5291(this.anInt5545);
		return local15.method5070(this.anInt5546, arg1, arg0, Static61.aClass48_1, this.anInt5565, this.anInt5574);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZLclient!r;ILclient!ub;I)V")
	@Override
	public void method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(5) Class1_Sub4 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		@Pc(11) Class57 local11 = this.method4717(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class8 local18 = arg0.method5007();
		local18.oa(this.anInt5572);
		local18.ZA(this.anInt5568);
		local18.U((int) this.aDouble7, (int) this.aDouble1, (int) this.aDouble3);
		this.method4715(local11, arg0, local18);
		if (Static361.aBoolean500) {
			local11.method7919(local18, null, Static6.anInt161, 0);
		} else {
			local11.method7927(local18, null, 0);
		}
		if (this.aClass1_Sub2_3 != null) {
			@Pc(71) Class305 local71 = this.aClass1_Sub2_3.method329();
			if (Static361.aBoolean500) {
				arg0.method5026(local71, Static6.anInt161);
			} else {
				arg0.method5017(local71);
			}
		}
		this.aBoolean421 = local11.LA();
		this.anInt5542 = local11.J();
		this.anInt5563 = local11.RA();
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		return arg0 == -117 ? this.anInt5563 : 64;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return this.anInt5542;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
	public void method4719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) double local21;
		if (!this.aBoolean419) {
			local21 = arg1 - super.anInt9934;
			@Pc(27) double local27 = (double) (arg0 - super.anInt9935);
			@Pc(36) double local36 = Math.sqrt(local27 * local27 + local21 * local21);
			this.aDouble7 = (double) this.anInt5571 * local21 / local36 + (double) super.anInt9934;
			this.aDouble3 = (double) super.anInt9935 + local27 * (double) this.anInt5571 / local36;
			if (this.aBoolean420) {
				this.aDouble1 = Static501.method5641((int) this.aDouble7, super.aByte126, (int) this.aDouble3) - this.anInt5554;
			} else {
				this.aDouble1 = super.anInt9932;
			}
		}
		local21 = this.anInt5547 + 1 - arg3;
		this.aDouble4 = ((double) arg0 - this.aDouble3) / local21;
		this.lb = ((double) arg1 - this.aDouble7) / local21;
		this.aDouble5 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.lb * this.lb);
		if (this.anInt5544 == -1) {
			this.aDouble6 = ((double) arg2 - this.aDouble1) / local21;
		} else {
			if (!this.aBoolean419) {
				this.aDouble6 = -this.aDouble5 * Math.tan((double) this.anInt5544 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg2 - this.aDouble1 - local21 * this.aDouble6) * 2.0D / (local21 * local21);
		}
	}

	@OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass1_Sub2_3 != null) {
			this.aClass1_Sub2_3.method337();
		}
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return false;
	}
}
