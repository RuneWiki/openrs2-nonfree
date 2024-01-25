import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class9_Sub1_Sub1_Sub3 extends Class9_Sub1_Sub1 {

	@OriginalMember(owner = "client!be", name = "R", descriptor = "I")
	private int anInt809;

	@OriginalMember(owner = "client!be", name = "T", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "Lclient!gp;")
	private Class9_Sub6 aClass9_Sub6_3;

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!be", name = "Ab", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!be", name = "Gb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!be", name = "Jb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
	private int anInt822 = -1;

	@OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
	private int anInt823 = 0;

	@OriginalMember(owner = "client!be", name = "U", descriptor = "I")
	private int anInt811 = 0;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!be", name = "Ib", descriptor = "I")
	private int anInt836 = 0;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!be", name = "zb", descriptor = "I")
	private final int anInt831;

	@OriginalMember(owner = "client!be", name = "Lb", descriptor = "I")
	private final int anInt838;

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
	public final int anInt808;

	@OriginalMember(owner = "client!be", name = "Fb", descriptor = "I")
	private final int anInt834;

	@OriginalMember(owner = "client!be", name = "db", descriptor = "I")
	private final int anInt819;

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "I")
	public final int anInt829;

	@OriginalMember(owner = "client!be", name = "Kb", descriptor = "I")
	public final int anInt837;

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
	public final int anInt815;

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "Z")
	private final boolean aBoolean76;

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "Lclient!as;")
	private final Class17 aClass17_1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class9_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static130.method2562(arg4, arg1, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt831 = arg9;
		this.aBoolean74 = false;
		this.anInt838 = arg0;
		this.anInt808 = arg11;
		this.anInt834 = arg5;
		this.anInt819 = arg8;
		this.anInt829 = arg7;
		this.anInt837 = arg10;
		this.anInt815 = arg6;
		this.aBoolean76 = arg12;
		@Pc(85) int local85 = Static547.aClass248_2.method5708(this.anInt838).anInt4956;
		if (local85 == -1) {
			this.aClass17_1 = null;
		} else {
			this.aClass17_1 = Static330.aClass279_2.method6216(local85);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!r;II)Lclient!da;")
	private Class57 method617(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class175 local14 = Static547.aClass248_2.method5708(this.anInt838);
		return local14.method4324(Static330.aClass279_2, this.anInt822, this.anInt811, this.anInt823, arg1, arg0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
	public void method618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean74) {
			local8 = arg2 - super.anInt8975;
			@Pc(15) double local15 = (double) (arg3 - super.anInt8980);
			@Pc(24) double local24 = Math.sqrt(local8 * local8 + local15 * local15);
			this.aDouble1 = (double) super.anInt8975 + (double) this.anInt831 * local8 / local24;
			this.aDouble8 = (double) super.anInt8980 + (double) this.anInt831 * local15 / local24;
			if (this.aBoolean76) {
				this.aDouble3 = Static130.method2562((int) this.aDouble8, super.aByte126, (int) this.aDouble1) - this.anInt834;
			} else {
				this.aDouble3 = super.anInt8977;
			}
		}
		local8 = this.anInt829 + 1 - arg1;
		this.aDouble7 = ((double) arg2 - this.aDouble1) / local8;
		this.aDouble4 = ((double) arg3 - this.aDouble8) / local8;
		this.aDouble5 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble4 * this.aDouble4);
		if (this.anInt819 == -1) {
			this.aDouble2 = ((double) arg0 - this.aDouble3) / local8;
		} else {
			if (!this.aBoolean74) {
				this.aDouble2 = -this.aDouble5 * Math.tan((double) this.anInt819 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg0 - local8 * this.aDouble2 - this.aDouble3) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		@Pc(11) Class57 local11 = this.method617(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class109 local18 = arg0.method7142();
		local18.oa(this.anInt809);
		local18.ZA(this.anInt826);
		local18.U((int) this.aDouble1, (int) this.aDouble3, (int) this.aDouble8);
		this.method624(local11, arg0, local18);
		if (Static225.aBoolean335) {
			local11.method7521(local18, null, Static354.anInt6136, 0);
		} else {
			local11.method7501(local18, null, 0);
		}
		if (this.aClass9_Sub6_3 != null) {
			@Pc(71) Class96 local71 = this.aClass9_Sub6_3.method3053();
			if (Static225.aBoolean335) {
				arg0.method7176(local71, Static354.anInt6136);
			} else {
				arg0.method7189(local71);
			}
		}
		this.aBoolean73 = local11.LA();
		this.lb = local11.J();
		this.anInt836 = local11.RA();
		return null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public void method619(@OriginalArg(0) int arg0) {
		this.aBoolean74 = true;
		this.aDouble1 += (double) arg0 * this.aDouble7;
		this.aDouble8 += this.aDouble4 * (double) arg0;
		if (this.aBoolean76) {
			this.aDouble3 = Static130.method2562((int) this.aDouble8, super.aByte126, (int) this.aDouble1) - this.anInt834;
		} else if (this.anInt819 == -1) {
			this.aDouble3 += (double) arg0 * this.aDouble2;
		} else {
			this.aDouble3 += (double) arg0 * this.aDouble2 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble6;
			this.aDouble2 += this.aDouble6 * (double) arg0;
		}
		this.anInt826 = (int) (Math.atan2(this.aDouble7, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt809 = (int) (Math.atan2(this.aDouble2, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass17_1 == null) {
			return;
		}
		this.anInt811 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass17_1.anIntArray54[this.anInt823] >= this.anInt811) {
						return;
					}
					this.anInt811 -= this.aClass17_1.anIntArray54[this.anInt823];
					this.anInt823++;
					if (this.aClass17_1.anIntArray55.length <= this.anInt823) {
						this.anInt823 -= this.aClass17_1.anInt551;
						if (this.anInt823 < 0 || this.aClass17_1.anIntArray55.length <= this.anInt823) {
							this.anInt823 = 0;
						}
					}
					this.anInt822 = this.anInt823 + 1;
				} while (this.anInt822 < this.aClass17_1.anIntArray55.length);
				this.anInt822 -= this.aClass17_1.anInt551;
			} while (this.anInt822 >= 0 && this.aClass17_1.anIntArray55.length > this.anInt822);
			this.anInt822 = -1;
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return false;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt836 = 94;
		}
		return this.anInt836;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aBoolean73;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	@Override
	public void method7477() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!be", name = "j", descriptor = "(I)V")
	public void method623() {
		if (this.aClass9_Sub6_3 != null) {
			this.aClass9_Sub6_3.method3059();
		}
	}

	@OriginalMember(owner = "client!be", name = "i", descriptor = "(I)V")
	@Override
	public void method7086() {
		super.aShort112 = super.aShort114 = (short) (this.aDouble1 / 512.0D);
		super.aShort115 = super.aShort113 = (short) (this.aDouble8 / 512.0D);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return this.lb;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!da;Lclient!r;Lclient!q;Z)V")
	private void method624(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class109 arg2) {
		arg0.method7525(arg2);
		@Pc(9) Class323[] local9 = arg0.method7503();
		@Pc(18) Class15[] local18 = arg0.method7516();
		if ((this.aClass9_Sub6_3 == null || this.aClass9_Sub6_3.aBoolean274) && (local9 != null || local18 != null)) {
			this.aClass9_Sub6_3 = Static177.method3058(Static305.anInt5560, true);
		}
		if (this.aClass9_Sub6_3 != null) {
			this.aClass9_Sub6_3.method3060(arg1, (long) Static305.anInt5560, local9, local18);
			this.aClass9_Sub6_3.method3049(super.aByte126, super.aShort112, super.aShort114, super.aShort115, super.aShort113);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
		@Pc(9) Class57 local9 = this.method617(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class109 local15 = arg0.method7142();
		local15.oa(this.anInt809);
		local15.ZA(this.anInt826);
		local15.U((int) this.aDouble1, (int) this.aDouble3, (int) this.aDouble8);
		this.lb = local9.J();
		this.anInt836 = local9.RA();
		this.method624(local9, arg0, local15);
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7483() {
		return false;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!gfa;IILclient!r;Z)V")
	@Override
	public void method7479(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class43 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!be", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub6_3 != null) {
			this.aClass9_Sub6_3.method3059();
		}
	}
}
