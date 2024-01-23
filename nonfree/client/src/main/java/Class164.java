import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class164 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public int anInt5451 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!jj;B)V")
	private void method4177(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		if (arg0 == 5) {
			this.anInt5451 = arg1.method3107();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!jj;)V")
	public void method4179(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3122();
			if (local5 == 0) {
				return;
			}
			this.method4177(local5, arg0);
		}
	}
}
