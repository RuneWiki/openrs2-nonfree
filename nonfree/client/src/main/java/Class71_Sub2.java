import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
	private final int anInt2927;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
	private final int anInt2922;

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
	private final int anInt2921;

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
	private final int anInt2923;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(IIIIII)V")
	public Class71_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2927 = arg1;
		this.anInt2922 = arg2;
		this.anInt2921 = arg0;
		this.anInt2923 = arg3;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)V")
	@Override
	public void method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BII)V")
	@Override
	public void method6990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt2921 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt2922 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt2927 >> 12;
		@Pc(39) int local39 = this.anInt2923 * arg1 >> 12;
		Static530.method7539(local18, local32, super.anInt8466, local39, local25);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
