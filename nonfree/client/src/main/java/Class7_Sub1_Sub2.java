import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class7_Sub1_Sub2 extends Class7_Sub1 {

	@OriginalMember(owner = "client!am", name = "C", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!am", name = "F", descriptor = "I")
	public int anInt267;

	@OriginalMember(owner = "client!am", name = "M", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ap;B)V")
	public void method195(@OriginalArg(0) Class7_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2772();
			if (local3 == 0) {
				return;
			}
			this.method199(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!am", name = "g", descriptor = "(I)Z")
	public boolean method197() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!ap;)V")
	private void method199(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static224.method3944(arg1.method2779());
		} else if (arg0 == 2) {
			this.anInt267 = arg1.method2767();
		} else if (arg0 == 5) {
			this.aString18 = arg1.method2782();
		}
	}
}
