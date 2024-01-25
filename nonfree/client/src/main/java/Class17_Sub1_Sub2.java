import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class17_Sub1_Sub2 extends Class17_Sub1 {

	@OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
	private int anInt3765;

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
	private int anInt3767;

	@OriginalMember(owner = "client!lj", name = "X", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!lj", name = "ab", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!lj", name = "bb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!lj", name = "mb", descriptor = "Lclient!kq;")
	private Class8_Sub6 aClass8_Sub6_5;

	@OriginalMember(owner = "client!lj", name = "nb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!lj", name = "ob", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!lj", name = "qb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
	private int anInt3759 = -1;

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
	private int anInt3760 = 0;

	@OriginalMember(owner = "client!lj", name = "db", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
	private int anInt3766 = -32768;

	@OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
	private int anInt3783 = 0;

	@OriginalMember(owner = "client!lj", name = "eb", descriptor = "I")
	public final int anInt3778;

	@OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
	private final int anInt3782;

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
	private final int anInt3772;

	@OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
	private final int anInt3779;

	@OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
	public final int anInt3770;

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
	public final int anInt3763;

	@OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
	public final int anInt3776;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "Lclient!bo;")
	private final Class24 aClass24_2;

	static {
		new Class34("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
		lb = -1;
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class17_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt3778 = arg10;
		this.aBoolean349 = false;
		this.anInt3782 = arg7;
		this.anInt3772 = arg0;
		this.anInt3779 = arg8;
		this.anInt3770 = arg5;
		this.anInt3763 = arg9;
		this.anInt3776 = arg6;
		@Pc(64) int local64 = Static265.method5633(this.anInt3772).anInt2088;
		if (local64 == -1) {
			this.aClass24_2 = null;
		} else {
			this.aClass24_2 = Static110.method5411(local64);
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
	@Override
	public void method4487() {
		super.aShort75 = super.aShort74 = (short) (this.aDouble4 / 128.0D);
		super.aShort77 = super.aShort76 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!lj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub6_5 != null) {
			this.aClass8_Sub6_5.method3280();
		}
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	public void method3460() {
		if (this.aClass8_Sub6_5 != null) {
			this.aClass8_Sub6_5.method3280();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ZI)V")
	public void method3461(@OriginalArg(1) int arg0) {
		if (this.anInt3782 == -1) {
			this.aDouble5 += this.aDouble9 * (double) arg0;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble9 + this.aDouble3 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble9 += this.aDouble3 * (double) arg0;
		}
		this.aDouble4 += (double) arg0 * this.aDouble7;
		this.aDouble8 += this.aDouble2 * (double) arg0;
		this.aBoolean349 = true;
		this.anInt3765 = (int) (Math.atan2(this.aDouble7, this.aDouble2) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt3767 = (int) (Math.atan2(this.aDouble9, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass24_2 == null) {
			return;
		}
		this.anInt3783 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt3783 <= this.aClass24_2.anIntArray89[this.anInt3760]) {
						return;
					}
					this.anInt3783 -= this.aClass24_2.anIntArray89[this.anInt3760];
					this.anInt3760++;
					if (this.anInt3760 >= this.aClass24_2.anIntArray90.length) {
						this.anInt3760 -= this.aClass24_2.anInt1034;
						if (this.anInt3760 < 0 || this.aClass24_2.anIntArray90.length <= this.anInt3760) {
							this.anInt3760 = 0;
						}
					}
					this.anInt3759 = this.anInt3760 + 1;
				} while (this.anInt3759 < this.aClass24_2.anIntArray90.length);
				this.anInt3759 -= this.aClass24_2.anInt1034;
			} while (this.anInt3759 >= 0 && this.anInt3759 < this.aClass24_2.anIntArray90.length);
			this.anInt3759 = -1;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBIII)V")
	public void method3462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean349) {
			local9 = arg1 - super.anInt5109;
			@Pc(15) double local15 = (double) (arg2 - super.anInt5108);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local9 * local9);
			this.aDouble8 = (double) super.anInt5108 + local15 * (double) this.anInt3779 / local24;
			this.aDouble4 = (double) super.anInt5109 + local9 * (double) this.anInt3779 / local24;
			this.aDouble5 = super.anInt5112;
		}
		local9 = this.anInt3776 + 1 - arg0;
		this.aDouble2 = ((double) arg2 - this.aDouble8) / local9;
		this.aDouble7 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble2 * this.aDouble2);
		if (this.anInt3782 == -1) {
			this.aDouble9 = ((double) arg3 - this.aDouble5) / local9;
		} else {
			if (!this.aBoolean349) {
				this.aDouble9 = -this.aDouble6 * Math.tan((double) this.anInt3782 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg3 - this.aDouble9 * local9 - this.aDouble5) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!ge;Lclient!uo;)V")
	private void method3463(@OriginalArg(1) Class73 arg0, @OriginalArg(2) Class32 arg1) {
		@Pc(12) Class206[] local12 = arg0.method3330();
		@Pc(15) Class115[] local15 = arg0.method3325();
		if ((this.aClass8_Sub6_5 == null || this.aClass8_Sub6_5.aBoolean331) && (local12 != null || local15 != null)) {
			this.aClass8_Sub6_5 = new Class8_Sub6(Static5.anInt208);
		}
		if (this.aClass8_Sub6_5 != null) {
			this.aClass8_Sub6_5.method3271(arg1, (long) Static5.anInt208, local12, local15);
			this.aClass8_Sub6_5.method3281(super.aByte51, super.aShort75, super.aShort74, super.aShort77, super.aShort76);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!uo;BI)Lclient!ge;")
	private Class73 method3464(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class67 local17 = Static265.method5633(this.anInt3772);
		return local17.method1823(this.anInt3783, arg1, this.anInt3759, this.anInt3760, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)I")
	@Override
	public int method4490() {
		return this.anInt3766;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		@Pc(9) Class73 local9 = this.method3464(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class109 local16 = arg0.method2194();
		local16.method3866(this.anInt3767);
		local16.method3868(this.anInt3765);
		local16.method3874((int) this.aDouble4, (int) this.aDouble5, (int) this.aDouble8);
		if (this.aClass8_Sub6_5 == null) {
			local9.method3322(local16, null, 0);
		} else {
			@Pc(42) Class191 local42 = this.aClass8_Sub6_5.method3279();
			arg0.method2181(local9, local42, local16, null);
		}
		this.anInt3766 = local9.method3327();
		this.method3463(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
		@Pc(9) Class73 local9 = this.method3464(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(19) Class109 local19 = arg0.method2194();
		local19.method3866(this.anInt3767);
		local19.method3868(this.anInt3765);
		local19.method3874((int) this.aDouble4, (int) this.aDouble5, (int) this.aDouble8);
		this.anInt3766 = local9.method3327();
		this.method3463(local9, arg0);
	}
}
