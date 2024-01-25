import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class20_Sub3_Sub2 extends Class20_Sub3 {

	@OriginalMember(owner = "client!gq", name = "lb", descriptor = "Lclient!ic;")
	public static Class113 lb;

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!gq", name = "A", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
	private int anInt2378;

	@OriginalMember(owner = "client!gq", name = "S", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!gq", name = "U", descriptor = "Lclient!ce;")
	private Class13_Sub2 aClass13_Sub2_2;

	@OriginalMember(owner = "client!gq", name = "ab", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!gq", name = "jb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!gq", name = "mb", descriptor = "I")
	private int anInt2400;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
	private int anInt2382 = -1;

	@OriginalMember(owner = "client!gq", name = "gb", descriptor = "I")
	private int anInt2396 = -32768;

	@OriginalMember(owner = "client!gq", name = "W", descriptor = "I")
	private int anInt2387 = 0;

	@OriginalMember(owner = "client!gq", name = "kb", descriptor = "I")
	private int anInt2399 = 0;

	@OriginalMember(owner = "client!gq", name = "ob", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
	private final int anInt2372;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
	private final int anInt2376;

	@OriginalMember(owner = "client!gq", name = "eb", descriptor = "I")
	public final int anInt2394;

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
	public final int anInt2377;

	@OriginalMember(owner = "client!gq", name = "hb", descriptor = "I")
	private final int anInt2397;

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
	public final int anInt2379;

	@OriginalMember(owner = "client!gq", name = "T", descriptor = "I")
	public final int anInt2385;

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "Z")
	private final boolean aBoolean176;

	@OriginalMember(owner = "client!gq", name = "X", descriptor = "I")
	private final int anInt2388;

	@OriginalMember(owner = "client!gq", name = "R", descriptor = "Lclient!nm;")
	private final Class171 aClass171_2;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class20_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static183.method4175(arg3, arg2, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt2372 = arg0;
		this.aBoolean177 = false;
		this.anInt2376 = arg4;
		this.anInt2394 = arg10;
		this.anInt2377 = arg6;
		this.anInt2397 = arg7;
		this.anInt2379 = arg5;
		this.anInt2385 = arg9;
		this.aBoolean176 = arg11;
		this.anInt2388 = arg8;
		@Pc(78) int local78 = Static44.aClass190_2.method4005(this.anInt2372).anInt325;
		if (local78 == -1) {
			this.aClass171_2 = null;
		} else {
			this.aClass171_2 = Static152.aClass213_1.method4410(local78);
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public void method1873() {
		if (this.aClass13_Sub2_2 != null) {
			this.aClass13_Sub2_2.method699();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		@Pc(9) Class33 local9 = this.method1878(arg0, 2048);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class40 local16 = arg0.method3600();
		local16.YA(this.anInt2400);
		local16.c(this.anInt2378);
		local16.ZA((int) this.aDouble5, (int) this.aDouble2, (int) this.aDouble4);
		if (this.aClass13_Sub2_2 == null) {
			local9.method5391(local16, null, 0);
		} else {
			@Pc(42) Class194 local42 = this.aClass13_Sub2_2.method702();
			arg0.method3557(local9, local42, local16, null);
		}
		this.anInt2396 = local9.b();
		this.method1874(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
		@Pc(15) Class33 local15 = this.method1878(arg0, 0);
		if (local15 == null) {
			return;
		}
		@Pc(21) Class40 local21 = arg0.method3600();
		local21.YA(this.anInt2400);
		local21.c(this.anInt2378);
		local21.ZA((int) this.aDouble5, (int) this.aDouble2, (int) this.aDouble4);
		this.anInt2396 = local15.b();
		this.method1874(arg0, local15);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!qa;Lclient!c;)V")
	private void method1874(@OriginalArg(1) Class128 arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(6) Class239[] local6 = arg1.method5380();
		@Pc(9) Class15[] local9 = arg1.method5385();
		if ((this.aClass13_Sub2_2 == null || this.aClass13_Sub2_2.aBoolean61) && (local6 != null || local9 != null)) {
			this.aClass13_Sub2_2 = new Class13_Sub2(Static368.anInt6250);
		}
		if (this.aClass13_Sub2_2 != null) {
			this.aClass13_Sub2_2.method700(arg0, (long) Static368.anInt6250, local6, local9);
			this.aClass13_Sub2_2.method704(super.aByte89, super.aShort85, super.aShort87, super.aShort88, super.aShort86);
		}
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)I")
	@Override
	public int method5097() {
		return this.anInt2396;
	}

	@OriginalMember(owner = "client!gq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub2_2 != null) {
			this.aClass13_Sub2_2.method699();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	public void method1876(@OriginalArg(1) int arg0) {
		this.aDouble5 += (double) arg0 * this.aDouble9;
		this.aDouble4 += (double) arg0 * this.aDouble8;
		this.aBoolean177 = true;
		if (this.aBoolean176) {
			this.aDouble2 = Static183.method4175((int) this.aDouble4, (int) this.aDouble5, super.aByte89) - this.anInt2376;
		} else if (this.anInt2397 == -1) {
			this.aDouble2 += (double) arg0 * this.aDouble3;
		} else {
			this.aDouble2 += this.aDouble3 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble7;
			this.aDouble3 += (double) arg0 * this.aDouble7;
		}
		this.anInt2378 = (int) (Math.atan2(this.aDouble9, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2400 = (int) (Math.atan2(this.aDouble3, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass171_2 == null) {
			return;
		}
		this.anInt2399 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass171_2.anIntArray234[this.anInt2387] >= this.anInt2399) {
						return;
					}
					this.anInt2399 -= this.aClass171_2.anIntArray234[this.anInt2387];
					this.anInt2387++;
					if (this.anInt2387 >= this.aClass171_2.anIntArray235.length) {
						this.anInt2387 -= this.aClass171_2.anInt4251;
						if (this.anInt2387 < 0 || this.aClass171_2.anIntArray235.length <= this.anInt2387) {
							this.anInt2387 = 0;
						}
					}
					this.anInt2382 = this.anInt2387 + 1;
				} while (this.aClass171_2.anIntArray235.length > this.anInt2382);
				this.anInt2382 -= this.aClass171_2.anInt4251;
			} while (this.anInt2382 >= 0 && this.anInt2382 < this.aClass171_2.anIntArray235.length);
			this.anInt2382 = -1;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	private Class33 method1878(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class14 local9 = Static44.aClass190_2.method4005(this.anInt2372);
		return local9.method268(this.anInt2387, arg0, this.anInt2399, this.anInt2382, Static152.aClass213_1, arg1);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V")
	public void method1880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean177) {
			local13 = arg0 - super.anInt6613;
			@Pc(19) double local19 = (double) (arg1 - super.anInt6616);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble4 = (double) this.anInt2388 * local19 / local28 + (double) super.anInt6616;
			this.aDouble5 = (double) super.anInt6613 + local13 * (double) this.anInt2388 / local28;
			if (this.aBoolean176) {
				this.aDouble2 = Static183.method4175((int) this.aDouble4, (int) this.aDouble5, super.aByte89) - this.anInt2376;
			} else {
				this.aDouble2 = super.anInt6615;
			}
		}
		local13 = this.anInt2377 + 1 - arg3;
		this.aDouble8 = ((double) arg1 - this.aDouble4) / local13;
		this.aDouble9 = ((double) arg0 - this.aDouble5) / local13;
		this.aDouble6 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble9 * this.aDouble9);
		if (this.anInt2397 == -1) {
			this.aDouble3 = ((double) arg2 - this.aDouble2) / local13;
		} else {
			if (!this.aBoolean177) {
				this.aDouble3 = -this.aDouble6 * Math.tan((double) this.anInt2397 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg2 - local13 * this.aDouble3 - this.aDouble2) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5096() {
		super.aShort85 = super.aShort87 = (short) (this.aDouble5 / 128.0D);
		super.aShort88 = super.aShort86 = (short) (this.aDouble4 / 128.0D);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}
}
