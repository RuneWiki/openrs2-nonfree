import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class155_Sub3 extends Class155 {

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
	private final int anInt5512;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
	private final int anInt5510;

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
	private final int anInt5517;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	private final int anInt5509;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
	private final int anInt5514;

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
	private final int anInt5515;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	private final int anInt5507;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	private final int anInt5511;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class155_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5512 = arg7;
		this.anInt5510 = arg3;
		this.anInt5517 = arg5;
		this.anInt5509 = arg6;
		this.anInt5514 = arg0;
		this.anInt5515 = arg1;
		this.anInt5507 = arg2;
		this.anInt5511 = arg4;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BII)V")
	@Override
	public void method5523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5514 >> 12;
		@Pc(17) int local17 = this.anInt5515 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5507 >> 12;
		@Pc(38) int local38 = this.anInt5510 * arg1 >> 12;
		@Pc(45) int local45 = this.anInt5511 * arg0 >> 12;
		@Pc(52) int local52 = arg1 * this.anInt5517 >> 12;
		@Pc(59) int local59 = arg0 * this.anInt5509 >> 12;
		@Pc(66) int local66 = this.anInt5512 * arg1 >> 12;
		Static284.method4129(local66, local17, local24, super.anInt6668, local38, local59, local45, local52, local10);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
	@Override
	public void method5520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
