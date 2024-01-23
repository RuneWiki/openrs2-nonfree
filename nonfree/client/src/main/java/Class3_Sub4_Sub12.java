import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public abstract class Class3_Sub4_Sub12 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
	protected int anInt5722;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
	public int anInt5723;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
	protected int anInt5725;

	@OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
	public int anInt5728;

	@OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
	public int anInt5729;

	@OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
	public int anInt5731;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	protected Class3_Sub4_Sub12() {
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)V")
	public abstract void method4697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(III)V")
	public abstract void method4700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIB)V")
	public final void method4701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = this.anInt5723 << 3;
		@Pc(18) int local18 = (arg3 << 4) + (local9 & 0xF);
		@Pc(27) int local27 = this.anInt5731 << 3;
		@Pc(35) int local35 = (local27 & 0xF) + (arg2 << 4);
		this.method4699(local9, local27, local18, local35, arg1, arg0);
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(II)V")
	public abstract void method4702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V")
	public abstract void method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(II)V")
	public abstract void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIII)V")
	public abstract void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
