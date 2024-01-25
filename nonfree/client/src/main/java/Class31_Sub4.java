import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class31_Sub4 extends Class31 {

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	private final int anInt3965;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	private final int anInt3960;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	private final int anInt3967;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	private final int anInt3959;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIII)V")
	public Class31_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt3965 = arg0;
		this.anInt3960 = arg3;
		this.anInt3967 = arg2;
		this.anInt3959 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3965 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt3967 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3959 >> 12;
		@Pc(37) int local37 = this.anInt3960 * arg0 >> 12;
		Static459.method5987(local24, super.anInt3958, local37, local10, local17);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIB)V")
	@Override
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
