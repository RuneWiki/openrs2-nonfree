import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public abstract class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public int anInt5109;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	public int anInt5112;

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
	public int anInt5113;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	protected int anInt5116;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
	protected int anInt5117;

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
	public int anInt5119;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	public abstract void method3914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIIII)V")
	public final void method3917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = this.anInt5109 << 3;
		@Pc(22) int local22 = (local14 & 0xF) + (arg2 << 4);
		@Pc(27) int local27 = this.anInt5113 << 3;
		@Pc(35) int local35 = (arg1 << 4) + (local27 & 0xF);
		this.method3923(local14, local27, local22, local35, arg3, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public abstract void method3919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
	public abstract void method3921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
	public abstract void method3922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method3923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
	public abstract void method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	public abstract void method3926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
