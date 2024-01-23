import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	private int anInt2911;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	private int anInt2916;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	private int anInt2917;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	private int anInt2914;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIII)V")
	public Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2911 = arg0;
		this.anInt2916 = arg2;
		this.anInt2917 = arg3;
		this.anInt2914 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	@Override
	public void method4157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt2916 >> 12;
		@Pc(21) int local21 = this.anInt2911 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt2917 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt2914 >> 12;
		Static173.method2864(local14, local28, local21, this.anInt4979, local35);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IBI)V")
	@Override
	public void method4158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
