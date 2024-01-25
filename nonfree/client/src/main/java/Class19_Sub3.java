import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class19_Sub3 extends Class19 {

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	private final int anInt7649;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	private final int anInt7643;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
	private final int anInt7644;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
	private final int anInt7641;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IIIIII)V")
	public Class19_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7649 = arg1;
		this.anInt7643 = arg0;
		this.anInt7644 = arg3;
		this.anInt7641 = arg2;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7643 >> 12;
		@Pc(17) int local17 = this.anInt7641 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt7649 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt7644 * arg0 >> 12;
		Static481.method6774(super.anInt8861, local17, local10, local39, local24);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(III)V")
	@Override
	public void method7064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
