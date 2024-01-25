import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class116_Sub3 extends Class116 {

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	private final int anInt6928;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
	private final int anInt6932;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	private final int anInt6925;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	private final int anInt6934;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIII)V")
	public Class116_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6928 = arg3;
		this.anInt6932 = arg1;
		this.anInt6925 = arg2;
		this.anInt6934 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IBI)V")
	@Override
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6934 >> 12;
		@Pc(17) int local17 = this.anInt6925 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt6932 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt6928 >> 12;
		Static208.method3305(local39, local32, super.anInt7709, local10, local17);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6934 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt6925 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt6932 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt6928 >> 12;
		Static61.method1139(super.anInt7706, local28, local35, local21, super.anInt7710, super.anInt7709, local10);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
