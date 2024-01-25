import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class35_Sub4 extends Class35 {

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
	private final int anInt9253;

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
	private final int anInt9256;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
	private final int anInt9251;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	private final int anInt9252;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class35_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt9253 = arg0;
		this.anInt9256 = arg3;
		this.anInt9251 = arg2;
		this.anInt9252 = arg1;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(III)V")
	@Override
	public void method7551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt9253 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt9251 >> 12;
		@Pc(32) int local32 = this.anInt9252 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt9256 >> 12;
		Static565.method7946(local32, local18, local25, local39, super.anInt9246);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	@Override
	public void method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt9253 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt9251 >> 12;
		@Pc(28) int local28 = this.anInt9252 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt9256 * arg1 >> 12;
		Static646.method8796(local17, super.anInt9245, local35, local28, super.anInt9243, local10, super.anInt9246);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)V")
	@Override
	public void method7552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
