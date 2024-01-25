import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class28_Sub1_Sub4_Sub3 extends Class28_Sub1_Sub4 {

	@OriginalMember(owner = "client!nja", name = "ab", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!nja", name = "cb", descriptor = "D")
	private double aDouble12;

	@OriginalMember(owner = "client!nja", name = "db", descriptor = "Lclient!nia;")
	private Class28_Sub5 aClass28_Sub5_5;

	@OriginalMember(owner = "client!nja", name = "fb", descriptor = "I")
	private int anInt7106;

	@OriginalMember(owner = "client!nja", name = "gb", descriptor = "D")
	private double aDouble13;

	@OriginalMember(owner = "client!nja", name = "jb", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!nja", name = "kb", descriptor = "D")
	private double aDouble15;

	@OriginalMember(owner = "client!nja", name = "ob", descriptor = "D")
	private double aDouble16;

	@OriginalMember(owner = "client!nja", name = "tb", descriptor = "I")
	private int anInt7114;

	@OriginalMember(owner = "client!nja", name = "zb", descriptor = "D")
	private double aDouble17;

	@OriginalMember(owner = "client!nja", name = "Gb", descriptor = "D")
	private double aDouble18;

	@OriginalMember(owner = "client!nja", name = "S", descriptor = "I")
	private int anInt7098 = 0;

	@OriginalMember(owner = "client!nja", name = "Ab", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!nja", name = "Cb", descriptor = "Z")
	private boolean aBoolean617 = false;

	@OriginalMember(owner = "client!nja", name = "vb", descriptor = "I")
	private int anInt7116 = 0;

	@OriginalMember(owner = "client!nja", name = "Bb", descriptor = "I")
	private int anInt7120 = -1;

	@OriginalMember(owner = "client!nja", name = "xb", descriptor = "I")
	private int anInt7118 = 0;

	@OriginalMember(owner = "client!nja", name = "Hb", descriptor = "I")
	private int anInt7124 = 0;

	@OriginalMember(owner = "client!nja", name = "Lb", descriptor = "I")
	public final int anInt7128;

	@OriginalMember(owner = "client!nja", name = "bb", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!nja", name = "ub", descriptor = "I")
	private final int anInt7115;

	@OriginalMember(owner = "client!nja", name = "Q", descriptor = "I")
	private final int anInt7096;

	@OriginalMember(owner = "client!nja", name = "R", descriptor = "I")
	private final int anInt7097;

	@OriginalMember(owner = "client!nja", name = "ib", descriptor = "I")
	private final int anInt7108;

	@OriginalMember(owner = "client!nja", name = "X", descriptor = "I")
	public final int anInt7103;

	@OriginalMember(owner = "client!nja", name = "U", descriptor = "I")
	public final int anInt7100;

	@OriginalMember(owner = "client!nja", name = "pb", descriptor = "I")
	private final int anInt7111;

	@OriginalMember(owner = "client!nja", name = "Nb", descriptor = "I")
	public final int anInt7130;

	@OriginalMember(owner = "client!nja", name = "Z", descriptor = "I")
	private final int anInt7105;

	@OriginalMember(owner = "client!nja", name = "eb", descriptor = "Lclient!jba;")
	private final Class175 aClass175_2;

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class28_Sub1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static441.method6444(arg1, arg3, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt7128 = arg7;
		this.aBoolean615 = arg13;
		this.anInt7115 = arg10;
		this.anInt7096 = arg14;
		this.anInt7097 = arg9;
		this.anInt7108 = arg8;
		this.anInt7103 = arg11;
		this.anInt7100 = arg6;
		this.anInt7111 = arg0;
		this.anInt7130 = arg12;
		this.aBoolean616 = false;
		this.anInt7105 = arg5;
		@Pc(91) int local91 = Static239.aClass91_1.method2243(this.anInt7111).anInt9376;
		if (local91 == -1) {
			this.aClass175_2 = null;
		} else {
			this.aClass175_2 = Static591.aClass66_2.method1768(local91);
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!ha;IB)Lclient!ka;")
	private Class153 method5891(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class338 local9 = Static239.aClass91_1.method2243(this.anInt7111);
		return local9.method7936(Static591.aClass66_2, arg1, this.anInt7098, arg0, this.anInt7120, this.anInt7116);
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(II)V")
	public void method5892(@OriginalArg(0) int arg0) {
		this.aDouble14 += (double) arg0 * this.aDouble17;
		this.aDouble12 += (double) arg0 * this.aDouble15;
		this.aBoolean616 = true;
		if (this.aBoolean615) {
			this.aDouble16 = (double) (Static441.method6444(super.aByte145, (int) this.aDouble12, (int) this.aDouble14) - this.anInt7105);
		} else if (this.anInt7108 == -1) {
			this.aDouble16 += this.aDouble18 * (double) arg0;
		} else {
			this.aDouble16 += (double) arg0 * this.aDouble18 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble13;
			this.aDouble18 += this.aDouble13 * (double) arg0;
		}
		this.anInt7114 = (int) (Math.atan2(this.aDouble15, this.aDouble17) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt7106 = (int) (Math.atan2(this.aDouble18, this.aDouble11) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass175_2 == null) {
			return;
		}
		this.anInt7116 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt7116 <= this.aClass175_2.anIntArray291[this.anInt7098]) {
						return;
					}
					this.anInt7116 -= this.aClass175_2.anIntArray291[this.anInt7098];
					this.anInt7098++;
					if (this.anInt7098 >= this.aClass175_2.anIntArray288.length) {
						this.anInt7098 -= this.aClass175_2.anInt5029;
						if (this.anInt7098 < 0 || this.anInt7098 >= this.aClass175_2.anIntArray288.length) {
							this.anInt7098 = 0;
						}
					}
					this.anInt7120 = this.anInt7098 + 1;
				} while (this.aClass175_2.anIntArray288.length > this.anInt7120);
				this.anInt7120 -= this.aClass175_2.anInt5029;
			} while (this.anInt7120 >= 0 && this.aClass175_2.anIntArray288.length > this.anInt7120);
			this.anInt7120 = -1;
		}
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub5_5 != null) {
			this.aClass28_Sub5_5.method5858();
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		@Pc(11) Class153 local11 = this.method5891(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class254 local24 = arg0.method6903();
		local24.method7354(this.anInt7106);
		local24.method7350(this.anInt7114);
		local24.method7358((int) this.aDouble12, (int) this.aDouble16, (int) this.aDouble14);
		this.method5897(local24, local11, arg0);
		@Pc(54) Class28_Sub7 local54 = Static375.method5607(false, 1);
		if (Static632.aBoolean877) {
			local11.method8594(local24, local54.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			local11.method8585(local24, local54.aClass28_Sub9Array1[0], 0);
		}
		if (this.aClass28_Sub5_5 != null) {
			@Pc(82) Class392 local82 = this.aClass28_Sub5_5.method5856();
			if (Static632.aBoolean877) {
				arg0.method6897(local82, Static483.anInt8094);
			} else {
				arg0.method6899(local82);
			}
		}
		this.aBoolean617 = local11.F();
		this.anInt7124 = local11.fa();
		this.anInt7118 = local11.ma();
		return local54;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V")
	public void method5894() {
		if (this.aBoolean616 || this.anInt7115 == 0) {
			return;
		}
		@Pc(19) Class28_Sub1_Sub4_Sub2 local19 = null;
		@Pc(30) int local30;
		if (this.anInt7115 >= 0) {
			local30 = this.anInt7115 - 1;
			@Pc(37) Class5_Sub25 local37 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local30);
			if (local37 != null) {
				local19 = local37.aClass28_Sub1_Sub4_Sub2_Sub1_1;
			}
		} else {
			local30 = -this.anInt7115 - 1;
			if (local30 == Static216.anInt4046) {
				local19 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1;
			} else {
				local19 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local30];
			}
		}
		if (local19 == null) {
			return;
		}
		super.anInt10784 = local19.anInt10784;
		super.anInt10781 = local19.anInt10781;
		super.anInt10779 = Static441.method6444(super.aByte145, local19.anInt10781, local19.anInt10784) - this.anInt7105;
		if (this.anInt7096 < 0) {
			return;
		}
		@Pc(92) Class167 local92 = local19.method4580();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		if (local92.anIntArrayArray22 != null && local92.anIntArrayArray22[this.anInt7096] != null) {
			local96 = local92.anIntArrayArray22[this.anInt7096][2];
			local94 = local92.anIntArrayArray22[this.anInt7096][0];
		}
		if (local92.anIntArrayArray21 != null && local92.anIntArrayArray21[this.anInt7096] != null) {
			local94 += local92.anIntArrayArray21[this.anInt7096][0];
			local96 += local92.anIntArrayArray21[this.anInt7096][2];
		}
		if (local94 != 0 || local96 != 0) {
			@Pc(166) int local166 = local19.aClass306_7.method7389();
			@Pc(168) int local168 = local166;
			if (local19.anIntArray306 != null && local19.anIntArray306[this.anInt7096] != -1) {
				local168 = local19.anIntArray306[this.anInt7096];
			}
			@Pc(190) int local190 = local168 - local166 & 0x3FFF;
			@Pc(194) int local194 = Class200.anIntArray337[local190];
			@Pc(198) int local198 = Class200.anIntArray338[local190];
			@Pc(208) int local208 = local194 * local96 + local94 * local198 >> 14;
			local96 = local198 * local96 - local194 * local94 >> 14;
			super.anInt10784 += local96;
			super.anInt10781 += local208;
		}
		return;
	}

	@OriginalMember(owner = "client!nja", name = "g", descriptor = "(I)V")
	public void method5895() {
		if (this.aClass28_Sub5_5 != null) {
			this.aClass28_Sub5_5.method5858();
		}
	}

	@OriginalMember(owner = "client!nja", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		return arg0 >= -85 ? 33 : this.anInt7118;
	}

	@OriginalMember(owner = "client!nja", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nja", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return false;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
		@Pc(15) Class153 local15 = this.method5891(arg0, 0);
		if (local15 == null) {
			return;
		}
		@Pc(21) Class254 local21 = arg0.method6903();
		local21.method7354(this.anInt7106);
		local21.method7350(this.anInt7114);
		local21.method7358((int) this.aDouble12, (int) this.aDouble16, (int) this.aDouble14);
		this.anInt7124 = local15.fa();
		this.anInt7118 = local15.ma();
		this.method5897(local21, local15, arg0);
	}

	@OriginalMember(owner = "client!nja", name = "f", descriptor = "(I)V")
	@Override
	public void method8981() {
		super.aShort124 = super.aShort122 = (short) (int) (this.aDouble12 / 512.0D);
		super.aShort121 = super.aShort123 = (short) (int) (this.aDouble14 / 512.0D);
	}

	@OriginalMember(owner = "client!nja", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aBoolean617;
	}

	@OriginalMember(owner = "client!nja", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		return false;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!oha;Lclient!ka;ILclient!ha;)V")
	private void method5897(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(3) Class65 arg2) {
		arg1.method8589(arg0);
		@Pc(13) Class313[] local13 = arg1.method8575();
		@Pc(16) Class209[] local16 = arg1.method8587();
		if ((this.aClass28_Sub5_5 == null || this.aClass28_Sub5_5.aBoolean608) && (local13 != null || local16 != null)) {
			this.aClass28_Sub5_5 = Static398.method5855(Static26.anInt350, true);
		}
		if (this.aClass28_Sub5_5 != null) {
			this.aClass28_Sub5_5.method5852(arg2, (long) Static26.anInt350, local13, local16);
			this.aClass28_Sub5_5.method5845(super.aByte145, super.aShort124, super.aShort122, super.aShort121, super.aShort123);
		}
	}

	@OriginalMember(owner = "client!nja", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.anInt7124;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IIIIB)V")
	public void method5899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean616) {
			local13 = (double) (arg3 - super.anInt10781);
			@Pc(20) double local20 = (double) (arg1 - super.anInt10784);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble12 = local13 * (double) this.anInt7097 / local29 + (double) super.anInt10781;
			this.aDouble14 = local20 * (double) this.anInt7097 / local29 + (double) super.anInt10784;
			if (this.aBoolean615) {
				this.aDouble16 = (double) (Static441.method6444(super.aByte145, (int) this.aDouble12, (int) this.aDouble14) - this.anInt7105);
			} else {
				this.aDouble16 = (double) super.anInt10779;
			}
		}
		local13 = (double) (this.anInt7128 + 1 - arg2);
		this.aDouble15 = ((double) arg3 - this.aDouble12) / local13;
		this.aDouble17 = ((double) arg1 - this.aDouble14) / local13;
		this.aDouble11 = Math.sqrt(this.aDouble17 * this.aDouble17 + this.aDouble15 * this.aDouble15);
		if (this.anInt7108 == -1) {
			this.aDouble18 = ((double) arg0 - this.aDouble16) / local13;
		} else {
			if (!this.aBoolean616) {
				this.aDouble18 = -this.aDouble11 * Math.tan((double) this.anInt7108 * 0.02454369D);
			}
			this.aDouble13 = ((double) arg0 - this.aDouble18 * local13 - this.aDouble16) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
