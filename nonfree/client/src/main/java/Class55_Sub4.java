import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class55_Sub4 extends Class55 {

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
	private final int anInt7985;

	@OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
	private final int anInt7994;

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
	private final int anInt7991;

	@OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
	private final int anInt7988;

	@OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
	private final int anInt7984;

	@OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
	private final int anInt7993;

	@OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
	private final int anInt7989;

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
	private final int anInt7990;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class55_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7985 = arg3;
		this.anInt7994 = arg5;
		this.anInt7991 = arg4;
		this.anInt7988 = arg2;
		this.anInt7984 = arg1;
		this.anInt7993 = arg7;
		this.anInt7989 = arg0;
		this.anInt7990 = arg6;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BII)V")
	@Override
	public void method6991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7989 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt7984 >> 12;
		@Pc(30) int local30 = this.anInt7988 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt7985 * arg0 >> 12;
		@Pc(44) int local44 = this.anInt7991 * arg1 >> 12;
		@Pc(51) int local51 = this.anInt7994 * arg0 >> 12;
		@Pc(58) int local58 = arg1 * this.anInt7990 >> 12;
		@Pc(65) int local65 = this.anInt7993 * arg0 >> 12;
		Static9.method159(local23, local44, local10, local30, local37, local58, local65, local51, super.anInt7977);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
	@Override
	public void method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(BII)V")
	@Override
	public void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
