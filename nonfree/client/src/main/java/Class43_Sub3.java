import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	private final int anInt7065;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
	private final int anInt7063;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
	private final int anInt7060;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
	private final int anInt7058;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIII)V")
	public Class43_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7065 = arg1;
		this.anInt7063 = arg3;
		this.anInt7060 = arg0;
		this.anInt7058 = arg2;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)V")
	@Override
	public void method7033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(III)V")
	@Override
	public void method7034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
	@Override
	public void method7030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt7060 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt7058 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt7065 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt7063 >> 12;
		Static254.method6587(local18, local32, local39, super.anInt8586, local25);
	}
}
