import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class6_Sub2_Sub6 extends Class6_Sub2 {

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
	private int anInt4291;

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!lq", name = "C", descriptor = "Lclient!li;")
	private Class41_Sub1 aClass41_Sub1_4;

	@OriginalMember(owner = "client!lq", name = "D", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!lq", name = "E", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!lq", name = "P", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!lq", name = "Q", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!lq", name = "Y", descriptor = "I")
	private int anInt4311;

	@OriginalMember(owner = "client!lq", name = "cb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!lq", name = "hb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
	private int anInt4297 = 0;

	@OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
	private int anInt4303 = 0;

	@OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
	private int anInt4306 = -32768;

	@OriginalMember(owner = "client!lq", name = "bb", descriptor = "I")
	private int anInt4314 = -1;

	@OriginalMember(owner = "client!lq", name = "lb", descriptor = "I")
	public final int lb;

	@OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
	private final int anInt4304;

	@OriginalMember(owner = "client!lq", name = "U", descriptor = "I")
	private final int anInt4308;

	@OriginalMember(owner = "client!lq", name = "W", descriptor = "I")
	private final int anInt4310;

	@OriginalMember(owner = "client!lq", name = "V", descriptor = "I")
	public final int anInt4309;

	@OriginalMember(owner = "client!lq", name = "T", descriptor = "Z")
	private final boolean aBoolean320;

	@OriginalMember(owner = "client!lq", name = "gb", descriptor = "I")
	private final int anInt4318;

	@OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
	public final int anInt4298;

	@OriginalMember(owner = "client!lq", name = "db", descriptor = "I")
	public final int anInt4315;

	@OriginalMember(owner = "client!lq", name = "X", descriptor = "Lclient!tq;")
	private final Class233 aClass233_2;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class6_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static222.method3109(arg2, arg1, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.lb = arg9;
		this.anInt4304 = arg0;
		this.anInt4308 = arg4;
		this.anInt4310 = arg8;
		this.anInt4309 = arg10;
		this.aBoolean320 = arg11;
		this.aBoolean319 = false;
		this.anInt4318 = arg7;
		this.anInt4298 = arg6;
		this.anInt4315 = arg5;
		@Pc(77) int local77 = Static92.aClass89_1.method1918(this.anInt4304).anInt4699;
		if (local77 == -1) {
			this.aClass233_2 = null;
		} else {
			this.aClass233_2 = Static269.aClass10_1.method286(local77);
		}
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!qa;Lclient!c;)V")
	private void method3260(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(6) Class56[] local6 = arg1.method4092();
		@Pc(9) Class120[] local9 = arg1.method4088();
		if ((this.aClass41_Sub1_4 == null || this.aClass41_Sub1_4.aBoolean308) && (local6 != null || local9 != null)) {
			this.aClass41_Sub1_4 = new Class41_Sub1(Static175.anInt3261);
		}
		if (this.aClass41_Sub1_4 != null) {
			this.aClass41_Sub1_4.method3165(arg0, (long) Static175.anInt3261, local6, local9);
			this.aClass41_Sub1_4.method3158(super.aByte86, super.aShort82, super.aShort84, super.aShort85, super.aShort83);
		}
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	private Class7 method3261(@OriginalArg(0) Class30 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class161 local14 = Static92.aClass89_1.method1918(this.anInt4304);
		return local14.method3587(this.anInt4314, this.anInt4297, arg1, this.anInt4303, arg0, Static269.aClass10_1);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public void method3262() {
		if (this.aClass41_Sub1_4 != null) {
			this.aClass41_Sub1_4.method3168();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public void method3264(@OriginalArg(0) int arg0) {
		this.aDouble6 += this.aDouble1 * (double) arg0;
		this.aBoolean319 = true;
		this.aDouble4 += (double) arg0 * this.aDouble7;
		if (this.aBoolean320) {
			this.aDouble5 = Static222.method3109((int) this.aDouble4, super.aByte86, (int) this.aDouble6) - this.anInt4308;
		} else if (this.anInt4318 == -1) {
			this.aDouble5 += this.aDouble2 * (double) arg0;
		} else {
			this.aDouble5 += (double) arg0 * 0.5D * this.aDouble8 * (double) arg0 + (double) arg0 * this.aDouble2;
			this.aDouble2 += this.aDouble8 * (double) arg0;
		}
		this.anInt4291 = (int) (Math.atan2(this.aDouble7, this.aDouble1) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4311 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass233_2 == null) {
			return;
		}
		this.anInt4303 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4303 <= this.aClass233_2.anIntArray591[this.anInt4297]) {
						return;
					}
					this.anInt4303 -= this.aClass233_2.anIntArray591[this.anInt4297];
					this.anInt4297++;
					if (this.aClass233_2.anIntArray593.length <= this.anInt4297) {
						this.anInt4297 -= this.aClass233_2.anInt6743;
						if (this.anInt4297 < 0 || this.anInt4297 >= this.aClass233_2.anIntArray593.length) {
							this.anInt4297 = 0;
						}
					}
					this.anInt4314 = this.anInt4297 + 1;
				} while (this.anInt4314 < this.aClass233_2.anIntArray593.length);
				this.anInt4314 -= this.aClass233_2.anInt6743;
			} while (this.anInt4314 >= 0 && this.anInt4314 < this.aClass233_2.anIntArray593.length);
			this.anInt4314 = -1;
		}
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V")
	@Override
	public void method4749() {
		super.aShort82 = super.aShort84 = (short) (this.aDouble4 / 128.0D);
		super.aShort85 = super.aShort83 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
		@Pc(9) Class7 local9 = this.method3261(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class116 local15 = arg0.method4678();
		local15.YA(this.anInt4311);
		local15.c(this.anInt4291);
		local15.ZA((int) this.aDouble4, (int) this.aDouble5, (int) this.aDouble6);
		this.anInt4306 = local9.b();
		this.method3260(arg0, local9);
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)I")
	@Override
	public int method4752() {
		return this.anInt4306;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		@Pc(11) Class7 local11 = this.method3261(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(26) Class116 local26 = arg0.method4678();
		local26.YA(this.anInt4311);
		local26.c(this.anInt4291);
		local26.ZA((int) this.aDouble4, (int) this.aDouble5, (int) this.aDouble6);
		if (this.aClass41_Sub1_4 == null) {
			local11.method4091(local26, null, 0);
		} else {
			@Pc(59) Class256 local59 = this.aClass41_Sub1_4.method3166();
			arg0.method4676(local11, local59, local26, null);
		}
		this.anInt4306 = local11.b();
		this.method3260(arg0, local11);
		return null;
	}

	@OriginalMember(owner = "client!lq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub1_4 != null) {
			this.aClass41_Sub1_4.method3168();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIII)V")
	public void method3265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean319) {
			local9 = arg2 - super.anInt6062;
			@Pc(15) double local15 = (double) (arg3 - super.anInt6061);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local9 * local9);
			this.aDouble4 = (double) this.anInt4310 * local9 / local24 + (double) super.anInt6062;
			this.aDouble6 = (double) super.anInt6061 + local15 * (double) this.anInt4310 / local24;
			if (this.aBoolean320) {
				this.aDouble5 = Static222.method3109((int) this.aDouble4, super.aByte86, (int) this.aDouble6) - this.anInt4308;
			} else {
				this.aDouble5 = super.anInt6067;
			}
		}
		local9 = this.anInt4298 + 1 - arg1;
		this.aDouble7 = ((double) arg2 - this.aDouble4) / local9;
		this.aDouble1 = ((double) arg3 - this.aDouble6) / local9;
		this.aDouble3 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble1 * this.aDouble1);
		if (this.anInt4318 == -1) {
			this.aDouble2 = ((double) arg0 - this.aDouble5) / local9;
		} else {
			if (!this.aBoolean319) {
				this.aDouble2 = -this.aDouble3 * Math.tan((double) this.anInt4318 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble2 * local9 - this.aDouble5) * 2.0D / (local9 * local9);
		}
	}
}
