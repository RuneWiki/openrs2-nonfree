import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!no", name = "w", descriptor = "I")
	private final int anInt4393;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "I")
	private final int anInt4392;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "I")
	private final int anInt4391;

	@OriginalMember(owner = "client!no", name = "t", descriptor = "I")
	private final int anInt4390;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIII)V")
	public Class43_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4393 = arg0;
		this.anInt4392 = arg2;
		this.anInt4391 = arg3;
		this.anInt4390 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
	@Override
	public void method4686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(III)V")
	@Override
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt4393 >> 12;
		@Pc(25) int local25 = this.anInt4392 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt4390 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt4391 * arg1 >> 12;
		Static168.method3217(super.anInt5551, local18, local25, local39, local32);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
