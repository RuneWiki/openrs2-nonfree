import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	private int anInt1216;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	private int anInt1217;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "I")
	private int anInt1218;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	private int anInt1212;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIII)V")
	public Class31_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1216 = arg1;
		this.anInt1217 = arg0;
		this.anInt1218 = arg2;
		this.anInt1212 = arg3;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)V")
	@Override
	public void method4431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt1217 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt1218 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt1212 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt1216 >> 12;
		Static300.method4572(this.anInt5797, local25, local6, local39, local32);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
