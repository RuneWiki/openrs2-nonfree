import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class113 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public int anInt3246 = 0;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public int anInt3247 = 2048;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public int anInt3252 = 0;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public int anInt3253 = 2048;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!aj;I)V")
	private void method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub2 arg2) {
		if (arg0 == 1) {
			this.anInt3252 = arg2.method2334();
		} else if (arg0 == 2) {
			this.anInt3247 = arg2.method2375();
		} else if (arg0 == 3) {
			this.anInt3253 = arg2.method2375();
		} else if (arg0 == 4) {
			this.anInt3246 = arg2.method2360();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!aj;I)V")
	public void method2558(@OriginalArg(1) Class8_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method2334();
			if (local3 == 0) {
				return;
			}
			this.method2556(local3, arg1, arg0);
		}
	}
}
