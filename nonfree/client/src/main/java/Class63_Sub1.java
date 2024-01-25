import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	private final int anInt1585;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private final int anInt1588;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	private final int anInt1586;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	private final int anInt1584;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IIIIII)V")
	public Class63_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1585 = arg3;
		this.anInt1588 = arg1;
		this.anInt1586 = arg2;
		this.anInt1584 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
	@Override
	public void method5135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 * this.anInt1584 >> 12;
		@Pc(23) int local23 = this.anInt1586 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt1588 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt1585 >> 12;
		Static235.method3092(local23, local30, local16, super.anInt6687, local37);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	@Override
	public void method5134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
