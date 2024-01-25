import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class62_Sub3 extends Class62 {

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "I")
	private final int anInt8120;

	@OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
	private final int anInt8117;

	@OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
	private final int anInt8119;

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
	private final int anInt8122;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(IIIIIII)V")
	public Class62_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8120 = arg3;
		this.anInt8117 = arg0;
		this.anInt8119 = arg2;
		this.anInt8122 = arg1;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8117 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt8119 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt8122 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt8120 * arg1 >> 12;
		Static407.method5834(super.anInt8329, local21, local10, local35, super.anInt8333, super.anInt8330, local28);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V")
	@Override
	public void method6729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(III)V")
	@Override
	public void method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 * this.anInt8117 >> 12;
		@Pc(20) int local20 = arg0 * this.anInt8119 >> 12;
		@Pc(27) int local27 = this.anInt8122 * arg1 >> 12;
		@Pc(34) int local34 = this.anInt8120 * arg1 >> 12;
		Static543.method7385(local27, super.anInt8333, local20, local13, local34);
	}
}
