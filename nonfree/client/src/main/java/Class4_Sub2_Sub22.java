import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class4_Sub2_Sub22 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "Ljava/lang/String;")
	public String aString193;

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
	public int anInt5557;

	@OriginalMember(owner = "client!wn", name = "B", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)Z")
	public boolean method4398() {
		return this.aChar4 == 's';
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!p;I)V")
	public void method4401(@OriginalArg(0) Class4_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1874();
			if (local5 == 0) {
				return;
			}
			this.method4403(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLclient!p;I)V")
	private void method4403(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static259.method3916(arg0.method1892());
		} else if (arg1 == 2) {
			this.anInt5557 = arg0.method1889();
		} else if (arg1 == 5) {
			this.aString193 = arg0.method1841();
		}
	}
}
