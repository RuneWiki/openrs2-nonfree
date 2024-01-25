import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
	private final int anInt7507;

	@OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
	private final int anInt7503;

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
	private final int anInt7505;

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
	private final int anInt7504;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(IIIIII)V")
	public Class22_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7507 = arg1;
		this.anInt7503 = arg0;
		this.anInt7505 = arg2;
		this.anInt7504 = arg3;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt7503 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt7505 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt7507 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt7504 >> 12;
		Static393.method6222(super.anInt7882, local25, local18, local32, local39);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)V")
	@Override
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
