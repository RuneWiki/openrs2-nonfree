import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub8_Sub24 extends Class2_Sub8 {

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "Ljava/lang/String;")
	public String aString207;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
	public int anInt5989;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!oe;)V")
	public void method4693(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2146();
			if (local5 == 0) {
				return;
			}
			this.method4695(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!oe;I)V")
	private void method4695(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static84.method1511(arg0.method2170());
		} else if (arg1 == 2) {
			this.anInt5989 = arg0.method2145();
		} else if (arg1 == 5) {
			this.aString207 = arg0.method2158();
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)Z")
	public boolean method4696() {
		return this.aChar4 == 's';
	}
}
