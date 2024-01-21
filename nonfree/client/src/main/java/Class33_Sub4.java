import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class33_Sub4 extends Class33 {

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
	private final int anInt3064;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	private final int anInt3068;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
	private final int anInt3070;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
	private final int anInt3074;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIII)V")
	public Class33_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3064 = arg2;
		this.anInt3068 = arg0;
		this.anInt3070 = arg3;
		this.anInt3074 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)V")
	@Override
	public void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3068 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt3064 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt3074 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt3070 * arg1 >> 12;
		Static76.method1147(super.anInt3057, local29, local17, local36, local10);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
	@Override
	public void method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	@Override
	public void method2267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
