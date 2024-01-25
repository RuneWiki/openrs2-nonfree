import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
	private final int anInt3103;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	private final int anInt3104;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	private final int anInt3100;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
	private final int anInt3098;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIIII)V")
	public Class22_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3103 = arg0;
		this.anInt3104 = arg1;
		this.anInt3100 = arg3;
		this.anInt3098 = arg2;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	@Override
	public void method7937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt3103 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt3098 >> 12;
		@Pc(29) int local29 = this.anInt3104 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt3100 * arg0 >> 12;
		Static36.method1111(local15, local36, super.anInt9185, local29, local22);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BII)V")
	@Override
	public void method7939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
