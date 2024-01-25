import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class141_Sub1 extends Class141 {

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	private final int anInt4094;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	private final int anInt4093;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
	private final int anInt4098;

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
	private final int anInt4090;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIII)V")
	public Class141_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4094 = arg1;
		this.anInt4093 = arg0;
		this.anInt4098 = arg3;
		this.anInt4090 = arg2;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	@Override
	public void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt4093 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt4090 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt4094 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt4098 >> 12;
		Static439.method6843(local24, local17, local31, super.anInt8951, local10);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)V")
	@Override
	public void method7715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
