import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!at", name = "p", descriptor = "I")
	private final int anInt380;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "I")
	private final int anInt376;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "I")
	private final int anInt377;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "I")
	private final int anInt384;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIIIII)V")
	public Class22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt380 = arg3;
		this.anInt376 = arg0;
		this.anInt377 = arg1;
		this.anInt384 = arg2;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt376 >> 12;
		@Pc(17) int local17 = this.anInt384 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt377 >> 12;
		@Pc(35) int local35 = this.anInt380 * arg1 >> 12;
		Static407.method6448(local10, local35, super.anInt7880, local28, local17);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V")
	@Override
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt376 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt384 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt377 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt380 >> 12;
		Static534.method7770(local31, super.anInt7880, super.anInt7878, local24, local10, super.anInt7882, local17);
	}
}
