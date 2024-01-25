import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	private final int anInt4570;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
	private final int anInt4566;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	private final int anInt4559;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	private final int anInt4564;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	private final int anInt4560;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
	private final int anInt4562;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	private final int anInt4563;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	private final int anInt4568;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4570 = arg7;
		this.anInt4566 = arg6;
		this.anInt4559 = arg2;
		this.anInt4564 = arg4;
		this.anInt4560 = arg0;
		this.anInt4562 = arg5;
		this.anInt4563 = arg3;
		this.anInt4568 = arg1;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V")
	@Override
	public void method7276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt4560 * arg1 >> 12;
		@Pc(20) int local20 = arg0 * this.anInt4568 >> 12;
		@Pc(27) int local27 = arg1 * this.anInt4559 >> 12;
		@Pc(34) int local34 = this.anInt4563 * arg0 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt4564 >> 12;
		@Pc(48) int local48 = arg0 * this.anInt4562 >> 12;
		@Pc(55) int local55 = arg1 * this.anInt4566 >> 12;
		@Pc(62) int local62 = this.anInt4570 * arg0 >> 12;
		Static387.method5343(local27, local20, local41, local13, local34, super.anInt8895, local62, local55, local48);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
