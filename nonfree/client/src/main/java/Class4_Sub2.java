import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	private final int anInt1099;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "I")
	private final int anInt1097;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	private final int anInt1100;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	private final int anInt1095;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIII)V")
	public Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1099 = arg1;
		this.anInt1097 = arg3;
		this.anInt1100 = arg2;
		this.anInt1095 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)V")
	@Override
	public void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt1095 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt1100 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt1099 >> 12;
		@Pc(39) int local39 = this.anInt1097 * arg0 >> 12;
		Static184.method3426(super.anInt3069, local32, local39, local25, local18);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
