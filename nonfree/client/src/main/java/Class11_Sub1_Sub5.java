import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class11_Sub1_Sub5 extends Class11_Sub1 {

	@OriginalMember(owner = "client!me", name = "D", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	private int anInt5980;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "I")
	private int anInt5982;

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!me", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!me", name = "pb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!me", name = "rb", descriptor = "Lclient!hm;")
	private Class5_Sub2 aClass5_Sub2_5;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "I")
	private int anInt5977 = -1;

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!me", name = "jb", descriptor = "I")
	private int anInt5996 = 0;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	private int anInt5981 = 0;

	@OriginalMember(owner = "client!me", name = "sb", descriptor = "I")
	private int anInt6002 = -32768;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "Z")
	private final boolean aBoolean446;

	@OriginalMember(owner = "client!me", name = "T", descriptor = "I")
	public final int anInt5983;

	@OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
	private final int anInt5989;

	@OriginalMember(owner = "client!me", name = "V", descriptor = "I")
	private final int anInt5985;

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	public final int anInt5999;

	@OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
	private final int anInt5993;

	@OriginalMember(owner = "client!me", name = "W", descriptor = "I")
	public final int anInt5986;

	@OriginalMember(owner = "client!me", name = "U", descriptor = "I")
	public final int anInt5984;

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
	private final int anInt5990;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "Lclient!am;")
	private final Class16 aClass16_2;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class11_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static482.method7333(arg1, arg3, arg2) - arg4, arg3, arg2 >> 9, arg2 >> 9, arg3 >> 9, arg3 >> 9, false, (byte) 0);
		this.aBoolean446 = arg11;
		this.anInt5983 = arg5;
		this.anInt5989 = arg8;
		this.anInt5985 = arg7;
		this.anInt5999 = arg10;
		this.anInt5993 = arg0;
		this.anInt5986 = arg6;
		this.anInt5984 = arg9;
		this.anInt5990 = arg4;
		this.aBoolean447 = false;
		@Pc(78) int local78 = Static355.aClass278_2.method6826(this.anInt5993).anInt6056;
		if (local78 == -1) {
			this.aClass16_2 = null;
		} else {
			this.aClass16_2 = Static114.aClass156_2.method4101(local78);
		}
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)I")
	@Override
	public int method6199() {
		return this.anInt6002;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!oa;I)Lclient!ba;")
	private Class23 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1) {
		@Pc(9) Class212 local9 = Static355.aClass278_2.method6826(this.anInt5993);
		return local9.method5191(this.anInt5981, arg1, this.anInt5996, Static114.aClass156_2, arg0, this.anInt5977);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	@Override
	public void method6201() {
		super.aShort78 = super.aShort79 = (short) (this.aDouble3 / 512.0D);
		super.aShort80 = super.aShort77 = (short) (this.lb / 512.0D);
	}

	@OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass5_Sub2_5 != null) {
			this.aClass5_Sub2_5.method3791();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method5129() {
		if (this.aClass5_Sub2_5 != null) {
			this.aClass5_Sub2_5.method3791();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		@Pc(11) Class23 local11 = this.method5127(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class8 local18 = arg0.method5417();
		local18.XA(this.anInt5982);
		local18.P(this.anInt5980);
		local18.G((int) this.aDouble3, (int) this.aDouble1, (int) this.lb);
		this.method5132(local18, arg0, local11);
		if (this.aClass5_Sub2_5 == null) {
			local11.method7077(local18, null, 0);
		} else {
			@Pc(57) Class299 local57 = this.aClass5_Sub2_5.method3789();
			arg0.method5457(local11, local57, local18, null, 0);
		}
		this.anInt6002 = local11.DA();
		return null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public void method5131(@OriginalArg(0) int arg0) {
		this.lb += (double) arg0 * this.aDouble4;
		this.aBoolean447 = true;
		this.aDouble3 += this.aDouble5 * (double) arg0;
		if (this.aBoolean446) {
			this.aDouble1 = Static482.method7333(super.aByte77, (int) this.lb, (int) this.aDouble3) - this.anInt5990;
		} else if (this.anInt5985 == -1) {
			this.aDouble1 += (double) arg0 * this.aDouble2;
		} else {
			this.aDouble1 += this.aDouble2 * (double) arg0 + (double) arg0 * 0.5D * this.aDouble7 * (double) arg0;
			this.aDouble2 += (double) arg0 * this.aDouble7;
		}
		this.anInt5980 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5982 = (int) (Math.atan2(this.aDouble2, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass16_2 == null) {
			return;
		}
		this.anInt5996 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass16_2.anIntArray46[this.anInt5981] >= this.anInt5996) {
						return;
					}
					this.anInt5996 -= this.aClass16_2.anIntArray46[this.anInt5981];
					this.anInt5981++;
					if (this.aClass16_2.anIntArray47.length <= this.anInt5981) {
						this.anInt5981 -= this.aClass16_2.anInt587;
						if (this.anInt5981 < 0 || this.anInt5981 >= this.aClass16_2.anIntArray47.length) {
							this.anInt5981 = 0;
						}
					}
					this.anInt5977 = this.anInt5981 + 1;
				} while (this.aClass16_2.anIntArray47.length > this.anInt5977);
				this.anInt5977 -= this.aClass16_2.anInt587;
			} while (this.anInt5977 >= 0 && this.anInt5977 < this.aClass16_2.anIntArray47.length);
			this.anInt5977 = -1;
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!q;Lclient!oa;Lclient!ba;)V")
	private void method5132(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) Class23 arg2) {
		arg2.method7078(arg0);
		@Pc(9) Class69[] local9 = arg2.method7080();
		@Pc(22) Class128[] local22 = arg2.method7071();
		if ((this.aClass5_Sub2_5 == null || this.aClass5_Sub2_5.aBoolean354) && (local9 != null || local22 != null)) {
			this.aClass5_Sub2_5 = Static202.method3777(Static508.anInt8998, true);
		}
		if (this.aClass5_Sub2_5 != null) {
			this.aClass5_Sub2_5.method3784(arg1, (long) Static508.anInt8998, local9, local22);
			this.aClass5_Sub2_5.method3790(super.aByte77, super.aShort78, super.aShort79, super.aShort80, super.aShort77);
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
		@Pc(9) Class23 local9 = this.method5127(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class8 local15 = arg0.method5417();
		local15.XA(this.anInt5982);
		local15.P(this.anInt5980);
		local15.G((int) this.aDouble3, (int) this.aDouble1, (int) this.lb);
		this.anInt6002 = local9.DA();
		this.method5132(local15, arg0, local9);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
	public void method5135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean447) {
			local9 = arg0 - super.anInt7347;
			@Pc(15) double local15 = (double) (arg3 - super.anInt7351);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local9 * local9);
			this.aDouble3 = local9 * (double) this.anInt5989 / local24 + (double) super.anInt7347;
			this.lb = (double) super.anInt7351 + local15 * (double) this.anInt5989 / local24;
			if (this.aBoolean446) {
				this.aDouble1 = Static482.method7333(super.aByte77, (int) this.lb, (int) this.aDouble3) - this.anInt5990;
			} else {
				this.aDouble1 = super.anInt7350;
			}
		}
		local9 = this.anInt5986 + 1 - arg1;
		this.aDouble5 = ((double) arg0 - this.aDouble3) / local9;
		this.aDouble4 = ((double) arg3 - this.lb) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble4 * this.aDouble4);
		if (this.anInt5985 == -1) {
			this.aDouble2 = ((double) arg2 - this.aDouble1) / local9;
		} else {
			if (!this.aBoolean447) {
				this.aDouble2 = -this.aDouble6 * Math.tan((double) this.anInt5985 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg2 - this.aDouble1 - local9 * this.aDouble2) * 2.0D / (local9 * local9);
		}
	}
}
