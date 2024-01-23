import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class4_Sub2_Sub13 extends Class4_Sub2 {

	@OriginalMember(owner = "client!l", name = "A", descriptor = "I")
	public int anInt2969 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!pi;I)V")
	private void method2389(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24 arg1) {
		if (arg0 == 2) {
			this.anInt2969 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!pi;)V")
	public void method2394(@OriginalArg(1) Class4_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method2389(local5, arg0);
		}
	}
}
