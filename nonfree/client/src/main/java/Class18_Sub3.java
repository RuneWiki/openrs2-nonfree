import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	private final int anInt1778;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
	private final int anInt1782;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
	private final int anInt1784;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	private final int anInt1777;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class18_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1778 = arg2;
		this.anInt1782 = arg0;
		this.anInt1784 = arg3;
		this.anInt1777 = arg1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	@Override
	public void method2849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1782 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1778 >> 12;
		@Pc(33) int local33 = arg1 * this.anInt1777 >> 12;
		@Pc(40) int local40 = this.anInt1784 * arg1 >> 12;
		Static12.method173(local10, super.anInt3164, local17, local33, super.anInt3162, super.anInt3161, local40);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)V")
	@Override
	public void method2850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt1782 >> 12;
		@Pc(22) int local22 = this.anInt1778 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt1777 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1784 >> 12;
		Static258.method4559(local22, super.anInt3164, local36, local29, local15);
	}
}
