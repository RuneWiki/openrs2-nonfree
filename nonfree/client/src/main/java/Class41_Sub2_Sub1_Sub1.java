import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class41_Sub2_Sub1_Sub1 extends Class41_Sub2_Sub1 {

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "D")
	private double aDouble23;

	@OriginalMember(owner = "client!bv", name = "Q", descriptor = "I")
	private int anInt1088;

	@OriginalMember(owner = "client!bv", name = "R", descriptor = "D")
	private double aDouble24;

	@OriginalMember(owner = "client!bv", name = "U", descriptor = "D")
	private double aDouble25;

	@OriginalMember(owner = "client!bv", name = "X", descriptor = "D")
	private double aDouble26;

	@OriginalMember(owner = "client!bv", name = "Y", descriptor = "D")
	private double aDouble27;

	@OriginalMember(owner = "client!bv", name = "bb", descriptor = "D")
	private double aDouble28;

	@OriginalMember(owner = "client!bv", name = "gb", descriptor = "D")
	private double aDouble29;

	@OriginalMember(owner = "client!bv", name = "lb", descriptor = "Lclient!wca;")
	private Class41_Sub9 lb;

	@OriginalMember(owner = "client!bv", name = "pb", descriptor = "I")
	private int anInt1104;

	@OriginalMember(owner = "client!bv", name = "ub", descriptor = "D")
	private double aDouble30;

	@OriginalMember(owner = "client!bv", name = "wb", descriptor = "I")
	private int anInt1109 = 0;

	@OriginalMember(owner = "client!bv", name = "rb", descriptor = "I")
	private int anInt1105 = -1;

	@OriginalMember(owner = "client!bv", name = "jb", descriptor = "I")
	private int anInt1100 = 0;

	@OriginalMember(owner = "client!bv", name = "mb", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!bv", name = "Eb", descriptor = "I")
	private int anInt1116 = 0;

	@OriginalMember(owner = "client!bv", name = "xb", descriptor = "I")
	private int anInt1110 = 0;

	@OriginalMember(owner = "client!bv", name = "Gb", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!bv", name = "V", descriptor = "I")
	private final int anInt1090;

	@OriginalMember(owner = "client!bv", name = "ob", descriptor = "I")
	private final int anInt1103;

	@OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
	public final int anInt1085;

	@OriginalMember(owner = "client!bv", name = "yb", descriptor = "I")
	public final int anInt1111;

	@OriginalMember(owner = "client!bv", name = "vb", descriptor = "I")
	private final int anInt1108;

	@OriginalMember(owner = "client!bv", name = "T", descriptor = "Z")
	private final boolean aBoolean99;

	@OriginalMember(owner = "client!bv", name = "db", descriptor = "I")
	public final int anInt1095;

	@OriginalMember(owner = "client!bv", name = "M", descriptor = "I")
	private final int anInt1084;

	@OriginalMember(owner = "client!bv", name = "ab", descriptor = "I")
	public final int anInt1093;

	@OriginalMember(owner = "client!bv", name = "qb", descriptor = "Lclient!lb;")
	private final Class185 aClass185_1;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class41_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static475.method6537(arg4, arg1, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt1090 = arg9;
		this.anInt1103 = arg8;
		this.anInt1085 = arg6;
		this.anInt1111 = arg7;
		this.aBoolean102 = false;
		this.anInt1108 = arg0;
		this.aBoolean99 = arg12;
		this.anInt1095 = arg10;
		this.anInt1084 = arg5;
		this.anInt1093 = arg11;
		@Pc(85) int local85 = Static368.aClass278_1.method6127(this.anInt1108).anInt7490;
		if (local85 == -1) {
			this.aClass185_1 = null;
		} else {
			this.aClass185_1 = Static545.aClass240_2.method5680(local85);
		}
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		@Pc(11) Class60 local11 = this.method923(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class11 local18 = arg0.method7397();
		local18.oa(this.anInt1088);
		local18.ZA(this.anInt1104);
		local18.U((int) this.aDouble26, (int) this.aDouble25, (int) this.aDouble28);
		this.method922(arg0, local11, local18);
		if (Static453.aBoolean599) {
			local11.method7224(local18, null, Static340.anInt5962, 0);
		} else {
			local11.method7230(local18, null, 0);
		}
		if (this.lb != null) {
			@Pc(70) Class283 local70 = this.lb.method7724();
			if (Static453.aBoolean599) {
				arg0.method7358(local70, Static340.anInt5962);
			} else {
				arg0.method7396(local70);
			}
		}
		this.aBoolean100 = local11.LA();
		this.anInt1109 = local11.J();
		this.anInt1116 = local11.RA();
		return null;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)V")
	public void method921(@OriginalArg(0) int arg0) {
		this.aDouble26 += this.aDouble27 * (double) arg0;
		this.aBoolean102 = true;
		this.aDouble28 += (double) arg0 * this.aDouble24;
		if (this.aBoolean99) {
			this.aDouble25 = Static475.method6537((int) this.aDouble28, super.aByte117, (int) this.aDouble26) - this.anInt1084;
		} else if (this.anInt1103 == -1) {
			this.aDouble25 += this.aDouble29 * (double) arg0;
		} else {
			this.aDouble25 += this.aDouble29 * (double) arg0 + this.aDouble30 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble29 += this.aDouble30 * (double) arg0;
		}
		this.anInt1104 = (int) (Math.atan2(this.aDouble27, this.aDouble24) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt1088 = (int) (Math.atan2(this.aDouble29, this.aDouble23) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass185_1 == null) {
			return;
		}
		this.anInt1100 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1100 <= this.aClass185_1.anIntArray282[this.anInt1110]) {
						return;
					}
					this.anInt1100 -= this.aClass185_1.anIntArray282[this.anInt1110];
					this.anInt1110++;
					if (this.anInt1110 >= this.aClass185_1.anIntArray280.length) {
						this.anInt1110 -= this.aClass185_1.anInt4971;
						if (this.anInt1110 < 0 || this.anInt1110 >= this.aClass185_1.anIntArray280.length) {
							this.anInt1110 = 0;
						}
					}
					this.anInt1105 = this.anInt1110 + 1;
				} while (this.aClass185_1.anIntArray280.length > this.anInt1105);
				this.anInt1105 -= this.aClass185_1.anInt4971;
			} while (this.anInt1105 >= 0 && this.aClass185_1.anIntArray280.length > this.anInt1105);
			this.anInt1105 = -1;
		}
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		return arg0 < 119 ? -16 : this.anInt1116;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!r;Lclient!da;Lclient!q;I)V")
	private void method922(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class11 arg2) {
		arg1.method7234(arg2);
		@Pc(9) Class248[] local9 = arg1.method7238();
		@Pc(12) Class281[] local12 = arg1.method7244();
		if ((this.lb == null || this.lb.aBoolean722) && (local9 != null || local12 != null)) {
			this.lb = Static575.method7722(Static506.anInt8251, true);
		}
		if (this.lb != null) {
			this.lb.method7732(arg0, (long) Static506.anInt8251, local9, local12);
			this.lb.method7721(super.aByte117, super.aShort147, super.aShort146, super.aShort144, super.aShort145);
		}
	}

	@OriginalMember(owner = "client!bv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.lb != null) {
			this.lb.method7726();
		}
	}

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "(I)V")
	@Override
	public void method7854() {
		super.aShort147 = super.aShort146 = (short) (this.aDouble26 / 512.0D);
		super.aShort144 = super.aShort145 = (short) (this.aDouble28 / 512.0D);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
		@Pc(9) Class60 local9 = this.method923(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class11 local15 = arg0.method7397();
		local15.oa(this.anInt1088);
		local15.ZA(this.anInt1104);
		local15.U((int) this.aDouble26, (int) this.aDouble25, (int) this.aDouble28);
		this.anInt1109 = local9.J();
		this.anInt1116 = local9.RA();
		this.method922(arg0, local9, local15);
	}

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aBoolean100;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class60 method923(@OriginalArg(1) Class45 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class284 local15 = Static368.aClass278_1.method6127(this.anInt1108);
		return local15.method6244(arg1, Static545.aClass240_2, arg0, this.anInt1105, this.anInt1110, this.anInt1100);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIB)V")
	public void method924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean102) {
			local9 = arg1 - super.anInt9444;
			@Pc(16) double local16 = (double) (arg0 - super.anInt9442);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble28 = (double) super.anInt9442 + local16 * (double) this.anInt1090 / local25;
			this.aDouble26 = local9 * (double) this.anInt1090 / local25 + (double) super.anInt9444;
			if (this.aBoolean99) {
				this.aDouble25 = Static475.method6537((int) this.aDouble28, super.aByte117, (int) this.aDouble26) - this.anInt1084;
			} else {
				this.aDouble25 = super.anInt9443;
			}
		}
		local9 = this.anInt1111 + 1 - arg3;
		this.aDouble27 = ((double) arg1 - this.aDouble26) / local9;
		this.aDouble24 = ((double) arg0 - this.aDouble28) / local9;
		this.aDouble23 = Math.sqrt(this.aDouble27 * this.aDouble27 + this.aDouble24 * this.aDouble24);
		if (this.anInt1103 == -1) {
			this.aDouble29 = ((double) arg2 - this.aDouble25) / local9;
		} else {
			if (!this.aBoolean102) {
				this.aDouble29 = -this.aDouble23 * Math.tan((double) this.anInt1103 * 0.02454369D);
			}
			this.aDouble30 = ((double) arg2 - local9 * this.aDouble29 - this.aDouble25) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.anInt1109;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
	public void method925() {
		if (this.lb != null) {
			this.lb.method7726();
		}
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return null;
	}
}
