import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	private final int anInt5895;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	private final int anInt5891;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
	private final int anInt5901;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
	private final int anInt5906;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
	private final int anInt5904;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	private final int anInt5892;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
	private final int anInt5896;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	private final int anInt5894;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5895 = arg4;
		this.anInt5891 = arg7;
		this.anInt5901 = arg0;
		this.anInt5906 = arg1;
		this.anInt5904 = arg5;
		this.anInt5892 = arg6;
		this.anInt5896 = arg2;
		this.anInt5894 = arg3;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)V")
	@Override
	public void method7033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)V")
	@Override
	public void method7030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5901 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt5906 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt5896 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt5894 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt5895 * arg1 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt5904 >> 12;
		@Pc(52) int local52 = arg1 * this.anInt5892 >> 12;
		@Pc(63) int local63 = arg0 * this.anInt5891 >> 12;
		Static497.method7516(local24, local52, local10, local38, local45, local17, local63, local31, super.anInt8586);
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(III)V")
	@Override
	public void method7034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
