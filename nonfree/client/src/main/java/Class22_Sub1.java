import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	private final int anInt1368;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
	private final int anInt1381;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
	private final int anInt1375;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	private final int anInt1369;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1368 = arg3;
		this.anInt1381 = arg1;
		this.anInt1375 = arg2;
		this.anInt1369 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt1369 * arg0 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt1381 >> 12;
		@Pc(29) int local29 = this.anInt1375 * arg0 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1368 >> 12;
		Static55.method1064(local15, super.anInt4159, super.anInt4156, local36, local22, super.anInt4155, local29);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
	@Override
	public void method3215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)V")
	@Override
	public void method3216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1375 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt1369 >> 12;
		@Pc(32) int local32 = this.anInt1381 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt1368 * arg0 >> 12;
		Static93.method1679(local10, local25, local32, local39, super.anInt4156);
	}
}
