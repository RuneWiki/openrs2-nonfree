import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qja")
public final class Class4_Sub1_Sub1_Sub4 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!qja", name = "jb", descriptor = "D")
	private double aDouble19;

	@OriginalMember(owner = "client!qja", name = "Lb", descriptor = "Lclient!tn;")
	private Class4_Sub9 aClass4_Sub9_7;

	@OriginalMember(owner = "client!qja", name = "Eb", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!qja", name = "yb", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!qja", name = "nb", descriptor = "I")
	private int anInt7934;

	@OriginalMember(owner = "client!qja", name = "R", descriptor = "D")
	private double aDouble22;

	@OriginalMember(owner = "client!qja", name = "wb", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!qja", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!qja", name = "V", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!qja", name = "eb", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!qja", name = "O", descriptor = "D")
	private double aDouble26;

	@OriginalMember(owner = "client!qja", name = "fb", descriptor = "I")
	private int anInt7937 = 0;

	@OriginalMember(owner = "client!qja", name = "cb", descriptor = "I")
	private int anInt7948 = 0;

	@OriginalMember(owner = "client!qja", name = "P", descriptor = "Z")
	private boolean aBoolean534 = false;

	@OriginalMember(owner = "client!qja", name = "ub", descriptor = "I")
	private int anInt7932 = -1;

	@OriginalMember(owner = "client!qja", name = "vb", descriptor = "I")
	private int anInt7939 = 0;

	@OriginalMember(owner = "client!qja", name = "ob", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!qja", name = "sb", descriptor = "I")
	private int anInt7959 = 0;

	@OriginalMember(owner = "client!qja", name = "S", descriptor = "I")
	public final int anInt7944;

	@OriginalMember(owner = "client!qja", name = "ib", descriptor = "I")
	private final int anInt7952;

	@OriginalMember(owner = "client!qja", name = "zb", descriptor = "I")
	private final int anInt7953;

	@OriginalMember(owner = "client!qja", name = "Hb", descriptor = "I")
	private final int anInt7949;

	@OriginalMember(owner = "client!qja", name = "gb", descriptor = "I")
	private final int anInt7956;

	@OriginalMember(owner = "client!qja", name = "Bb", descriptor = "I")
	public final int anInt7958;

	@OriginalMember(owner = "client!qja", name = "Db", descriptor = "I")
	public final int anInt7947;

	@OriginalMember(owner = "client!qja", name = "ab", descriptor = "I")
	private final int anInt7931;

	@OriginalMember(owner = "client!qja", name = "xb", descriptor = "I")
	public final int anInt7942;

	@OriginalMember(owner = "client!qja", name = "Kb", descriptor = "Z")
	private final boolean aBoolean533;

	@OriginalMember(owner = "client!qja", name = "mb", descriptor = "I")
	private final int anInt7935;

	@OriginalMember(owner = "client!qja", name = "Cb", descriptor = "Lclient!oe;")
	private final Class264 aClass264_2;

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class4_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static461.method6500(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt7944 = arg7;
		this.anInt7952 = arg10;
		this.anInt7953 = arg14;
		this.anInt7949 = arg9;
		this.aBoolean535 = false;
		this.anInt7956 = arg8;
		this.anInt7958 = arg6;
		this.anInt7947 = arg11;
		this.anInt7931 = arg5;
		this.anInt7942 = arg12;
		this.aBoolean533 = arg13;
		this.anInt7935 = arg0;
		@Pc(91) int local91 = Static463.aClass352_1.method8006(this.anInt7935).anInt7610;
		if (local91 == -1) {
			this.aClass264_2 = null;
		} else {
			this.aClass264_2 = Static315.aClass14_1.method227(local91);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(II)V")
	public void method6885(@OriginalArg(0) int arg0) {
		this.aDouble23 += this.aDouble26 * (double) arg0;
		this.aBoolean535 = true;
		this.aDouble19 += (double) arg0 * this.aDouble24;
		if (this.aBoolean533) {
			this.aDouble20 = (double) (Static461.method6500((int) this.aDouble23, super.aByte139, (int) this.aDouble19) - this.anInt7931);
		} else if (this.anInt7956 == -1) {
			this.aDouble20 += (double) arg0 * this.aDouble25;
		} else {
			this.aDouble20 += this.aDouble21 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble25;
			this.aDouble25 += (double) arg0 * this.aDouble21;
		}
		this.lb = (int) (Math.atan2(this.aDouble26, this.aDouble24) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt7934 = (int) (Math.atan2(this.aDouble25, this.aDouble22) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass264_2 == null) {
			return;
		}
		this.anInt7948 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass264_2.anIntArray425[this.anInt7959] >= this.anInt7948) {
						return;
					}
					this.anInt7948 -= this.aClass264_2.anIntArray425[this.anInt7959];
					this.anInt7959++;
					if (this.aClass264_2.anIntArray423.length <= this.anInt7959) {
						this.anInt7959 -= this.aClass264_2.anInt7050;
						if (this.anInt7959 < 0 || this.anInt7959 >= this.aClass264_2.anIntArray423.length) {
							this.anInt7959 = 0;
						}
					}
					this.anInt7932 = this.anInt7959 + 1;
				} while (this.aClass264_2.anIntArray423.length > this.anInt7932);
				this.anInt7932 -= this.aClass264_2.anInt7050;
			} while (this.anInt7932 >= 0 && this.aClass264_2.anIntArray423.length > this.anInt7932);
			this.anInt7932 = -1;
		}
	}

	@OriginalMember(owner = "client!qja", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aBoolean534;
	}

	@OriginalMember(owner = "client!qja", name = "d", descriptor = "(B)V")
	@Override
	public void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 >= -41) {
			this.aBoolean535 = true;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub9_7 != null) {
			this.aClass4_Sub9_7.method8044();
		}
	}

	@OriginalMember(owner = "client!qja", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return this.anInt7937;
	}

	@OriginalMember(owner = "client!qja", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
		@Pc(18) Class43 local18 = this.method6891(arg0, 0);
		if (local18 == null) {
			return;
		}
		@Pc(25) Class10 local25 = arg0.method8610();
		local25.method4218(this.anInt7934);
		local25.method4215(this.lb);
		local25.method4225((int) this.aDouble23, (int) this.aDouble20, (int) this.aDouble19);
		this.anInt7937 = local18.fa();
		this.anInt7939 = local18.ma();
		this.method6893(arg0, local25, local18);
	}

	@OriginalMember(owner = "client!qja", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(I)V")
	public void method6889() {
		if (this.aBoolean535 || this.anInt7952 == 0) {
			return;
		}
		@Pc(21) Class4_Sub1_Sub1_Sub2 local21 = null;
		@Pc(33) int local33;
		if (this.anInt7952 < 0) {
			local33 = -this.anInt7952 - 1;
			if (Static649.anInt10621 == local33) {
				local21 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4;
			} else {
				local21 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local33];
			}
		} else {
			local33 = this.anInt7952 - 1;
			@Pc(60) Class5_Sub9 local60 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local33);
			if (local60 != null) {
				local21 = local60.aClass4_Sub1_Sub1_Sub2_Sub2_1;
			}
		}
		if (local21 == null) {
			return;
		}
		super.anInt9805 = local21.anInt9805;
		super.anInt9803 = local21.anInt9803;
		super.anInt9797 = Static461.method6500(local21.anInt9805, super.aByte139, local21.anInt9803) - this.anInt7931;
		if (this.anInt7953 < 0) {
			return;
		}
		@Pc(99) Class92 local99 = local21.method5930();
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 0;
		if (local99.anIntArrayArray16 != null && local99.anIntArrayArray16[this.anInt7953] != null) {
			local103 = local99.anIntArrayArray16[this.anInt7953][2];
			local101 = local99.anIntArrayArray16[this.anInt7953][0];
		}
		if (local99.anIntArrayArray17 != null && local99.anIntArrayArray17[this.anInt7953] != null) {
			local103 += local99.anIntArrayArray17[this.anInt7953][2];
			local101 += local99.anIntArrayArray17[this.anInt7953][0];
		}
		if (local101 != 0 || local103 != 0) {
			@Pc(179) int local179 = local21.aClass49_7.method978();
			@Pc(181) int local181 = local179;
			if (local21.anIntArray398 != null && local21.anIntArray398[this.anInt7953] != -1) {
				local181 = local21.anIntArray398[this.anInt7953];
			}
			@Pc(207) int local207 = local181 - local179 & 0x3FFF;
			@Pc(211) int local211 = Class42.anIntArray51[local207];
			@Pc(215) int local215 = Class42.anIntArray52[local207];
			@Pc(225) int local225 = local215 * local101 + local211 * local103 >> 14;
			local103 = local103 * local215 - local211 * local101 >> 14;
			super.anInt9803 += local103;
			super.anInt9805 += local225;
		}
		return;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(BIIII)V")
	public void method6890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) double local14;
		if (!this.aBoolean535) {
			local14 = (double) (arg1 - super.anInt9805);
			@Pc(21) double local21 = (double) (arg0 - super.anInt9803);
			@Pc(30) double local30 = Math.sqrt(local21 * local21 + local14 * local14);
			this.aDouble19 = local21 * (double) this.anInt7949 / local30 + (double) super.anInt9803;
			this.aDouble23 = (double) super.anInt9805 + (double) this.anInt7949 * local14 / local30;
			if (this.aBoolean533) {
				this.aDouble20 = (double) (Static461.method6500((int) this.aDouble23, super.aByte139, (int) this.aDouble19) - this.anInt7931);
			} else {
				this.aDouble20 = (double) super.anInt9797;
			}
		}
		local14 = (double) (this.anInt7944 + 1 - arg3);
		this.aDouble26 = ((double) arg1 - this.aDouble23) / local14;
		this.aDouble24 = ((double) arg0 - this.aDouble19) / local14;
		this.aDouble22 = Math.sqrt(this.aDouble26 * this.aDouble26 + this.aDouble24 * this.aDouble24);
		if (this.anInt7956 == -1) {
			this.aDouble25 = ((double) arg2 - this.aDouble20) / local14;
		} else {
			if (!this.aBoolean535) {
				this.aDouble25 = -this.aDouble22 * Math.tan((double) this.anInt7956 * 0.02454369D);
			}
			this.aDouble21 = ((double) arg2 - this.aDouble20 - local14 * this.aDouble25) * 2.0D / (local14 * local14);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class43 method6891(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class295 local9 = Static463.aClass352_1.method8006(this.anInt7935);
		return local9.method6637(Static315.aClass14_1, this.anInt7932, arg1, this.anInt7959, arg0, this.anInt7948);
	}

	@OriginalMember(owner = "client!qja", name = "b", descriptor = "(I)V")
	public void method6892() {
		if (this.aClass4_Sub9_7 != null) {
			this.aClass4_Sub9_7.method8044();
		}
	}

	@OriginalMember(owner = "client!qja", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		return false;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		@Pc(11) Class43 local11 = this.method6891(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(19) Class10 local19 = arg0.method8610();
		local19.method4218(this.anInt7934);
		local19.method4215(this.lb);
		local19.method4225((int) this.aDouble23, (int) this.aDouble20, (int) this.aDouble19);
		this.method6893(arg0, local19, local11);
		@Pc(49) Class4_Sub6 local49 = Static281.method4512(false, 1);
		if (Static305.aBoolean339) {
			local11.method8846(local19, local49.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
		} else {
			local11.method8849(local19, local49.aClass4_Sub8Array1[0], 0);
		}
		if (this.aClass4_Sub9_7 != null) {
			@Pc(81) Class336 local81 = this.aClass4_Sub9_7.method8046();
			if (Static305.aBoolean339) {
				arg0.method8618(local81, Static216.anInt1170);
			} else {
				arg0.method8586(local81);
			}
		}
		this.aBoolean534 = local11.F();
		this.anInt7937 = local11.fa();
		this.anInt7939 = local11.ma();
		return local49;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!ha;ZLclient!sj;Lclient!ka;)V")
	private void method6893(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) Class43 arg2) {
		arg2.method8847(arg1);
		@Pc(16) Class363[] local16 = arg2.method8853();
		@Pc(19) Class270[] local19 = arg2.method8863();
		if ((this.aClass4_Sub9_7 == null || this.aClass4_Sub9_7.aBoolean654) && (local16 != null || local19 != null)) {
			this.aClass4_Sub9_7 = Static585.method8058(Static565.anInt8921, true);
		}
		if (this.aClass4_Sub9_7 != null) {
			this.aClass4_Sub9_7.method8049(arg0, (long) Static565.anInt8921, local16, local19);
			this.aClass4_Sub9_7.method8057(super.aByte139, super.aShort104, super.aShort103, super.aShort105, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qja", name = "j", descriptor = "(I)V")
	@Override
	public void method7575() {
		super.aShort104 = super.aShort103 = (short) (int) (this.aDouble23 / 512.0D);
		super.aShort105 = super.aShort102 = (short) (int) (this.aDouble19 / 512.0D);
	}

	@OriginalMember(owner = "client!qja", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 > -112) {
			this.method8344();
		}
		return this.anInt7939;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 <= -10) {
			throw new IllegalStateException();
		}
	}
}
