import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class45 {

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
	public int anInt953;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Z")
	public boolean aBoolean119 = true;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!wm;Z)V")
	public void method841(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2915();
			if (local14 == 0) {
				return;
			}
			this.method844(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Z")
	public boolean method842() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZLclient!wm;I)V")
	private void method844(@OriginalArg(1) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static95.method5199(arg0.method2917());
		} else if (arg1 == 2) {
			this.anInt953 = arg0.method2877();
		} else if (arg1 == 4) {
			this.aBoolean119 = false;
		} else if (arg1 == 5) {
			this.aString7 = arg0.method2914();
		}
	}
}
