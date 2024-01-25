import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
	private final int anInt1192;

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
	private final int anInt1186;

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
	private final int anInt1189;

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
	private final int anInt1188;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIIIII)V")
	public Class37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1192 = arg3;
		this.anInt1186 = arg0;
		this.anInt1189 = arg2;
		this.anInt1188 = arg1;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BII)V")
	@Override
	public void method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt1186 >> 12;
		@Pc(21) int local21 = this.anInt1189 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt1188 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt1192 >> 12;
		Static274.method4155(super.anInt9376, local14, local35, local28, super.anInt9377, super.anInt9375, local21);
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(III)V")
	@Override
	public void method7782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1186 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt1189 >> 12;
		@Pc(30) int local30 = this.anInt1188 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt1192 * arg1 >> 12;
		Static199.method3319(local23, local37, super.anInt9377, local30, local10);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)V")
	@Override
	public void method7778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1186 * arg1 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1189 >> 12;
		@Pc(31) int local31 = this.anInt1188 * arg0 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt1192 >> 12;
		Static22.method389(local31, super.anInt9375, local38, local10, local24, super.anInt9376);
	}
}
