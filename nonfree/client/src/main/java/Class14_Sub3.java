import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
	private final int anInt5854;

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
	private final int anInt5842;

	@OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
	private final int anInt5851;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
	private final int anInt5849;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	private final int anInt5841;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
	private final int anInt5834;

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
	private final int anInt5847;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
	private final int anInt5844;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class14_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5854 = arg0;
		this.anInt5842 = arg4;
		this.anInt5851 = arg7;
		this.anInt5849 = arg1;
		this.anInt5841 = arg6;
		this.anInt5834 = arg3;
		this.anInt5847 = arg2;
		this.anInt5844 = arg5;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)V")
	@Override
	public void method5442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	@Override
	public void method5440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5854 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt5849 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt5847 >> 12;
		@Pc(35) int local35 = this.anInt5834 * arg0 >> 12;
		@Pc(42) int local42 = arg1 * this.anInt5842 >> 12;
		@Pc(49) int local49 = this.anInt5844 * arg0 >> 12;
		@Pc(56) int local56 = arg1 * this.anInt5841 >> 12;
		@Pc(63) int local63 = arg0 * this.anInt5851 >> 12;
		Static170.method3388(local63, local56, super.anInt6450, local42, local10, local28, local49, local21, local35);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
