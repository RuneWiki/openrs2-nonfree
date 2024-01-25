import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class71_Sub3 extends Class71 {

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
	private final int anInt7934;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	private final int anInt7929;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	private final int anInt7931;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	private final int anInt7933;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIII)V")
	public Class71_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7934 = arg3;
		this.anInt7929 = arg2;
		this.anInt7931 = arg1;
		this.anInt7933 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	@Override
	public void method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt7933 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt7929 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt7931 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt7934 * arg1 >> 12;
		Static244.method4644(local32, local18, super.anInt8462, local25, local39);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt7933 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt7929 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt7931 >> 12;
		@Pc(35) int local35 = this.anInt7934 * arg0 >> 12;
		Static376.method5969(local28, local10, super.anInt8466, local35, super.anInt8462, local17, super.anInt8461);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
	@Override
	public void method6990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
