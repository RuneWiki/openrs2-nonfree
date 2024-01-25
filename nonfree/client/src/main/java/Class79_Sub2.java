import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class79_Sub2 extends Class79 {

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	private final int anInt3864;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	private final int anInt3870;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	private final int anInt3860;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "I")
	private final int anInt3867;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIII)V")
	public Class79_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3864 = arg3;
		this.anInt3870 = arg0;
		this.anInt3860 = arg2;
		this.anInt3867 = arg1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	@Override
	public void method5114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3870 >> 12;
		@Pc(30) int local30 = this.anInt3860 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt3867 * arg1 >> 12;
		@Pc(44) int local44 = this.anInt3864 * arg1 >> 12;
		Static90.method4773(local10, super.anInt5792, local37, local30, local44);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V")
	@Override
	public void method5119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3870 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3860 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3867 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3864 >> 12;
		Static61.method1392(super.anInt5794, super.anInt5792, local24, local31, local10, super.anInt5793, local17);
	}
}
