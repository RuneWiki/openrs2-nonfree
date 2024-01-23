import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	private final int anInt2099;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	private final int anInt2093;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
	private final int anInt2102;

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
	private final int anInt2097;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIII)V")
	public Class13_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2099 = arg2;
		this.anInt2093 = arg3;
		this.anInt2102 = arg0;
		this.anInt2097 = arg1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	@Override
	public void method2676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)V")
	@Override
	public void method2677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2102 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2099 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2097 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt2093 >> 12;
		Static30.method429(local17, local31, local10, super.anInt3322, local24);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
	@Override
	public void method2680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
