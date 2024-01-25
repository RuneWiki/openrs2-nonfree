import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class57_Sub4 extends Class57 {

	@OriginalMember(owner = "client!si", name = "m", descriptor = "I")
	private final int anInt6167;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "I")
	private final int anInt6160;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "I")
	private final int anInt6164;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	private final int anInt6163;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIII)V")
	public Class57_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6167 = arg3;
		this.anInt6160 = arg1;
		this.anInt6164 = arg0;
		this.anInt6163 = arg2;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt6164 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt6163 >> 12;
		@Pc(29) int local29 = this.anInt6160 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt6167 >> 12;
		Static208.method2801(local36, local29, local15, super.anInt6156, local22, super.anInt6158, super.anInt6157);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
	@Override
	public void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt6164 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt6163 >> 12;
		@Pc(28) int local28 = this.anInt6160 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt6167 * arg1 >> 12;
		Static324.method4383(local35, local28, super.anInt6157, local21, local14);
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V")
	@Override
	public void method4807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
