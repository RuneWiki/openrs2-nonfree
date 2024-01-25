import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class134_Sub1 extends Class134 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	private final int anInt5904;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	private final int anInt5901;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	private final int anInt5899;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "I")
	private final int anInt5893;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	private final int anInt5900;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "I")
	private final int anInt5894;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "I")
	private final int anInt5898;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	private final int anInt5897;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class134_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5904 = arg4;
		this.anInt5901 = arg6;
		this.anInt5899 = arg3;
		this.anInt5893 = arg7;
		this.anInt5900 = arg0;
		this.anInt5894 = arg1;
		this.anInt5898 = arg2;
		this.anInt5897 = arg5;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)V")
	@Override
	public void method8052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	@Override
	public void method8051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5900 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5894 >> 12;
		@Pc(24) int local24 = this.anInt5898 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5899 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt5904 >> 12;
		@Pc(52) int local52 = arg1 * this.anInt5897 >> 12;
		@Pc(59) int local59 = this.anInt5901 * arg0 >> 12;
		@Pc(66) int local66 = arg1 * this.anInt5893 >> 12;
		Static290.method8801(super.anInt9222, local17, local31, local59, local10, local45, local24, local66, local52);
	}
}
