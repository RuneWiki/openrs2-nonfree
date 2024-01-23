import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	private final int anInt498;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	private final int anInt495;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	private final int anInt502;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	private final int anInt501;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt498 = arg2;
		this.anInt495 = arg0;
		this.anInt502 = arg1;
		this.anInt501 = arg3;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	@Override
	public void method2676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt495 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt498 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt501 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt502 * arg1 >> 12;
		Static1.method32(super.anInt3315, super.anInt3316, local32, local17, local39, local10, super.anInt3322);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V")
	@Override
	public void method2680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt495 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt498 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt502 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt501 >> 12;
		Static175.method2892(local10, local28, super.anInt3315, local35, local21);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
	@Override
	public void method2677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt495 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt498 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt502 >> 12;
		@Pc(36) int local36 = this.anInt501 * arg1 >> 12;
		Static75.method1096(local29, local10, local36, local22, super.anInt3322, super.anInt3316);
	}
}
