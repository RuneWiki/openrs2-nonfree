import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class45_Sub4 extends Class45 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	private final int anInt3470;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	private final int anInt3469;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	private final int anInt3467;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	private final int anInt3471;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class45_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3470 = arg1;
		this.anInt3469 = arg0;
		this.anInt3467 = arg2;
		this.anInt3471 = arg3;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(BII)V")
	@Override
	public void method2629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt3467 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt3470 >> 12;
		@Pc(28) int local28 = this.anInt3469 * arg0 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt3471 >> 12;
		Static10.method221(super.anInt3461, super.anInt3465, local35, local14, local28, super.anInt3466, local21);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	@Override
	public void method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V")
	@Override
	public void method2628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3469 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3467 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3470 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt3471 >> 12;
		Static160.method2689(local24, local10, super.anInt3461, local39, local17);
	}
}
