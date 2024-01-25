import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class155_Sub4 extends Class155 {

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
	private final int anInt6675;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
	private final int anInt6676;

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
	private final int anInt6678;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
	private final int anInt6673;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(IIIIII)V")
	public Class155_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6675 = arg2;
		this.anInt6676 = arg0;
		this.anInt6678 = arg1;
		this.anInt6673 = arg3;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt6676 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt6675 >> 12;
		@Pc(29) int local29 = this.anInt6678 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt6673 * arg1 >> 12;
		Static452.method6157(local22, local15, local29, local36, super.anInt6668);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
	@Override
	public void method5520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BII)V")
	@Override
	public void method5523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
