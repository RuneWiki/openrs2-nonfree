import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!aj", name = "lb", descriptor = "I")
	public static int lb = 0;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "Lclient!kr;")
	private Class7_Sub7 aClass7_Sub7_1;

	@OriginalMember(owner = "client!aj", name = "S", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!aj", name = "V", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!aj", name = "X", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!aj", name = "Y", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!aj", name = "hb", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!aj", name = "nb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!aj", name = "ub", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!aj", name = "xb", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!aj", name = "db", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
	private int anInt160 = 0;

	@OriginalMember(owner = "client!aj", name = "ib", descriptor = "I")
	private int anInt175 = 0;

	@OriginalMember(owner = "client!aj", name = "cb", descriptor = "I")
	private int anInt170 = -1;

	@OriginalMember(owner = "client!aj", name = "eb", descriptor = "I")
	private int anInt171 = -32768;

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
	public final int anInt154;

	@OriginalMember(owner = "client!aj", name = "wb", descriptor = "I")
	public final int anInt186;

	@OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
	private final int anInt161;

	@OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
	public final int anInt155;

	@OriginalMember(owner = "client!aj", name = "sb", descriptor = "I")
	private final int anInt183;

	@OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
	public final int anInt173;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
	private final int anInt158;

	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "Lclient!rj;")
	private final Class177 aClass177_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt154 = arg5;
		this.anInt186 = arg6;
		this.anInt161 = arg7;
		this.anInt155 = arg9;
		this.aBoolean17 = false;
		this.anInt183 = arg0;
		this.anInt173 = arg10;
		this.anInt158 = arg8;
		@Pc(64) int local64 = Static264.method4763(this.anInt183).anInt4910;
		if (local64 == -1) {
			this.aClass177_1 = null;
		} else {
			this.aClass177_1 = Static354.method5863(local64);
		}
	}

	@OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub7_1 != null) {
			this.aClass7_Sub7_1.method2822();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I")
	@Override
	public int method5829() {
		return this.anInt171;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		@Pc(11) Class40 local11 = this.method169(arg0, 1024);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class31 local18 = arg0.method4304();
		local18.method3172(this.anInt187);
		local18.method3173(this.anInt174);
		local18.method3184((int) this.aDouble7, (int) this.aDouble4, (int) this.aDouble2);
		if (this.aClass7_Sub7_1 == null) {
			local11.method4587(local18, null, 0);
		} else {
			@Pc(44) Class153 local44 = this.aClass7_Sub7_1.method2817();
			arg0.method4276(local11, local44, local18, null);
		}
		this.anInt171 = local11.method4572();
		this.method163(local11, arg0);
		return null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V")
	public void method161(@OriginalArg(0) int arg0) {
		this.aBoolean17 = true;
		if (this.anInt161 == -1) {
			this.aDouble4 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble4 += (double) arg0 * 0.5D * this.aDouble6 * (double) arg0 + (double) arg0 * this.aDouble5;
			this.aDouble5 += this.aDouble6 * (double) arg0;
		}
		this.aDouble7 += (double) arg0 * this.aDouble3;
		this.aDouble2 += (double) arg0 * this.aDouble1;
		this.anInt174 = (int) (Math.atan2(this.aDouble3, this.aDouble1) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt187 = (int) (Math.atan2(this.aDouble5, this.aDouble8) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass177_1 == null) {
			return;
		}
		this.anInt160 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass177_1.anIntArray528[this.anInt175] >= this.anInt160) {
						return;
					}
					this.anInt160 -= this.aClass177_1.anIntArray528[this.anInt175];
					this.anInt175++;
					if (this.anInt175 >= this.aClass177_1.anIntArray529.length) {
						this.anInt175 -= this.aClass177_1.anInt5408;
						if (this.anInt175 < 0 || this.anInt175 >= this.aClass177_1.anIntArray529.length) {
							this.anInt175 = 0;
						}
					}
					this.anInt170 = this.anInt175 + 1;
				} while (this.aClass177_1.anIntArray529.length > this.anInt170);
				this.anInt170 -= this.aClass177_1.anInt5408;
			} while (this.anInt170 >= 0 && this.aClass177_1.anIntArray529.length > this.anInt170);
			this.anInt170 = -1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!dc;Lclient!ii;)V")
	private void method163(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class105 arg1) {
		@Pc(11) Class100[] local11 = arg0.method4606();
		@Pc(14) Class123[] local14 = arg0.method4589();
		if ((this.aClass7_Sub7_1 == null || this.aClass7_Sub7_1.aBoolean255) && (local11 != null || local14 != null)) {
			this.aClass7_Sub7_1 = new Class7_Sub7(Static282.anInt3516);
		}
		if (this.aClass7_Sub7_1 != null) {
			this.aClass7_Sub7_1.method2818(arg1, (long) Static282.anInt3516, local11, local14);
			this.aClass7_Sub7_1.method2826(super.aByte73, super.aShort94, super.aShort93, super.aShort91, super.aShort92);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
		@Pc(9) Class40 local9 = this.method169(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class31 local15 = arg0.method4304();
		local15.method3172(this.anInt187);
		local15.method3173(this.anInt174);
		local15.method3184((int) this.aDouble7, (int) this.aDouble4, (int) this.aDouble2);
		this.anInt171 = local9.method4572();
		this.method163(local9, arg0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
	public void method167() {
		if (this.aClass7_Sub7_1 != null) {
			this.aClass7_Sub7_1.method2822();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIBII)V")
	public void method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean17) {
			local12 = arg0 - super.anInt6728;
			@Pc(19) double local19 = (double) (arg3 - super.anInt6726);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble4 = super.anInt6722;
			this.aDouble2 = (double) super.anInt6726 + local19 * (double) this.anInt158 / local28;
			this.aDouble7 = (double) super.anInt6728 + local12 * (double) this.anInt158 / local28;
		}
		local12 = this.anInt186 + 1 - arg1;
		this.aDouble3 = ((double) arg0 - this.aDouble7) / local12;
		this.aDouble1 = ((double) arg3 - this.aDouble2) / local12;
		this.aDouble8 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble1 * this.aDouble1);
		if (this.anInt161 == -1) {
			this.aDouble5 = ((double) arg2 - this.aDouble4) / local12;
		} else {
			if (!this.aBoolean17) {
				this.aDouble5 = -this.aDouble8 * Math.tan((double) this.anInt161 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg2 - this.aDouble5 * local12 - this.aDouble4) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ii;II)Lclient!dc;")
	private Class40 method169(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class162 local8 = Static264.method4763(this.anInt183);
		return local8.method4328(arg1, arg0, this.anInt170, this.anInt160, this.anInt175);
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
	@Override
	public void method5828() {
		super.aShort94 = super.aShort93 = (short) (this.aDouble7 / 128.0D);
		super.aShort91 = super.aShort92 = (short) (this.aDouble2 / 128.0D);
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5824() {
		return false;
	}
}
