import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	private final int anInt1341;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
	private final int anInt1336;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
	private final int anInt1343;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	private final int anInt1337;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class33_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1341 = arg1;
		this.anInt1336 = arg3;
		this.anInt1343 = arg2;
		this.anInt1337 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	@Override
	public void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt1337 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt1343 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt1341 >> 12;
		@Pc(35) int local35 = this.anInt1336 * arg1 >> 12;
		Static172.method2714(local21, super.anInt3060, local14, local35, super.anInt3057, local28);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	@Override
	public void method2267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt1343 >> 12;
		@Pc(17) int local17 = this.anInt1341 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt1336 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt1337 >> 12;
		Static103.method1559(local6, super.anInt3058, local24, super.anInt3057, local17, local31, super.anInt3060);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BII)V")
	@Override
	public void method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt1337 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt1343 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt1341 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1336 >> 12;
		Static75.method1141(super.anInt3058, local36, local15, local22, local29);
	}
}
