import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class114_Sub2 extends Class114 {

	@OriginalMember(owner = "client!gfa", name = "j", descriptor = "I")
	private final int anInt4305;

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
	private final int anInt4301;

	@OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
	private final int anInt4304;

	@OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
	private final int anInt4306;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class114_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4305 = arg0;
		this.anInt4301 = arg1;
		this.anInt4304 = arg3;
		this.anInt4306 = arg2;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
	@Override
	public void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4305 >> 12;
		@Pc(17) int local17 = this.anInt4306 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4301 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt4304 >> 12;
		Static429.method6857(super.anInt7441, local24, local10, super.anInt7442, super.anInt7440, local17, local36);
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(III)V")
	@Override
	public void method6310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4305 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt4306 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt4301 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt4304 >> 12;
		Static339.method5848(super.anInt7442, super.anInt7440, local28, local35, local21, local10);
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(III)V")
	@Override
	public void method6309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4305 >> 12;
		@Pc(17) int local17 = this.anInt4306 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt4301 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt4304 >> 12;
		Static578.method7001(local17, super.anInt7441, local37, local10, local30);
	}
}
