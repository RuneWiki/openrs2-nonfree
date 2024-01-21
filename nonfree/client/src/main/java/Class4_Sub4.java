import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	private final int anInt3079;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	private final int anInt3077;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	private final int anInt3080;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	private final int anInt3078;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIII)V")
	public Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3079 = arg2;
		this.anInt3077 = arg3;
		this.anInt3080 = arg1;
		this.anInt3078 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BII)V")
	@Override
	public void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt3079 >> 12;
		@Pc(13) int local13 = arg1 * this.anInt3078 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3080 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt3077 >> 12;
		Static93.method2180(super.anInt3067, super.anInt3069, local6, local24, local36, local13);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3078 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt3079 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3080 >> 12;
		@Pc(36) int local36 = this.anInt3077 * arg1 >> 12;
		Static189.method3459(super.anInt3072, local24, local36, local17, local10);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt3079 * arg1 >> 12;
		@Pc(13) int local13 = this.anInt3078 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt3080 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt3077 * arg0 >> 12;
		Static118.method2561(super.anInt3067, super.anInt3072, local35, local28, super.anInt3069, local6, local13);
	}
}
