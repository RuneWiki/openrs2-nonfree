import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class51_Sub4 extends Class51 {

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
	private final int anInt7232;

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
	private final int anInt7236;

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
	private final int anInt7233;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
	private final int anInt7231;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(IIIIIII)V")
	public Class51_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7232 = arg0;
		this.anInt7236 = arg3;
		this.anInt7233 = arg1;
		this.anInt7231 = arg2;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)V")
	@Override
	public void method5807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = this.anInt7232 * arg0 >> 12;
		@Pc(26) int local26 = this.anInt7231 * arg0 >> 12;
		@Pc(33) int local33 = arg1 * this.anInt7233 >> 12;
		@Pc(40) int local40 = arg1 * this.anInt7236 >> 12;
		Static188.method2766(super.anInt7226, super.anInt7223, local19, local40, local33, super.anInt7228, local26);
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(III)V")
	@Override
	public void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7232 >> 12;
		@Pc(17) int local17 = this.anInt7231 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt7233 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt7236 >> 12;
		Static189.method2768(super.anInt7226, local24, local17, local10, local31);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = this.anInt7232 * arg0 >> 12;
		@Pc(26) int local26 = this.anInt7231 * arg0 >> 12;
		@Pc(33) int local33 = this.anInt7233 * arg1 >> 12;
		@Pc(40) int local40 = this.anInt7236 * arg1 >> 12;
		Static385.method5097(local40, local33, super.anInt7223, local26, super.anInt7228, local19);
	}
}
