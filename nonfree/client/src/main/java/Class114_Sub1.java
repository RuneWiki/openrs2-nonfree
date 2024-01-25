import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private final int anInt4150;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	private final int anInt4155;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private final int anInt4149;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private final int anInt4148;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class114_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4150 = arg0;
		this.anInt4155 = arg3;
		this.anInt4149 = arg2;
		this.anInt4148 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
	@Override
	public void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt4150 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt4149 >> 12;
		@Pc(29) int local29 = this.anInt4148 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt4155 >> 12;
		Static591.method5433(local36, local15, super.anInt7442, super.anInt7441, super.anInt7440, local29, local22);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)V")
	@Override
	public void method6310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V")
	@Override
	public void method6309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 * this.anInt4150 >> 12;
		@Pc(23) int local23 = this.anInt4149 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt4148 * arg1 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt4155 >> 12;
		Static199.method7244(local30, local37, super.anInt7441, local23, local16);
	}
}
