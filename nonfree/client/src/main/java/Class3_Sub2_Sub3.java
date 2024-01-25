import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!bq;")
	private Class8_Sub3 aClass8_Sub3_5;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
	private int anInt4247;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
	private int anInt4261;

	@OriginalMember(owner = "client!lg", name = "Y", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!lg", name = "bb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!lg", name = "jb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
	private int anInt4245 = -1;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
	private int anInt4256 = 0;

	@OriginalMember(owner = "client!lg", name = "ib", descriptor = "I")
	private int anInt4270 = 0;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
	private int anInt4249 = -32768;

	@OriginalMember(owner = "client!lg", name = "kb", descriptor = "Z")
	private boolean aBoolean310 = false;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
	public final int anInt4243;

	@OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
	private final int anInt4263;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
	public final int anInt4244;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
	private final int anInt4262;

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
	private final int anInt4259;

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "Z")
	private final boolean aBoolean309;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
	public final int anInt4246;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
	private final int anInt4251;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
	public final int anInt4250;

	@OriginalMember(owner = "client!lg", name = "cb", descriptor = "Lclient!vf;")
	private final Class250 aClass250_3;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class3_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static85.method1695(arg1, arg3, arg2) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4243 = arg6;
		this.anInt4263 = arg0;
		this.anInt4244 = arg5;
		this.anInt4262 = arg7;
		this.anInt4259 = arg8;
		this.aBoolean309 = arg11;
		this.anInt4246 = arg9;
		this.anInt4251 = arg4;
		this.aBoolean310 = false;
		this.anInt4250 = arg10;
		@Pc(77) int local77 = Static395.aClass247_2.method5407(this.anInt4263).anInt5615;
		if (local77 == -1) {
			this.aClass250_3 = null;
		} else {
			this.aClass250_3 = Static338.aClass12_2.method255(local77);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!ya;I)Lclient!t;")
	private Class91 method3453(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class203 local14 = Static395.aClass247_2.method5407(this.anInt4263);
		return local14.method4517(this.anInt4245, Static338.aClass12_2, arg1, this.anInt4270, this.anInt4256, arg0);
	}

	@OriginalMember(owner = "client!lg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub3_5 != null) {
			this.aClass8_Sub3_5.method565();
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)I")
	@Override
	public int method4916() {
		return this.anInt4249;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBII)V")
	public void method3456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean310) {
			local8 = arg0 - super.anInt6119;
			@Pc(14) double local14 = (double) (arg1 - super.anInt6121);
			@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
			this.aDouble7 = (double) super.anInt6119 + local8 * (double) this.anInt4259 / local23;
			this.aDouble5 = (double) super.anInt6121 + local14 * (double) this.anInt4259 / local23;
			if (this.aBoolean309) {
				this.aDouble8 = Static85.method1695(super.aByte89, (int) this.aDouble5, (int) this.aDouble7) - this.anInt4251;
			} else {
				this.aDouble8 = super.anInt6120;
			}
		}
		local8 = this.anInt4243 + 1 - arg2;
		this.aDouble2 = ((double) arg1 - this.aDouble5) / local8;
		this.aDouble4 = ((double) arg0 - this.aDouble7) / local8;
		this.aDouble9 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble4 * this.aDouble4);
		if (this.anInt4262 == -1) {
			this.aDouble3 = ((double) arg3 - this.aDouble8) / local8;
		} else {
			if (!this.aBoolean310) {
				this.aDouble3 = -this.aDouble9 * Math.tan((double) this.anInt4262 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg3 - this.aDouble3 * local8 - this.aDouble8) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ya;BLclient!t;)V")
	private void method3457(@OriginalArg(0) Class49 arg0, @OriginalArg(2) Class91 arg1) {
		@Pc(6) Class200[] local6 = arg1.method3290();
		@Pc(9) Class189[] local9 = arg1.method3278();
		if ((this.aClass8_Sub3_5 == null || this.aClass8_Sub3_5.aBoolean35) && (local6 != null || local9 != null)) {
			this.aClass8_Sub3_5 = new Class8_Sub3(Static131.anInt2821);
		}
		if (this.aClass8_Sub3_5 != null) {
			this.aClass8_Sub3_5.method556(arg0, (long) Static131.anInt2821, local6, local9);
			this.aClass8_Sub3_5.method558(super.aByte89, super.aShort85, super.aShort87, super.aShort86, super.aShort88);
		}
	}

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "(I)V")
	@Override
	public void method4918() {
		super.aShort85 = super.aShort87 = (short) (this.aDouble7 / 128.0D);
		super.aShort86 = super.aShort88 = (short) (this.aDouble5 / 128.0D);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
		@Pc(9) Class91 local9 = this.method3453(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(21) Class35 local21 = arg0.method4445();
		local21.N(this.anInt4261);
		local21.ja(this.anInt4247);
		local21.o((int) this.aDouble7, (int) this.aDouble8, (int) this.aDouble5);
		this.anInt4249 = local9.MA();
		this.method3457(arg0, local9);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method3459() {
		if (this.aClass8_Sub3_5 != null) {
			this.aClass8_Sub3_5.method565();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		@Pc(21) Class91 local21 = this.method3453(arg0, 2048);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class35 local28 = arg0.method4445();
		local28.N(this.anInt4261);
		local28.ja(this.anInt4247);
		local28.o((int) this.aDouble7, (int) this.aDouble8, (int) this.aDouble5);
		if (this.aClass8_Sub3_5 == null) {
			local21.method3276(local28, null, 0);
		} else {
			@Pc(61) Class194 local61 = this.aClass8_Sub3_5.method561();
			arg0.method4468(local21, local61, local28, null);
		}
		this.anInt4249 = local21.MA();
		this.method3457(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V")
	public void method3460(@OriginalArg(0) int arg0) {
		this.aBoolean310 = true;
		this.aDouble5 += this.aDouble2 * (double) arg0;
		this.aDouble7 += (double) arg0 * this.aDouble4;
		if (this.aBoolean309) {
			this.aDouble8 = Static85.method1695(super.aByte89, (int) this.aDouble5, (int) this.aDouble7) - this.anInt4251;
		} else if (this.anInt4262 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble3;
		} else {
			this.aDouble8 += (double) arg0 * 0.5D * this.aDouble6 * (double) arg0 + (double) arg0 * this.aDouble3;
			this.aDouble3 += (double) arg0 * this.aDouble6;
		}
		this.anInt4247 = (int) (Math.atan2(this.aDouble4, this.aDouble2) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4261 = (int) (Math.atan2(this.aDouble3, this.aDouble9) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass250_3 == null) {
			return;
		}
		this.anInt4256 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass250_3.anIntArray594[this.anInt4270] >= this.anInt4256) {
						return;
					}
					this.anInt4256 -= this.aClass250_3.anIntArray594[this.anInt4270];
					this.anInt4270++;
					if (this.aClass250_3.anIntArray592.length <= this.anInt4270) {
						this.anInt4270 -= this.aClass250_3.anInt7016;
						if (this.anInt4270 < 0 || this.aClass250_3.anIntArray592.length <= this.anInt4270) {
							this.anInt4270 = 0;
						}
					}
					this.anInt4245 = this.anInt4270 + 1;
				} while (this.anInt4245 < this.aClass250_3.anIntArray592.length);
				this.anInt4245 -= this.aClass250_3.anInt7016;
			} while (this.anInt4245 >= 0 && this.aClass250_3.anIntArray592.length > this.anInt4245);
			this.anInt4245 = -1;
		}
	}

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		throw new IllegalStateException();
	}
}
