import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
	private int anInt4323;

	@OriginalMember(owner = "client!mq", name = "Q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!mq", name = "R", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!mq", name = "U", descriptor = "Lclient!dd;")
	private Class48_Sub1 aClass48_Sub1_3;

	@OriginalMember(owner = "client!mq", name = "V", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!mq", name = "W", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!mq", name = "cb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!mq", name = "gb", descriptor = "I")
	private int anInt4337;

	@OriginalMember(owner = "client!mq", name = "hb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!mq", name = "jb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
	private int anInt4311 = -1;

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "I")
	private int anInt4328 = -32768;

	@OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
	private int anInt4318 = 0;

	@OriginalMember(owner = "client!mq", name = "T", descriptor = "I")
	private int anInt4330 = 0;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
	private final int anInt4321;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
	public final int anInt4317;

	@OriginalMember(owner = "client!mq", name = "bb", descriptor = "I")
	public final int anInt4334;

	@OriginalMember(owner = "client!mq", name = "N", descriptor = "I")
	private final int anInt4326;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
	public final int anInt4314;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "Z")
	private final boolean aBoolean280;

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
	private final int anInt4312;

	@OriginalMember(owner = "client!mq", name = "db", descriptor = "I")
	private final int anInt4335;

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
	public final int anInt4319;

	@OriginalMember(owner = "client!mq", name = "fb", descriptor = "Lclient!fn;")
	private final Class83 aClass83_2;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class3_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static165.method2689(arg2, arg1, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean279 = false;
		this.anInt4321 = arg7;
		this.anInt4317 = arg9;
		this.anInt4334 = arg5;
		this.anInt4326 = arg0;
		this.anInt4314 = arg10;
		this.aBoolean280 = arg11;
		this.anInt4312 = arg8;
		this.anInt4335 = arg4;
		this.anInt4319 = arg6;
		@Pc(78) int local78 = Static93.aClass70_1.method1595(this.anInt4326).anInt6999;
		if (local78 == -1) {
			this.aClass83_2 = null;
		} else {
			this.aClass83_2 = Static244.aClass174_2.method4011(local78);
		}
	}

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.anInt4328;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public void method3907() {
		if (this.aClass48_Sub1_3 != null) {
			this.aClass48_Sub1_3.method1289();
		}
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		@Pc(9) Class39 local9 = this.method3910(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class132 local16 = arg0.method3564();
		local16.method3980(this.anInt4323);
		local16.method3987(this.anInt4337);
		local16.method3991((int) this.aDouble8, (int) this.aDouble5, (int) this.aDouble6);
		if (this.aClass48_Sub1_3 == null) {
			local9.method4910(local16, null, 0);
		} else {
			@Pc(48) Class115 local48 = this.aClass48_Sub1_3.method1293();
			arg0.method3571(local9, local48, local16, null);
		}
		this.anInt4328 = local9.method4875();
		this.method3909(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIBI)V")
	public void method3908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean279) {
			@Pc(9) double local9 = (double) (arg3 - super.anInt6675);
			@Pc(15) double local15 = (double) (arg2 - super.anInt6677);
			@Pc(24) double local24 = Math.sqrt(local9 * local9 + local15 * local15);
			this.aDouble8 = (double) this.anInt4312 * local9 / local24 + (double) super.anInt6675;
			this.aDouble6 = local15 * (double) this.anInt4312 / local24 + (double) super.anInt6677;
			if (this.aBoolean280) {
				this.aDouble5 = Static165.method2689((int) this.aDouble8, super.aByte93, (int) this.aDouble6) - this.anInt4335;
			} else {
				this.aDouble5 = super.anInt6673;
			}
		}
		@Pc(98) double local98 = (double) (this.anInt4319 + 1 - arg0);
		this.aDouble2 = ((double) arg3 - this.aDouble8) / local98;
		this.aDouble1 = ((double) arg2 - this.aDouble6) / local98;
		this.aDouble7 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble1 * this.aDouble1);
		if (this.anInt4321 == -1) {
			this.aDouble3 = ((double) arg1 - this.aDouble5) / local98;
		} else {
			if (!this.aBoolean279) {
				this.aDouble3 = -this.aDouble7 * Math.tan((double) this.anInt4321 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg1 - this.aDouble5 - local98 * this.aDouble3) * 2.0D / (local98 * local98);
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
	@Override
	public void method5505() {
		super.aShort97 = super.aShort98 = (short) (this.aDouble8 / 128.0D);
		super.aShort95 = super.aShort96 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!qq;ILclient!cd;)V")
	private void method3909(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(6) Class192[] local6 = arg1.method4899();
		@Pc(15) Class161[] local15 = arg1.method4885();
		if ((this.aClass48_Sub1_3 == null || this.aClass48_Sub1_3.aBoolean123) && (local6 != null || local15 != null)) {
			this.aClass48_Sub1_3 = new Class48_Sub1(Static125.anInt2225);
		}
		if (this.aClass48_Sub1_3 != null) {
			this.aClass48_Sub1_3.method1290(arg0, (long) Static125.anInt2225, local6, local15);
			this.aClass48_Sub1_3.method1294(super.aByte93, super.aShort97, super.aShort98, super.aShort95, super.aShort96);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILclient!qq;)Lclient!cd;")
	private Class39 method3910(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(14) Class250 local14 = Static93.aClass70_1.method1595(this.anInt4326);
		return local14.method5686(arg1, Static244.aClass174_2, this.anInt4311, this.anInt4330, arg0, this.anInt4318);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass48_Sub1_3 != null) {
			this.aClass48_Sub1_3.method1289();
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
		@Pc(9) Class39 local9 = this.method3910(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class132 local15 = arg0.method3564();
		local15.method3980(this.anInt4323);
		local15.method3987(this.anInt4337);
		local15.method3991((int) this.aDouble8, (int) this.aDouble5, (int) this.aDouble6);
		this.anInt4328 = local9.method4875();
		this.method3909(arg0, local9);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public void method3911(@OriginalArg(0) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble1;
		this.aDouble8 += (double) arg0 * this.aDouble2;
		this.aBoolean279 = true;
		if (this.aBoolean280) {
			this.aDouble5 = Static165.method2689((int) this.aDouble8, super.aByte93, (int) this.aDouble6) - this.anInt4335;
		} else if (this.anInt4321 == -1) {
			this.aDouble5 += this.aDouble3 * (double) arg0;
		} else {
			this.aDouble5 += (double) arg0 * 0.5D * this.aDouble4 * (double) arg0 + (double) arg0 * this.aDouble3;
			this.aDouble3 += this.aDouble4 * (double) arg0;
		}
		this.anInt4337 = (int) (Math.atan2(this.aDouble2, this.aDouble1) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4323 = (int) (Math.atan2(this.aDouble3, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass83_2 == null) {
			return;
		}
		this.anInt4330 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4330 <= this.aClass83_2.anIntArray212[this.anInt4318]) {
						return;
					}
					this.anInt4330 -= this.aClass83_2.anIntArray212[this.anInt4318];
					this.anInt4318++;
					if (this.anInt4318 >= this.aClass83_2.anIntArray211.length) {
						this.anInt4318 -= this.aClass83_2.anInt1987;
						if (this.anInt4318 < 0 || this.aClass83_2.anIntArray211.length <= this.anInt4318) {
							this.anInt4318 = 0;
						}
					}
					this.anInt4311 = this.anInt4318 + 1;
				} while (this.anInt4311 < this.aClass83_2.anIntArray211.length);
				this.anInt4311 -= this.aClass83_2.anInt1987;
			} while (this.anInt4311 >= 0 && this.aClass83_2.anIntArray211.length > this.anInt4311);
			this.anInt4311 = -1;
		}
	}
}
