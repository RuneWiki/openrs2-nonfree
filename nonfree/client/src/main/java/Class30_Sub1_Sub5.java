import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class30_Sub1_Sub5 extends Class30_Sub1 {

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
	private int anInt8740;

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!tt", name = "L", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!tt", name = "cb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!tt", name = "db", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!tt", name = "qb", descriptor = "Lclient!jw;")
	private Class7_Sub3 aClass7_Sub3_6;

	@OriginalMember(owner = "client!tt", name = "tb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!tt", name = "wb", descriptor = "I")
	private int anInt8768;

	@OriginalMember(owner = "client!tt", name = "X", descriptor = "I")
	private int anInt8754 = 0;

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
	private int anInt8741 = 0;

	@OriginalMember(owner = "client!tt", name = "kb", descriptor = "I")
	private int anInt8762 = -1;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
	private int anInt8736 = -32768;

	@OriginalMember(owner = "client!tt", name = "ob", descriptor = "Z")
	private boolean aBoolean617 = false;

	@OriginalMember(owner = "client!tt", name = "bb", descriptor = "I")
	private final int anInt8757;

	@OriginalMember(owner = "client!tt", name = "R", descriptor = "I")
	private final int anInt8749;

	@OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
	private final int anInt8746;

	@OriginalMember(owner = "client!tt", name = "eb", descriptor = "Z")
	private final boolean aBoolean616;

	@OriginalMember(owner = "client!tt", name = "fb", descriptor = "I")
	public final int anInt8758;

	@OriginalMember(owner = "client!tt", name = "W", descriptor = "I")
	public final int anInt8753;

	@OriginalMember(owner = "client!tt", name = "nb", descriptor = "I")
	public final int anInt8764;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
	public final int anInt8739;

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
	private final int anInt8745;

	@OriginalMember(owner = "client!tt", name = "pb", descriptor = "Lclient!dba;")
	private final Class64 aClass64_2;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class30_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static443.method6717(arg2, arg3, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt8757 = arg0;
		this.anInt8749 = arg8;
		this.aBoolean617 = false;
		this.anInt8746 = arg4;
		this.aBoolean616 = arg11;
		this.anInt8758 = arg10;
		this.anInt8753 = arg9;
		this.anInt8764 = arg6;
		this.anInt8739 = arg5;
		this.anInt8745 = arg7;
		@Pc(78) int local78 = Static82.aClass212_2.method5063(this.anInt8757).anInt1432;
		if (local78 == -1) {
			this.aClass64_2 = null;
		} else {
			this.aClass64_2 = Static47.aClass41_1.method911(local78);
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		@Pc(9) Class26 local9 = this.method7199(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class91 local16 = arg0.method5847();
		local16.KA(this.anInt8740);
		local16.XA(this.anInt8768);
		local16.TA((int) this.aDouble7, (int) this.aDouble9, (int) this.aDouble4);
		if (this.aClass7_Sub3_6 == null) {
			local9.method8003(local16, null, 0);
		} else {
			@Pc(49) Class136 local49 = this.aClass7_Sub3_6.method4202();
			arg0.method5864(local9, local49, local16, null);
		}
		this.anInt8736 = local9.TA();
		this.method7198(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!tt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub3_6 != null) {
			this.aClass7_Sub3_6.method4196();
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IIIII)V")
	public void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean617) {
			local9 = arg1 - super.anInt9418;
			@Pc(16) double local16 = (double) (arg3 - super.anInt9416);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble7 = (double) this.anInt8749 * local9 / local25 + (double) super.anInt9418;
			this.aDouble4 = (double) super.anInt9416 + local16 * (double) this.anInt8749 / local25;
			if (this.aBoolean616) {
				this.aDouble9 = Static443.method6717((int) this.aDouble7, (int) this.aDouble4, super.aByte99) - this.anInt8746;
			} else {
				this.aDouble9 = super.anInt9422;
			}
		}
		local9 = this.anInt8764 + 1 - arg0;
		this.aDouble6 = ((double) arg1 - this.aDouble7) / local9;
		this.aDouble5 = ((double) arg3 - this.aDouble4) / local9;
		this.aDouble8 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
		if (this.anInt8745 == -1) {
			this.aDouble3 = ((double) arg2 - this.aDouble9) / local9;
		} else {
			if (!this.aBoolean617) {
				this.aDouble3 = -this.aDouble8 * Math.tan((double) this.anInt8745 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg2 - local9 * this.aDouble3 - this.aDouble9) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
	public void method7192(@OriginalArg(1) int arg0) {
		this.aBoolean617 = true;
		this.aDouble7 += this.aDouble6 * (double) arg0;
		this.aDouble4 += (double) arg0 * this.aDouble5;
		if (this.aBoolean616) {
			this.aDouble9 = Static443.method6717((int) this.aDouble7, (int) this.aDouble4, super.aByte99) - this.anInt8746;
		} else if (this.anInt8745 == -1) {
			this.aDouble9 += this.aDouble3 * (double) arg0;
		} else {
			this.aDouble9 += (double) arg0 * this.aDouble3 + (double) arg0 * this.aDouble2 * 0.5D * (double) arg0;
			this.aDouble3 += this.aDouble2 * (double) arg0;
		}
		this.anInt8768 = (int) (Math.atan2(this.aDouble6, this.aDouble5) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt8740 = (int) (Math.atan2(this.aDouble3, this.aDouble8) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass64_2 == null) {
			return;
		}
		this.anInt8741 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt8741 <= this.aClass64_2.anIntArray184[this.anInt8754]) {
						return;
					}
					this.anInt8741 -= this.aClass64_2.anIntArray184[this.anInt8754];
					this.anInt8754++;
					if (this.anInt8754 >= this.aClass64_2.anIntArray185.length) {
						this.anInt8754 -= this.aClass64_2.anInt1962;
						if (this.anInt8754 < 0 || this.aClass64_2.anIntArray185.length <= this.anInt8754) {
							this.anInt8754 = 0;
						}
					}
					this.anInt8762 = this.anInt8754 + 1;
				} while (this.anInt8762 < this.aClass64_2.anIntArray185.length);
				this.anInt8762 -= this.aClass64_2.anInt1962;
			} while (this.anInt8762 >= 0 && this.aClass64_2.anIntArray185.length > this.anInt8762);
			this.anInt8762 = -1;
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
	public void method7193() {
		if (this.aClass7_Sub3_6 != null) {
			this.aClass7_Sub3_6.method4196();
		}
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "(I)V")
	@Override
	public void method7813() {
		super.aShort112 = super.aShort114 = (short) (this.aDouble4 / 128.0D);
		super.aShort115 = super.aShort113 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
		@Pc(17) Class26 local17 = this.method7199(0, arg0);
		if (local17 == null) {
			return;
		}
		@Pc(23) Class91 local23 = arg0.method5847();
		local23.KA(this.anInt8740);
		local23.XA(this.anInt8768);
		local23.TA((int) this.aDouble7, (int) this.aDouble9, (int) this.aDouble4);
		this.anInt8736 = local17.TA();
		this.method7198(local17, arg0);
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!r;ILclient!qa;)V")
	private void method7198(@OriginalArg(0) Class26 arg0, @OriginalArg(2) Class42 arg1) {
		@Pc(6) Class142[] local6 = arg0.method8006();
		@Pc(13) Class265[] local13 = arg0.method7999();
		if ((this.aClass7_Sub3_6 == null || this.aClass7_Sub3_6.aBoolean392) && (local6 != null || local13 != null)) {
			this.aClass7_Sub3_6 = Static244.method4191(Static409.anInt7683);
		}
		if (this.aClass7_Sub3_6 != null) {
			this.aClass7_Sub3_6.method4201(arg1, (long) Static409.anInt7683, local6, local13);
			this.aClass7_Sub3_6.method4193(super.aByte99, super.aShort115, super.aShort113, super.aShort112, super.aShort114);
		}
	}

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)I")
	@Override
	public int method7815() {
		return this.anInt8736;
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!qa;I)Lclient!r;")
	private Class26 method7199(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1) {
		@Pc(18) Class50 local18 = Static82.aClass212_2.method5063(this.anInt8757);
		return local18.method1440(this.anInt8741, arg0, this.anInt8754, Static47.aClass41_1, arg1, this.anInt8762);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return null;
	}
}
