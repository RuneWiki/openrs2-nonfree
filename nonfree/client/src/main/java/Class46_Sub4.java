import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class46_Sub4 extends Class46 {

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	private final int anInt7300;

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
	private final int anInt7305;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
	private final int anInt7299;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
	private final int anInt7298;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
	private final int anInt7303;

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
	private final int anInt7302;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
	private final int anInt7296;

	@OriginalMember(owner = "client!wq", name = "x", descriptor = "I")
	private final int anInt7307;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class46_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7300 = arg1;
		this.anInt7305 = arg5;
		this.anInt7299 = arg4;
		this.anInt7298 = arg6;
		this.anInt7303 = arg0;
		this.anInt7302 = arg3;
		this.anInt7296 = arg2;
		this.anInt7307 = arg7;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
	@Override
	public void method5893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
	@Override
	public void method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt7303 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt7300 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt7296 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt7302 >> 12;
		@Pc(38) int local38 = this.anInt7299 * arg1 >> 12;
		@Pc(45) int local45 = this.anInt7305 * arg0 >> 12;
		@Pc(57) int local57 = this.anInt7298 * arg1 >> 12;
		@Pc(64) int local64 = this.anInt7307 * arg0 >> 12;
		Static241.method3460(local24, local10, local17, local31, local57, local45, local64, super.anInt7287, local38);
	}
}
