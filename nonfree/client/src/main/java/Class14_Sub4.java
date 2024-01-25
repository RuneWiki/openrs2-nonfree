import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	private final int anInt6455;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	private final int anInt6459;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
	private final int anInt6457;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	private final int anInt6453;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIII)V")
	public Class14_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6455 = arg1;
		this.anInt6459 = arg2;
		this.anInt6457 = arg3;
		this.anInt6453 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V")
	@Override
	public void method5440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6453 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt6459 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt6455 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt6457 >> 12;
		Static300.method5084(local10, super.anInt6450, local32, super.anInt6449, local39, local25);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BII)V")
	@Override
	public void method5442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6453 >> 12;
		@Pc(17) int local17 = this.anInt6459 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt6455 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt6457 * arg0 >> 12;
		Static175.method3469(local24, local17, super.anInt6452, local31, local10);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt6453 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt6459 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt6455 >> 12;
		@Pc(36) int local36 = this.anInt6457 * arg1 >> 12;
		Static7.method273(super.anInt6450, local29, local36, super.anInt6449, local22, local15, super.anInt6452);
	}
}
