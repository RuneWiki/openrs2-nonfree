import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class24_Sub3_Sub5 extends Class24_Sub3 {

	@OriginalMember(owner = "client!us", name = "A", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!us", name = "D", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!us", name = "E", descriptor = "Lclient!oi;")
	private Class40_Sub6 aClass40_Sub6_7;

	@OriginalMember(owner = "client!us", name = "G", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!us", name = "P", descriptor = "I")
	private int anInt7025;

	@OriginalMember(owner = "client!us", name = "Y", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!us", name = "cb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!us", name = "eb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!us", name = "fb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!us", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!us", name = "mb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
	private int anInt7026 = 0;

	@OriginalMember(owner = "client!us", name = "W", descriptor = "I")
	private int anInt7031 = -1;

	@OriginalMember(owner = "client!us", name = "hb", descriptor = "I")
	private int anInt7036 = -32768;

	@OriginalMember(owner = "client!us", name = "ib", descriptor = "I")
	private int anInt7037 = 0;

	@OriginalMember(owner = "client!us", name = "V", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!us", name = "gb", descriptor = "I")
	private final int anInt7035;

	@OriginalMember(owner = "client!us", name = "J", descriptor = "I")
	public final int anInt7019;

	@OriginalMember(owner = "client!us", name = "u", descriptor = "I")
	public final int anInt7010;

	@OriginalMember(owner = "client!us", name = "x", descriptor = "I")
	private final int anInt7012;

	@OriginalMember(owner = "client!us", name = "y", descriptor = "I")
	public final int anInt7013;

	@OriginalMember(owner = "client!us", name = "T", descriptor = "I")
	private final int anInt7029;

	@OriginalMember(owner = "client!us", name = "U", descriptor = "I")
	private final int anInt7030;

	@OriginalMember(owner = "client!us", name = "Z", descriptor = "Z")
	private final boolean aBoolean461;

	@OriginalMember(owner = "client!us", name = "R", descriptor = "I")
	public final int anInt7027;

	@OriginalMember(owner = "client!us", name = "v", descriptor = "Lclient!jv;")
	private final Class137 aClass137_3;

	static {
		new Class182("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class24_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static326.method4459(arg1, arg2, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt7035 = arg0;
		this.anInt7019 = arg9;
		this.anInt7010 = arg10;
		this.anInt7012 = arg7;
		this.anInt7013 = arg6;
		this.anInt7029 = arg4;
		this.aBoolean460 = false;
		this.anInt7030 = arg8;
		this.aBoolean461 = arg11;
		this.anInt7027 = arg5;
		@Pc(78) int local78 = Static147.aClass107_1.method2639(this.anInt7035).anInt4316;
		if (local78 == -1) {
			this.aClass137_3 = null;
		} else {
			this.aClass137_3 = Static281.aClass98_3.method2405(local78);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIII)V")
	public void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean460) {
			local8 = arg0 - super.anInt7092;
			@Pc(14) double local14 = (double) (arg1 - super.anInt7094);
			@Pc(23) double local23 = Math.sqrt(local14 * local14 + local8 * local8);
			this.aDouble3 = (double) this.anInt7030 * local8 / local23 + (double) super.anInt7092;
			this.aDouble8 = (double) super.anInt7094 + local14 * (double) this.anInt7030 / local23;
			if (this.aBoolean461) {
				this.aDouble7 = Static326.method4459(super.aByte98, (int) this.aDouble3, (int) this.aDouble8) - this.anInt7029;
			} else {
				this.aDouble7 = super.anInt7096;
			}
		}
		local8 = this.anInt7013 + 1 - arg3;
		this.aDouble9 = ((double) arg0 - this.aDouble3) / local8;
		this.aDouble2 = ((double) arg1 - this.aDouble8) / local8;
		this.aDouble5 = Math.sqrt(this.aDouble9 * this.aDouble9 + this.aDouble2 * this.aDouble2);
		if (this.anInt7012 == -1) {
			this.aDouble6 = ((double) arg2 - this.aDouble7) / local8;
		} else {
			if (!this.aBoolean460) {
				this.aDouble6 = -this.aDouble5 * Math.tan((double) this.anInt7012 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg2 - local8 * this.aDouble6 - this.aDouble7) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V")
	public void method5510() {
		if (this.aClass40_Sub6_7 != null) {
			this.aClass40_Sub6_7.method4097();
		}
	}

	@OriginalMember(owner = "client!us", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass40_Sub6_7 != null) {
			this.aClass40_Sub6_7.method4097();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILclient!za;)Lclient!e;")
	private Class63 method5513(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(16) Class156 local16 = Static147.aClass107_1.method2639(this.anInt7035);
		return local16.method3463(this.anInt7031, Static281.aClass98_3, arg0, this.anInt7037, this.anInt7026, arg1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!e;Lclient!za;I)V")
	private void method5514(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class50 arg1) {
		@Pc(6) Class78[] local6 = arg0.method6094();
		@Pc(9) Class141[] local9 = arg0.method6098();
		if ((this.aClass40_Sub6_7 == null || this.aClass40_Sub6_7.aBoolean346) && (local6 != null || local9 != null)) {
			this.aClass40_Sub6_7 = new Class40_Sub6(Static400.anInt6752);
		}
		if (this.aClass40_Sub6_7 != null) {
			this.aClass40_Sub6_7.method4099(arg1, (long) Static400.anInt6752, local6, local9);
			this.aClass40_Sub6_7.method4091(super.aByte98, super.aShort107, super.aShort106, super.aShort105, super.aShort104);
		}
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(I)I")
	@Override
	public int method5579() {
		return this.anInt7036;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
		@Pc(9) Class63 local9 = this.method5513(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(23) Class34 local23 = arg0.method5819();
		local23.g(this.anInt7025);
		local23.EA(this.lb);
		local23.W((int) this.aDouble3, (int) this.aDouble7, (int) this.aDouble8);
		this.anInt7036 = local9.B();
		this.method5514(local9, arg0);
	}

	@OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V")
	@Override
	public void method5580() {
		super.aShort107 = super.aShort106 = (short) (this.aDouble3 / 128.0D);
		super.aShort105 = super.aShort104 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		@Pc(9) Class63 local9 = this.method5513(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class34 local16 = arg0.method5819();
		local16.g(this.anInt7025);
		local16.EA(this.lb);
		local16.W((int) this.aDouble3, (int) this.aDouble7, (int) this.aDouble8);
		if (this.aClass40_Sub6_7 == null) {
			local9.method6090(local16, null, 0);
		} else {
			@Pc(48) Class121 local48 = this.aClass40_Sub6_7.method4088();
			arg0.method5845(local9, local48, local16, null);
		}
		this.anInt7036 = local9.B();
		this.method5514(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(II)V")
	public void method5519(@OriginalArg(1) int arg0) {
		this.aDouble8 += this.aDouble2 * (double) arg0;
		this.aDouble3 += this.aDouble9 * (double) arg0;
		this.aBoolean460 = true;
		if (this.aBoolean461) {
			this.aDouble7 = Static326.method4459(super.aByte98, (int) this.aDouble3, (int) this.aDouble8) - this.anInt7029;
		} else if (this.anInt7012 == -1) {
			this.aDouble7 += (double) arg0 * this.aDouble6;
		} else {
			this.aDouble7 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble4 + this.aDouble6 * (double) arg0;
			this.aDouble6 += this.aDouble4 * (double) arg0;
		}
		this.lb = (int) (Math.atan2(this.aDouble9, this.aDouble2) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt7025 = (int) (Math.atan2(this.aDouble6, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass137_3 == null) {
			return;
		}
		this.anInt7037 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass137_3.anIntArray404[this.anInt7026] >= this.anInt7037) {
						return;
					}
					this.anInt7037 -= this.aClass137_3.anIntArray404[this.anInt7026];
					this.anInt7026++;
					if (this.anInt7026 >= this.aClass137_3.anIntArray403.length) {
						this.anInt7026 -= this.aClass137_3.anInt4046;
						if (this.anInt7026 < 0 || this.aClass137_3.anIntArray403.length <= this.anInt7026) {
							this.anInt7026 = 0;
						}
					}
					this.anInt7031 = this.anInt7026 + 1;
				} while (this.aClass137_3.anIntArray403.length > this.anInt7031);
				this.anInt7031 -= this.aClass137_3.anInt4046;
			} while (this.anInt7031 >= 0 && this.anInt7031 < this.aClass137_3.anIntArray403.length);
			this.anInt7031 = -1;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return false;
	}
}
