import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public abstract class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
	public int anInt2835;

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
	protected int anInt2838;

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
	public int anInt2839;

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
	protected int anInt2842;

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
	public int anInt2843;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)V")
	public abstract void method2155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIII)V")
	public abstract void method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
	public abstract void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	public abstract void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V")
	public final void method2163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = this.anInt2843 << 3;
		@Pc(19) int local19 = this.anInt2835 << 3;
		@Pc(28) int local28 = (arg3 << 4) + (local19 & 0xF);
		@Pc(36) int local36 = (arg2 << 4) + (local14 & 0xF);
		this.method2162(local14, local19, local36, local28, arg0, arg1);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V")
	public abstract void method2164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)V")
	public abstract void method2166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
