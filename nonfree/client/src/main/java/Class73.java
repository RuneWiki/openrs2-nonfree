import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class73 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public int anInt2126 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLclient!nn;I)V")
	private void method1846(@OriginalArg(1) Class10_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt2126 = arg0.method2485();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!nn;B)V")
	public void method1849(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2502();
			if (local5 == 0) {
				return;
			}
			this.method1846(arg0, local5);
		}
	}
}
