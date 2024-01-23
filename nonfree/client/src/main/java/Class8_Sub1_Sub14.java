import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class8_Sub1_Sub14 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
	public int anInt4501 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!aj;)V")
	public void method3420(@OriginalArg(1) Class8_Sub2 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2334();
			if (local14 == 0) {
				return;
			}
			this.method3424(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!aj;B)V")
	private void method3424(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub2 arg1) {
		if (arg0 == 2) {
			this.anInt4501 = arg1.method2375();
		}
	}
}
