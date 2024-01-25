import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	private final int anInt4240;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	private final int anInt4238;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
	private final int anInt4241;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
	private final int anInt4237;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIII)V")
	public Class65_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4240 = arg0;
		this.anInt4238 = arg1;
		this.anInt4241 = arg2;
		this.anInt4237 = arg3;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(III)V")
	@Override
	public void method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
	@Override
	public void method4775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt4240 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4241 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4238 >> 12;
		@Pc(31) int local31 = this.anInt4237 * arg1 >> 12;
		Static217.method3608(super.anInt5512, super.anInt5514, local17, local24, local31, super.anInt5511, local10);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4240 >> 12;
		@Pc(17) int local17 = this.anInt4241 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt4238 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt4237 >> 12;
		Static334.method4936(local10, local24, local17, super.anInt5511, local31);
	}
}
