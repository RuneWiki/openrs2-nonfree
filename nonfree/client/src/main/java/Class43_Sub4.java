import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	private final int anInt8904;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
	private final int anInt8907;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	private final int anInt8906;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	private final int anInt8903;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIII)V")
	public Class43_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt8904 = arg0;
		this.anInt8907 = arg3;
		this.anInt8906 = arg1;
		this.anInt8903 = arg2;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8904 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt8903 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt8906 >> 12;
		@Pc(37) int local37 = this.anInt8907 * arg0 >> 12;
		Static520.method7229(super.anInt8895, local17, local30, local10, local37);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)V")
	@Override
	public void method7276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
