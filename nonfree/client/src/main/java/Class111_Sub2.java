import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class111_Sub2 extends Class111 {

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
	private final int anInt3612;

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	private final int anInt3609;

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
	private final int anInt3608;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
	private final int anInt3604;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIIII)V")
	public Class111_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3612 = arg0;
		this.anInt3609 = arg2;
		this.anInt3608 = arg1;
		this.anInt3604 = arg3;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3612 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3609 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3608 >> 12;
		@Pc(36) int local36 = this.anInt3604 * arg1 >> 12;
		Static129.method2557(local36, super.anInt9311, local10, local24, local17);
	}
}
