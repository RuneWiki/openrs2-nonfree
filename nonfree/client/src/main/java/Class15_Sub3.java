import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
	public int anInt1012;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "Lclient!gl;")
	private Class20_Sub2 aClass20_Sub2_3;

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!cl", name = "W", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!cl", name = "cb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
	private int anInt1003 = -1;

	@OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
	private int anInt1017 = -32768;

	@OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
	private int anInt1018 = 0;

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	private int anInt1001 = 0;

	@OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
	public int anInt1020;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	public int anInt997;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
	public int anInt1026;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
	public int anInt1024;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
	public int anInt1013;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!cl", name = "ab", descriptor = "Lclient!mi;")
	private Class112 aClass112_1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class15_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1020 = arg5;
		this.anInt1002 = arg2;
		this.anInt997 = arg1;
		this.anInt1004 = arg0;
		this.anInt1023 = arg8;
		this.anInt1026 = arg6;
		this.anInt1006 = arg3;
		this.anInt1015 = arg7;
		this.anInt1024 = arg9;
		this.aBoolean68 = false;
		this.anInt1013 = arg10;
		this.anInt1009 = arg4;
		@Pc(61) int local61 = Static156.method2852(this.anInt1004).anInt3389;
		if (local61 == -1) {
			this.aClass112_1 = null;
		} else {
			this.aClass112_1 = Static208.method3496(local61);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIIJILclient!gl;)V")
	@Override
	public void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub2 arg10) {
		@Pc(7) Class15_Sub5 local7 = this.method757();
		if (local7 != null) {
			this.method756(local7);
			local7.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_3);
			this.anInt1017 = local7.method4274();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean66) {
			@Pc(10) Class15_Sub5 local10 = this.method757();
			if (local10 == null) {
				return;
			}
			this.method756(local10);
		}
		if (this.aClass20_Sub2_3 != null) {
			this.aClass20_Sub2_3.method1691(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V")
	public void method752(@OriginalArg(1) int arg0) {
		this.aDouble5 += this.aDouble4 * (double) arg0;
		this.aBoolean68 = true;
		if (this.anInt1015 == -1) {
			this.aDouble6 += (double) arg0 * this.aDouble2;
		} else {
			this.aDouble6 += (double) arg0 * 0.5D * this.aDouble7 * (double) arg0 + this.aDouble2 * (double) arg0;
			this.aDouble2 += this.aDouble7 * (double) arg0;
		}
		this.aDouble1 += this.aDouble8 * (double) arg0;
		this.anInt1012 = (int) (Math.atan2(this.aDouble8, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt1016 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) & 0x7FF;
		if (this.aClass112_1 == null) {
			return;
		}
		this.anInt1001 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1001 <= this.aClass112_1.anIntArray377[this.anInt1018]) {
						return;
					}
					this.anInt1001 -= this.aClass112_1.anIntArray377[this.anInt1018];
					this.anInt1018++;
					if (this.aClass112_1.anIntArray378.length <= this.anInt1018) {
						this.anInt1018 -= this.aClass112_1.anInt3856;
						if (this.anInt1018 < 0 || this.aClass112_1.anIntArray378.length <= this.anInt1018) {
							this.anInt1018 = 0;
						}
					}
					this.anInt1003 = this.anInt1018 + 1;
				} while (this.aClass112_1.anIntArray378.length > this.anInt1003);
				this.anInt1003 -= this.aClass112_1.anInt3856;
			} while (this.anInt1003 >= 0 && this.anInt1003 < this.aClass112_1.anIntArray378.length);
			this.anInt1003 = -1;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIII)V")
	public void method755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean68) {
			local9 = arg3 - this.anInt1002;
			@Pc(16) double local16 = (double) (arg1 - this.anInt1006);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble5 = (double) this.anInt1006 + (double) this.anInt1023 * local16 / local25;
			this.aDouble6 = this.anInt1009;
			this.aDouble1 = (double) this.anInt1023 * local9 / local25 + (double) this.anInt1002;
		}
		local9 = this.anInt1026 + 1 - arg0;
		this.aDouble8 = ((double) arg3 - this.aDouble1) / local9;
		this.aDouble4 = ((double) arg1 - this.aDouble5) / local9;
		this.aDouble3 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble8 * this.aDouble8);
		if (this.anInt1015 == -1) {
			this.aDouble2 = ((double) arg2 - this.aDouble6) / local9;
		} else {
			if (!this.aBoolean68) {
				this.aDouble2 = -this.aDouble3 * Math.tan((double) this.anInt1015 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg2 - this.aDouble6 - local9 * this.aDouble2) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLclient!hb;)V")
	private void method756(@OriginalArg(1) Class15_Sub5 arg0) {
		if (Static116.aBoolean184) {
			@Pc(8) Class15_Sub5_Sub2 local8 = (Class15_Sub5_Sub2) arg0;
			if ((this.aClass20_Sub2_3 == null || this.aClass20_Sub2_3.aBoolean150) && (local8.aClass185Array2 != null || local8.aClass176Array2 != null)) {
				this.aClass20_Sub2_3 = new Class20_Sub2(Static268.anInt5236, 1, 1);
			}
			if (this.aClass20_Sub2_3 != null) {
				this.aClass20_Sub2_3.method1699(local8.aClass185Array2, local8.aClass176Array2, false, local8.anIntArray285, local8.anIntArray287, local8.anIntArray288);
			}
		} else {
			@Pc(52) Class15_Sub5_Sub1 local52 = (Class15_Sub5_Sub1) arg0;
			if ((this.aClass20_Sub2_3 == null || this.aClass20_Sub2_3.aBoolean150) && (local52.aClass185Array1 != null || local52.aClass176Array1 != null)) {
				this.aClass20_Sub2_3 = new Class20_Sub2(Static268.anInt5236, 1, 1);
			}
			if (this.aClass20_Sub2_3 != null) {
				this.aClass20_Sub2_3.method1699(local52.aClass185Array1, local52.aClass176Array1, false, local52.anIntArray251, local52.anIntArray244, local52.anIntArray249);
			}
		}
		this.aBoolean66 = true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
	@Override
	public int method4274() {
		return this.anInt1017;
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)Lclient!hb;")
	private Class15_Sub5 method757() {
		@Pc(8) Class96 local8 = Static156.method2852(this.anInt1004);
		@Pc(24) Class15_Sub5 local24 = local8.method2801(this.anInt1018, this.anInt1001, this.anInt1003);
		if (local24 == null) {
			return null;
		} else {
			local24.method2347(this.anInt1016);
			return local24;
		}
	}
}
