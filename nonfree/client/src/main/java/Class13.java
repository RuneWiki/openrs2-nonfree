import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class13 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public int anInt200;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Z")
	public boolean aBoolean15 = true;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLclient!ia;)V")
	public void method147(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1171();
			if (local7 == 0) {
				return;
			}
			this.method149(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z")
	public boolean method148() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ia;II)V")
	private void method149(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static231.method3516(arg0.method1212());
		} else if (arg1 == 2) {
			this.anInt200 = arg0.method1188();
		} else if (arg1 == 4) {
			this.aBoolean15 = false;
		} else if (arg1 == 5) {
			this.aString3 = arg0.method1201();
		}
	}
}
