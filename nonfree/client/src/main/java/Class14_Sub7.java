import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class14_Sub7 extends Class14 {

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "Lclient!sa;")
	private Class86_Sub1 aClass86_Sub1_5;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
	private int anInt3405 = 0;

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
	private int anInt3407 = -1;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
	private int anInt3408 = -32768;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	private int anInt3400 = 0;

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
	public int anInt3410;

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
	public int anInt3413;

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
	public int anInt3411;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public int anInt3402;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
	private int anInt3414;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
	public int anInt3403;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "Lclient!om;")
	private Class125 aClass125_3;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIII)V")
	public Class14_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3410 = arg2;
		this.anInt3413 = arg4;
		this.anInt3411 = arg3;
		this.anInt3402 = arg1;
		this.anInt3414 = arg0;
		this.anInt3403 = arg5 + arg6;
		@Pc(42) int local42 = Static242.method3711(this.anInt3414).anInt4951;
		if (local42 == -1) {
			this.aBoolean246 = true;
		} else {
			this.aBoolean246 = false;
			this.aClass125_3 = Static90.method1591(local42);
		}
		if (arg6 == this.anInt3403) {
			Static77.method1354(this.anInt3400, false, this.anInt3410, this.aClass125_3, this.anInt3411);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Lclient!q;")
	private Class14_Sub6 method2753() {
		@Pc(4) Class157 local4 = Static242.method3711(this.anInt3414);
		@Pc(24) Class14_Sub6 local24;
		if (this.aBoolean246) {
			local24 = local4.method3873(-1, -1, 0);
		} else {
			local24 = local4.method3873(this.anInt3400, this.anInt3407, this.anInt3405);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10) {
		@Pc(7) Class14_Sub6 local7 = this.method2753();
		if (local7 != null) {
			local7.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_5);
			this.anInt3408 = local7.method4091();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
	public void method2754(@OriginalArg(1) int arg0) {
		if (this.aBoolean246) {
			return;
		}
		this.anInt3405 += arg0;
		while (this.anInt3405 > this.aClass125_3.anIntArray356[this.anInt3400]) {
			this.anInt3405 -= this.aClass125_3.anIntArray356[this.anInt3400];
			this.anInt3400++;
			if (this.anInt3400 >= this.aClass125_3.anIntArray357.length) {
				this.aBoolean246 = true;
				break;
			}
		}
		if (!this.aBoolean246) {
			Static77.method1354(this.anInt3400, false, this.anInt3410, this.aClass125_3, this.anInt3411);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()I")
	@Override
	public int method4091() {
		return this.anInt3408;
	}
}
