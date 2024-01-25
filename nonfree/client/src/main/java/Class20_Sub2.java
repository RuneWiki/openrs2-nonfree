import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
	private final int anInt629;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	private final int anInt627;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	private final int anInt625;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
	private final int anInt631;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIIII)V")
	public Class20_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt629 = arg3;
		this.anInt627 = arg2;
		this.anInt625 = arg0;
		this.anInt631 = arg1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BII)V")
	@Override
	public void method3816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)V")
	@Override
	public void method3819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt625 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt627 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt631 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt629 >> 12;
		Static145.method2443(local10, local17, local24, local31, super.anInt4733);
	}
}
