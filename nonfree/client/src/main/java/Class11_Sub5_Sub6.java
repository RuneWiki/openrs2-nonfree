import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class11_Sub5_Sub6 extends Class11_Sub5 {

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!vm", name = "U", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!vm", name = "X", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!vm", name = "db", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!vm", name = "hb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!vm", name = "jb", descriptor = "I")
	private int anInt7547;

	@OriginalMember(owner = "client!vm", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!vm", name = "nb", descriptor = "Lclient!uh;")
	private Class71_Sub6 aClass71_Sub6_7;

	@OriginalMember(owner = "client!vm", name = "ob", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!vm", name = "ub", descriptor = "I")
	private int anInt7553;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
	private int anInt7523 = -1;

	@OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
	private int anInt7533 = 0;

	@OriginalMember(owner = "client!vm", name = "Q", descriptor = "Z")
	private boolean aBoolean554 = false;

	@OriginalMember(owner = "client!vm", name = "kb", descriptor = "I")
	private int anInt7548 = -32768;

	@OriginalMember(owner = "client!vm", name = "rb", descriptor = "I")
	private int anInt7550 = 0;

	@OriginalMember(owner = "client!vm", name = "ib", descriptor = "I")
	private final int anInt7546;

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
	private final int anInt7531;

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
	public final int anInt7528;

	@OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
	public final int anInt7537;

	@OriginalMember(owner = "client!vm", name = "Z", descriptor = "I")
	public final int anInt7539;

	@OriginalMember(owner = "client!vm", name = "fb", descriptor = "I")
	private final int anInt7544;

	@OriginalMember(owner = "client!vm", name = "gb", descriptor = "I")
	public final int anInt7545;

	@OriginalMember(owner = "client!vm", name = "pb", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
	private final int anInt7529;

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "Lclient!kg;")
	private final Class130 aClass130_3;

	static {
		new Class21("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class11_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static21.method356(arg2, arg3, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt7546 = arg4;
		this.anInt7531 = arg8;
		this.aBoolean554 = false;
		this.anInt7528 = arg9;
		this.anInt7537 = arg5;
		this.anInt7539 = arg6;
		this.anInt7544 = arg0;
		this.anInt7545 = arg10;
		this.aBoolean555 = arg11;
		this.anInt7529 = arg7;
		@Pc(77) int local77 = Static193.aClass186_1.method4462(this.anInt7544).anInt4573;
		if (local77 == -1) {
			this.aClass130_3 = null;
		} else {
			this.aClass130_3 = Static143.aClass85_1.method2406(local77);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ka;Lclient!qa;I)V")
	private void method6046(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class30 arg1) {
		@Pc(6) Class61[] local6 = arg0.method6076();
		@Pc(9) Class239[] local9 = arg0.method6083();
		if ((this.aClass71_Sub6_7 == null || this.aClass71_Sub6_7.aBoolean535) && (local6 != null || local9 != null)) {
			this.aClass71_Sub6_7 = Static415.method5785(Static277.anInt2834);
		}
		if (this.aClass71_Sub6_7 != null) {
			this.aClass71_Sub6_7.method5792(arg1, (long) Static277.anInt2834, local6, local9);
			this.aClass71_Sub6_7.method5789(super.aByte100, super.aShort95, super.aShort94, super.aShort93, super.aShort92);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
	@Override
	public void method6040() {
		super.aShort93 = super.aShort92 = (short) (this.aDouble2 / 128.0D);
		super.aShort95 = super.aShort94 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!qa;II)Lclient!ka;")
	private Class57 method6049(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class149 local14 = Static193.aClass186_1.method4462(this.anInt7544);
		return local14.method3923(arg0, Static143.aClass85_1, this.anInt7533, arg1, this.anInt7550, this.anInt7523);
	}

	@OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass71_Sub6_7 != null) {
			this.aClass71_Sub6_7.method5788();
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(Z)V")
	public void method6050() {
		if (this.aClass71_Sub6_7 != null) {
			this.aClass71_Sub6_7.method5788();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
	public void method6051(@OriginalArg(1) int arg0) {
		this.aDouble7 += this.lb * (double) arg0;
		this.aBoolean554 = true;
		this.aDouble2 += (double) arg0 * this.aDouble4;
		if (this.aBoolean555) {
			this.aDouble8 = Static21.method356((int) this.aDouble7, (int) this.aDouble2, super.aByte100) - this.anInt7546;
		} else if (this.anInt7529 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble8 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble3 + (double) arg0 * this.aDouble5;
			this.aDouble5 += (double) arg0 * this.aDouble3;
		}
		this.anInt7547 = (int) (Math.atan2(this.lb, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt7553 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass130_3 == null) {
			return;
		}
		this.anInt7533 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass130_3.anIntArray308[this.anInt7550] >= this.anInt7533) {
						return;
					}
					this.anInt7533 -= this.aClass130_3.anIntArray308[this.anInt7550];
					this.anInt7550++;
					if (this.aClass130_3.anIntArray306.length <= this.anInt7550) {
						this.anInt7550 -= this.aClass130_3.anInt3940;
						if (this.anInt7550 < 0 || this.aClass130_3.anIntArray306.length <= this.anInt7550) {
							this.anInt7550 = 0;
						}
					}
					this.anInt7523 = this.anInt7550 + 1;
				} while (this.anInt7523 < this.aClass130_3.anIntArray306.length);
				this.anInt7523 -= this.aClass130_3.anInt3940;
			} while (this.anInt7523 >= 0 && this.aClass130_3.anIntArray306.length > this.anInt7523);
			this.anInt7523 = -1;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		@Pc(11) Class57 local11 = this.method6049(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class72 local18 = arg0.method2092();
		local18.SA(this.anInt7553);
		local18.CA(this.anInt7547);
		local18.J((int) this.aDouble7, (int) this.aDouble8, (int) this.aDouble2);
		if (this.aClass71_Sub6_7 == null) {
			local11.method6073(local18, null, 0);
		} else {
			@Pc(44) Class270 local44 = this.aClass71_Sub6_7.method5794();
			arg0.method2041(local11, local44, local18, null);
		}
		this.anInt7548 = local11.ja();
		this.method6046(local11, arg0);
		return null;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)I")
	@Override
	public int method6044() {
		return this.anInt7548;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBIII)V")
	public void method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) double local15;
		if (!this.aBoolean554) {
			local15 = arg2 - super.anInt7514;
			@Pc(22) double local22 = (double) (arg0 - super.anInt7515);
			@Pc(31) double local31 = Math.sqrt(local15 * local15 + local22 * local22);
			this.aDouble2 = (double) super.anInt7515 + (double) this.anInt7531 * local22 / local31;
			this.aDouble7 = (double) super.anInt7514 + (double) this.anInt7531 * local15 / local31;
			if (this.aBoolean555) {
				this.aDouble8 = Static21.method356((int) this.aDouble7, (int) this.aDouble2, super.aByte100) - this.anInt7546;
			} else {
				this.aDouble8 = super.anInt7511;
			}
		}
		local15 = this.anInt7539 + 1 - arg3;
		this.aDouble4 = ((double) arg0 - this.aDouble2) / local15;
		this.lb = ((double) arg2 - this.aDouble7) / local15;
		this.aDouble6 = Math.sqrt(this.lb * this.lb + this.aDouble4 * this.aDouble4);
		if (this.anInt7529 == -1) {
			this.aDouble5 = ((double) arg1 - this.aDouble8) / local15;
		} else {
			if (!this.aBoolean554) {
				this.aDouble5 = -this.aDouble6 * Math.tan((double) this.anInt7529 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg1 - this.aDouble8 - this.aDouble5 * local15) * 2.0D / (local15 * local15);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
		@Pc(9) Class57 local9 = this.method6049(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class72 local15 = arg0.method2092();
		local15.SA(this.anInt7553);
		local15.CA(this.anInt7547);
		local15.J((int) this.aDouble7, (int) this.aDouble8, (int) this.aDouble2);
		this.anInt7548 = local9.ja();
		this.method6046(local9, arg0);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return null;
	}
}
