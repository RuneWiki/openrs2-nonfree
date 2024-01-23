import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public int anInt2383;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public int anInt2384;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	private int anInt2377 = -32768;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
	@Override
	public int method2718() {
		return this.anInt2377;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class12_Sub2 local14 = Static63.method1158(this.anInt2384).method2157(this.anInt2383, 0, null);
		if (local14 != null) {
			local14.method2715(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2377 = local14.method2718();
		}
	}
}
