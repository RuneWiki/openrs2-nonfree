import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class173_Sub2 extends Class173 {

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
	public static final int[] anIntArray333 = new int[200];

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_173 = new Class145(32, 3);

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public static int anInt4846 = -1;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	private final int anInt4843;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	private final int anInt4845;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	private final int anInt4839;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	private final int anInt4840;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V", line = 58)
	public Class173_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4843 = arg1;
		this.anInt4845 = arg0;
		this.anInt4839 = arg2;
		this.anInt4840 = arg3;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V", line = 15)
	@Override
	public void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V", line = 31)
	@Override
	public void method6252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4845 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4839 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt4843 >> 12;
		@Pc(36) int local36 = this.anInt4840 * arg1 >> 12;
		Static289.method5312(local10, super.anInt6984, super.anInt6983, local29, local17, local36, super.anInt6985);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V", line = 71)
	@Override
	public void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4845 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt4839 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt4843 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt4840 * arg0 >> 12;
		Static39.method5750(local31, local17, local10, local24, super.anInt6984);
	}
}
