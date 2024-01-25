import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class204 {

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
	public int anInt5933;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "Z")
	public boolean aBoolean437 = true;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!ol;II)V")
	private void method5365(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static386.method6507(arg0.method5175());
		} else if (arg1 == 2) {
			this.anInt5933 = arg0.method5172();
		} else if (arg1 == 4) {
			this.aBoolean437 = false;
		} else if (arg1 == 5) {
			this.aString69 = arg0.method5178();
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Z")
	public boolean method5366() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!ol;)V")
	public void method5367(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5203();
			if (local7 == 0) {
				return;
			}
			this.method5365(arg0, local7);
		}
	}
}
