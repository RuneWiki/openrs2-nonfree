import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
	private int anInt6164;

	@OriginalMember(owner = "client!ni", name = "V", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ni", name = "X", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ni", name = "ab", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ni", name = "db", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!ni", name = "hb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!ni", name = "jb", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!ni", name = "kb", descriptor = "I")
	private int anInt6177;

	@OriginalMember(owner = "client!ni", name = "lb", descriptor = "Lclient!l;")
	private Class98_Sub3 lb;

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
	private int anInt6159 = -32768;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
	private int anInt6150 = -1;

	@OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
	private int anInt6161 = 0;

	@OriginalMember(owner = "client!ni", name = "cb", descriptor = "I")
	private int anInt6174 = 0;

	@OriginalMember(owner = "client!ni", name = "N", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
	private final int anInt6156;

	@OriginalMember(owner = "client!ni", name = "pb", descriptor = "Z")
	private final boolean aBoolean439;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
	public final int anInt6154;

	@OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
	public final int anInt6173;

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
	public final int anInt6160;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
	private final int anInt6162;

	@OriginalMember(owner = "client!ni", name = "fb", descriptor = "I")
	private final int anInt6175;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
	public final int anInt6152;

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
	private final int anInt6166;

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "Lclient!cu;")
	private final Class57 aClass57_2;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class4_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static160.method2951(arg3, arg2, arg1) - arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
		this.anInt6156 = arg0;
		this.aBoolean439 = arg11;
		this.anInt6154 = arg5;
		this.anInt6173 = arg6;
		this.anInt6160 = arg9;
		this.aBoolean437 = false;
		this.anInt6162 = arg8;
		this.anInt6175 = arg7;
		this.anInt6152 = arg10;
		this.anInt6166 = arg4;
		@Pc(78) int local78 = Static289.aClass66_7.method1652(this.anInt6156).anInt334;
		if (local78 == -1) {
			this.aClass57_2 = null;
		} else {
			this.aClass57_2 = Static78.aClass298_2.method6521(local78);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public void method5284() {
		if (this.lb != null) {
			this.lb.method4537();
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZII)V")
	public void method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean437) {
			local8 = arg3 - super.anInt9542;
			@Pc(15) double local15 = (double) (arg0 - super.anInt9540);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble11 = (double) super.anInt9540 + local15 * (double) this.anInt6162 / local24;
			this.aDouble6 = (double) super.anInt9542 + local8 * (double) this.anInt6162 / local24;
			if (this.aBoolean439) {
				this.aDouble7 = Static160.method2951((int) this.aDouble11, (int) this.aDouble6, super.aByte108) - this.anInt6166;
			} else {
				this.aDouble7 = super.anInt9541;
			}
		}
		local8 = this.anInt6173 + 1 - arg1;
		this.aDouble8 = ((double) arg0 - this.aDouble11) / local8;
		this.aDouble5 = ((double) arg3 - this.aDouble6) / local8;
		this.aDouble9 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble8 * this.aDouble8);
		if (this.anInt6175 == -1) {
			this.aDouble4 = ((double) arg2 - this.aDouble7) / local8;
		} else {
			if (!this.aBoolean437) {
				this.aDouble4 = -this.aDouble9 * Math.tan((double) this.anInt6175 * 0.02454369D);
			}
			this.aDouble10 = ((double) arg2 - this.aDouble7 - local8 * this.aDouble4) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ni", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.lb != null) {
			this.lb.method4537();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!oa;Lclient!ba;BLclient!q;)V")
	private void method5287(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class54 arg2) {
		arg1.method7263(arg2);
		@Pc(19) Class85[] local19 = arg1.method7267();
		@Pc(22) Class90[] local22 = arg1.method7261();
		if ((this.lb == null || this.lb.aBoolean369) && (local19 != null || local22 != null)) {
			this.lb = Static275.method4528(Static312.anInt5688, true);
		}
		if (this.lb != null) {
			this.lb.method4538(arg0, (long) Static312.anInt5688, local19, local22);
			this.lb.method4530(super.aByte108, super.aShort126, super.aShort123, super.aShort125, super.aShort124);
		}
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)I")
	@Override
	public int method7790() {
		return this.anInt6159;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public void method5288(@OriginalArg(0) int arg0) {
		this.aDouble6 += this.aDouble5 * (double) arg0;
		this.aDouble11 += (double) arg0 * this.aDouble8;
		this.aBoolean437 = true;
		if (this.aBoolean439) {
			this.aDouble7 = Static160.method2951((int) this.aDouble11, (int) this.aDouble6, super.aByte108) - this.anInt6166;
		} else if (this.anInt6175 == -1) {
			this.aDouble7 += (double) arg0 * this.aDouble4;
		} else {
			this.aDouble7 += this.aDouble4 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble10;
			this.aDouble4 += this.aDouble10 * (double) arg0;
		}
		this.anInt6177 = (int) (Math.atan2(this.aDouble5, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt6164 = (int) (Math.atan2(this.aDouble4, this.aDouble9) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass57_2 == null) {
			return;
		}
		this.anInt6161 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass57_2.anIntArray130[this.anInt6174] >= this.anInt6161) {
						return;
					}
					this.anInt6161 -= this.aClass57_2.anIntArray130[this.anInt6174];
					this.anInt6174++;
					if (this.aClass57_2.anIntArray132.length <= this.anInt6174) {
						this.anInt6174 -= this.aClass57_2.anInt1549;
						if (this.anInt6174 < 0 || this.anInt6174 >= this.aClass57_2.anIntArray132.length) {
							this.anInt6174 = 0;
						}
					}
					this.anInt6150 = this.anInt6174 + 1;
				} while (this.anInt6150 < this.aClass57_2.anIntArray132.length);
				this.anInt6150 -= this.aClass57_2.anInt1549;
			} while (this.anInt6150 >= 0 && this.anInt6150 < this.aClass57_2.anIntArray132.length);
			this.anInt6150 = -1;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	private Class20 method5289(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class10 local9 = Static289.aClass66_7.method1652(this.anInt6156);
		return local9.method256(arg1, this.anInt6161, Static78.aClass298_2, this.anInt6150, this.anInt6174, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		@Pc(16) Class20 local16 = this.method5289(arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class54 local23 = arg0.method6851();
		local23.XA(this.anInt6164);
		local23.P(this.anInt6177);
		local23.G((int) this.aDouble6, (int) this.aDouble7, (int) this.aDouble11);
		this.method5287(arg0, local16, local23);
		if (this.lb == null) {
			local16.method7256(local23, null, 0);
		} else {
			@Pc(62) Class144 local62 = this.lb.method4532();
			arg0.method6856(local16, local62, local23, null, 0);
		}
		this.anInt6159 = local16.DA();
		return null;
	}

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
	@Override
	public void method7792() {
		super.aShort125 = super.aShort124 = (short) (this.aDouble11 / 512.0D);
		super.aShort126 = super.aShort123 = (short) (this.aDouble6 / 512.0D);
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
		@Pc(11) Class20 local11 = this.method5289(arg0, 0);
		if (local11 == null) {
			return;
		}
		@Pc(17) Class54 local17 = arg0.method6851();
		local17.XA(this.anInt6164);
		local17.P(this.anInt6177);
		local17.G((int) this.aDouble6, (int) this.aDouble7, (int) this.aDouble11);
		this.anInt6159 = local11.DA();
		this.method5287(arg0, local11, local17);
	}
}
