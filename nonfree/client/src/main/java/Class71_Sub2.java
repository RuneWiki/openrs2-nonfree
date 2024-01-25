import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
	private final int anInt3350;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
	private final int anInt3354;

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
	private final int anInt3349;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
	private final int anInt3346;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(IIIIIII)V")
	public Class71_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3350 = arg3;
		this.anInt3354 = arg1;
		this.anInt3349 = arg2;
		this.anInt3346 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(III)V")
	@Override
	public void method5893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt3346 >> 12;
		@Pc(22) int local22 = this.anInt3349 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt3354 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt3350 * arg0 >> 12;
		Static147.method7912(super.anInt6720, local29, local36, local15, local22, super.anInt6719, super.anInt6721);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3346 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3349 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3354 >> 12;
		@Pc(38) int local38 = this.anInt3350 * arg1 >> 12;
		Static191.method2974(local10, super.anInt6720, local38, local17, local24);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3346 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt3349 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt3354 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt3350 >> 12;
		Static153.method2631(local37, local23, local30, local10, super.anInt6719, super.anInt6721);
	}
}
