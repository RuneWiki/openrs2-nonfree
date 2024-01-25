import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!va", name = "x", descriptor = "I")
	private final int anInt6359;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	private final int anInt6361;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "I")
	private final int anInt6360;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	private final int anInt6356;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIII)V")
	public Class26_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt6359 = arg2;
		this.anInt6361 = arg0;
		this.anInt6360 = arg3;
		this.anInt6356 = arg1;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V")
	@Override
	public void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	@Override
	public void method5411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6361 >> 12;
		@Pc(17) int local17 = this.anInt6359 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt6356 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt6360 * arg0 >> 12;
		Static8.method190(local24, super.anInt6415, local31, local10, local17);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
	@Override
	public void method5412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
