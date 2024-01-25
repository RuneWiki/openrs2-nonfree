import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
	private final int anInt1177;

	@OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
	private final int anInt1173;

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
	private final int anInt1171;

	@OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
	private final int anInt1174;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(IIIIIII)V")
	public Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1177 = arg2;
		this.anInt1173 = arg0;
		this.anInt1171 = arg3;
		this.anInt1174 = arg1;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)V")
	@Override
	public void method7659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt1173 * arg1 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1177 >> 12;
		@Pc(31) int local31 = this.anInt1174 * arg0 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt1171 >> 12;
		Static259.method4096(local24, local31, super.anInt9988, super.anInt9990, local38, local17, super.anInt9989);
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(III)V")
	@Override
	public void method7660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 * this.anInt1173 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt1177 >> 12;
		@Pc(30) int local30 = this.anInt1174 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt1171 * arg1 >> 12;
		Static197.method3233(local37, local16, local23, local30, super.anInt9990);
	}
}
