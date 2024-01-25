import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class18_Sub4 extends Class18 {

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
	private final int anInt3590;

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
	private final int anInt3597;

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	private final int anInt3599;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
	private final int anInt3600;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class18_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3590 = arg0;
		this.anInt3597 = arg2;
		this.anInt3599 = arg1;
		this.anInt3600 = arg3;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(III)V")
	@Override
	public void method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt3590 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt3597 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt3599 >> 12;
		@Pc(39) int local39 = this.anInt3600 * arg0 >> 12;
		Static412.method6390(local25, super.anInt3582, super.anInt3585, local39, local18, local32);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3590 >> 12;
		@Pc(26) int local26 = this.anInt3597 * arg1 >> 12;
		@Pc(33) int local33 = arg0 * this.anInt3599 >> 12;
		@Pc(40) int local40 = arg0 * this.anInt3600 >> 12;
		Static170.method2824(local33, local26, super.anInt3585, local10, super.anInt3582, super.anInt3587, local40);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)V")
	@Override
	public void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3590 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3597 >> 12;
		@Pc(24) int local24 = this.anInt3599 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt3600 >> 12;
		Static19.method261(local24, super.anInt3587, local17, local10, local39);
	}
}
