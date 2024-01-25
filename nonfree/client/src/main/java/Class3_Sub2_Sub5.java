import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lu", name = "B", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
	private int anInt4328;

	@OriginalMember(owner = "client!lu", name = "K", descriptor = "Lclient!ko;")
	private Class57_Sub4 aClass57_Sub4_3;

	@OriginalMember(owner = "client!lu", name = "L", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!lu", name = "O", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!lu", name = "V", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!lu", name = "Y", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!lu", name = "ab", descriptor = "I")
	private int anInt4341;

	@OriginalMember(owner = "client!lu", name = "mb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!lu", name = "ob", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!lu", name = "pb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!lu", name = "gb", descriptor = "I")
	private int anInt4345 = -1;

	@OriginalMember(owner = "client!lu", name = "hb", descriptor = "I")
	private int anInt4346 = 0;

	@OriginalMember(owner = "client!lu", name = "eb", descriptor = "I")
	private int anInt4343 = 0;

	@OriginalMember(owner = "client!lu", name = "cb", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!lu", name = "lb", descriptor = "I")
	private int lb = -32768;

	@OriginalMember(owner = "client!lu", name = "Q", descriptor = "I")
	public final int anInt4335;

	@OriginalMember(owner = "client!lu", name = "R", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
	public final int anInt4334;

	@OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
	public final int anInt4333;

	@OriginalMember(owner = "client!lu", name = "bb", descriptor = "I")
	private final int anInt4342;

	@OriginalMember(owner = "client!lu", name = "qb", descriptor = "I")
	public final int anInt4351;

	@OriginalMember(owner = "client!lu", name = "S", descriptor = "I")
	private final int anInt4336;

	@OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
	private final int anInt4332;

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
	private final int anInt4331;

	@OriginalMember(owner = "client!lu", name = "db", descriptor = "Lclient!jl;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class3_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static221.method3331(arg1, arg3, arg2) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4335 = arg5;
		this.aBoolean283 = arg11;
		this.aBoolean284 = false;
		this.anInt4334 = arg6;
		this.anInt4333 = arg10;
		this.anInt4342 = arg0;
		this.anInt4351 = arg9;
		this.anInt4336 = arg8;
		this.anInt4332 = arg4;
		this.anInt4331 = arg7;
		@Pc(77) int local77 = Static141.aClass141_2.method3177(this.anInt4342).anInt2019;
		if (local77 == -1) {
			this.aClass131_1 = null;
		} else {
			this.aClass131_1 = Static5.aClass217_1.method5234(local77);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZIII)V")
	public void method3661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) double local17;
		if (!this.aBoolean284) {
			local17 = arg3 - super.anInt7202;
			@Pc(23) double local23 = (double) (arg2 - super.anInt7207);
			@Pc(32) double local32 = Math.sqrt(local17 * local17 + local23 * local23);
			this.aDouble7 = (double) super.anInt7202 + local17 * (double) this.anInt4336 / local32;
			this.aDouble2 = (double) super.anInt7207 + local23 * (double) this.anInt4336 / local32;
			if (this.aBoolean283) {
				this.aDouble8 = Static221.method3331(super.aByte103, (int) this.aDouble2, (int) this.aDouble7) - this.anInt4332;
			} else {
				this.aDouble8 = super.anInt7208;
			}
		}
		local17 = this.anInt4334 + 1 - arg0;
		this.aDouble4 = ((double) arg3 - this.aDouble7) / local17;
		this.aDouble6 = ((double) arg2 - this.aDouble2) / local17;
		this.aDouble3 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble4 * this.aDouble4);
		if (this.anInt4331 == -1) {
			this.aDouble5 = ((double) arg1 - this.aDouble8) / local17;
		} else {
			if (!this.aBoolean284) {
				this.aDouble5 = -this.aDouble3 * Math.tan((double) this.anInt4331 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg1 - this.aDouble5 * local17 - this.aDouble8) * 2.0D / (local17 * local17);
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)I")
	@Override
	public int method5947() {
		return this.lb;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
		@Pc(11) Class224 local11 = this.method3667(0, arg0);
		if (local11 == null) {
			return;
		}
		@Pc(17) Class5 local17 = arg0.method5064();
		local17.method3835(this.anInt4328);
		local17.method3847(this.anInt4341);
		local17.method3843((int) this.aDouble7, (int) this.aDouble8, (int) this.aDouble2);
		this.lb = local11.method5812();
		this.method3666(local11, arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		@Pc(9) Class224 local9 = this.method3667(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class5 local21 = arg0.method5064();
		local21.method3835(this.anInt4328);
		local21.method3847(this.anInt4341);
		local21.method3843((int) this.aDouble7, (int) this.aDouble8, (int) this.aDouble2);
		if (this.aClass57_Sub4_3 == null) {
			local9.method5798(local21, null, 0);
		} else {
			@Pc(54) Class32 local54 = this.aClass57_Sub4_3.method3250();
			arg0.method5021(local9, local54, local21, null);
		}
		this.lb = local9.method5812();
		this.method3666(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V")
	@Override
	public void method5944() {
		super.aShort102 = super.aShort99 = (short) (this.aDouble2 / 128.0D);
		super.aShort101 = super.aShort100 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)V")
	public void method3664(@OriginalArg(0) int arg0) {
		this.aDouble7 += this.aDouble4 * (double) arg0;
		this.aDouble2 += this.aDouble6 * (double) arg0;
		this.aBoolean284 = true;
		if (this.aBoolean283) {
			this.aDouble8 = Static221.method3331(super.aByte103, (int) this.aDouble2, (int) this.aDouble7) - this.anInt4332;
		} else if (this.anInt4331 == -1) {
			this.aDouble8 += this.aDouble5 * (double) arg0;
		} else {
			this.aDouble8 += this.aDouble5 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble1;
			this.aDouble5 += this.aDouble1 * (double) arg0;
		}
		this.anInt4341 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4328 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass131_1 == null) {
			return;
		}
		this.anInt4343 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass131_1.anIntArray233[this.anInt4346] >= this.anInt4343) {
						return;
					}
					this.anInt4343 -= this.aClass131_1.anIntArray233[this.anInt4346];
					this.anInt4346++;
					if (this.anInt4346 >= this.aClass131_1.anIntArray235.length) {
						this.anInt4346 -= this.aClass131_1.anInt3698;
						if (this.anInt4346 < 0 || this.anInt4346 >= this.aClass131_1.anIntArray235.length) {
							this.anInt4346 = 0;
						}
					}
					this.anInt4345 = this.anInt4346 + 1;
				} while (this.aClass131_1.anIntArray235.length > this.anInt4345);
				this.anInt4345 -= this.aClass131_1.anInt3698;
			} while (this.anInt4345 >= 0 && this.aClass131_1.anIntArray235.length > this.anInt4345);
			this.anInt4345 = -1;
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V")
	public void method3665() {
		if (this.aClass57_Sub4_3 != null) {
			this.aClass57_Sub4_3.method3252();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!va;Lclient!eq;B)V")
	private void method3666(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class66 arg1) {
		@Pc(6) Class119[] local6 = arg0.method5794();
		@Pc(21) Class94[] local21 = arg0.method5807();
		if ((this.aClass57_Sub4_3 == null || this.aClass57_Sub4_3.aBoolean262) && (local6 != null || local21 != null)) {
			this.aClass57_Sub4_3 = new Class57_Sub4(Static66.anInt1741);
		}
		if (this.aClass57_Sub4_3 != null) {
			this.aClass57_Sub4_3.method3248(arg1, (long) Static66.anInt1741, local6, local21);
			this.aClass57_Sub4_3.method3255(super.aByte103, super.aShort101, super.aShort100, super.aShort102, super.aShort99);
		}
	}

	@OriginalMember(owner = "client!lu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass57_Sub4_3 != null) {
			this.aClass57_Sub4_3.method3252();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!eq;)Lclient!va;")
	private Class224 method3667(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		@Pc(9) Class58 local9 = Static141.aClass141_2.method3177(this.anInt4342);
		return local9.method1571(Static5.aClass217_1, this.anInt4346, this.anInt4343, arg1, arg0, this.anInt4345);
	}
}
