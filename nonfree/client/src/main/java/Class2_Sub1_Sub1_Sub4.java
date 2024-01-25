import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!lga", name = "bb", descriptor = "I")
	private int anInt5800;

	@OriginalMember(owner = "client!lga", name = "gb", descriptor = "D")
	private double aDouble105;

	@OriginalMember(owner = "client!lga", name = "jb", descriptor = "D")
	private double aDouble106;

	@OriginalMember(owner = "client!lga", name = "kb", descriptor = "D")
	private double aDouble107;

	@OriginalMember(owner = "client!lga", name = "sb", descriptor = "Lclient!ju;")
	private Class2_Sub8 aClass2_Sub8_6;

	@OriginalMember(owner = "client!lga", name = "ub", descriptor = "I")
	private int anInt5813;

	@OriginalMember(owner = "client!lga", name = "vb", descriptor = "D")
	private double aDouble108;

	@OriginalMember(owner = "client!lga", name = "Fb", descriptor = "D")
	private double aDouble109;

	@OriginalMember(owner = "client!lga", name = "Sb", descriptor = "D")
	private double aDouble110;

	@OriginalMember(owner = "client!lga", name = "Tb", descriptor = "D")
	private double aDouble111;

	@OriginalMember(owner = "client!lga", name = "Vb", descriptor = "D")
	private double aDouble112;

	@OriginalMember(owner = "client!lga", name = "Eb", descriptor = "I")
	private int anInt5821 = 0;

	@OriginalMember(owner = "client!lga", name = "xb", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!lga", name = "eb", descriptor = "Z")
	private boolean aBoolean385 = false;

	@OriginalMember(owner = "client!lga", name = "Wb", descriptor = "I")
	private int anInt5835 = 0;

	@OriginalMember(owner = "client!lga", name = "db", descriptor = "I")
	private int anInt5802 = 0;

	@OriginalMember(owner = "client!lga", name = "Ob", descriptor = "I")
	private int anInt5830 = -1;

	@OriginalMember(owner = "client!lga", name = "ob", descriptor = "I")
	private int anInt5808 = 0;

	@OriginalMember(owner = "client!lga", name = "Bb", descriptor = "I")
	private final int anInt5818;

	@OriginalMember(owner = "client!lga", name = "pb", descriptor = "I")
	private final int anInt5809;

	@OriginalMember(owner = "client!lga", name = "Qb", descriptor = "I")
	public final int anInt5832;

	@OriginalMember(owner = "client!lga", name = "Lb", descriptor = "I")
	private final int anInt5827;

	@OriginalMember(owner = "client!lga", name = "ab", descriptor = "I")
	public final int anInt5799;

	@OriginalMember(owner = "client!lga", name = "Gb", descriptor = "I")
	private final int anInt5822;

	@OriginalMember(owner = "client!lga", name = "Db", descriptor = "I")
	private final int anInt5820;

	@OriginalMember(owner = "client!lga", name = "Nb", descriptor = "I")
	public final int anInt5829;

	@OriginalMember(owner = "client!lga", name = "Yb", descriptor = "Z")
	private final boolean aBoolean387;

	@OriginalMember(owner = "client!lga", name = "ib", descriptor = "I")
	private final int anInt5805;

	@OriginalMember(owner = "client!lga", name = "rb", descriptor = "I")
	public final int anInt5811;

	@OriginalMember(owner = "client!lga", name = "lb", descriptor = "Lclient!gf;")
	private final Class119 lb;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class2_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static284.method4118(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt5818 = arg9;
		this.anInt5809 = arg0;
		this.anInt5832 = arg12;
		this.aBoolean385 = false;
		this.anInt5827 = arg8;
		this.anInt5799 = arg6;
		this.anInt5822 = arg14;
		this.anInt5820 = arg10;
		this.anInt5829 = arg11;
		this.aBoolean387 = arg13;
		this.anInt5805 = arg5;
		this.anInt5811 = arg7;
		@Pc(90) int local90 = Static111.aClass279_4.method6905(this.anInt5809).anInt6006;
		if (local90 == -1) {
			this.lb = null;
		} else {
			this.lb = Static334.aClass268_2.method6469(local90);
		}
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		@Pc(11) Class184 local11 = this.method4950(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class207 local24 = arg0.method7456();
		local24.method8202(this.anInt5813);
		local24.method8213(this.anInt5800);
		local24.method8209((int) this.aDouble111, (int) this.aDouble107, (int) this.aDouble110);
		this.method4951(local11, arg0, local24);
		@Pc(54) Class2_Sub9 local54 = Static49.method971(1, false);
		if (Static487.aBoolean565) {
			local11.method8658(local24, local54.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			local11.method8662(local24, local54.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass2_Sub8_6 != null) {
			@Pc(82) Class137 local82 = this.aClass2_Sub8_6.method4170();
			if (Static487.aBoolean565) {
				arg0.method7469(local82, Static472.anInt8136);
			} else {
				arg0.method7455(local82);
			}
		}
		this.aBoolean386 = local11.F();
		this.anInt5808 = local11.fa();
		this.anInt5835 = local11.ma();
		return local54;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V")
	public void method4947() {
		if (this.aBoolean385 || this.anInt5820 == 0) {
			return;
		}
		@Pc(23) Class2_Sub1_Sub1_Sub3 local23 = null;
		@Pc(32) int local32;
		if (this.anInt5820 < 0) {
			local32 = -this.anInt5820 - 1;
			if (Static659.anInt7559 == local32) {
				local23 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2;
			} else {
				local23 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local32];
			}
		} else {
			local32 = this.anInt5820 - 1;
			@Pc(59) Class6_Sub44 local59 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local32);
			if (local59 != null) {
				local23 = local59.aClass2_Sub1_Sub1_Sub3_Sub2_2;
			}
		}
		if (local23 == null) {
			return;
		}
		super.anInt10001 = local23.anInt10001;
		super.anInt10006 = local23.anInt10006;
		super.anInt10004 = Static284.method4118(local23.anInt10006, super.aByte140, local23.anInt10001) - this.anInt5805;
		if (this.anInt5822 < 0) {
			return;
		}
		@Pc(98) Class389 local98 = local23.method4317();
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		if (local98.anIntArrayArray60 != null && local98.anIntArrayArray60[this.anInt5822] != null) {
			local102 = local98.anIntArrayArray60[this.anInt5822][2];
			local100 = local98.anIntArrayArray60[this.anInt5822][0];
		}
		if (local98.anIntArrayArray61 != null && local98.anIntArrayArray61[this.anInt5822] != null) {
			local102 += local98.anIntArrayArray61[this.anInt5822][2];
			local100 += local98.anIntArrayArray61[this.anInt5822][0];
		}
		if (local100 != 0 || local102 != 0) {
			@Pc(175) int local175 = local23.lb.method8507();
			@Pc(177) int local177 = local175;
			if (local23.anIntArray297 != null && local23.anIntArray297[this.anInt5822] != -1) {
				local177 = local23.anIntArray297[this.anInt5822];
			}
			@Pc(200) int local200 = local177 - local175 & 0x3FFF;
			@Pc(204) int local204 = Class6_Sub1_Sub3.anIntArray56[local200];
			@Pc(208) int local208 = Class6_Sub1_Sub3.anIntArray58[local200];
			@Pc(218) int local218 = local102 * local204 + local100 * local208 >> 14;
			local102 = local208 * local102 - local100 * local204 >> 14;
			super.anInt10001 += local102;
			super.anInt10006 += local218;
		}
		return;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
		@Pc(9) Class184 local9 = this.method4950(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(23) Class207 local23 = arg0.method7456();
		local23.method8202(this.anInt5813);
		local23.method8213(this.anInt5800);
		local23.method8209((int) this.aDouble111, (int) this.aDouble107, (int) this.aDouble110);
		this.anInt5808 = local9.fa();
		this.anInt5835 = local9.ma();
		this.method4951(local9, arg0, local23);
	}

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		return false;
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.anInt5808;
	}

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "(Z)V")
	@Override
	public void method8465() {
		super.aShort121 = super.aShort120 = (short) (int) (this.aDouble110 / 512.0D);
		super.aShort118 = super.aShort119 = (short) (int) (this.aDouble111 / 512.0D);
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aBoolean386;
	}

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIII)V")
	public void method4948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean385) {
			local12 = (double) (arg0 - super.anInt10006);
			@Pc(19) double local19 = (double) (arg2 - super.anInt10001);
			@Pc(28) double local28 = Math.sqrt(local12 * local12 + local19 * local19);
			this.aDouble111 = local12 * (double) this.anInt5818 / local28 + (double) super.anInt10006;
			this.aDouble110 = (double) this.anInt5818 * local19 / local28 + (double) super.anInt10001;
			if (this.aBoolean387) {
				this.aDouble107 = (double) (Static284.method4118((int) this.aDouble111, super.aByte140, (int) this.aDouble110) - this.anInt5805);
			} else {
				this.aDouble107 = (double) super.anInt10004;
			}
		}
		local12 = (double) (this.anInt5811 + 1 - arg3);
		this.aDouble105 = ((double) arg2 - this.aDouble110) / local12;
		this.aDouble106 = ((double) arg0 - this.aDouble111) / local12;
		this.aDouble109 = Math.sqrt(this.aDouble106 * this.aDouble106 + this.aDouble105 * this.aDouble105);
		if (this.anInt5827 == -1) {
			this.aDouble112 = ((double) arg1 - this.aDouble107) / local12;
		} else {
			if (!this.aBoolean385) {
				this.aDouble112 = -this.aDouble109 * Math.tan((double) this.anInt5827 * 0.02454369D);
			}
			this.aDouble108 = ((double) arg1 - this.aDouble107 - this.aDouble112 * local12) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)V")
	public void method4949(@OriginalArg(1) int arg0) {
		this.aDouble111 += (double) arg0 * this.aDouble106;
		this.aBoolean385 = true;
		this.aDouble110 += (double) arg0 * this.aDouble105;
		if (this.aBoolean387) {
			this.aDouble107 = (double) (Static284.method4118((int) this.aDouble111, super.aByte140, (int) this.aDouble110) - this.anInt5805);
		} else if (this.anInt5827 == -1) {
			this.aDouble107 += this.aDouble112 * (double) arg0;
		} else {
			this.aDouble107 += (double) arg0 * 0.5D * this.aDouble108 * (double) arg0 + this.aDouble112 * (double) arg0;
			this.aDouble112 += this.aDouble108 * (double) arg0;
		}
		this.anInt5800 = (int) (Math.atan2(this.aDouble106, this.aDouble105) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5813 = (int) (Math.atan2(this.aDouble112, this.aDouble109) * 2607.5945876176133D) & 0x3FFF;
		if (this.lb == null) {
			return;
		}
		this.anInt5802 += arg0;
		while (true) {
			do {
				do {
					if (this.lb.anIntArray168[this.anInt5821] >= this.anInt5802) {
						return;
					}
					this.anInt5802 -= this.lb.anIntArray168[this.anInt5821];
					this.anInt5821++;
					if (this.anInt5821 >= this.lb.anIntArray167.length) {
						this.anInt5821 -= this.lb.anInt3005;
						if (this.anInt5821 < 0 || this.lb.anIntArray167.length <= this.anInt5821) {
							this.anInt5821 = 0;
						}
					}
					this.anInt5830 = this.anInt5821 + 1;
				} while (this.lb.anIntArray167.length > this.anInt5830);
				this.anInt5830 -= this.lb.anInt3005;
			} while (this.anInt5830 >= 0 && this.anInt5830 < this.lb.anIntArray167.length);
			this.anInt5830 = -1;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!ka;")
	private Class184 method4950(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class213 local15 = Static111.aClass279_4.method6905(this.anInt5809);
		return local15.method5117(arg0, this.anInt5830, this.anInt5802, arg1, this.anInt5821, Static334.aClass268_2);
	}

	@OriginalMember(owner = "client!lga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub8_6 != null) {
			this.aClass2_Sub8_6.method4175();
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!ka;Lclient!ha;ILclient!oo;)V")
	private void method4951(@OriginalArg(0) Class184 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) Class207 arg2) {
		arg0.method8659(arg2);
		@Pc(14) Class100[] local14 = arg0.method8657();
		@Pc(17) Class218[] local17 = arg0.method8643();
		if ((this.aClass2_Sub8_6 == null || this.aClass2_Sub8_6.aBoolean310) && (local14 != null || local17 != null)) {
			this.aClass2_Sub8_6 = Static290.method4176(Static90.anInt1698, true);
		}
		if (this.aClass2_Sub8_6 != null) {
			this.aClass2_Sub8_6.method4169(arg1, (long) Static90.anInt1698, local14, local17);
			this.aClass2_Sub8_6.method4171(super.aByte140, super.aShort118, super.aShort119, super.aShort121, super.aShort120);
		}
	}

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "(I)V")
	public void method4952() {
		if (this.aClass2_Sub8_6 != null) {
			this.aClass2_Sub8_6.method4175();
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.anInt5835;
	}
}
