import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class141_Sub2 extends Class141 {

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
	private final int anInt7106;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	private final int anInt7105;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	private final int anInt7100;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	private final int anInt7099;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIIII)V")
	public Class141_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7106 = arg1;
		this.anInt7105 = arg2;
		this.anInt7100 = arg3;
		this.anInt7099 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt7099 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt7105 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt7106 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt7100 * arg1 >> 12;
		Static501.method7400(super.anInt8955, local30, local23, super.anInt8957, local16, super.anInt8951, local37);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)V")
	@Override
	public void method7715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7099 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt7105 >> 12;
		@Pc(28) int local28 = this.anInt7106 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt7100 >> 12;
		Static80.method1870(local14, super.anInt8957, local35, local28, local21);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	@Override
	public void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
