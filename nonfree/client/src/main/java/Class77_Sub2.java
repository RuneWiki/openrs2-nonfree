import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
	private final int anInt4104;

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
	private final int anInt4109;

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
	private final int anInt4108;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
	private final int anInt4110;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIIIII)V")
	public Class77_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4104 = arg0;
		this.anInt4109 = arg2;
		this.anInt4108 = arg1;
		this.anInt4110 = arg3;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(IBI)V")
	@Override
	public void method5256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4104 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt4109 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4108 >> 12;
		@Pc(38) int local38 = this.anInt4110 * arg1 >> 12;
		Static267.method4543(local38, super.anInt6155, local10, local31, local24);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt4104 >> 12;
		@Pc(22) int local22 = this.anInt4109 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt4108 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt4110 >> 12;
		Static225.method4047(local29, local22, local36, super.anInt6154, super.anInt6157, local15);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4104 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt4109 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt4108 >> 12;
		@Pc(37) int local37 = this.anInt4110 * arg1 >> 12;
		Static225.method4048(super.anInt6155, super.anInt6157, local30, local23, local37, super.anInt6154, local10);
	}
}
