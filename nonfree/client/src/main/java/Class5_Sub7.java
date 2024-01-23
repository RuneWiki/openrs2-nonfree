import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
	public int anInt4721;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
	private int anInt4723;

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
	private int anInt4717 = 0;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	private int anInt4712 = 0;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private int anInt4718 = -32768;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	private int anInt4707;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
	public int anInt4711;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	private int anInt4710;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	private int anInt4706;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public int anInt4715;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	public int anInt4714;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
	private int anInt4725;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	private int anInt4713;

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	private int anInt4727;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
	public int anInt4722;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
	public int anInt4724;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!fc;")
	private Class40 aClass40_3;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt4707 = arg3;
		this.aBoolean212 = false;
		this.anInt4711 = arg9;
		this.anInt4710 = arg0;
		this.anInt4706 = arg8;
		this.anInt4715 = arg10;
		this.anInt4714 = arg6;
		this.anInt4725 = arg7;
		this.anInt4713 = arg2;
		this.anInt4727 = arg4;
		this.anInt4722 = arg5;
		this.anInt4724 = arg1;
		@Pc(55) int local55 = Static103.method3801(this.anInt4710).anInt4605;
		if (local55 == -1) {
			this.aClass40_3 = null;
		} else {
			this.aClass40_3 = Static32.method546(local55);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIB)V")
	public void method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean212) {
			local8 = arg2 - this.anInt4713;
			@Pc(15) double local15 = (double) (arg3 - this.anInt4707);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble5 = (double) this.anInt4706 * local15 / local24 + (double) this.anInt4707;
			this.aDouble7 = this.anInt4727;
			this.aDouble9 = (double) this.anInt4713 + (double) this.anInt4706 * local8 / local24;
		}
		local8 = this.anInt4714 + 1 - arg1;
		this.aDouble3 = ((double) arg3 - this.aDouble5) / local8;
		this.aDouble8 = ((double) arg2 - this.aDouble9) / local8;
		this.aDouble6 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble8 * this.aDouble8);
		if (!this.aBoolean212) {
			this.aDouble4 = -this.aDouble6 * Math.tan((double) this.anInt4725 * 0.02454369D);
		}
		this.aDouble10 = ((double) arg0 - this.aDouble7 - local8 * this.aDouble4) * 2.0D / (local8 * local8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lclient!ei;")
	private Class5_Sub2 method3686() {
		@Pc(8) Class122 local8 = Static103.method3801(this.anInt4710);
		@Pc(14) Class5_Sub2 local14 = local8.method3608(this.anInt4712);
		if (local14 == null) {
			return null;
		} else {
			local14.method2919(this.anInt4723);
			return local14;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public void method3689(@OriginalArg(0) int arg0) {
		this.aBoolean212 = true;
		this.aDouble9 += (double) arg0 * this.aDouble8;
		this.aDouble7 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble10 + this.aDouble4 * (double) arg0;
		this.aDouble5 += this.aDouble3 * (double) arg0;
		this.aDouble4 += this.aDouble10 * (double) arg0;
		this.anInt4721 = (int) (Math.atan2(this.aDouble8, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt4723 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass40_3 == null) {
			return;
		}
		this.anInt4717 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass40_3.anIntArray76[this.anInt4712] >= this.anInt4717) {
						return;
					}
					this.anInt4717 -= this.aClass40_3.anIntArray76[this.anInt4712];
					this.anInt4712++;
				} while (this.anInt4712 < this.aClass40_3.anIntArray75.length);
				this.anInt4712 -= this.aClass40_3.anInt1248;
			} while (this.anInt4712 >= 0 && this.anInt4712 < this.aClass40_3.anIntArray75.length);
			this.anInt4712 = 0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class5_Sub2 local3 = this.method3686();
		if (local3 != null) {
			local3.method3679(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt4718 = local3.method3680();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()I")
	@Override
	public int method3680() {
		return this.anInt4718;
	}
}
