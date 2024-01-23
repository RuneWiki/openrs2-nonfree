import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIII)V")
	public Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt966 = arg2;
		this.anInt963 = arg0;
		this.anInt971 = arg3;
		this.anInt967 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt963 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt971 >> 12;
		@Pc(28) int local28 = this.anInt967 * arg1 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt966 >> 12;
		Static113.method4189(super.anInt4038, local10, local28, local35, local17);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
	@Override
	public void method3012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	@Override
	public void method3008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
