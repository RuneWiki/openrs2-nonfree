import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class69_Sub3 extends Class69 {

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
	private final int anInt6392;

	@OriginalMember(owner = "client!mca", name = "x", descriptor = "I")
	private final int anInt6395;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
	private final int anInt6386;

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
	private final int anInt6394;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
	private final int anInt6387;

	@OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
	private final int anInt6389;

	@OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
	private final int anInt6391;

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
	private final int anInt6390;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class69_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6392 = arg0;
		this.anInt6395 = arg5;
		this.anInt6386 = arg2;
		this.anInt6394 = arg6;
		this.anInt6387 = arg1;
		this.anInt6389 = arg3;
		this.anInt6391 = arg7;
		this.anInt6390 = arg4;
	}

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "(III)V")
	@Override
	public void method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(III)V")
	@Override
	public void method5707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt6392 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt6387 * arg1 >> 12;
		@Pc(30) int local30 = this.anInt6386 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt6389 * arg1 >> 12;
		@Pc(44) int local44 = arg0 * this.anInt6390 >> 12;
		@Pc(51) int local51 = this.anInt6395 * arg1 >> 12;
		@Pc(58) int local58 = arg0 * this.anInt6394 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt6391 >> 12;
		Static647.method9003(local30, local37, local51, local44, local16, local23, local65, local58, super.anInt6646);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
	@Override
	public void method5702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
