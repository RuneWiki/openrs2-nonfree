import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class106 {

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
	public int anInt2688;

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Z")
	public boolean aBoolean311 = true;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!ug;B)V")
	public void method2328(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method2332(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!ug;II)V")
	private void method2332(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static276.method3830(arg0.method5367());
		} else if (arg1 == 2) {
			this.anInt2688 = arg0.method5355();
		} else if (arg1 == 4) {
			this.aBoolean311 = false;
		} else if (arg1 == 5) {
			this.aString35 = arg0.method5381();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Z")
	public boolean method2333() {
		return this.aChar2 == 's';
	}
}
