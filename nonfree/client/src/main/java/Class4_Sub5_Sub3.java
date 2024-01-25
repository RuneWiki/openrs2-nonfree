import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class4_Sub5_Sub3 extends Class4_Sub5 {

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!qo", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!qo", name = "M", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!qo", name = "N", descriptor = "I")
	private int anInt5255;

	@OriginalMember(owner = "client!qo", name = "Q", descriptor = "I")
	private int anInt5258;

	@OriginalMember(owner = "client!qo", name = "db", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!qo", name = "mb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!qo", name = "ob", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!qo", name = "qb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!qo", name = "rb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!qo", name = "tb", descriptor = "Lclient!rs;")
	private Class32_Sub7 aClass32_Sub7_6;

	@OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
	private int anInt5250 = 0;

	@OriginalMember(owner = "client!qo", name = "U", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!qo", name = "jb", descriptor = "I")
	private int anInt5274 = -32768;

	@OriginalMember(owner = "client!qo", name = "sb", descriptor = "I")
	private int anInt5278 = 0;

	@OriginalMember(owner = "client!qo", name = "gb", descriptor = "I")
	private int anInt5271 = -1;

	@OriginalMember(owner = "client!qo", name = "P", descriptor = "I")
	public final int anInt5257;

	@OriginalMember(owner = "client!qo", name = "fb", descriptor = "I")
	public final int anInt5270;

	@OriginalMember(owner = "client!qo", name = "ub", descriptor = "I")
	private final int anInt5279;

	@OriginalMember(owner = "client!qo", name = "O", descriptor = "I")
	public final int anInt5256;

	@OriginalMember(owner = "client!qo", name = "ib", descriptor = "I")
	public final int anInt5273;

	@OriginalMember(owner = "client!qo", name = "W", descriptor = "I")
	private final int anInt5263;

	@OriginalMember(owner = "client!qo", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!qo", name = "Z", descriptor = "Lclient!i;")
	private final Class89 aClass89_3;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class4_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt5257 = arg10;
		this.anInt5270 = arg5;
		this.anInt5279 = arg7;
		this.anInt5256 = arg9;
		this.aBoolean437 = false;
		this.anInt5273 = arg6;
		this.anInt5263 = arg0;
		this.lb = arg8;
		@Pc(64) int local64 = Static325.method5628(this.anInt5263).anInt5031;
		if (local64 == -1) {
			this.aClass89_3 = null;
		} else {
			this.aClass89_3 = Static162.method2849(local64);
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		@Pc(9) Class112 local9 = this.method4706(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class66 local16 = arg0.method5195();
		local16.method5814(this.anInt5258);
		local16.method5821(this.anInt5255);
		local16.method5825((int) this.aDouble6, (int) this.aDouble5, (int) this.aDouble3);
		if (this.aClass32_Sub7_6 == null) {
			local9.method4338(local16, null, 0);
		} else {
			@Pc(42) Class146 local42 = this.aClass32_Sub7_6.method4955();
			arg0.method5241(local9, local42, local16, null);
		}
		this.anInt5274 = local9.method4331();
		this.method4707(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.anInt5274;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
	public void method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean437) {
			local13 = arg1 - super.anInt6631;
			@Pc(20) double local20 = (double) (arg0 - super.anInt6632);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble3 = (double) super.anInt6632 + local20 * (double) this.lb / local29;
			this.aDouble5 = super.anInt6633;
			this.aDouble6 = (double) super.anInt6631 + (double) this.lb * local13 / local29;
		}
		local13 = this.anInt5273 + 1 - arg3;
		this.aDouble2 = ((double) arg1 - this.aDouble6) / local13;
		this.aDouble4 = ((double) arg0 - this.aDouble3) / local13;
		this.aDouble9 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble2 * this.aDouble2);
		if (this.anInt5279 == -1) {
			this.aDouble7 = ((double) arg2 - this.aDouble5) / local13;
		} else {
			if (!this.aBoolean437) {
				this.aDouble7 = -this.aDouble9 * Math.tan((double) this.anInt5279 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble5 - this.aDouble7 * local13) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V")
	@Override
	public void method5905() {
		super.aShort93 = super.aShort90 = (short) (this.aDouble3 / 128.0D);
		super.aShort92 = super.aShort91 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BILclient!ea;)Lclient!ts;")
	private Class112 method4706(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(14) Class163 local14 = Static325.method5628(this.anInt5263);
		return local14.method4486(this.anInt5278, this.anInt5271, arg1, arg0, this.anInt5250);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!ea;Lclient!ts;)V")
	private void method4707(@OriginalArg(1) Class55 arg0, @OriginalArg(2) Class112 arg1) {
		@Pc(6) Class113[] local6 = arg1.method4321();
		@Pc(9) Class148[] local9 = arg1.method4334();
		if ((this.aClass32_Sub7_6 == null || this.aClass32_Sub7_6.aBoolean461) && (local6 != null || local9 != null)) {
			this.aClass32_Sub7_6 = new Class32_Sub7(Static283.anInt5563);
		}
		if (this.aClass32_Sub7_6 != null) {
			this.aClass32_Sub7_6.method4963(arg0, (long) Static283.anInt5563, local6, local9);
			this.aClass32_Sub7_6.method4959(super.aByte75, super.aShort92, super.aShort91, super.aShort93, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public void method4708() {
		if (this.aClass32_Sub7_6 != null) {
			this.aClass32_Sub7_6.method4957();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
	public void method4709(@OriginalArg(0) int arg0) {
		this.aDouble3 += this.aDouble4 * (double) arg0;
		this.aDouble6 += (double) arg0 * this.aDouble2;
		this.aBoolean437 = true;
		if (this.anInt5279 == -1) {
			this.aDouble5 += this.aDouble7 * (double) arg0;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble8 * 0.5D * (double) arg0 + this.aDouble7 * (double) arg0;
			this.aDouble7 += (double) arg0 * this.aDouble8;
		}
		this.anInt5255 = (int) (Math.atan2(this.aDouble2, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5258 = (int) (Math.atan2(this.aDouble7, this.aDouble9) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass89_3 == null) {
			return;
		}
		this.anInt5250 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass89_3.anIntArray244[this.anInt5278] >= this.anInt5250) {
						return;
					}
					this.anInt5250 -= this.aClass89_3.anIntArray244[this.anInt5278];
					this.anInt5278++;
					if (this.anInt5278 >= this.aClass89_3.anIntArray245.length) {
						this.anInt5278 -= this.aClass89_3.anInt2466;
						if (this.anInt5278 < 0 || this.aClass89_3.anIntArray245.length <= this.anInt5278) {
							this.anInt5278 = 0;
						}
					}
					this.anInt5271 = this.anInt5278 + 1;
				} while (this.aClass89_3.anIntArray245.length > this.anInt5271);
				this.anInt5271 -= this.aClass89_3.anInt2466;
			} while (this.anInt5271 >= 0 && this.aClass89_3.anIntArray245.length > this.anInt5271);
			this.anInt5271 = -1;
		}
	}

	@OriginalMember(owner = "client!qo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass32_Sub7_6 != null) {
			this.aClass32_Sub7_6.method4957();
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
		@Pc(9) Class112 local9 = this.method4706(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class66 local15 = arg0.method5195();
		local15.method5814(this.anInt5258);
		local15.method5821(this.anInt5255);
		local15.method5825((int) this.aDouble6, (int) this.aDouble5, (int) this.aDouble3);
		this.anInt5274 = local9.method4331();
		this.method4707(arg0, local9);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		return false;
	}
}
