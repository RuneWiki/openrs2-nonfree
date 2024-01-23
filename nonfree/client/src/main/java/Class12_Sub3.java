import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
	private int anInt5742;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	private int anInt5738;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	private int anInt5745;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
	private int anInt5746;

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
	private int anInt5736;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
	private int anInt5735;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
	private int anInt5741;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	private int anInt5747;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class12_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5742 = arg7;
		this.anInt5738 = arg1;
		this.anInt5745 = arg3;
		this.anInt5746 = arg4;
		this.anInt5736 = arg6;
		this.anInt5735 = arg2;
		this.anInt5741 = arg5;
		this.anInt5747 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(III)V")
	@Override
	public void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V")
	@Override
	public void method4663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt5738 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt5735 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt5745 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt5747 * arg1 >> 12;
		@Pc(43) int local43 = this.anInt5746 * arg1 >> 12;
		@Pc(50) int local50 = this.anInt5736 * arg1 >> 12;
		@Pc(57) int local57 = arg0 * this.anInt5742 >> 12;
		@Pc(64) int local64 = arg0 * this.anInt5741 >> 12;
		Static309.method4584(local22, local43, local36, local57, local29, this.anInt5930, local50, local15, local64);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
