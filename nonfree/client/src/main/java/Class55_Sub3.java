import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class55_Sub3 extends Class55 {

	@OriginalMember(owner = "client!og", name = "m", descriptor = "I")
	private final int anInt6827;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	private final int anInt6828;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "I")
	private final int anInt6830;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	private final int anInt6826;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIIII)V")
	public Class55_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6827 = arg1;
		this.anInt6828 = arg2;
		this.anInt6830 = arg0;
		this.anInt6826 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	@Override
	public void method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6830 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6828 >> 12;
		@Pc(24) int local24 = this.anInt6827 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt6826 >> 12;
		Static513.method7231(super.anInt7982, local10, local24, local31, local17);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(BII)V")
	@Override
	public void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6830 >> 12;
		@Pc(17) int local17 = this.anInt6828 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt6827 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt6826 >> 12;
		Static417.method5961(local10, super.anInt7978, super.anInt7982, local24, local31, super.anInt7977, local17);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
	@Override
	public void method6991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6830 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6828 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt6827 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt6826 >> 12;
		Static242.method6990(local31, super.anInt7977, local10, local17, super.anInt7978, local24);
	}
}
