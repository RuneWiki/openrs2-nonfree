import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class221_Sub1 extends Class221 {

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	private final int anInt6193;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
	private final int anInt6196;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	private final int anInt6192;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
	private final int anInt6199;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIII)V")
	public Class221_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6193 = arg0;
		this.anInt6196 = arg3;
		this.anInt6192 = arg1;
		this.anInt6199 = arg2;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	@Override
	public void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt6193 >> 12;
		@Pc(21) int local21 = this.anInt6199 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt6192 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt6196 >> 12;
		Static171.method7692(super.anInt8716, local35, local28, local14, local21);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6193 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6199 >> 12;
		@Pc(32) int local32 = this.anInt6192 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt6196 * arg1 >> 12;
		Static282.method4204(local10, local17, super.anInt8716, local32, local39, super.anInt8713, super.anInt8717);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
	@Override
	public void method7276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6193 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt6199 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt6192 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt6196 >> 12;
		Static357.method5302(local17, local24, super.anInt8713, local36, super.anInt8717, local10);
	}
}
