import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class12_Sub5 extends Class12 {

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	private int anInt3935;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "Lclient!id;")
	private Class67_Sub1 aClass67_Sub1_4;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	public int anInt3953;

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	private int anInt3946 = -32768;

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
	private int anInt3948 = 0;

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
	private int anInt3949 = -1;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	private int anInt3945 = 0;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	private int anInt3941;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public int anInt3938;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	public int anInt3936;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	private int anInt3937;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	public int anInt3939;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
	public int anInt3940;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
	private int anInt3954;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
	private int anInt3942;

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
	private int anInt3952;

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
	public int anInt3943;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
	private int anInt3947;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "Lclient!qm;")
	private Class141 aClass141_2;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class12_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt3941 = arg2;
		this.aBoolean253 = false;
		this.anInt3938 = arg10;
		this.anInt3936 = arg6;
		this.anInt3937 = arg0;
		this.anInt3939 = arg1;
		this.anInt3940 = arg9;
		this.anInt3954 = arg7;
		this.anInt3942 = arg8;
		this.anInt3952 = arg4;
		this.anInt3943 = arg5;
		this.anInt3947 = arg3;
		@Pc(58) int local58 = Static262.method3973(this.anInt3937).anInt3816;
		if (local58 == -1) {
			this.aClass141_2 = null;
		} else {
			this.aClass141_2 = Static296.method1376(local58);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
		@Pc(3) Class12_Sub2 local3 = this.method3127();
		if (local3 != null) {
			local3.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_4);
			this.anInt3946 = local3.method3355();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
	public void method3126(@OriginalArg(1) int arg0) {
		this.aDouble7 += (double) arg0 * this.aDouble9;
		this.aBoolean253 = true;
		this.aDouble3 += (double) arg0 * this.aDouble2;
		if (this.anInt3954 == -1) {
			this.aDouble6 += this.aDouble4 * (double) arg0;
		} else {
			this.aDouble6 += this.aDouble4 * (double) arg0 + (double) arg0 * 0.5D * this.aDouble5 * (double) arg0;
			this.aDouble4 += this.aDouble5 * (double) arg0;
		}
		this.anInt3953 = (int) (Math.atan2(this.aDouble9, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt3935 = (int) (Math.atan2(this.aDouble4, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass141_2 == null) {
			return;
		}
		this.anInt3948 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt3948 <= this.aClass141_2.anIntArray392[this.anInt3945]) {
						return;
					}
					this.anInt3948 -= this.aClass141_2.anIntArray392[this.anInt3945];
					this.anInt3945++;
					if (this.aClass141_2.anIntArray390.length <= this.anInt3945) {
						this.anInt3945 -= this.aClass141_2.anInt4367;
						if (this.anInt3945 < 0 || this.aClass141_2.anIntArray390.length <= this.anInt3945) {
							this.anInt3945 = 0;
						}
					}
					this.anInt3949 = this.anInt3945 + 1;
				} while (this.aClass141_2.anIntArray390.length > this.anInt3949);
				this.anInt3949 -= this.aClass141_2.anInt4367;
			} while (this.anInt3949 >= 0 && this.anInt3949 < this.aClass141_2.anIntArray390.length);
			this.anInt3949 = -1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)Lclient!uc;")
	private Class12_Sub2 method3127() {
		@Pc(8) Class126 local8 = Static262.method3973(this.anInt3937);
		@Pc(35) Class12_Sub2 local35 = local8.method3023(this.anInt3949, this.anInt3945, this.anInt3948);
		if (local35 == null) {
			return null;
		} else {
			local35.method3158(this.anInt3935);
			return local35;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		return this.anInt3946;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIII)V")
	public void method3128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean253) {
			local13 = arg1 - this.anInt3941;
			@Pc(19) double local19 = (double) (arg0 - this.anInt3947);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble7 = (double) this.anInt3941 + local13 * (double) this.anInt3942 / local28;
			this.aDouble6 = this.anInt3952;
			this.aDouble3 = local19 * (double) this.anInt3942 / local28 + (double) this.anInt3947;
		}
		local13 = this.anInt3936 + 1 - arg2;
		this.aDouble9 = ((double) arg1 - this.aDouble7) / local13;
		this.aDouble2 = ((double) arg0 - this.aDouble3) / local13;
		this.aDouble8 = Math.sqrt(this.aDouble9 * this.aDouble9 + this.aDouble2 * this.aDouble2);
		if (this.anInt3954 == -1) {
			this.aDouble4 = ((double) arg3 - this.aDouble6) / local13;
		} else {
			if (!this.aBoolean253) {
				this.aDouble4 = -this.aDouble8 * Math.tan((double) this.anInt3954 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg3 - this.aDouble4 * local13 - this.aDouble6) * 2.0D / (local13 * local13);
		}
	}
}
