import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class57_Sub3 extends Class57 {

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
	private final int anInt5493;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	private final int anInt5494;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	private final int anInt5492;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	private final int anInt5489;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	private final int anInt5487;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	private final int anInt5495;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	private final int anInt5483;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	private final int anInt5491;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class57_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5493 = arg3;
		this.anInt5494 = arg7;
		this.anInt5492 = arg2;
		this.anInt5489 = arg1;
		this.anInt5487 = arg0;
		this.anInt5495 = arg4;
		this.anInt5483 = arg6;
		this.anInt5491 = arg5;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	@Override
	public void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)V")
	@Override
	public void method4807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5487 * arg0 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt5489 >> 12;
		@Pc(29) int local29 = this.anInt5492 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt5493 * arg1 >> 12;
		@Pc(43) int local43 = this.anInt5495 * arg0 >> 12;
		@Pc(50) int local50 = this.anInt5491 * arg1 >> 12;
		@Pc(57) int local57 = this.anInt5483 * arg0 >> 12;
		@Pc(64) int local64 = this.anInt5494 * arg1 >> 12;
		Static181.method2509(local36, local22, local50, local43, super.anInt6158, local10, local57, local64, local29);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
