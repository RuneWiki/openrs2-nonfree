import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class28_Sub1_Sub1_Sub3 extends Class28_Sub1_Sub1 {

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "D")
	private double aDouble15;

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "D")
	private double aDouble16;

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
	private int anInt6681;

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
	private int anInt6684;

	@OriginalMember(owner = "client!o", name = "tb", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!o", name = "vb", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!o", name = "xb", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!o", name = "Eb", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!o", name = "Jb", descriptor = "D")
	private double aDouble22;

	@OriginalMember(owner = "client!o", name = "Lb", descriptor = "Lclient!sp;")
	private Class28_Sub7 aClass28_Sub7_3;

	@OriginalMember(owner = "client!o", name = "db", descriptor = "I")
	private int anInt6673 = 0;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
	private int anInt6672 = -1;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
	private int anInt6682 = 0;

	@OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!o", name = "Ab", descriptor = "I")
	private int anInt6689 = 0;

	@OriginalMember(owner = "client!o", name = "Qb", descriptor = "Z")
	private boolean aBoolean472 = false;

	@OriginalMember(owner = "client!o", name = "Vb", descriptor = "Z")
	private boolean aBoolean473 = false;

	@OriginalMember(owner = "client!o", name = "Nb", descriptor = "I")
	private final int anInt6698;

	@OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
	private final int anInt6678;

	@OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
	public final int anInt6685;

	@OriginalMember(owner = "client!o", name = "Ib", descriptor = "I")
	private final int anInt6695;

	@OriginalMember(owner = "client!o", name = "Hb", descriptor = "I")
	public final int anInt6694;

	@OriginalMember(owner = "client!o", name = "Kb", descriptor = "I")
	public final int anInt6696;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
	private final int anInt6670;

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "I")
	private final int anInt6686;

	@OriginalMember(owner = "client!o", name = "Db", descriptor = "I")
	public final int anInt6692;

	@OriginalMember(owner = "client!o", name = "Rb", descriptor = "I")
	private final int anInt6701;

	@OriginalMember(owner = "client!o", name = "Gb", descriptor = "Z")
	private final boolean aBoolean471;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "Lclient!vq;")
	private final Class372 aClass372_2;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class28_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static168.method3058(arg1, arg3, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt6698 = arg14;
		this.anInt6678 = arg9;
		this.aBoolean473 = false;
		this.anInt6685 = arg7;
		this.anInt6695 = arg0;
		this.anInt6694 = arg6;
		this.anInt6696 = arg12;
		this.anInt6670 = arg5;
		this.anInt6686 = arg8;
		this.anInt6692 = arg11;
		this.anInt6701 = arg10;
		this.aBoolean471 = arg13;
		@Pc(90) int local90 = Static354.aClass236_2.method5615(this.anInt6695).anInt4332;
		if (local90 == -1) {
			this.aClass372_2 = null;
		} else {
			this.aClass372_2 = Static243.aClass343_3.method8356(local90);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
		@Pc(9) Class95 local9 = this.method5964(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class239 local15 = arg0.method8447();
		local15.method9250(this.anInt6681);
		local15.method9243(this.anInt6684);
		local15.method9244((int) this.aDouble20, (int) this.aDouble15, (int) this.aDouble19);
		this.anInt6682 = local9.fa();
		this.lb = local9.ma();
		this.method5962(local9, arg0, local15);
	}

	@OriginalMember(owner = "client!o", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!o", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 != -13878) {
			this.aDouble16 = 0.3755719478872897D;
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBIII)V")
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean473) {
			local12 = (double) (arg1 - super.anInt10729);
			@Pc(19) double local19 = (double) (arg3 - super.anInt10731);
			@Pc(28) double local28 = Math.sqrt(local12 * local12 + local19 * local19);
			this.aDouble19 = (double) super.anInt10731 + (double) this.anInt6678 * local19 / local28;
			this.aDouble20 = (double) super.anInt10729 + (double) this.anInt6678 * local12 / local28;
			if (this.aBoolean471) {
				this.aDouble15 = (double) (Static168.method3058(super.aByte174, (int) this.aDouble20, (int) this.aDouble19) - this.anInt6670);
			} else {
				this.aDouble15 = (double) super.anInt10722;
			}
		}
		local12 = (double) (this.anInt6685 + 1 - arg0);
		this.aDouble22 = ((double) arg1 - this.aDouble20) / local12;
		this.aDouble17 = ((double) arg3 - this.aDouble19) / local12;
		this.aDouble18 = Math.sqrt(this.aDouble17 * this.aDouble17 + this.aDouble22 * this.aDouble22);
		if (this.anInt6686 == -1) {
			this.aDouble21 = ((double) arg2 - this.aDouble15) / local12;
		} else {
			if (!this.aBoolean473) {
				this.aDouble21 = -this.aDouble18 * Math.tan((double) this.anInt6686 * 0.02454369D);
			}
			this.aDouble16 = ((double) arg2 - this.aDouble15 - local12 * this.aDouble21) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public void method5959() {
		if (this.aBoolean473 || this.anInt6701 == 0) {
			return;
		}
		@Pc(13) Class28_Sub1_Sub1_Sub1 local13 = null;
		@Pc(24) int local24;
		if (this.anInt6701 >= 0) {
			local24 = this.anInt6701 - 1;
			@Pc(33) Class3_Sub3 local33 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local24);
			if (local33 != null) {
				local13 = local33.aClass28_Sub1_Sub1_Sub1_Sub2_1;
			}
		} else {
			local24 = -this.anInt6701 - 1;
			if (Static106.anInt2205 == local24) {
				local13 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2;
			} else {
				local13 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local24];
			}
		}
		if (local13 == null) {
			return;
		}
		super.anInt10731 = local13.anInt10731;
		super.anInt10729 = local13.anInt10729;
		super.anInt10722 = Static168.method3058(super.aByte174, local13.anInt10729, local13.anInt10731) - this.anInt6670;
		if (this.anInt6698 < 0) {
			return;
		}
		@Pc(89) Class359 local89 = local13.method9315();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 0;
		if (local89.anIntArrayArray62 != null && local89.anIntArrayArray62[this.anInt6698] != null) {
			local93 = local89.anIntArrayArray62[this.anInt6698][2];
			local91 = local89.anIntArrayArray62[this.anInt6698][0];
		}
		if (local89.anIntArrayArray63 != null && local89.anIntArrayArray63[this.anInt6698] != null) {
			local93 += local89.anIntArrayArray63[this.anInt6698][2];
			local91 += local89.anIntArrayArray63[this.anInt6698][0];
		}
		if (local91 != 0 || local93 != 0) {
			@Pc(163) int local163 = local13.aClass282_7.method7022();
			@Pc(165) int local165 = local163;
			if (local13.anIntArray954 != null && local13.anIntArray954[this.anInt6698] != -1) {
				local165 = local13.anIntArray954[this.anInt6698];
			}
			@Pc(189) int local189 = local165 - local163 & 0x3FFF;
			@Pc(193) int local193 = Class3_Sub20.anIntArray206[local189];
			@Pc(197) int local197 = Class3_Sub20.anIntArray204[local189];
			@Pc(207) int local207 = local197 * local91 + local93 * local193 >> 14;
			local93 = local197 * local93 - local193 * local91 >> 14;
			super.anInt10731 += local93;
			super.anInt10729 += local207;
		}
		return;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!o", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aBoolean472;
	}

	@OriginalMember(owner = "client!o", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub7_3 != null) {
			this.aClass28_Sub7_3.method7915();
		}
	}

	@OriginalMember(owner = "client!o", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.anInt6682;
	}

	@OriginalMember(owner = "client!o", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public void method5960(@OriginalArg(1) int arg0) {
		this.aDouble20 += this.aDouble22 * (double) arg0;
		this.aDouble19 += (double) arg0 * this.aDouble17;
		this.aBoolean473 = true;
		if (this.aBoolean471) {
			this.aDouble15 = (double) (Static168.method3058(super.aByte174, (int) this.aDouble20, (int) this.aDouble19) - this.anInt6670);
		} else if (this.anInt6686 == -1) {
			this.aDouble15 += this.aDouble21 * (double) arg0;
		} else {
			this.aDouble15 += this.aDouble21 * (double) arg0 + (double) arg0 * this.aDouble16 * 0.5D * (double) arg0;
			this.aDouble21 += (double) arg0 * this.aDouble16;
		}
		this.anInt6684 = (int) (Math.atan2(this.aDouble22, this.aDouble17) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt6681 = (int) (Math.atan2(this.aDouble21, this.aDouble18) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass372_2 == null) {
			return;
		}
		this.anInt6673 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass372_2.anIntArray900[this.anInt6689] >= this.anInt6673) {
						return;
					}
					this.anInt6673 -= this.aClass372_2.anIntArray900[this.anInt6689];
					this.anInt6689++;
					if (this.anInt6689 >= this.aClass372_2.anIntArray901.length) {
						this.anInt6689 -= this.aClass372_2.anInt10256;
						if (this.anInt6689 < 0 || this.aClass372_2.anIntArray901.length <= this.anInt6689) {
							this.anInt6689 = 0;
						}
					}
					this.anInt6672 = this.anInt6689 + 1;
				} while (this.anInt6672 < this.aClass372_2.anIntArray901.length);
				this.anInt6672 -= this.aClass372_2.anInt10256;
			} while (this.anInt6672 >= 0 && this.anInt6672 < this.aClass372_2.anIntArray901.length);
			this.anInt6672 = -1;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ka;BLclient!ha;Lclient!uu;)V")
	private void method5962(@OriginalArg(0) Class95 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class239 arg2) {
		arg0.method5669(arg2);
		@Pc(9) Class49[] local9 = arg0.method5654();
		@Pc(12) Class197[] local12 = arg0.method5668();
		if ((this.aClass28_Sub7_3 == null || this.aClass28_Sub7_3.aBoolean709) && (local9 != null || local12 != null)) {
			this.aClass28_Sub7_3 = Static556.method7916(Static588.anInt9467, true);
		}
		if (this.aClass28_Sub7_3 != null) {
			this.aClass28_Sub7_3.method7910(arg1, (long) Static588.anInt9467, local9, local12);
			this.aClass28_Sub7_3.method7914(super.aByte174, super.aShort125, super.aShort124, super.aShort123, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		return false;
	}

	@OriginalMember(owner = "client!o", name = "o", descriptor = "(I)V")
	@Override
	public void method9299() {
		super.aShort125 = super.aShort124 = (short) (int) (this.aDouble20 / 512.0D);
		super.aShort123 = super.aShort122 = (short) (int) (this.aDouble19 / 512.0D);
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public void method5963() {
		if (this.aClass28_Sub7_3 != null) {
			this.aClass28_Sub7_3.method7915();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZLclient!ha;)Lclient!ka;")
	private Class95 method5964(@OriginalArg(0) int arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(14) Class144 local14 = Static354.aClass236_2.method5615(this.anInt6695);
		return local14.method3932(arg0, arg1, this.anInt6689, Static243.aClass343_3, this.anInt6673, this.anInt6672);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		@Pc(11) Class95 local11 = this.method5964(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class239 local18 = arg0.method8447();
		local18.method9250(this.anInt6681);
		local18.method9243(this.anInt6684);
		local18.method9244((int) this.aDouble20, (int) this.aDouble15, (int) this.aDouble19);
		this.method5962(local11, arg0, local18);
		@Pc(50) Class28_Sub3 local50 = Static4.method120(false, 1);
		if (Static443.aBoolean515) {
			local11.method5659(local18, local50.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			local11.method5653(local18, local50.aClass28_Sub8Array1[0], 0);
		}
		if (this.aClass28_Sub7_3 != null) {
			@Pc(78) Class84 local78 = this.aClass28_Sub7_3.method7917();
			if (Static443.aBoolean515) {
				arg0.method8506(local78, Static675.anInt10880);
			} else {
				arg0.method8499(local78);
			}
		}
		this.aBoolean472 = local11.F();
		this.anInt6682 = local11.fa();
		this.lb = local11.ma();
		return local50;
	}
}
