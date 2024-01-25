import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	private final int anInt1438;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	private final int anInt1443;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	private final int anInt1439;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	private final int anInt1440;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIII)V")
	public Class26_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1438 = arg3;
		this.anInt1443 = arg0;
		this.anInt1439 = arg2;
		this.anInt1440 = arg1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1443 >> 12;
		@Pc(17) int local17 = this.anInt1439 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt1440 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt1438 >> 12;
		Static546.method8351(local29, local17, super.anInt4745, local36, local10);
	}
}
