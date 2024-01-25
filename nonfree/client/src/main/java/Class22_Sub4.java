import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
	private final int anInt7888;

	@OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
	private final int anInt7886;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
	private final int anInt7884;

	@OriginalMember(owner = "client!qda", name = "u", descriptor = "I")
	private final int anInt7893;

	@OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
	private final int anInt7885;

	@OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
	private final int anInt7887;

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
	private final int anInt7883;

	@OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
	private final int anInt7891;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class22_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7888 = arg2;
		this.anInt7886 = arg1;
		this.anInt7884 = arg4;
		this.anInt7893 = arg7;
		this.anInt7885 = arg5;
		this.anInt7887 = arg6;
		this.anInt7883 = arg0;
		this.anInt7891 = arg3;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7883 >> 12;
		@Pc(17) int local17 = this.anInt7886 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt7888 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt7891 * arg1 >> 12;
		@Pc(42) int local42 = this.anInt7884 * arg0 >> 12;
		@Pc(49) int local49 = arg1 * this.anInt7885 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt7887 >> 12;
		@Pc(63) int local63 = arg1 * this.anInt7893 >> 12;
		Static47.method611(local28, local35, super.anInt7882, local63, local42, local56, local49, local17, local10);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
	@Override
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
