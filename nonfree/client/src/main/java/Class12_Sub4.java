import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
	private int anInt5938;

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
	private int anInt5943;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
	private int anInt5937;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
	private int anInt5939;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIII)V")
	public Class12_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5938 = arg3;
		this.anInt5943 = arg2;
		this.anInt5937 = arg0;
		this.anInt5939 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	@Override
	public void method4663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt5937 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5939 >> 12;
		@Pc(24) int local24 = this.anInt5938 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt5943 * arg0 >> 12;
		Static245.method1899(local39, local24, local6, this.anInt5927, local17);
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(III)V")
	@Override
	public void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5937 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt5943 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5939 >> 12;
		@Pc(31) int local31 = this.anInt5938 * arg1 >> 12;
		Static64.method2451(this.anInt5930, this.anInt5933, local24, local10, this.anInt5927, local17, local31);
	}
}
