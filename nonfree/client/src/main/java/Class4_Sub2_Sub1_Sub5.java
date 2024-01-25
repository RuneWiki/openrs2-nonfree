import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class4_Sub2_Sub1_Sub5 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "D")
	private double aDouble26;

	@OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
	private int anInt9487;

	@OriginalMember(owner = "client!ue", name = "mb", descriptor = "D")
	private double aDouble27;

	@OriginalMember(owner = "client!ue", name = "ub", descriptor = "D")
	private double aDouble28;

	@OriginalMember(owner = "client!ue", name = "yb", descriptor = "D")
	private double aDouble29;

	@OriginalMember(owner = "client!ue", name = "Ab", descriptor = "D")
	private double aDouble30;

	@OriginalMember(owner = "client!ue", name = "Eb", descriptor = "Lclient!em;")
	private Class4_Sub4 aClass4_Sub4_8;

	@OriginalMember(owner = "client!ue", name = "Ib", descriptor = "D")
	private double aDouble31;

	@OriginalMember(owner = "client!ue", name = "Nb", descriptor = "I")
	private int anInt9506;

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
	private int anInt9472 = 0;

	@OriginalMember(owner = "client!ue", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!ue", name = "nb", descriptor = "Z")
	private boolean aBoolean680 = false;

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "I")
	private int anInt9486 = 0;

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
	private int anInt9478 = -1;

	@OriginalMember(owner = "client!ue", name = "Mb", descriptor = "I")
	private int anInt9505 = 0;

	@OriginalMember(owner = "client!ue", name = "ob", descriptor = "Z")
	private boolean aBoolean681 = false;

	@OriginalMember(owner = "client!ue", name = "tb", descriptor = "I")
	public final int anInt9492;

	@OriginalMember(owner = "client!ue", name = "Pb", descriptor = "I")
	private final int anInt9508;

	@OriginalMember(owner = "client!ue", name = "Fb", descriptor = "I")
	private final int anInt9500;

	@OriginalMember(owner = "client!ue", name = "Ob", descriptor = "I")
	public final int anInt9507;

	@OriginalMember(owner = "client!ue", name = "rb", descriptor = "I")
	private final int anInt9490;

	@OriginalMember(owner = "client!ue", name = "Lb", descriptor = "I")
	private final int anInt9504;

	@OriginalMember(owner = "client!ue", name = "Jb", descriptor = "I")
	private final int anInt9503;

	@OriginalMember(owner = "client!ue", name = "Bb", descriptor = "I")
	public final int anInt9497;

	@OriginalMember(owner = "client!ue", name = "vb", descriptor = "I")
	private final int anInt9493;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!ue", name = "pb", descriptor = "I")
	public final int anInt9488;

	@OriginalMember(owner = "client!ue", name = "Kb", descriptor = "Lclient!vga;")
	private final Class362 aClass362_3;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class4_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static644.method9021(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.aBoolean681 = false;
		this.anInt9492 = arg11;
		this.anInt9508 = arg10;
		this.anInt9500 = arg8;
		this.anInt9507 = arg6;
		this.anInt9490 = arg0;
		this.anInt9504 = arg9;
		this.anInt9503 = arg14;
		this.anInt9497 = arg12;
		this.anInt9493 = arg5;
		this.aBoolean679 = arg13;
		this.anInt9488 = arg7;
		@Pc(91) int local91 = Static52.aClass10_1.method211(this.anInt9490).anInt2052;
		if (local91 == -1) {
			this.aClass362_3 = null;
		} else {
			this.aClass362_3 = Static435.aClass298_1.method7034(local91);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public void method8167() {
		if (this.aBoolean681 || this.anInt9508 == 0) {
			return;
		}
		@Pc(20) Class4_Sub2_Sub1_Sub1 local20 = null;
		@Pc(29) int local29;
		if (this.anInt9508 < 0) {
			local29 = -this.anInt9508 - 1;
			if (local29 == Static337.anInt5722) {
				local20 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2;
			} else {
				local20 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local29];
			}
		} else {
			local29 = this.anInt9508 - 1;
			@Pc(56) Class5_Sub3 local56 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local29);
			if (local56 != null) {
				local20 = local56.aClass4_Sub2_Sub1_Sub1_Sub2_1;
			}
		}
		if (local20 == null) {
			return;
		}
		super.anInt10229 = local20.anInt10229;
		super.anInt10231 = local20.anInt10231;
		super.anInt10228 = Static644.method9021(local20.anInt10229, local20.anInt10231, super.aByte132) - this.anInt9493;
		if (this.anInt9503 < 0) {
			return;
		}
		@Pc(92) Class269 local92 = local20.method1025();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		if (local92.anIntArrayArray50 != null && local92.anIntArrayArray50[this.anInt9503] != null) {
			local94 = local92.anIntArrayArray50[this.anInt9503][0];
			local96 = local92.anIntArrayArray50[this.anInt9503][2];
		}
		if (local92.anIntArrayArray51 != null && local92.anIntArrayArray51[this.anInt9503] != null) {
			local94 += local92.anIntArrayArray51[this.anInt9503][0];
			local96 += local92.anIntArrayArray51[this.anInt9503][2];
		}
		if (local94 != 0 || local96 != 0) {
			@Pc(166) int local166 = local20.aClass107_7.method2219();
			@Pc(168) int local168 = local166;
			if (local20.anIntArray89 != null && local20.anIntArray89[this.anInt9503] != -1) {
				local168 = local20.anIntArray89[this.anInt9503];
			}
			@Pc(191) int local191 = local168 - local166 & 0x3FFF;
			@Pc(195) int local195 = Class377.anIntArray600[local191];
			@Pc(199) int local199 = Class377.anIntArray601[local191];
			@Pc(209) int local209 = local195 * local96 + local199 * local94 >> 14;
			local96 = local96 * local199 - local94 * local195 >> 14;
			super.anInt10231 += local209;
			super.anInt10229 += local96;
		}
		return;
	}

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
		@Pc(19) Class187 local19 = this.method8173(arg0, 0);
		if (local19 == null) {
			return;
		}
		@Pc(25) Class113 local25 = arg0.method7262();
		local25.method8457(this.anInt9487);
		local25.method8461(this.anInt9506);
		local25.method8454((int) this.aDouble31, (int) this.aDouble29, (int) this.aDouble24);
		this.anInt9505 = local19.fa();
		this.lb = local19.ma();
		this.method8168(arg0, local25, local19);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		@Pc(11) Class187 local11 = this.method8173(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class113 local18 = arg0.method7262();
		local18.method8457(this.anInt9487);
		local18.method8461(this.anInt9506);
		local18.method8454((int) this.aDouble31, (int) this.aDouble29, (int) this.aDouble24);
		this.method8168(arg0, local18, local11);
		@Pc(57) Class4_Sub6 local57 = Static242.method4012(1, false);
		if (Static57.aBoolean65) {
			local11.method8654(local18, local57.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
		} else {
			local11.method8645(local18, local57.aClass4_Sub9Array1[0], 0);
		}
		if (this.aClass4_Sub4_8 != null) {
			@Pc(85) Class235 local85 = this.aClass4_Sub4_8.method1961();
			if (Static57.aBoolean65) {
				arg0.method7302(local85, Static469.anInt7885);
			} else {
				arg0.method7308(local85);
			}
		}
		this.aBoolean680 = local11.F();
		this.anInt9505 = local11.fa();
		this.lb = local11.ma();
		return local57;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ha;Lclient!tc;Lclient!ka;Z)V")
	private void method8168(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class187 arg2) {
		arg2.method8638(arg1);
		@Pc(15) Class261[] local15 = arg2.method8650();
		@Pc(18) Class320[] local18 = arg2.method8636();
		if ((this.aClass4_Sub4_8 == null || this.aClass4_Sub4_8.aBoolean174) && (local15 != null || local18 != null)) {
			this.aClass4_Sub4_8 = Static131.method1960(Static631.anInt10493, true);
		}
		if (this.aClass4_Sub4_8 != null) {
			this.aClass4_Sub4_8.method1966(arg0, (long) Static631.anInt10493, local15, local18);
			this.aClass4_Sub4_8.method1965(super.aByte132, super.aShort107, super.aShort109, super.aShort108, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aBoolean680;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "(I)V")
	@Override
	public void method8165() {
		super.aShort107 = super.aShort109 = (short) (this.aDouble31 / 512.0D);
		super.aShort108 = super.aShort110 = (short) (this.aDouble24 / 512.0D);
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
	@Override
	public void method8726() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZILclient!ha;Lclient!ov;IIZ)V")
	@Override
	public void method8715(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
	public void method8169(@OriginalArg(0) int arg0) {
		this.aDouble31 += (double) arg0 * this.aDouble27;
		this.aBoolean681 = true;
		this.aDouble24 += this.aDouble28 * (double) arg0;
		if (this.aBoolean679) {
			this.aDouble29 = Static644.method9021((int) this.aDouble24, (int) this.aDouble31, super.aByte132) - this.anInt9493;
		} else if (this.anInt9500 == -1) {
			this.aDouble29 += this.aDouble26 * (double) arg0;
		} else {
			this.aDouble29 += (double) arg0 * this.aDouble26 + (double) arg0 * 0.5D * this.aDouble25 * (double) arg0;
			this.aDouble26 += this.aDouble25 * (double) arg0;
		}
		this.anInt9506 = (int) (Math.atan2(this.aDouble27, this.aDouble28) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt9487 = (int) (Math.atan2(this.aDouble26, this.aDouble30) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass362_3 == null) {
			return;
		}
		this.anInt9472 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt9472 <= this.aClass362_3.anIntArray573[this.anInt9486]) {
						return;
					}
					this.anInt9472 -= this.aClass362_3.anIntArray573[this.anInt9486];
					this.anInt9486++;
					if (this.aClass362_3.anIntArray571.length <= this.anInt9486) {
						this.anInt9486 -= this.aClass362_3.anInt9996;
						if (this.anInt9486 < 0 || this.anInt9486 >= this.aClass362_3.anIntArray571.length) {
							this.anInt9486 = 0;
						}
					}
					this.anInt9478 = this.anInt9486 + 1;
				} while (this.aClass362_3.anIntArray571.length > this.anInt9478);
				this.anInt9478 -= this.aClass362_3.anInt9996;
			} while (this.anInt9478 >= 0 && this.aClass362_3.anIntArray571.length > this.anInt9478);
			this.anInt9478 = -1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub4_8 != null) {
			this.aClass4_Sub4_8.method1962();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public void method8171() {
		if (this.aClass4_Sub4_8 != null) {
			this.aClass4_Sub4_8.method1962();
		}
	}

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class187 method8173(@OriginalArg(0) Class133 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class82 local15 = Static52.aClass10_1.method211(this.anInt9490);
		return local15.method1684(arg1, arg0, this.anInt9478, this.anInt9486, Static435.aClass298_1, this.anInt9472);
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.anInt9505;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBII)V")
	public void method8174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean681) {
			local12 = arg2 - super.anInt10231;
			@Pc(18) double local18 = (double) (arg1 - super.anInt10229);
			@Pc(27) double local27 = Math.sqrt(local18 * local18 + local12 * local12);
			this.aDouble31 = (double) this.anInt9504 * local12 / local27 + (double) super.anInt10231;
			this.aDouble24 = (double) this.anInt9504 * local18 / local27 + (double) super.anInt10229;
			if (this.aBoolean679) {
				this.aDouble29 = Static644.method9021((int) this.aDouble24, (int) this.aDouble31, super.aByte132) - this.anInt9493;
			} else {
				this.aDouble29 = super.anInt10228;
			}
		}
		local12 = this.anInt9488 + 1 - arg0;
		this.aDouble28 = ((double) arg1 - this.aDouble24) / local12;
		this.aDouble27 = ((double) arg2 - this.aDouble31) / local12;
		this.aDouble30 = Math.sqrt(this.aDouble28 * this.aDouble28 + this.aDouble27 * this.aDouble27);
		if (this.anInt9500 == -1) {
			this.aDouble26 = ((double) arg3 - this.aDouble29) / local12;
		} else {
			if (!this.aBoolean681) {
				this.aDouble26 = -this.aDouble30 * Math.tan((double) this.anInt9500 * 0.02454369D);
			}
			this.aDouble25 = ((double) arg3 - this.aDouble29 - this.aDouble26 * local12) * 2.0D / (local12 * local12);
		}
	}
}
