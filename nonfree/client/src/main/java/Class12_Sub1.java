import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!al", name = "q", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!al", name = "v", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIII)V")
	public Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt179 = arg3;
		this.anInt177 = arg2;
		this.anInt182 = arg0;
		this.anInt184 = arg1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
	@Override
	public void method4663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt182 >> 12;
		@Pc(25) int local25 = this.anInt177 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt179 >> 12;
		@Pc(39) int local39 = this.anInt184 * arg0 >> 12;
		Static60.method1023(local32, local18, this.anInt5930, local39, local25, this.anInt5933);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt177 >> 12;
		@Pc(25) int local25 = this.anInt182 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt184 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt179 * arg1 >> 12;
		Static46.method817(this.anInt5927, local18, local32, local39, local25);
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(III)V")
	@Override
	public void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt182 >> 12;
		@Pc(17) int local17 = this.anInt177 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt184 >> 12;
		@Pc(31) int local31 = this.anInt179 * arg1 >> 12;
		Static221.method3496(this.anInt5930, local31, local24, this.anInt5927, local10, this.anInt5933, local17);
	}
}
