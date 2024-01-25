import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
	private final int anInt1145;

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
	private final int anInt1147;

	@OriginalMember(owner = "client!caa", name = "z", descriptor = "I")
	private final int anInt1154;

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
	private final int anInt1146;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(IIIIII)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1145 = arg0;
		this.anInt1147 = arg1;
		this.anInt1154 = arg2;
		this.anInt1146 = arg3;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)V")
	@Override
	public void method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1145 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1154 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt1147 >> 12;
		@Pc(36) int local36 = this.anInt1146 * arg1 >> 12;
		Static582.method7927(local36, local29, super.anInt10310, local17, local10);
	}
}
