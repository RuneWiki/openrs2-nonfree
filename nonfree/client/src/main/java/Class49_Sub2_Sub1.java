import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class49_Sub2_Sub1 extends Class49_Sub2 {

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt1433;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Lclient!lm;")
	private Class72_Sub4 aClass72_Sub4_1;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "I")
	private int anInt1449;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!db", name = "W", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "I")
	private int anInt1437 = -32768;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	private int anInt1435 = -1;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt1441 = 0;

	@OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
	private int anInt1460 = 0;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "Z")
	private final boolean aBoolean91;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	private final int anInt1454;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private final int anInt1442;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "I")
	public final int anInt1450;

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	private final int anInt1451;

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
	public final int anInt1465;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public final int anInt1439;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	private final int anInt1447;

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
	public final int anInt1461;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Lclient!na;")
	private final Class199 aClass199_1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class49_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static38.method884(arg1, arg2, arg3) - arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
		this.aBoolean91 = arg11;
		this.anInt1454 = arg7;
		this.anInt1442 = arg4;
		this.anInt1450 = arg9;
		this.anInt1451 = arg0;
		this.anInt1465 = arg10;
		this.anInt1439 = arg5;
		this.aBoolean90 = false;
		this.anInt1447 = arg8;
		this.anInt1461 = arg6;
		@Pc(78) int local78 = Static489.aClass194_2.method4810(this.anInt1451).anInt1342;
		if (local78 == -1) {
			this.aClass199_1 = null;
		} else {
			this.aClass199_1 = Static182.aClass218_1.method5221(local78);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
	@Override
	public int method5994() {
		return this.anInt1437;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZII)V")
	public void method1373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean90) {
			local9 = arg1 - super.anInt7137;
			@Pc(16) double local16 = (double) (arg3 - super.anInt7141);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble4 = local9 * (double) this.anInt1447 / local25 + (double) super.anInt7137;
			this.aDouble1 = local16 * (double) this.anInt1447 / local25 + (double) super.anInt7141;
			if (this.aBoolean91) {
				this.aDouble8 = Static38.method884(super.aByte98, (int) this.aDouble4, (int) this.aDouble1) - this.anInt1442;
			} else {
				this.aDouble8 = super.anInt7140;
			}
		}
		local9 = this.anInt1461 + 1 - arg2;
		this.aDouble7 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble5 = ((double) arg3 - this.aDouble1) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble7 * this.aDouble7);
		if (this.anInt1454 == -1) {
			this.aDouble3 = ((double) arg0 - this.aDouble8) / local9;
		} else {
			if (!this.aBoolean90) {
				this.aDouble3 = -this.aDouble6 * Math.tan((double) this.anInt1454 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg0 - this.aDouble8 - this.aDouble3 * local9) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public void method1375() {
		if (this.aClass72_Sub4_1 != null) {
			this.aClass72_Sub4_1.method4534();
		}
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!r;Lclient!qa;)V")
	private void method1377(@OriginalArg(1) Class145 arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(14) Class161[] local14 = arg0.method6677();
		@Pc(17) Class93[] local17 = arg0.method6684();
		if ((this.aClass72_Sub4_1 == null || this.aClass72_Sub4_1.aBoolean369) && (local14 != null || local17 != null)) {
			this.aClass72_Sub4_1 = Static279.method4523(Static436.anInt6850);
		}
		if (this.aClass72_Sub4_1 != null) {
			this.aClass72_Sub4_1.method4529(arg1, (long) Static436.anInt6850, local14, local17);
			this.aClass72_Sub4_1.method4532(super.aByte98, super.aShort117, super.aShort115, super.aShort116, super.aShort118);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	private Class145 method1378(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(15) Class52 local15 = Static489.aClass194_2.method4810(this.anInt1451);
		return local15.method1270(this.anInt1435, arg0, this.anInt1460, arg1, this.anInt1441, Static182.aClass218_1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	@Override
	public void method5992() {
		super.aShort116 = super.aShort118 = (short) (this.aDouble1 / 512.0D);
		super.aShort117 = super.aShort115 = (short) (this.aDouble4 / 512.0D);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
	public void method1379(@OriginalArg(0) int arg0) {
		this.aDouble1 += this.aDouble5 * (double) arg0;
		this.aDouble4 += this.aDouble7 * (double) arg0;
		this.aBoolean90 = true;
		if (this.aBoolean91) {
			this.aDouble8 = Static38.method884(super.aByte98, (int) this.aDouble4, (int) this.aDouble1) - this.anInt1442;
		} else if (this.anInt1454 == -1) {
			this.aDouble8 += this.aDouble3 * (double) arg0;
		} else {
			this.aDouble8 += (double) arg0 * (double) arg0 * this.aDouble2 * 0.5D + (double) arg0 * this.aDouble3;
			this.aDouble3 += this.aDouble2 * (double) arg0;
		}
		this.anInt1433 = (int) (Math.atan2(this.aDouble7, this.aDouble5) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt1449 = (int) (Math.atan2(this.aDouble3, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass199_1 == null) {
			return;
		}
		this.anInt1441 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1441 <= this.aClass199_1.anIntArray575[this.anInt1460]) {
						return;
					}
					this.anInt1441 -= this.aClass199_1.anIntArray575[this.anInt1460];
					this.anInt1460++;
					if (this.anInt1460 >= this.aClass199_1.anIntArray574.length) {
						this.anInt1460 -= this.aClass199_1.anInt5746;
						if (this.anInt1460 < 0 || this.anInt1460 >= this.aClass199_1.anIntArray574.length) {
							this.anInt1460 = 0;
						}
					}
					this.anInt1435 = this.anInt1460 + 1;
				} while (this.anInt1435 < this.aClass199_1.anIntArray574.length);
				this.anInt1435 -= this.aClass199_1.anInt5746;
			} while (this.anInt1435 >= 0 && this.aClass199_1.anIntArray574.length > this.anInt1435);
			this.anInt1435 = -1;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
		@Pc(9) Class145 local9 = this.method1378(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class118 local15 = arg0.method7256();
		local15.KA(this.anInt1449);
		local15.XA(this.anInt1433);
		local15.TA((int) this.aDouble4, (int) this.aDouble8, (int) this.aDouble1);
		this.anInt1437 = local9.TA();
		this.method1377(local9, arg0);
	}

	@OriginalMember(owner = "client!db", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass72_Sub4_1 != null) {
			this.aClass72_Sub4_1.method4534();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		@Pc(9) Class145 local9 = this.method1378(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(24) Class118 local24 = arg0.method7256();
		local24.KA(this.anInt1449);
		local24.XA(this.anInt1433);
		local24.TA((int) this.aDouble4, (int) this.aDouble8, (int) this.aDouble1);
		if (this.aClass72_Sub4_1 == null) {
			local9.method6686(local24, null, 0);
		} else {
			@Pc(50) Class175 local50 = this.aClass72_Sub4_1.method4537();
			arg0.method7246(local9, local50, local24, null);
		}
		this.anInt1437 = local9.TA();
		this.method1377(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		throw new IllegalStateException();
	}
}
