import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class79_Sub3 extends Class79 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	private final int anInt6766;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	private final int anInt6768;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	private final int anInt6769;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	private final int anInt6767;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class79_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6766 = arg0;
		this.anInt6768 = arg2;
		this.anInt6769 = arg1;
		this.anInt6767 = arg3;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6766 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6768 >> 12;
		@Pc(32) int local32 = this.anInt6769 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt6767 * arg1 >> 12;
		Static202.method3655(super.anInt9202, local39, super.anInt9201, local10, super.anInt9200, local32, local17);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	@Override
	public void method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt6766 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt6768 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt6769 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt6767 >> 12;
		Static455.method6424(local25, local32, local18, super.anInt9201, local39);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
