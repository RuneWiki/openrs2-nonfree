import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
	private final int anInt1303;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
	private final int anInt1296;

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "I")
	private final int anInt1293;

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
	private final int anInt1299;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(IIIIIII)V")
	public Class55_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1303 = arg3;
		this.anInt1296 = arg1;
		this.anInt1293 = arg0;
		this.anInt1299 = arg2;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(BII)V")
	@Override
	public void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt1293 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt1299 >> 12;
		@Pc(28) int local28 = this.anInt1296 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt1303 >> 12;
		Static230.method3908(super.anInt7977, super.anInt7978, super.anInt7982, local35, local28, local21, local14);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)V")
	@Override
	public void method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1293 >> 12;
		@Pc(23) int local23 = this.anInt1299 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt1296 >> 12;
		@Pc(37) int local37 = this.anInt1303 * arg1 >> 12;
		Static219.method3799(local30, local23, local10, local37, super.anInt7982);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BII)V")
	@Override
	public void method6991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
