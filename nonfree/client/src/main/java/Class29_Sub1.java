import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	private final int anInt910;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	private final int anInt908;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	private final int anInt905;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	private final int anInt907;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIII)V")
	public Class29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt910 = arg3;
		this.anInt908 = arg2;
		this.anInt905 = arg1;
		this.anInt907 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIB)V")
	@Override
	public void method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt907 * arg0 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt908 >> 12;
		@Pc(30) int local30 = this.anInt905 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt910 * arg1 >> 12;
		Static116.method2288(local23, super.anInt5716, local30, local37, local16);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	@Override
	public void method5055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
