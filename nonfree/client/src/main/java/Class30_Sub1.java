import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	private final int anInt942;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	private final int anInt945;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
	private final int anInt941;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	private final int anInt943;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIII)V")
	public Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt942 = arg2;
		this.anInt945 = arg3;
		this.anInt941 = arg1;
		this.anInt943 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	@Override
	public void method7125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt943 >> 12;
		@Pc(22) int local22 = this.anInt942 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt941 >> 12;
		@Pc(36) int local36 = this.anInt945 * arg1 >> 12;
		Static427.method6529(local36, local22, super.anInt8662, local15, super.anInt8664, super.anInt8661, local29);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt943 >> 12;
		@Pc(17) int local17 = this.anInt942 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt941 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt945 >> 12;
		Static306.method5022(super.anInt8664, local37, local30, local17, local10);
	}
}
