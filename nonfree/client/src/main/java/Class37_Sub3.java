import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	private final int anInt8344;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
	private final int anInt8341;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	private final int anInt8340;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	private final int anInt8343;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIIII)V")
	public Class37_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt8344 = arg3;
		this.anInt8341 = arg1;
		this.anInt8340 = arg0;
		this.anInt8343 = arg2;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
	@Override
	public void method7778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 * this.anInt8340 >> 12;
		@Pc(20) int local20 = this.anInt8343 * arg1 >> 12;
		@Pc(27) int local27 = this.anInt8341 * arg0 >> 12;
		@Pc(34) int local34 = arg0 * this.anInt8344 >> 12;
		Static9.method3876(super.anInt9376, local20, local13, local34, local27);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BII)V")
	@Override
	public void method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)V")
	@Override
	public void method7782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
