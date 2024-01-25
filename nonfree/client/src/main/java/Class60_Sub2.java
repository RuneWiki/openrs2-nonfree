import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private final int anInt3070;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	private final int anInt3076;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	private final int anInt3071;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	private final int anInt3072;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII)V")
	public Class60_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3070 = arg2;
		this.anInt3076 = arg0;
		this.anInt3071 = arg3;
		this.anInt3072 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	@Override
	public void method3640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	@Override
	public void method3642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)V")
	@Override
	public void method3643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3076 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt3070 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt3072 >> 12;
		@Pc(39) int local39 = this.anInt3071 * arg1 >> 12;
		Static13.method118(local25, super.anInt4585, local32, local39, local10);
	}
}
