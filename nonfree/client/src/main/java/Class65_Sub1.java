import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	private final int anInt1644;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "I")
	private final int anInt1650;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	private final int anInt1649;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	private final int anInt1645;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIII)V")
	public Class65_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1644 = arg2;
		this.anInt1650 = arg3;
		this.anInt1649 = arg1;
		this.anInt1645 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(III)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	@Override
	public void method4775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(III)V")
	@Override
	public void method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1645 >> 12;
		@Pc(17) int local17 = this.anInt1644 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt1649 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt1650 * arg0 >> 12;
		Static149.method5441(local10, local24, local17, super.anInt5514, local31);
	}
}
