import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public int anInt2768;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public int anInt2772;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	private int anInt2771 = -32768;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()I")
	@Override
	public int method3680() {
		return this.anInt2771;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class5_Sub2 local14 = Static36.method637(this.anInt2768).method2810(this.anInt2772, 0, null);
		if (local14 != null) {
			local14.method3679(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2771 = local14.method3680();
		}
	}
}
