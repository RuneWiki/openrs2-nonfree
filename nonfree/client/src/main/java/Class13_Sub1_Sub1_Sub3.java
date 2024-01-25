import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class13_Sub1_Sub1_Sub3 extends Class13_Sub1_Sub1 {

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "D")
	private double aDouble41;

	@OriginalMember(owner = "client!qr", name = "T", descriptor = "I")
	private int anInt7562;

	@OriginalMember(owner = "client!qr", name = "Y", descriptor = "D")
	private double aDouble42;

	@OriginalMember(owner = "client!qr", name = "mb", descriptor = "Lclient!pba;")
	private Class13_Sub9 aClass13_Sub9_8;

	@OriginalMember(owner = "client!qr", name = "nb", descriptor = "D")
	private double aDouble43;

	@OriginalMember(owner = "client!qr", name = "pb", descriptor = "I")
	private int anInt7579;

	@OriginalMember(owner = "client!qr", name = "wb", descriptor = "D")
	private double aDouble44;

	@OriginalMember(owner = "client!qr", name = "Bb", descriptor = "D")
	private double aDouble45;

	@OriginalMember(owner = "client!qr", name = "Cb", descriptor = "D")
	private double aDouble46;

	@OriginalMember(owner = "client!qr", name = "Ib", descriptor = "D")
	private double aDouble47;

	@OriginalMember(owner = "client!qr", name = "Lb", descriptor = "D")
	private double aDouble48;

	@OriginalMember(owner = "client!qr", name = "hb", descriptor = "I")
	private int anInt7574 = 0;

	@OriginalMember(owner = "client!qr", name = "ab", descriptor = "I")
	private int anInt7568 = 0;

	@OriginalMember(owner = "client!qr", name = "xb", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "client!qr", name = "vb", descriptor = "I")
	private int anInt7584 = 0;

	@OriginalMember(owner = "client!qr", name = "fb", descriptor = "I")
	private int anInt7572 = -1;

	@OriginalMember(owner = "client!qr", name = "Eb", descriptor = "Z")
	private boolean aBoolean563 = false;

	@OriginalMember(owner = "client!qr", name = "zb", descriptor = "I")
	private int anInt7586 = 0;

	@OriginalMember(owner = "client!qr", name = "rb", descriptor = "I")
	private final int anInt7581;

	@OriginalMember(owner = "client!qr", name = "sb", descriptor = "I")
	private final int anInt7582;

	@OriginalMember(owner = "client!qr", name = "Kb", descriptor = "I")
	public final int anInt7593;

	@OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
	public final int anInt7561;

	@OriginalMember(owner = "client!qr", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!qr", name = "Z", descriptor = "I")
	public final int anInt7567;

	@OriginalMember(owner = "client!qr", name = "ob", descriptor = "I")
	private final int anInt7578;

	@OriginalMember(owner = "client!qr", name = "qb", descriptor = "I")
	private final int anInt7580;

	@OriginalMember(owner = "client!qr", name = "eb", descriptor = "Z")
	private final boolean aBoolean561;

	@OriginalMember(owner = "client!qr", name = "Db", descriptor = "I")
	public final int anInt7588;

	@OriginalMember(owner = "client!qr", name = "X", descriptor = "I")
	private final int anInt7566;

	@OriginalMember(owner = "client!qr", name = "ub", descriptor = "Lclient!ec;")
	private final Class81 aClass81_3;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class13_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static504.method6917(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt7581 = arg14;
		this.anInt7582 = arg8;
		this.anInt7593 = arg11;
		this.anInt7561 = arg12;
		this.aBoolean562 = false;
		this.lb = arg10;
		this.anInt7567 = arg6;
		this.anInt7578 = arg0;
		this.anInt7580 = arg9;
		this.aBoolean561 = arg13;
		this.anInt7588 = arg7;
		this.anInt7566 = arg5;
		@Pc(90) int local90 = Static460.aClass155_2.method3363(this.anInt7578).anInt1044;
		if (local90 == -1) {
			this.aClass81_3 = null;
		} else {
			this.aClass81_3 = Static540.aClass173_2.method3791(local90);
		}
	}

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.anInt7568;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!ka;")
	private Class182 method6397(@OriginalArg(0) Class95 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class39 local15 = Static460.aClass155_2.method3363(this.anInt7578);
		return local15.method816(arg0, this.anInt7574, Static540.aClass173_2, arg1, this.anInt7572, this.anInt7586);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ka;BLclient!uha;Lclient!ha;)V")
	private void method6398(@OriginalArg(0) Class182 arg0, @OriginalArg(2) Class177 arg1, @OriginalArg(3) Class95 arg2) {
		arg0.method6197(arg1);
		@Pc(16) Class143[] local16 = arg0.method6217();
		@Pc(19) Class255[] local19 = arg0.method6196();
		if ((this.aClass13_Sub9_8 == null || this.aClass13_Sub9_8.aBoolean490) && (local16 != null || local19 != null)) {
			this.aClass13_Sub9_8 = Static423.method5656(Static262.anInt5597, true);
		}
		if (this.aClass13_Sub9_8 != null) {
			this.aClass13_Sub9_8.method5659(arg2, (long) Static262.anInt5597, local16, local19);
			this.aClass13_Sub9_8.method5655(super.aByte127, super.aShort117, super.aShort120, super.aShort119, super.aShort118);
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)V")
	public void method6399(@OriginalArg(1) int arg0) {
		this.aBoolean562 = true;
		this.aDouble46 += (double) arg0 * this.aDouble42;
		this.aDouble43 += (double) arg0 * this.aDouble41;
		if (this.aBoolean561) {
			this.aDouble44 = Static504.method6917((int) this.aDouble46, super.aByte127, (int) this.aDouble43) - this.anInt7566;
		} else if (this.anInt7582 == -1) {
			this.aDouble44 += this.aDouble48 * (double) arg0;
		} else {
			this.aDouble44 += (double) arg0 * this.aDouble48 + this.aDouble45 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble48 += this.aDouble45 * (double) arg0;
		}
		this.anInt7562 = (int) (Math.atan2(this.aDouble42, this.aDouble41) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt7579 = (int) (Math.atan2(this.aDouble48, this.aDouble47) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass81_3 == null) {
			return;
		}
		this.anInt7586 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass81_3.anIntArray151[this.anInt7574] >= this.anInt7586) {
						return;
					}
					this.anInt7586 -= this.aClass81_3.anIntArray151[this.anInt7574];
					this.anInt7574++;
					if (this.aClass81_3.anIntArray149.length <= this.anInt7574) {
						this.anInt7574 -= this.aClass81_3.anInt2150;
						if (this.anInt7574 < 0 || this.anInt7574 >= this.aClass81_3.anIntArray149.length) {
							this.anInt7574 = 0;
						}
					}
					this.anInt7572 = this.anInt7574 + 1;
				} while (this.aClass81_3.anIntArray149.length > this.anInt7572);
				this.anInt7572 -= this.aClass81_3.anInt2150;
			} while (this.anInt7572 >= 0 && this.anInt7572 < this.aClass81_3.anIntArray149.length);
			this.anInt7572 = -1;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(Z)V")
	@Override
	public void method7691() {
		super.aShort119 = super.aShort118 = (short) (this.aDouble43 / 512.0D);
		super.aShort117 = super.aShort120 = (short) (this.aDouble46 / 512.0D);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public void method6400() {
		if (this.aClass13_Sub9_8 != null) {
			this.aClass13_Sub9_8.method5657();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub9_8 != null) {
			this.aClass13_Sub9_8.method5657();
		}
	}

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.anInt7584 : 63;
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aBoolean563;
	}

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "(B)V")
	public void method6401() {
		if (this.aBoolean562 || this.lb == 0) {
			return;
		}
		@Pc(23) Class13_Sub1_Sub1_Sub1 local23 = null;
		@Pc(32) int local32;
		if (this.lb < 0) {
			local32 = -this.lb - 1;
			if (Static528.anInt8672 == local32) {
				local23 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1;
			} else {
				local23 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local32];
			}
		} else {
			local32 = this.lb - 1;
			@Pc(59) Class2_Sub43 local59 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local32);
			if (local59 != null) {
				local23 = local59.aClass13_Sub1_Sub1_Sub1_Sub1_2;
			}
		}
		if (local23 == null) {
			return;
		}
		super.anInt10089 = local23.anInt10089;
		super.anInt10090 = local23.anInt10090;
		super.anInt10097 = Static504.method6917(local23.anInt10090, super.aByte127, local23.anInt10089) - this.anInt7566;
		if (this.anInt7581 < 0) {
			return;
		}
		@Pc(95) Class334 local95 = local23.method3964();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 0;
		if (local95.anIntArrayArray58 != null && local95.anIntArrayArray58[this.anInt7581] != null) {
			local99 = local95.anIntArrayArray58[this.anInt7581][2];
			local97 = local95.anIntArrayArray58[this.anInt7581][0];
		}
		if (local95.anIntArrayArray59 != null && local95.anIntArrayArray59[this.anInt7581] != null) {
			local97 += local95.anIntArrayArray59[this.anInt7581][0];
			local99 += local95.anIntArrayArray59[this.anInt7581][2];
		}
		if (local97 != 0 || local99 != 0) {
			@Pc(172) int local172 = local23.aClass116_7.method2590();
			@Pc(174) int local174 = local172;
			if (local23.anIntArray301 != null && local23.anIntArray301[this.anInt7581] != -1) {
				local174 = local23.anIntArray301[this.anInt7581];
			}
			@Pc(197) int local197 = local174 - local172 & 0x3FFF;
			@Pc(201) int local201 = Canvas_Sub1.anIntArray497[local197];
			@Pc(205) int local205 = Canvas_Sub1.anIntArray498[local197];
			@Pc(215) int local215 = local201 * local99 + local97 * local205 >> 14;
			local99 = local99 * local205 - local201 * local97 >> 14;
			super.anInt10090 += local215;
			super.anInt10089 += local99;
		}
		return;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		@Pc(11) Class182 local11 = this.method6397(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class177 local18 = arg0.method6967();
		local18.method7880(this.anInt7579);
		local18.method7874(this.anInt7562);
		local18.method7872((int) this.aDouble46, (int) this.aDouble44, (int) this.aDouble43);
		this.method6398(local11, local18, arg0);
		@Pc(54) Class13_Sub6 local54 = Static491.method6848(1, false);
		if (Static449.aBoolean538) {
			local11.method6194(local18, local54.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			local11.method6206(local18, local54.aClass13_Sub2Array1[0], 0);
		}
		if (this.aClass13_Sub9_8 != null) {
			@Pc(82) Class98 local82 = this.aClass13_Sub9_8.method5660();
			if (Static449.aBoolean538) {
				arg0.method6977(local82, Static638.anInt7982);
			} else {
				arg0.method6960(local82);
			}
		}
		this.aBoolean563 = local11.F();
		this.anInt7568 = local11.fa();
		this.anInt7584 = local11.ma();
		return local54;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIBII)V")
	public void method6403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean562) {
			local13 = arg2 - super.anInt10090;
			@Pc(19) double local19 = (double) (arg3 - super.anInt10089);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble46 = (double) super.anInt10090 + (double) this.anInt7580 * local13 / local28;
			this.aDouble43 = local19 * (double) this.anInt7580 / local28 + (double) super.anInt10089;
			if (this.aBoolean561) {
				this.aDouble44 = Static504.method6917((int) this.aDouble46, super.aByte127, (int) this.aDouble43) - this.anInt7566;
			} else {
				this.aDouble44 = super.anInt10097;
			}
		}
		local13 = this.anInt7588 + 1 - arg0;
		this.aDouble41 = ((double) arg3 - this.aDouble43) / local13;
		this.aDouble42 = ((double) arg2 - this.aDouble46) / local13;
		this.aDouble47 = Math.sqrt(this.aDouble41 * this.aDouble41 + this.aDouble42 * this.aDouble42);
		if (this.anInt7582 == -1) {
			this.aDouble48 = ((double) arg1 - this.aDouble44) / local13;
		} else {
			if (!this.aBoolean562) {
				this.aDouble48 = -this.aDouble47 * Math.tan((double) this.anInt7582 * 0.02454369D);
			}
			this.aDouble45 = ((double) arg1 - local13 * this.aDouble48 - this.aDouble44) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
		@Pc(17) Class182 local17 = this.method6397(arg0, 0);
		if (local17 == null) {
			return;
		}
		@Pc(23) Class177 local23 = arg0.method6967();
		local23.method7880(this.anInt7579);
		local23.method7874(this.anInt7562);
		local23.method7872((int) this.aDouble46, (int) this.aDouble44, (int) this.aDouble43);
		this.anInt7568 = local17.fa();
		this.anInt7584 = local17.ma();
		this.method6398(local17, local23, arg0);
	}
}
