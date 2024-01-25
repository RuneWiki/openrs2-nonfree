import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	private final int anInt3325;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
	private final int anInt3329;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
	private final int anInt3323;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
	private final int anInt3326;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIIII)V")
	public Class56_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3325 = arg3;
		this.anInt3329 = arg1;
		this.anInt3323 = arg0;
		this.anInt3326 = arg2;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)V")
	@Override
	public void method4856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3323 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt3326 >> 12;
		@Pc(24) int local24 = this.anInt3329 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt3325 * arg0 >> 12;
		Static98.method5424(local31, local24, local17, super.anInt5404, super.anInt5406, local10, super.anInt5408);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3323 >> 12;
		@Pc(17) int local17 = this.anInt3326 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3329 >> 12;
		@Pc(31) int local31 = this.anInt3325 * arg1 >> 12;
		Static32.method416(local31, local10, local17, local24, super.anInt5406);
	}
}
