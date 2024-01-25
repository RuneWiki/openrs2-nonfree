import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jm", name = "lb", descriptor = "F")
	public static float lb;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
	private int anInt4119;

	@OriginalMember(owner = "client!jm", name = "E", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!jm", name = "U", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!jm", name = "W", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jm", name = "X", descriptor = "I")
	private int anInt4134;

	@OriginalMember(owner = "client!jm", name = "Y", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jm", name = "ab", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!jm", name = "bb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!jm", name = "ib", descriptor = "Lclient!qv;")
	private Class6_Sub7 aClass6_Sub7_5;

	@OriginalMember(owner = "client!jm", name = "jb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
	private int anInt4121 = -1;

	@OriginalMember(owner = "client!jm", name = "T", descriptor = "I")
	private int anInt4132 = -32768;

	@OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
	private int anInt4125 = 0;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
	private int anInt4118 = 0;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
	private final int anInt4114;

	@OriginalMember(owner = "client!jm", name = "N", descriptor = "I")
	public final int anInt4127;

	@OriginalMember(owner = "client!jm", name = "hb", descriptor = "Z")
	private final boolean aBoolean320;

	@OriginalMember(owner = "client!jm", name = "ob", descriptor = "I")
	public final int anInt4144;

	@OriginalMember(owner = "client!jm", name = "cb", descriptor = "I")
	public final int anInt4136;

	@OriginalMember(owner = "client!jm", name = "V", descriptor = "I")
	private final int anInt4133;

	@OriginalMember(owner = "client!jm", name = "P", descriptor = "I")
	private final int anInt4129;

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "I")
	public final int anInt4122;

	@OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
	private final int anInt4123;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "Lclient!aba;")
	private final Class4 aClass4_3;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static200.method3233(arg1, arg2, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4114 = arg8;
		this.anInt4127 = arg10;
		this.aBoolean320 = arg11;
		this.anInt4144 = arg9;
		this.aBoolean319 = false;
		this.anInt4136 = arg6;
		this.anInt4133 = arg0;
		this.anInt4129 = arg7;
		this.anInt4122 = arg5;
		this.anInt4123 = arg4;
		@Pc(78) int local78 = Static305.aClass14_1.method555(this.anInt4133).anInt6964;
		if (local78 == -1) {
			this.aClass4_3 = null;
		} else {
			this.aClass4_3 = Static396.aClass157_2.method3745(local78);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
		@Pc(9) Class63 local9 = this.method3607(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class181 local15 = arg0.method6022();
		local15.KA(this.anInt4119);
		local15.XA(this.anInt4134);
		local15.TA((int) this.aDouble5, (int) this.aDouble9, (int) this.aDouble8);
		this.anInt4132 = local9.TA();
		this.method3605(arg0, local9);
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(B)V")
	@Override
	public void method6430() {
		super.aShort127 = super.aShort125 = (short) (this.aDouble5 / 128.0D);
		super.aShort128 = super.aShort126 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!qa;Lclient!r;B)V")
	private void method3605(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class63 arg1) {
		@Pc(6) Class192[] local6 = arg1.method7708();
		@Pc(9) Class169[] local9 = arg1.method7702();
		if ((this.aClass6_Sub7_5 == null || this.aClass6_Sub7_5.aBoolean566) && (local6 != null || local9 != null)) {
			this.aClass6_Sub7_5 = Static406.method6402(Static115.anInt2326);
		}
		if (this.aClass6_Sub7_5 != null) {
			this.aClass6_Sub7_5.method6397(arg0, (long) Static115.anInt2326, local6, local9);
			this.aClass6_Sub7_5.method6407(super.aByte90, super.aShort127, super.aShort125, super.aShort128, super.aShort126);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public void method3606(@OriginalArg(0) int arg0) {
		this.aDouble5 += this.aDouble4 * (double) arg0;
		this.aBoolean319 = true;
		this.aDouble8 += (double) arg0 * this.aDouble6;
		if (this.aBoolean320) {
			this.aDouble9 = Static200.method3233(super.aByte90, (int) this.aDouble5, (int) this.aDouble8) - this.anInt4123;
		} else if (this.anInt4129 == -1) {
			this.aDouble9 += (double) arg0 * this.aDouble2;
		} else {
			this.aDouble9 += (double) arg0 * this.aDouble3 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble2;
			this.aDouble2 += this.aDouble3 * (double) arg0;
		}
		this.anInt4134 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4119 = (int) (Math.atan2(this.aDouble2, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass4_3 == null) {
			return;
		}
		this.anInt4118 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4118 <= this.aClass4_3.anIntArray12[this.anInt4125]) {
						return;
					}
					this.anInt4118 -= this.aClass4_3.anIntArray12[this.anInt4125];
					this.anInt4125++;
					if (this.anInt4125 >= this.aClass4_3.anIntArray11.length) {
						this.anInt4125 -= this.aClass4_3.anInt116;
						if (this.anInt4125 < 0 || this.anInt4125 >= this.aClass4_3.anIntArray11.length) {
							this.anInt4125 = 0;
						}
					}
					this.anInt4121 = this.anInt4125 + 1;
				} while (this.aClass4_3.anIntArray11.length > this.anInt4121);
				this.anInt4121 -= this.aClass4_3.anInt116;
			} while (this.anInt4121 >= 0 && this.anInt4121 < this.aClass4_3.anIntArray11.length);
			this.anInt4121 = -1;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!qa;I)Lclient!r;")
	private Class63 method3607(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1) {
		@Pc(15) Class226 local15 = Static305.aClass14_1.method555(this.anInt4133);
		return local15.method5917(arg1, arg0, this.anInt4118, Static396.aClass157_2, this.anInt4125, this.anInt4121);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		@Pc(9) Class63 local9 = this.method3607(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class181 local21 = arg0.method6022();
		local21.KA(this.anInt4119);
		local21.XA(this.anInt4134);
		local21.TA((int) this.aDouble5, (int) this.aDouble9, (int) this.aDouble8);
		if (this.aClass6_Sub7_5 == null) {
			local9.method7700(local21, null, 0);
		} else {
			@Pc(47) Class208 local47 = this.aClass6_Sub7_5.method6400();
			arg0.method6020(local9, local47, local21, null);
		}
		this.anInt4132 = local9.TA();
		this.method3605(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public void method3609() {
		if (this.aClass6_Sub7_5 != null) {
			this.aClass6_Sub7_5.method6406();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIBII)V")
	public void method3610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) double local20;
		if (!this.aBoolean319) {
			local20 = arg0 - super.anInt7660;
			@Pc(27) double local27 = (double) (arg1 - super.anInt7659);
			@Pc(36) double local36 = Math.sqrt(local27 * local27 + local20 * local20);
			this.aDouble8 = (double) super.anInt7659 + local27 * (double) this.anInt4114 / local36;
			this.aDouble5 = (double) this.anInt4114 * local20 / local36 + (double) super.anInt7660;
			if (this.aBoolean320) {
				this.aDouble9 = Static200.method3233(super.aByte90, (int) this.aDouble5, (int) this.aDouble8) - this.anInt4123;
			} else {
				this.aDouble9 = super.anInt7657;
			}
		}
		local20 = this.anInt4136 + 1 - arg3;
		this.aDouble4 = ((double) arg0 - this.aDouble5) / local20;
		this.aDouble6 = ((double) arg1 - this.aDouble8) / local20;
		this.aDouble7 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble4 * this.aDouble4);
		if (this.anInt4129 == -1) {
			this.aDouble2 = ((double) arg2 - this.aDouble9) / local20;
		} else {
			if (!this.aBoolean319) {
				this.aDouble2 = -this.aDouble7 * Math.tan((double) this.anInt4129 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg2 - local20 * this.aDouble2 - this.aDouble9) * 2.0D / (local20 * local20);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub7_5 != null) {
			this.aClass6_Sub7_5.method6406();
		}
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)I")
	@Override
	public int method6432() {
		return this.anInt4132;
	}
}
