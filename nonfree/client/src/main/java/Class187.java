import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class187 {

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	private int anInt4865;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	private int anInt4868;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "Lclient!ls;")
	public Class34_Sub7 aClass34_Sub7_5;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "Lclient!mu;")
	private Class239 aClass239_2;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
	private int anInt4871;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "Lclient!jca;")
	private Class173 aClass173_1;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "[Z")
	private boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
	private int anInt4883;

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "Lclient!ka;")
	private Class149 aClass149_5;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "Lclient!r;")
	private Class3_Sub5_Sub11 aClass3_Sub5_Sub11_4;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
	private int anInt4864 = -1;

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
	private int anInt4880 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
	private int anInt4861 = -1;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "Z")
	private boolean aBoolean323 = false;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	private int anInt4862 = 0;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
	private int anInt4876 = 0;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
	public final int anInt4870;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	public final int anInt4866;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
	public final int anInt4882;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Lclient!fq;")
	private final Class34_Sub1 aClass34_Sub1_16;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!ha;Lclient!lp;IIIILclient!fq;ZI)V")
	public Class187(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class34_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aBoolean323 = arg7;
		this.aByte72 = (byte) arg5;
		this.anInt4870 = arg2;
		this.anInt4866 = arg1.anInt5946;
		this.anInt4882 = arg3;
		this.aByte73 = (byte) arg4;
		this.aClass34_Sub1_16 = arg6;
		this.aBoolean321 = arg0.method8061() && arg1.aBoolean411 && !this.aBoolean323;
		if (arg8 != -1) {
			this.aBoolean322 = true;
		}
		this.method4168(arg8);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V")
	public void method4158(@OriginalArg(0) int arg0) {
		this.aBoolean322 = true;
		this.method4168(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!ha;ZIZ)Lclient!ka;")
	public Class149 method4159(@OriginalArg(1) Class95 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class216 local11 = Static466.aClass340_6.method7665(this.anInt4866);
		if (local11.anIntArray325 != null) {
			local11 = local11.method5043(Static210.aClass262_1);
		}
		if (local11 == null) {
			this.method4161(arg0);
			this.anInt4864 = -1;
			this.anInt4880 = -1;
			this.anInt4861 = -1;
			return null;
		}
		if (!this.aBoolean322 && this.anInt4880 != local11.anInt5946) {
			this.aClass149_5 = null;
			this.method4168(-1);
		}
		this.method4166(this.aClass34_Sub1_16);
		if (arg3) {
			@Pc(72) boolean local72 = arg3 & this.aBoolean321 & Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511() != 0;
			arg3 = local72 & (this.anInt4861 != local11.anInt5946 || this.aClass239_2 != null && Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511() >= 2 && (this.anInt4865 != this.anInt4864 || (this.aClass239_2.aBoolean445 || Static378.aBoolean643) && this.anInt4883 != this.anInt4865));
		}
		if (arg1 && !arg3) {
			this.anInt4880 = local11.anInt5946;
			return null;
		}
		if (arg3) {
			Static123.method1842(this.aClass3_Sub5_Sub11_4, this.aByte72, this.aClass34_Sub1_16.anInt9614, this.aClass34_Sub1_16.anInt9619, this.aBooleanArray16);
			this.anInt4864 = -1;
			this.anInt4861 = -1;
		}
		@Pc(156) Class35 local156 = Static582.aClass35Array3[this.aByte72];
		@Pc(168) Class35 local168;
		if (this.aBoolean323) {
			local168 = Static556.aClass35Array2[0];
		} else {
			local168 = this.aByte72 < 3 ? Static582.aClass35Array3[this.aByte72 + 1] : null;
		}
		@Pc(187) Class149 local187 = null;
		if (this.aClass239_2 != null) {
			if (arg3) {
				arg2 |= 0x40000;
			}
			local187 = local11.method5037(local156, arg2, this.anInt4870 == 11 ? this.anInt4882 + 4 : this.anInt4882, this.anInt4865, this.aClass239_2, local168, this.aClass173_1, this.aClass34_Sub1_16.anInt9614, this.aClass34_Sub1_16.anInt9619, local156.method7452(this.aClass34_Sub1_16.anInt9614, this.aClass34_Sub1_16.anInt9619), this.anInt4871, this.anInt4870 == 11 ? 10 : this.anInt4870, this.anInt4883, arg0);
			if (local187 == null) {
				this.anInt4862 = 0;
				this.aBooleanArray16 = null;
				this.anInt4876 = 0;
				this.aClass3_Sub5_Sub11_4 = null;
			} else {
				if (arg3) {
					if (this.aBooleanArray16 == null) {
						this.aBooleanArray16 = new boolean[4];
					}
					this.aClass3_Sub5_Sub11_4 = local187.ba(this.aClass3_Sub5_Sub11_4);
					Static344.method5000(this.aClass3_Sub5_Sub11_4, this.aByte72, this.aClass34_Sub1_16.anInt9614, this.aClass34_Sub1_16.anInt9619, this.aBooleanArray16);
					this.anInt4864 = this.anInt4865;
					this.anInt4861 = local11.anInt5946;
				}
				this.anInt4862 = local187.fa();
				this.anInt4876 = local187.ma();
			}
			this.aClass149_5 = null;
		} else if (this.aClass149_5 != null && (arg2 & this.aClass149_5.ua()) == arg2 && this.anInt4880 == local11.anInt5946) {
			local187 = this.aClass149_5;
		} else {
			if (this.aClass149_5 != null) {
				arg2 |= this.aClass149_5.ua();
			}
			@Pc(265) Class330 local265 = local11.method5040(this.aClass34_Sub1_16.anInt9614, local168, this.anInt4870 == 11 ? 10 : this.anInt4870, arg2, arg3, arg0, local156, this.aClass173_1, local156.method7452(this.aClass34_Sub1_16.anInt9614, this.aClass34_Sub1_16.anInt9619), this.anInt4870 == 11 ? this.anInt4882 + 4 : this.anInt4882, this.aClass34_Sub1_16.anInt9619);
			if (local265 == null) {
				this.anInt4862 = 0;
				this.aClass149_5 = null;
				this.aClass3_Sub5_Sub11_4 = null;
				this.anInt4876 = 0;
				this.aBooleanArray16 = null;
			} else {
				local187 = local265.aClass149_7;
				this.aClass149_5 = local265.aClass149_7;
				if (arg3) {
					this.aClass3_Sub5_Sub11_4 = local265.aClass3_Sub5_Sub11_6;
					this.aBooleanArray16 = null;
					Static344.method5000(this.aClass3_Sub5_Sub11_4, this.aByte72, this.aClass34_Sub1_16.anInt9614, this.aClass34_Sub1_16.anInt9619, (boolean[]) null);
					this.anInt4861 = local11.anInt5946;
					this.anInt4864 = -1;
				}
				this.anInt4862 = local187.fa();
				this.anInt4876 = local187.ma();
			}
		}
		this.anInt4880 = local11.anInt5946;
		return local187;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)I")
	public int method4160(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aBoolean323 = true;
		}
		return this.anInt4876;
	}

	@OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass34_Sub7_5 != null) {
			this.aClass34_Sub7_5.method5094();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ha;Z)V")
	public void method4161(@OriginalArg(0) Class95 arg0) {
		if (this.aClass3_Sub5_Sub11_4 != null) {
			Static123.method1842(this.aClass3_Sub5_Sub11_4, this.aByte72, this.aClass34_Sub1_16.anInt9614, this.aClass34_Sub1_16.anInt9619, this.aBooleanArray16);
			this.aBooleanArray16 = null;
			this.aClass3_Sub5_Sub11_4 = null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZIILclient!al;Lclient!ha;IIBLclient!ka;)V")
	public void method4165(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) Class95 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class149 arg7) {
		@Pc(10) Class373[] local10 = arg7.method8867();
		@Pc(13) Class305[] local13 = arg7.method8861();
		if ((this.aClass34_Sub7_5 == null || this.aClass34_Sub7_5.aBoolean416) && (local10 != null || local13 != null)) {
			@Pc(30) Class216 local30 = Static466.aClass340_6.method7665(this.anInt4866);
			if (local30.anIntArray325 != null) {
				local30 = local30.method5043(Static210.aClass262_1);
			}
			if (local30 != null) {
				this.aClass34_Sub7_5 = Static350.method5095(Static122.anInt2190, true);
			}
		}
		if (this.aClass34_Sub7_5 == null) {
			return;
		}
		arg7.method8848(arg3);
		if (arg0) {
			this.aClass34_Sub7_5.method5088(arg4, (long) Static122.anInt2190, local10, local13);
		} else {
			this.aClass34_Sub7_5.method5093((long) Static122.anInt2190);
		}
		this.aClass34_Sub7_5.method5101(this.aByte73, arg1, arg2, arg6, arg5);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!fq;I)V")
	private void method4166(@OriginalArg(0) Class34_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass239_2 == null) {
				if (this.aBoolean322) {
					return;
				}
				this.method4168(-1);
				if (this.aClass239_2 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static122.anInt2190 - this.anInt4868;
			if (local34 > 100 && this.aClass239_2.anInt6414 > 0) {
				@Pc(55) int local55 = this.aClass239_2.anIntArray339.length - this.aClass239_2.anInt6414;
				while (this.anInt4865 < local55 && local34 > this.aClass239_2.anIntArray337[this.anInt4865]) {
					local34 -= this.aClass239_2.anIntArray337[this.anInt4865];
					this.anInt4865++;
				}
				if (local55 <= this.anInt4865) {
					@Pc(94) int local94 = 0;
					for (@Pc(96) int local96 = local55; local96 < this.aClass239_2.anIntArray339.length; local96++) {
						local94 += this.aClass239_2.anIntArray337[local96];
					}
					local34 %= local94;
				}
				this.anInt4883 = this.anInt4865 + 1;
				if (this.aClass239_2.anIntArray339.length <= this.anInt4883) {
					this.anInt4883 -= this.aClass239_2.anInt6414;
					if (this.anInt4883 < 0 || this.anInt4883 >= this.aClass239_2.anIntArray339.length) {
						this.anInt4883 = -1;
					}
				}
			}
			while (local34 > this.aClass239_2.anIntArray337[this.anInt4865]) {
				Static305.method4420(arg0, this.aClass239_2, this.anInt4865);
				local34 -= this.aClass239_2.anIntArray337[this.anInt4865];
				this.anInt4865++;
				if (this.aClass239_2.anIntArray339.length <= this.anInt4865) {
					this.anInt4865 -= this.aClass239_2.anInt6414;
					if (this.anInt4865 < 0 || this.aClass239_2.anIntArray339.length <= this.anInt4865) {
						this.aClass239_2 = null;
						continue label80;
					}
				}
				this.anInt4883 = this.anInt4865 + 1;
				if (this.anInt4883 >= this.aClass239_2.anIntArray339.length) {
					this.anInt4883 -= this.aClass239_2.anInt6414;
					if (this.anInt4883 < 0 || this.aClass239_2.anIntArray339.length <= this.anInt4883) {
						this.anInt4883 = -1;
					}
				}
			}
			this.anInt4868 = Static122.anInt2190 - local34;
			this.anInt4871 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!jca;Z)V")
	public void method4167(@OriginalArg(0) Class173 arg0) {
		this.aClass149_5 = null;
		this.aClass173_1 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)V")
	private void method4168(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(20) Class216 local20 = Static466.aClass340_6.method7665(this.anInt4866);
			@Pc(22) Class216 local22 = local20;
			if (local20.anIntArray325 != null) {
				local20 = local20.method5043(Static210.aClass262_1);
			}
			if (local20 == null) {
				return;
			}
			if (local20 == local22) {
				local22 = null;
			}
			if (local20.anIntArray324 != null) {
				if (this.aClass239_2 != null && local20.method5048(this.aClass239_2.anInt6410)) {
					return;
				}
				local7 = local20.method5039();
				if (local20.anInt5946 != this.anInt4880) {
					local9 = local20.aBoolean405;
				}
			} else if (local20.anInt5942 == -1) {
				if (local22 != null && local22.anIntArray324 != null) {
					if (this.aClass239_2 != null && local22.method5048(this.aClass239_2.anInt6410)) {
						return;
					}
					local7 = local22.method5039();
					if (this.anInt4880 != local22.anInt5946) {
						local9 = local22.aBoolean405;
					}
				} else if (local22 != null && local22.anInt5942 != -1 && local22.anInt5946 != this.anInt4880) {
					local9 = local22.aBoolean405;
					local7 = local22.anInt5942;
				}
			} else if (this.anInt4880 != local20.anInt5946) {
				local7 = local20.anInt5942;
				local9 = local20.aBoolean405;
			}
		}
		if (local7 == -1) {
			this.aClass239_2 = null;
			return;
		}
		this.aClass149_5 = null;
		if (this.aClass239_2 == null || this.aClass239_2.anInt6410 != local7) {
			this.aClass239_2 = Static13.aClass213_1.method5008(local7);
		} else if (this.aClass239_2.anInt6416 == 0) {
			return;
		}
		if (this.aClass239_2.anIntArray339 == null) {
			this.aClass239_2 = null;
			return;
		}
		if (local9) {
			this.anInt4865 = (int) (Math.random() * (double) this.aClass239_2.anIntArray339.length);
			this.anInt4871 = (int) (Math.random() * (double) this.aClass239_2.anIntArray337[this.anInt4865]) + 1;
		} else {
			this.anInt4871 = 1;
			this.anInt4865 = 0;
		}
		this.anInt4883 = this.anInt4865 + 1;
		if (this.anInt4883 < 0 || this.anInt4883 >= this.aClass239_2.anIntArray339.length) {
			this.anInt4883 = -1;
		}
		this.anInt4868 = Static122.anInt2190 - this.anInt4871;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I")
	public int method4169() {
		return this.anInt4862;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!ha;)V")
	public void method4170(@OriginalArg(1) Class95 arg0) {
		this.method4159(arg0, true, 262144, true);
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)Z")
	public boolean method4171() {
		return this.aBoolean321;
	}
}
