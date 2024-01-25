import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class25_Sub4 extends Class25 {

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
	private final int anInt7047;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
	private final int anInt7053;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	private final int anInt7050;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
	private final int anInt7049;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIII)V")
	public Class25_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7047 = arg1;
		this.anInt7053 = arg0;
		this.anInt7050 = arg3;
		this.anInt7049 = arg2;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 * this.anInt7053 >> 12;
		@Pc(20) int local20 = this.anInt7049 * arg1 >> 12;
		@Pc(27) int local27 = this.anInt7047 * arg0 >> 12;
		@Pc(34) int local34 = arg0 * this.anInt7050 >> 12;
		Static1.method47(local20, local34, local13, local27, super.anInt7042);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BII)V")
	@Override
	public void method6074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V")
	@Override
	public void method6072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
