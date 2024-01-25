import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	private final int anInt1239;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	private final int anInt1240;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	private final int anInt1238;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "I")
	private final int anInt1241;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	private final int anInt1237;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	private final int anInt1236;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	private final int anInt1235;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "I")
	private final int anInt1242;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt1239 = arg4;
		this.anInt1240 = arg1;
		this.anInt1238 = arg2;
		this.anInt1241 = arg6;
		this.anInt1237 = arg7;
		this.anInt1236 = arg5;
		this.anInt1235 = arg3;
		this.anInt1242 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
	@Override
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1242 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt1240 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt1238 >> 12;
		@Pc(37) int local37 = this.anInt1235 * arg1 >> 12;
		@Pc(44) int local44 = arg0 * this.anInt1239 >> 12;
		@Pc(51) int local51 = arg1 * this.anInt1236 >> 12;
		@Pc(58) int local58 = arg0 * this.anInt1241 >> 12;
		@Pc(65) int local65 = this.anInt1237 * arg1 >> 12;
		Static95.method2185(local10, super.anInt5256, local44, local51, local17, local65, local37, local30, local58);
	}
}
