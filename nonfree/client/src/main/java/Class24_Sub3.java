import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class24_Sub3 extends Class24 {

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	private final int anInt9274;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
	private final int anInt9281;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
	private final int anInt9279;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
	private final int anInt9278;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IIIIII)V")
	public Class24_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt9274 = arg3;
		this.anInt9281 = arg2;
		this.anInt9279 = arg0;
		this.anInt9278 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BII)V")
	@Override
	public void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt9279 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt9281 >> 12;
		@Pc(24) int local24 = this.anInt9278 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt9274 >> 12;
		Static186.method2661(local39, local10, super.anInt9953, local17, local24);
	}
}
