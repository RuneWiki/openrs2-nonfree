import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
	private final int anInt2304;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
	private final int anInt2302;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	private final int anInt2306;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	private final int anInt2303;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class74_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2304 = arg1;
		this.anInt2302 = arg3;
		this.anInt2306 = arg0;
		this.anInt2303 = arg2;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
	@Override
	public void method8221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(IBI)V")
	@Override
	public void method8219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2306 >> 12;
		@Pc(17) int local17 = this.anInt2303 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2304 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt2302 >> 12;
		Static582.method7834(local39, local17, local24, super.anInt9644, local10);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2306 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2303 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2304 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2302 * arg1 >> 12;
		Static241.method3896(super.anInt9645, super.anInt9644, super.anInt9646, local10, local31, local17, local24);
	}
}
