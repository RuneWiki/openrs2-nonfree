import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class10_Sub1_Sub3 extends Class10_Sub1 {

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
	private int anInt6194;

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "Lclient!hv;")
	private Class26_Sub3 aClass26_Sub3_4;

	@OriginalMember(owner = "client!nh", name = "gb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!nh", name = "hb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!nh", name = "jb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!nh", name = "kb", descriptor = "I")
	private int anInt6209;

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
	private int anInt6201 = 0;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
	private int anInt6192 = 0;

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
	private int anInt6186 = -32768;

	@OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
	private int anInt6205 = -1;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
	public final int anInt6182;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	private final int anInt6183;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!nh", name = "ib", descriptor = "I")
	private final int anInt6208;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	public final int anInt6184;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
	public final int anInt6202;

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
	public final int anInt6197;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	private final int anInt6181;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
	private final int anInt6187;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "Lclient!dv;")
	private final Class77 aClass77_1;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class10_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static160.method3164(arg2, arg1, arg3) - arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
		this.aBoolean460 = false;
		this.anInt6182 = arg9;
		this.anInt6183 = arg0;
		this.aBoolean459 = arg11;
		this.anInt6208 = arg4;
		this.anInt6184 = arg10;
		this.anInt6202 = arg5;
		this.anInt6197 = arg6;
		this.anInt6181 = arg7;
		this.anInt6187 = arg8;
		@Pc(78) int local78 = Static206.aClass275_1.method6050(this.anInt6183).anInt8788;
		if (local78 == -1) {
			this.aClass77_1 = null;
		} else {
			this.aClass77_1 = Static168.aClass327_2.method7326(local78);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLclient!oa;)Lclient!ba;")
	private Class9 method5246(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		@Pc(17) Class318 local17 = Static206.aClass275_1.method6050(this.anInt6183);
		return local17.method7218(arg0, Static168.aClass327_2, this.anInt6205, this.anInt6201, this.anInt6192, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		@Pc(9) Class9 local9 = this.method5246(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class134 local21 = arg0.method6842();
		local21.XA(this.anInt6194);
		local21.P(this.anInt6209);
		local21.G((int) this.aDouble8, (int) this.aDouble4, (int) this.aDouble6);
		this.method5250(local21, local9, arg0);
		if (this.aClass26_Sub3_4 == null) {
			local9.method4023(local21, null, 0);
		} else {
			@Pc(60) Class42 local60 = this.aClass26_Sub3_4.method3658();
			arg0.method6807(local9, local60, local21, null, 0);
		}
		this.anInt6186 = local9.DA();
		return null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
	public void method5248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean460) {
			local8 = arg1 - super.anInt8934;
			@Pc(15) double local15 = (double) (arg2 - super.anInt8929);
			@Pc(24) double local24 = Math.sqrt(local8 * local8 + local15 * local15);
			this.aDouble8 = (double) super.anInt8934 + (double) this.anInt6187 * local8 / local24;
			this.aDouble6 = (double) super.anInt8929 + (double) this.anInt6187 * local15 / local24;
			if (this.aBoolean459) {
				this.aDouble4 = Static160.method3164((int) this.aDouble8, super.aByte101, (int) this.aDouble6) - this.anInt6208;
			} else {
				this.aDouble4 = super.anInt8931;
			}
		}
		local8 = this.anInt6197 + 1 - arg0;
		this.aDouble2 = ((double) arg1 - this.aDouble8) / local8;
		this.aDouble7 = ((double) arg2 - this.aDouble6) / local8;
		this.aDouble5 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble2 * this.aDouble2);
		if (this.anInt6181 == -1) {
			this.aDouble3 = ((double) arg3 - this.aDouble4) / local8;
		} else {
			if (!this.aBoolean460) {
				this.aDouble3 = -this.aDouble5 * Math.tan((double) this.anInt6181 * 0.02454369D);
			}
			this.aDouble9 = ((double) arg3 - local8 * this.aDouble3 - this.aDouble4) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!q;ILclient!ba;Lclient!oa;)V")
	private void method5250(@OriginalArg(0) Class134 arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) Class66 arg2) {
		arg1.method4011(arg0);
		@Pc(18) Class181[] local18 = arg1.method4019();
		@Pc(21) Class89[] local21 = arg1.method4015();
		if ((this.aClass26_Sub3_4 == null || this.aClass26_Sub3_4.aBoolean320) && (local18 != null || local21 != null)) {
			this.aClass26_Sub3_4 = Static207.method3660(Static237.anInt7561, true);
		}
		if (this.aClass26_Sub3_4 != null) {
			this.aClass26_Sub3_4.method3659(arg2, (long) Static237.anInt7561, local18, local21);
			this.aClass26_Sub3_4.method3653(super.aByte101, super.aShort116, super.aShort118, super.aShort117, super.aShort115);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	@Override
	public void method7344() {
		super.aShort117 = super.aShort115 = (short) (this.aDouble6 / 512.0D);
		super.aShort116 = super.aShort118 = (short) (this.aDouble8 / 512.0D);
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(Z)I")
	@Override
	public int method7342() {
		return this.anInt6186;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
		@Pc(9) Class9 local9 = this.method5246(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class134 local15 = arg0.method6842();
		local15.XA(this.anInt6194);
		local15.P(this.anInt6209);
		local15.G((int) this.aDouble8, (int) this.aDouble4, (int) this.aDouble6);
		this.anInt6186 = local9.DA();
		this.method5250(local15, local9, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public void method5253() {
		if (this.aClass26_Sub3_4 != null) {
			this.aClass26_Sub3_4.method3661();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
	public void method5254(@OriginalArg(0) int arg0) {
		this.aDouble6 += this.aDouble7 * (double) arg0;
		this.aDouble8 += (double) arg0 * this.aDouble2;
		this.aBoolean460 = true;
		if (this.aBoolean459) {
			this.aDouble4 = Static160.method3164((int) this.aDouble8, super.aByte101, (int) this.aDouble6) - this.anInt6208;
		} else if (this.anInt6181 == -1) {
			this.aDouble4 += (double) arg0 * this.aDouble3;
		} else {
			this.aDouble4 += (double) arg0 * (double) arg0 * this.aDouble9 * 0.5D + (double) arg0 * this.aDouble3;
			this.aDouble3 += (double) arg0 * this.aDouble9;
		}
		this.anInt6209 = (int) (Math.atan2(this.aDouble2, this.aDouble7) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt6194 = (int) (Math.atan2(this.aDouble3, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass77_1 == null) {
			return;
		}
		this.anInt6201 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass77_1.anIntArray240[this.anInt6192] >= this.anInt6201) {
						return;
					}
					this.anInt6201 -= this.aClass77_1.anIntArray240[this.anInt6192];
					this.anInt6192++;
					if (this.aClass77_1.anIntArray238.length <= this.anInt6192) {
						this.anInt6192 -= this.aClass77_1.anInt2575;
						if (this.anInt6192 < 0 || this.anInt6192 >= this.aClass77_1.anIntArray238.length) {
							this.anInt6192 = 0;
						}
					}
					this.anInt6205 = this.anInt6192 + 1;
				} while (this.anInt6205 < this.aClass77_1.anIntArray238.length);
				this.anInt6205 -= this.aClass77_1.anInt2575;
			} while (this.anInt6205 >= 0 && this.aClass77_1.anIntArray238.length > this.anInt6205);
			this.anInt6205 = -1;
		}
	}

	@OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass26_Sub3_4 != null) {
			this.aClass26_Sub3_4.method3661();
		}
	}
}
