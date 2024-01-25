import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class71_Sub4 extends Class71 {

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	private final int anInt6821;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
	private final int anInt6820;

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
	private final int anInt6827;

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
	private final int anInt6826;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(IIIIII)V")
	public Class71_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6821 = arg0;
		this.anInt6820 = arg2;
		this.anInt6827 = arg1;
		this.anInt6826 = arg3;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt6821 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt6820 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt6827 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt6826 >> 12;
		Static116.method4221(local22, local29, local36, local15, super.anInt6816);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)V")
	@Override
	public void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
