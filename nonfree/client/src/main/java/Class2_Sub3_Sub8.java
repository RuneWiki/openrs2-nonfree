import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public abstract class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
	public int anInt2844;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
	public int anInt2845;

	@OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
	public int anInt2847;

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
	public int anInt2850;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
	protected int anInt2852;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
	protected int anInt2853;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	protected Class2_Sub3_Sub8() {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V")
	public abstract void method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	public abstract void method2255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
	public abstract void method2256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
	public abstract void method2257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIIII)V")
	public final void method2258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anInt2844 << 3;
		@Pc(13) int local13 = this.anInt2850 << 3;
		@Pc(21) int local21 = (local4 & 0xF) + (arg2 << 4);
		@Pc(29) int local29 = (local13 & 0xF) + (arg3 << 4);
		this.method2252(local13, local4, local29, local21, arg0, arg1);
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)V")
	public abstract void method2262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIII)V")
	public abstract void method2263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
