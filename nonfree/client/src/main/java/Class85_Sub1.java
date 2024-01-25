import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	private final int anInt2809;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	private final int anInt2807;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
	private final int anInt2810;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
	private final int anInt2805;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class85_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2809 = arg1;
		this.anInt2807 = arg2;
		this.anInt2810 = arg0;
		this.anInt2805 = arg3;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt2810 >> 12;
		@Pc(25) int local25 = this.anInt2807 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt2809 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt2805 >> 12;
		Static59.method1262(super.anInt7166, super.anInt7168, local18, local32, local39, local25, super.anInt7170);
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)V")
	@Override
	public void method5867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2810 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2807 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt2809 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt2805 * arg1 >> 12;
		Static39.method719(local30, local10, local17, super.anInt7166, local37);
	}
}
