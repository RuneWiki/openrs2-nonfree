import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class184 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public int anInt5018;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "Z")
	public boolean aBoolean342 = true;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Z")
	public boolean method4167() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!hp;)V")
	public void method4168(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5366();
			if (local12 == 0) {
				return;
			}
			this.method4169(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILclient!hp;)V")
	private void method4169(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static246.method4274(arg1.method5416());
		} else if (arg0 == 2) {
			this.anInt5018 = arg1.method5407();
		} else if (arg0 == 4) {
			this.aBoolean342 = false;
		} else if (arg0 == 5) {
			this.aString51 = arg1.method5401();
		}
	}
}
