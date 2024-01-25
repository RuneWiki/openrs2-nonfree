import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class29_Sub2_Sub4 extends Class29_Sub2 {

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "Lclient!tp;")
	private Class102_Sub6 aClass102_Sub6_6;

	@OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
	private int anInt7989;

	@OriginalMember(owner = "client!sr", name = "T", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!sr", name = "V", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!sr", name = "X", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!sr", name = "db", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!sr", name = "eb", descriptor = "I")
	private int anInt8004;

	@OriginalMember(owner = "client!sr", name = "hb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!sr", name = "ib", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!sr", name = "kb", descriptor = "I")
	private int anInt8007 = 0;

	@OriginalMember(owner = "client!sr", name = "O", descriptor = "Z")
	private boolean aBoolean545 = false;

	@OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
	private int anInt7993 = -32768;

	@OriginalMember(owner = "client!sr", name = "Z", descriptor = "I")
	private int anInt8000 = 0;

	@OriginalMember(owner = "client!sr", name = "nb", descriptor = "I")
	private int anInt8008 = -1;

	@OriginalMember(owner = "client!sr", name = "bb", descriptor = "I")
	public final int anInt8002;

	@OriginalMember(owner = "client!sr", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!sr", name = "Y", descriptor = "I")
	private final int anInt7999;

	@OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
	public final int anInt7987;

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
	private final int anInt7980;

	@OriginalMember(owner = "client!sr", name = "cb", descriptor = "I")
	public final int anInt8003;

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
	public final int anInt7983;

	@OriginalMember(owner = "client!sr", name = "G", descriptor = "Z")
	private final boolean aBoolean544;

	@OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
	private final int anInt7992;

	@OriginalMember(owner = "client!sr", name = "mb", descriptor = "Lclient!fq;")
	private final Class108 aClass108_3;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class29_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static490.method6768(arg2, arg1, arg3) - arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
		this.aBoolean545 = false;
		this.anInt8002 = arg5;
		this.lb = arg0;
		this.anInt7999 = arg8;
		this.anInt7987 = arg9;
		this.anInt7980 = arg7;
		this.anInt8003 = arg10;
		this.anInt7983 = arg6;
		this.aBoolean544 = arg11;
		this.anInt7992 = arg4;
		@Pc(77) int local77 = Static448.aClass117_2.method2317(this.lb).anInt6458;
		if (local77 == -1) {
			this.aClass108_3 = null;
		} else {
			this.aClass108_3 = Static31.aClass345_1.method7798(local77);
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
	@Override
	public void method7547() {
		super.aShort122 = super.aShort124 = (short) (this.aDouble9 / 512.0D);
		super.aShort121 = super.aShort123 = (short) (this.aDouble3 / 512.0D);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	public void method6606(@OriginalArg(1) int arg0) {
		this.aDouble3 += this.aDouble10 * (double) arg0;
		this.aDouble9 += this.aDouble6 * (double) arg0;
		this.aBoolean545 = true;
		if (this.aBoolean544) {
			this.aDouble7 = Static490.method6768((int) this.aDouble9, super.aByte103, (int) this.aDouble3) - this.anInt7992;
		} else if (this.anInt7980 == -1) {
			this.aDouble7 += this.aDouble5 * (double) arg0;
		} else {
			this.aDouble7 += this.aDouble4 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble5;
			this.aDouble5 += (double) arg0 * this.aDouble4;
		}
		this.anInt7989 = (int) (Math.atan2(this.aDouble6, this.aDouble10) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt8004 = (int) (Math.atan2(this.aDouble5, this.aDouble8) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass108_3 == null) {
			return;
		}
		this.anInt8000 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt8000 <= this.aClass108_3.anIntArray313[this.anInt8007]) {
						return;
					}
					this.anInt8000 -= this.aClass108_3.anIntArray313[this.anInt8007];
					this.anInt8007++;
					if (this.aClass108_3.anIntArray312.length <= this.anInt8007) {
						this.anInt8007 -= this.aClass108_3.anInt2603;
						if (this.anInt8007 < 0 || this.anInt8007 >= this.aClass108_3.anIntArray312.length) {
							this.anInt8007 = 0;
						}
					}
					this.anInt8008 = this.anInt8007 + 1;
				} while (this.anInt8008 < this.aClass108_3.anIntArray312.length);
				this.anInt8008 -= this.aClass108_3.anInt2603;
			} while (this.anInt8008 >= 0 && this.anInt8008 < this.aClass108_3.anIntArray312.length);
			this.anInt8008 = -1;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	public void method6607() {
		if (this.aClass102_Sub6_6 != null) {
			this.aClass102_Sub6_6.method6838();
		}
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)I")
	@Override
	public int method7546() {
		return this.anInt7993;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		@Pc(17) Class22 local17 = this.method6609(2048, arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(24) Class34 local24 = arg0.method7096();
		local24.XA(this.anInt8004);
		local24.P(this.anInt7989);
		local24.G((int) this.aDouble9, (int) this.aDouble7, (int) this.aDouble3);
		this.method6610(arg0, local17, local24);
		if (this.aClass102_Sub6_6 == null) {
			local17.method4689(local24, null, 0);
		} else {
			@Pc(63) Class222 local63 = this.aClass102_Sub6_6.method6847();
			arg0.method7118(local17, local63, local24, null, 0);
		}
		this.anInt7993 = local17.DA();
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
	public void method6608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean545) {
			local16 = arg3 - super.anInt9222;
			@Pc(23) double local23 = (double) (arg0 - super.anInt9218);
			@Pc(32) double local32 = Math.sqrt(local23 * local23 + local16 * local16);
			this.aDouble3 = local23 * (double) this.anInt7999 / local32 + (double) super.anInt9218;
			this.aDouble9 = local16 * (double) this.anInt7999 / local32 + (double) super.anInt9222;
			if (this.aBoolean544) {
				this.aDouble7 = Static490.method6768((int) this.aDouble9, super.aByte103, (int) this.aDouble3) - this.anInt7992;
			} else {
				this.aDouble7 = super.anInt9223;
			}
		}
		local16 = this.anInt7983 + 1 - arg2;
		this.aDouble10 = ((double) arg0 - this.aDouble3) / local16;
		this.aDouble6 = ((double) arg3 - this.aDouble9) / local16;
		this.aDouble8 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble10 * this.aDouble10);
		if (this.anInt7980 == -1) {
			this.aDouble5 = ((double) arg1 - this.aDouble7) / local16;
		} else {
			if (!this.aBoolean545) {
				this.aDouble5 = -this.aDouble8 * Math.tan((double) this.anInt7980 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg1 - this.aDouble5 * local16 - this.aDouble7) * 2.0D / (local16 * local16);
		}
	}

	@OriginalMember(owner = "client!sr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass102_Sub6_6 != null) {
			this.aClass102_Sub6_6.method6838();
		}
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
		@Pc(9) Class22 local9 = this.method6609(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(19) Class34 local19 = arg0.method7096();
		local19.XA(this.anInt8004);
		local19.P(this.anInt7989);
		local19.G((int) this.aDouble9, (int) this.aDouble7, (int) this.aDouble3);
		this.anInt7993 = local9.DA();
		this.method6610(arg0, local9, local19);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	private Class22 method6609(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		@Pc(9) Class237 local9 = Static448.aClass117_2.method2317(this.lb);
		return local9.method5496(this.anInt8000, this.anInt8008, this.anInt8007, arg0, arg1, Static31.aClass345_1);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!oa;Lclient!ba;ILclient!q;)V")
	private void method6610(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) Class34 arg2) {
		arg1.method4701(arg2);
		@Pc(17) Class163[] local17 = arg1.method4708();
		@Pc(20) Class250[] local20 = arg1.method4692();
		if ((this.aClass102_Sub6_6 == null || this.aClass102_Sub6_6.aBoolean567) && (local17 != null || local20 != null)) {
			this.aClass102_Sub6_6 = Static496.method6833(Static358.anInt6263, true);
		}
		if (this.aClass102_Sub6_6 != null) {
			this.aClass102_Sub6_6.method6834(arg0, (long) Static358.anInt6263, local17, local20);
			this.aClass102_Sub6_6.method6844(super.aByte103, super.aShort122, super.aShort124, super.aShort121, super.aShort123);
		}
	}
}
