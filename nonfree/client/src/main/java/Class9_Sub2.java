import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	private final int anInt6781;

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
	private final int anInt6789;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	private final int anInt6780;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	private final int anInt6779;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
	private final int anInt6783;

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
	private final int anInt6790;

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
	private final int anInt6777;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	private final int anInt6784;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class9_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6781 = arg0;
		this.anInt6789 = arg5;
		this.anInt6780 = arg3;
		this.anInt6779 = arg2;
		this.anInt6783 = arg7;
		this.anInt6790 = arg1;
		this.anInt6777 = arg4;
		this.anInt6784 = arg6;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(IIB)V")
	@Override
	public void method7305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	@Override
	public void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6781 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6790 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt6779 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt6780 >> 12;
		@Pc(38) int local38 = this.anInt6777 * arg0 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt6789 >> 12;
		@Pc(52) int local52 = this.anInt6784 * arg0 >> 12;
		@Pc(59) int local59 = arg1 * this.anInt6783 >> 12;
		Static441.method6443(local31, local52, local45, local38, local17, super.anInt8564, local59, local10, local24);
	}
}
