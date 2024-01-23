import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "Lclient!pe;")
	private Class91_Sub1 aClass91_Sub1_2;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	private int anInt3206 = 0;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
	private int anInt3211 = 0;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	private int anInt3205 = -32768;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
	private int anInt3216 = -1;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
	public int anInt3218;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
	private int anInt3210;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public int anInt3198;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
	public int anInt3217;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
	public int anInt3214;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public int anInt3200;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!pi;")
	private Class133 aClass133_2;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3218 = arg5 + arg6;
		this.anInt3210 = arg0;
		this.anInt3198 = arg3;
		this.anInt3217 = arg2;
		this.anInt3214 = arg4;
		this.anInt3200 = arg1;
		@Pc(42) int local42 = Static280.method4295(this.anInt3210).anInt838;
		if (local42 == -1) {
			this.aBoolean241 = true;
		} else {
			this.aBoolean241 = false;
			this.aClass133_2 = Static262.method4031(local42);
		}
		if (arg6 == this.anInt3218) {
			Static128.method1976(false, this.aClass133_2, this.anInt3198, this.anInt3206, this.anInt3217);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
		@Pc(3) Class6_Sub2 local3 = this.method2637();
		if (local3 != null) {
			local3.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_2);
			this.anInt3205 = local3.method3833();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		return this.anInt3205;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lclient!ei;")
	private Class6_Sub2 method2637() {
		@Pc(14) Class25 local14 = Static280.method4295(this.anInt3210);
		@Pc(24) Class6_Sub2 local24;
		if (this.aBoolean241) {
			local24 = local14.method711(0, -1, -1);
		} else {
			local24 = local14.method711(this.anInt3211, this.anInt3216, this.anInt3206);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IZ)V")
	public void method2638(@OriginalArg(0) int arg0) {
		if (this.aBoolean241) {
			return;
		}
		this.anInt3211 += arg0;
		while (this.anInt3211 > this.aClass133_2.anIntArray460[this.anInt3206]) {
			this.anInt3211 -= this.aClass133_2.anIntArray460[this.anInt3206];
			this.anInt3206++;
			if (this.anInt3206 >= this.aClass133_2.anIntArray461.length) {
				this.aBoolean241 = true;
				break;
			}
		}
		if (!this.aBoolean241) {
			Static128.method1976(false, this.aClass133_2, this.anInt3198, this.anInt3206, this.anInt3217);
		}
	}
}
