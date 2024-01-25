import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class20_Sub2_Sub4_Sub4 extends Class20_Sub2_Sub4 {

	@OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
	private int anInt8159;

	@OriginalMember(owner = "client!sl", name = "S", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!sl", name = "T", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!sl", name = "X", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!sl", name = "bb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!sl", name = "qb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!sl", name = "rb", descriptor = "I")
	private int anInt8178;

	@OriginalMember(owner = "client!sl", name = "ub", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!sl", name = "Bb", descriptor = "Lclient!ii;")
	private Class20_Sub5 aClass20_Sub5_6;

	@OriginalMember(owner = "client!sl", name = "Gb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!sl", name = "Mb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!sl", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
	private int anInt8164 = 0;

	@OriginalMember(owner = "client!sl", name = "hb", descriptor = "I")
	private int anInt8170 = 0;

	@OriginalMember(owner = "client!sl", name = "xb", descriptor = "I")
	private int anInt8182 = 0;

	@OriginalMember(owner = "client!sl", name = "vb", descriptor = "Z")
	private boolean aBoolean586 = false;

	@OriginalMember(owner = "client!sl", name = "yb", descriptor = "I")
	private int anInt8183 = -1;

	@OriginalMember(owner = "client!sl", name = "Db", descriptor = "Z")
	private boolean aBoolean587 = false;

	@OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
	private final int anInt8162;

	@OriginalMember(owner = "client!sl", name = "Ab", descriptor = "I")
	public final int anInt8185;

	@OriginalMember(owner = "client!sl", name = "mb", descriptor = "I")
	private final int anInt8174;

	@OriginalMember(owner = "client!sl", name = "nb", descriptor = "I")
	private final int anInt8175;

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "Z")
	private final boolean aBoolean585;

	@OriginalMember(owner = "client!sl", name = "wb", descriptor = "I")
	public final int anInt8181;

	@OriginalMember(owner = "client!sl", name = "Lb", descriptor = "I")
	public final int anInt8192;

	@OriginalMember(owner = "client!sl", name = "Ob", descriptor = "I")
	public final int anInt8194;

	@OriginalMember(owner = "client!sl", name = "kb", descriptor = "I")
	private final int anInt8173;

	@OriginalMember(owner = "client!sl", name = "gb", descriptor = "Lclient!hca;")
	private final Class131 aClass131_2;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class20_Sub2_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static122.method2103(arg1, arg3, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.aBoolean587 = false;
		this.anInt8162 = arg8;
		this.anInt8185 = arg6;
		this.anInt8174 = arg5;
		this.anInt8175 = arg0;
		this.aBoolean585 = arg12;
		this.anInt8181 = arg7;
		this.anInt8192 = arg10;
		this.anInt8194 = arg11;
		this.anInt8173 = arg9;
		@Pc(85) int local85 = Static592.aClass98_2.method2295(this.anInt8175).anInt3012;
		if (local85 == -1) {
			this.aClass131_2 = null;
		} else {
			this.aClass131_2 = Static594.aClass311_2.method7009(local85);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
	public void method6796(@OriginalArg(0) int arg0) {
		this.aDouble6 += this.aDouble5 * (double) arg0;
		this.aDouble2 += this.aDouble8 * (double) arg0;
		this.aBoolean587 = true;
		if (this.aBoolean585) {
			this.aDouble4 = Static122.method2103(super.aByte116, (int) this.aDouble2, (int) this.aDouble6) - this.anInt8174;
		} else if (this.anInt8162 == -1) {
			this.aDouble4 += (double) arg0 * this.aDouble9;
		} else {
			this.aDouble4 += this.aDouble9 * (double) arg0 + (double) arg0 * this.aDouble7 * 0.5D * (double) arg0;
			this.aDouble9 += this.aDouble7 * (double) arg0;
		}
		this.anInt8159 = (int) (Math.atan2(this.aDouble8, this.aDouble5) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt8178 = (int) (Math.atan2(this.aDouble9, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass131_2 == null) {
			return;
		}
		this.anInt8170 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass131_2.anIntArray204[this.anInt8164] >= this.anInt8170) {
						return;
					}
					this.anInt8170 -= this.aClass131_2.anIntArray204[this.anInt8164];
					this.anInt8164++;
					if (this.anInt8164 >= this.aClass131_2.anIntArray202.length) {
						this.anInt8164 -= this.aClass131_2.anInt3744;
						if (this.anInt8164 < 0 || this.anInt8164 >= this.aClass131_2.anIntArray202.length) {
							this.anInt8164 = 0;
						}
					}
					this.anInt8183 = this.anInt8164 + 1;
				} while (this.aClass131_2.anIntArray202.length > this.anInt8183);
				this.anInt8183 -= this.aClass131_2.anInt3744;
			} while (this.anInt8183 >= 0 && this.aClass131_2.anIntArray202.length > this.anInt8183);
			this.anInt8183 = -1;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!q;Lclient!da;ILclient!r;)V")
	private void method6798(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) Class12 arg2) {
		arg1.method7588(arg0);
		@Pc(9) Class219[] local9 = arg1.method7597();
		@Pc(12) Class101[] local12 = arg1.method7599();
		if ((this.aClass20_Sub5_6 == null || this.aClass20_Sub5_6.aBoolean342) && (local9 != null || local12 != null)) {
			this.aClass20_Sub5_6 = Static220.method3658(Static81.anInt1910, true);
		}
		if (this.aClass20_Sub5_6 != null) {
			this.aClass20_Sub5_6.method3656(arg2, (long) Static81.anInt1910, local9, local12);
			this.aClass20_Sub5_6.method3655(super.aByte116, super.aShort100, super.aShort98, super.aShort97, super.aShort99);
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "(I)V")
	@Override
	public void method7202() {
		super.aShort97 = super.aShort99 = (short) (this.aDouble6 / 512.0D);
		super.aShort100 = super.aShort98 = (short) (this.aDouble2 / 512.0D);
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aBoolean586;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.anInt8182;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		@Pc(11) Class61 local11 = this.method6801(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class209 local18 = arg0.method6441();
		local18.oa(this.anInt8178);
		local18.ZA(this.anInt8159);
		local18.U((int) this.aDouble2, (int) this.aDouble4, (int) this.aDouble6);
		this.method6798(local18, local11, arg0);
		if (Static188.aBoolean320) {
			local11.method7592(local18, null, Static33.anInt894, 0);
		} else {
			local11.method7587(local18, null, 0);
		}
		if (this.aClass20_Sub5_6 != null) {
			@Pc(65) Class82 local65 = this.aClass20_Sub5_6.method3664();
			if (Static188.aBoolean320) {
				arg0.method6404(local65, Static33.anInt894);
			} else {
				arg0.method6460(local65);
			}
		}
		this.aBoolean586 = local11.LA();
		this.anInt8182 = local11.J();
		this.lb = local11.RA();
		return null;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
	public void method6800() {
		if (this.aClass20_Sub5_6 != null) {
			this.aClass20_Sub5_6.method3661();
		}
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!r;ZI)Lclient!da;")
	private Class61 method6801(@OriginalArg(0) Class12 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class116 local16 = Static592.aClass98_2.method2295(this.anInt8175);
		return local16.method2546(this.anInt8164, this.anInt8170, Static594.aClass311_2, this.anInt8183, arg1, arg0);
	}

	@OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub5_6 != null) {
			this.aClass20_Sub5_6.method3661();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method6801(null, -19);
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
		@Pc(15) Class61 local15 = this.method6801(arg0, 0);
		if (local15 == null) {
			return;
		}
		@Pc(21) Class209 local21 = arg0.method6441();
		local21.oa(this.anInt8178);
		local21.ZA(this.anInt8159);
		local21.U((int) this.aDouble2, (int) this.aDouble4, (int) this.aDouble6);
		this.anInt8182 = local15.J();
		this.lb = local15.RA();
		this.method6798(local21, local15, arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIB)V")
	public void method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) double local17;
		if (!this.aBoolean587) {
			local17 = arg1 - super.anInt8796;
			@Pc(24) double local24 = (double) (arg0 - super.anInt8795);
			@Pc(33) double local33 = Math.sqrt(local24 * local24 + local17 * local17);
			this.aDouble2 = local17 * (double) this.anInt8173 / local33 + (double) super.anInt8796;
			this.aDouble6 = (double) super.anInt8795 + (double) this.anInt8173 * local24 / local33;
			if (this.aBoolean585) {
				this.aDouble4 = Static122.method2103(super.aByte116, (int) this.aDouble2, (int) this.aDouble6) - this.anInt8174;
			} else {
				this.aDouble4 = super.anInt8790;
			}
		}
		local17 = this.anInt8181 + 1 - arg3;
		this.aDouble8 = ((double) arg1 - this.aDouble2) / local17;
		this.aDouble5 = ((double) arg0 - this.aDouble6) / local17;
		this.aDouble3 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble5 * this.aDouble5);
		if (this.anInt8162 == -1) {
			this.aDouble9 = ((double) arg2 - this.aDouble4) / local17;
		} else {
			if (!this.aBoolean587) {
				this.aDouble9 = -this.aDouble3 * Math.tan((double) this.anInt8162 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg2 - local17 * this.aDouble9 - this.aDouble4) * 2.0D / (local17 * local17);
		}
	}
}
