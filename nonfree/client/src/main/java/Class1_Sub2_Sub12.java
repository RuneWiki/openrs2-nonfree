import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "Ljava/lang/String;")
	public String aString150;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
	public int anInt2582;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!cg;II)V")
	private void method2054(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static170.method2924(arg0.method2663());
		} else if (arg1 == 2) {
			this.anInt2582 = arg0.method2643();
		} else if (arg1 == 5) {
			this.aString150 = arg0.method2629();
		}
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Z")
	public boolean method2055() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!cg;)V")
	public void method2057(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2690();
			if (local10 == 0) {
				return;
			}
			this.method2054(arg0, local10);
		}
	}
}
