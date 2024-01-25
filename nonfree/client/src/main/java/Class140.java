import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class140 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public int anInt5140;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Z")
	public boolean aBoolean453 = true;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Z")
	public boolean method4349() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!tn;I)V")
	private void method4352(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static278.method6290(arg1.method8440());
		} else if (arg0 == 2) {
			this.anInt5140 = arg1.method8402();
		} else if (arg0 == 4) {
			this.aBoolean453 = false;
		} else if (arg0 == 5) {
			this.aString48 = arg1.method8413();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!tn;I)V")
	public void method4353(@OriginalArg(0) Class3_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8401();
			if (local9 == 0) {
				return;
			}
			this.method4352(local9, arg0);
		}
	}
}
