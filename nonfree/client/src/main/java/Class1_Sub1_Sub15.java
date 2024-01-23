import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!od", name = "z", descriptor = "Ljava/lang/String;")
	public String aString133;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "I")
	public int anInt3964;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Z")
	public boolean method3170() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!sb;I)V")
	private void method3174(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static16.method215(arg1.method2598());
		} else if (arg0 == 2) {
			this.anInt3964 = arg1.method2647();
		} else if (arg0 == 5) {
			this.aString133 = arg1.method2605();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!sb;)V")
	public void method3176(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2595();
			if (local11 == 0) {
				return;
			}
			this.method3174(local11, arg0);
		}
	}
}
