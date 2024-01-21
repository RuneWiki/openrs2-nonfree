import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class24_Sub3 extends Class24 {

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	private final int anInt1291;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "I")
	private final int anInt1290;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "I")
	private final int anInt1283;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "I")
	private final int anInt1289;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIII)V")
	public Class24_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1291 = arg0;
		this.anInt1290 = arg3;
		this.anInt1283 = arg2;
		this.anInt1289 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1291 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1289 >> 12;
		@Pc(24) int local24 = this.anInt1283 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt1290 * arg1 >> 12;
		Static165.method2409(local10, local31, local24, super.anInt4287, local17);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
	@Override
	public void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
