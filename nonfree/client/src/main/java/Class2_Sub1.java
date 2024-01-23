import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	private int anInt24;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
	private int anInt32;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
	private int anInt25;

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
	private int anInt33;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt24 = arg0;
		this.anInt32 = arg3;
		this.anInt25 = arg2;
		this.anInt33 = arg1;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IBI)V")
	@Override
	public void method4158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * this.anInt25 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt33 >> 12;
		@Pc(31) int local31 = this.anInt24 * arg0 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt32 >> 12;
		Static301.method4861(this.anInt4977, local31, local17, this.anInt4978, local24, this.anInt4979, local38);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt25 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt33 >> 12;
		@Pc(32) int local32 = this.anInt24 * arg0 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt32 >> 12;
		Static170.method2817(local39, local18, local25, this.anInt4977, local32);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
	@Override
	public void method4157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
