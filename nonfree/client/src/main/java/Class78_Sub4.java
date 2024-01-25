import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class78_Sub4 extends Class78 {

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	private final int anInt7673;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
	private final int anInt7676;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	private final int anInt7678;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
	private final int anInt7679;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class78_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7673 = arg3;
		this.anInt7676 = arg1;
		this.anInt7678 = arg0;
		this.anInt7679 = arg2;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
	@Override
	public void method6318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt7678 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt7679 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt7676 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt7673 >> 12;
		Static406.method5727(super.anInt7671, local22, local36, local10, local29);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V")
	@Override
	public void method6316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7678 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt7679 >> 12;
		@Pc(28) int local28 = this.anInt7676 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt7673 >> 12;
		Static593.method7896(super.anInt7669, local35, super.anInt7671, local21, local28, super.anInt7670, local10);
	}
}
