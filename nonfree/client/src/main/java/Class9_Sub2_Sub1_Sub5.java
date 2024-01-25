import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class9_Sub2_Sub1_Sub5 extends Class9_Sub2_Sub1 {

	@OriginalMember(owner = "client!si", name = "S", descriptor = "I")
	private int anInt8750;

	@OriginalMember(owner = "client!si", name = "V", descriptor = "Lclient!nha;")
	private Class9_Sub8 aClass9_Sub8_6;

	@OriginalMember(owner = "client!si", name = "Y", descriptor = "D")
	private double aDouble20;

	@OriginalMember(owner = "client!si", name = "ib", descriptor = "D")
	private double aDouble21;

	@OriginalMember(owner = "client!si", name = "ob", descriptor = "D")
	private double aDouble22;

	@OriginalMember(owner = "client!si", name = "wb", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!si", name = "xb", descriptor = "I")
	private int anInt8772;

	@OriginalMember(owner = "client!si", name = "Fb", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!si", name = "Gb", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!si", name = "Jb", descriptor = "D")
	private double aDouble26;

	@OriginalMember(owner = "client!si", name = "Mb", descriptor = "D")
	private double aDouble27;

	@OriginalMember(owner = "client!si", name = "R", descriptor = "I")
	private int anInt8749 = 0;

	@OriginalMember(owner = "client!si", name = "hb", descriptor = "Z")
	private boolean aBoolean650 = false;

	@OriginalMember(owner = "client!si", name = "Ab", descriptor = "I")
	private int anInt8775 = 0;

	@OriginalMember(owner = "client!si", name = "zb", descriptor = "I")
	private int anInt8774 = 0;

	@OriginalMember(owner = "client!si", name = "Pb", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!si", name = "qb", descriptor = "I")
	private int anInt8766 = 0;

	@OriginalMember(owner = "client!si", name = "Qb", descriptor = "I")
	private int anInt8785 = -1;

	@OriginalMember(owner = "client!si", name = "vb", descriptor = "I")
	private final int anInt8771;

	@OriginalMember(owner = "client!si", name = "mb", descriptor = "Z")
	private final boolean aBoolean651;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "I")
	public final int anInt8747;

	@OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
	private final int anInt8757;

	@OriginalMember(owner = "client!si", name = "Db", descriptor = "I")
	public final int anInt8778;

	@OriginalMember(owner = "client!si", name = "tb", descriptor = "I")
	private final int anInt8769;

	@OriginalMember(owner = "client!si", name = "yb", descriptor = "I")
	private final int anInt8773;

	@OriginalMember(owner = "client!si", name = "kb", descriptor = "I")
	public final int anInt8763;

	@OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
	public final int anInt8759;

	@OriginalMember(owner = "client!si", name = "pb", descriptor = "I")
	private final int anInt8765;

	@OriginalMember(owner = "client!si", name = "nb", descriptor = "I")
	private final int anInt8764;

	@OriginalMember(owner = "client!si", name = "Eb", descriptor = "Lclient!pia;")
	private final Class267 aClass267_3;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class9_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static594.method8211(arg3, arg4, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt8771 = arg8;
		this.aBoolean651 = arg13;
		this.anInt8747 = arg11;
		this.anInt8757 = arg9;
		this.anInt8778 = arg12;
		this.anInt8769 = arg10;
		this.aBoolean650 = false;
		this.anInt8773 = arg0;
		this.anInt8763 = arg7;
		this.anInt8759 = arg6;
		this.anInt8765 = arg5;
		this.anInt8764 = arg14;
		@Pc(91) int local91 = Static266.aClass135_1.method3108(this.anInt8773).anInt6225;
		if (local91 == -1) {
			this.aClass267_3 = null;
		} else {
			this.aClass267_3 = Static474.aClass264_2.method6574(local91);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		@Pc(13) Class75 local13 = this.method7552(arg0, 2048);
		if (local13 == null) {
			return null;
		}
		@Pc(20) Class31 local20 = arg0.method6125();
		local20.method7935(this.anInt8750);
		local20.method7924(this.anInt8772);
		local20.method7930((int) this.aDouble22, (int) this.aDouble26, (int) this.aDouble25);
		this.method7556(local13, arg0, local20);
		@Pc(52) Class9_Sub10 local52 = Static635.method8548(1, false);
		if (Static40.aBoolean34) {
			local13.method6788(local20, local52.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			local13.method6799(local20, local52.aClass9_Sub5Array1[0], 0);
		}
		if (this.aClass9_Sub8_6 != null) {
			@Pc(80) Class162 local80 = this.aClass9_Sub8_6.method5949();
			if (Static40.aBoolean34) {
				arg0.method6107(local80, Static562.anInt9327);
			} else {
				arg0.method6161(local80);
			}
		}
		this.aBoolean652 = local13.F();
		this.anInt8766 = local13.fa();
		this.anInt8749 = local13.ma();
		return local52;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return false;
	}

	@OriginalMember(owner = "client!si", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!si", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub8_6 != null) {
			this.aClass9_Sub8_6.method5945();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class75 method7552(@OriginalArg(1) Class82 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class207 local16 = Static266.aClass135_1.method3108(this.anInt8773);
		return local16.method5373(Static474.aClass264_2, this.anInt8775, this.anInt8774, arg1, this.anInt8785, arg0);
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	public void method7554() {
		if (this.aBoolean650 || this.anInt8769 == 0) {
			return;
		}
		@Pc(13) Class9_Sub2_Sub1_Sub2 local13 = null;
		@Pc(25) int local25;
		if (this.anInt8769 < 0) {
			local25 = -this.anInt8769 - 1;
			if (local25 == Static54.anInt1032) {
				local13 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1;
			} else {
				local13 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local25];
			}
		} else {
			local25 = this.anInt8769 - 1;
			@Pc(54) Class3_Sub43 local54 = (Class3_Sub43) Static545.aClass25_40.method426((long) local25);
			if (local54 != null) {
				local13 = local54.aClass9_Sub2_Sub1_Sub2_Sub2_2;
			}
		}
		if (local13 == null) {
			return;
		}
		super.anInt10152 = local13.anInt10152;
		super.anInt10158 = local13.anInt10158;
		super.anInt10154 = Static594.method8211(local13.anInt10152, local13.anInt10158, super.aByte127) - this.anInt8765;
		if (this.anInt8764 < 0) {
			return;
		}
		@Pc(92) Class176 local92 = local13.method8633();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		if (local92.anIntArrayArray22 != null && local92.anIntArrayArray22[this.anInt8764] != null) {
			local94 = local92.anIntArrayArray22[this.anInt8764][0];
			local96 = local92.anIntArrayArray22[this.anInt8764][2];
		}
		if (local92.anIntArrayArray23 != null && local92.anIntArrayArray23[this.anInt8764] != null) {
			local96 += local92.anIntArrayArray23[this.anInt8764][2];
			local94 += local92.anIntArrayArray23[this.anInt8764][0];
		}
		if (local94 != 0 || local96 != 0) {
			@Pc(166) int local166 = local13.aClass191_7.method5071();
			@Pc(168) int local168 = local166;
			if (local13.anIntArray667 != null && local13.anIntArray667[this.anInt8764] != -1) {
				local168 = local13.anIntArray667[this.anInt8764];
			}
			@Pc(191) int local191 = local168 - local166 & 0x3FFF;
			@Pc(195) int local195 = Class3_Sub13.anIntArray147[local191];
			@Pc(199) int local199 = Class3_Sub13.anIntArray146[local191];
			@Pc(210) int local210 = local195 * local96 + local94 * local199 >> 14;
			local96 = local96 * local199 - local94 * local195 >> 14;
			super.anInt10158 += local96;
			super.anInt10152 += local210;
		}
		return;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ka;Lclient!ha;ILclient!ih;)V")
	private void method7556(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) Class31 arg2) {
		arg0.method6797(arg2);
		@Pc(9) Class228[] local9 = arg0.method6794();
		@Pc(18) Class232[] local18 = arg0.method6801();
		if ((this.aClass9_Sub8_6 == null || this.aClass9_Sub8_6.aBoolean493) && (local9 != null || local18 != null)) {
			this.aClass9_Sub8_6 = Static375.method5938(Static304.anInt8391, true);
		}
		if (this.aClass9_Sub8_6 != null) {
			this.aClass9_Sub8_6.method5936(arg1, (long) Static304.anInt8391, local9, local18);
			this.aClass9_Sub8_6.method5946(super.aByte127, super.aShort126, super.aShort127, super.aShort124, super.aShort125);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)V")
	public void method7557(@OriginalArg(1) int arg0) {
		this.aDouble25 += (double) arg0 * this.aDouble20;
		this.aBoolean650 = true;
		this.aDouble22 += this.aDouble21 * (double) arg0;
		if (this.aBoolean651) {
			this.aDouble26 = (double) (Static594.method8211((int) this.aDouble22, (int) this.aDouble25, super.aByte127) - this.anInt8765);
		} else if (this.anInt8771 == -1) {
			this.aDouble26 += (double) arg0 * this.aDouble23;
		} else {
			this.aDouble26 += this.aDouble23 * (double) arg0 + this.aDouble24 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble23 += this.aDouble24 * (double) arg0;
		}
		this.anInt8772 = (int) (Math.atan2(this.aDouble21, this.aDouble20) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt8750 = (int) (Math.atan2(this.aDouble23, this.aDouble27) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass267_3 == null) {
			return;
		}
		this.anInt8774 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass267_3.anIntArray456[this.anInt8775] >= this.anInt8774) {
						return;
					}
					this.anInt8774 -= this.aClass267_3.anIntArray456[this.anInt8775];
					this.anInt8775++;
					if (this.aClass267_3.anIntArray458.length <= this.anInt8775) {
						this.anInt8775 -= this.aClass267_3.anInt7575;
						if (this.anInt8775 < 0 || this.anInt8775 >= this.aClass267_3.anIntArray458.length) {
							this.anInt8775 = 0;
						}
					}
					this.anInt8785 = this.anInt8775 + 1;
				} while (this.aClass267_3.anIntArray458.length > this.anInt8785);
				this.anInt8785 -= this.aClass267_3.anInt7575;
			} while (this.anInt8785 >= 0 && this.anInt8785 < this.aClass267_3.anIntArray458.length);
			this.anInt8785 = -1;
		}
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		return false;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		return arg0 == -86 ? this.anInt8749 : 14;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
		@Pc(9) Class75 local9 = this.method7552(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(19) Class31 local19 = arg0.method6125();
		local19.method7935(this.anInt8750);
		local19.method7924(this.anInt8772);
		local19.method7930((int) this.aDouble22, (int) this.aDouble26, (int) this.aDouble25);
		this.anInt8766 = local9.fa();
		this.anInt8749 = local9.ma();
		this.method7556(local9, arg0, local19);
	}

	@OriginalMember(owner = "client!si", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.anInt8766;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V")
	public void method7559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean650) {
			local8 = (double) (arg1 - super.anInt10152);
			@Pc(15) double local15 = (double) (arg3 - super.anInt10158);
			@Pc(24) double local24 = Math.sqrt(local8 * local8 + local15 * local15);
			this.aDouble25 = (double) super.anInt10158 + (double) this.anInt8757 * local15 / local24;
			this.aDouble22 = (double) super.anInt10152 + (double) this.anInt8757 * local8 / local24;
			if (this.aBoolean651) {
				this.aDouble26 = (double) (Static594.method8211((int) this.aDouble22, (int) this.aDouble25, super.aByte127) - this.anInt8765);
			} else {
				this.aDouble26 = (double) super.anInt10154;
			}
		}
		local8 = (double) (this.anInt8763 + 1 - arg2);
		this.aDouble20 = ((double) arg3 - this.aDouble25) / local8;
		this.aDouble21 = ((double) arg1 - this.aDouble22) / local8;
		this.aDouble27 = Math.sqrt(this.aDouble20 * this.aDouble20 + this.aDouble21 * this.aDouble21);
		if (this.anInt8771 == -1) {
			this.aDouble23 = ((double) arg0 - this.aDouble26) / local8;
		} else {
			if (!this.aBoolean650) {
				this.aDouble23 = -this.aDouble27 * Math.tan((double) this.anInt8771 * 0.02454369D);
			}
			this.aDouble24 = ((double) arg0 - local8 * this.aDouble23 - this.aDouble26) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!si", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aBoolean652;
	}

	@OriginalMember(owner = "client!si", name = "p", descriptor = "(I)V")
	@Override
	public void method8616() {
		super.aShort124 = super.aShort125 = (short) (int) (this.aDouble25 / 512.0D);
		super.aShort126 = super.aShort127 = (short) (int) (this.aDouble22 / 512.0D);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public void method7560() {
		if (this.aClass9_Sub8_6 != null) {
			this.aClass9_Sub8_6.method5945();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		return false;
	}
}
