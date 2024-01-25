import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class120 {

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
	public int anInt2965;

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "Z")
	public boolean aBoolean225 = true;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)Z")
	public boolean method2384() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IILclient!mo;)V")
	private void method2385(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub35 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static546.method7462(arg1.method5751());
		} else if (arg0 == 2) {
			this.anInt2965 = arg1.method5804();
		} else if (arg0 == 4) {
			this.aBoolean225 = false;
		} else if (arg0 == 5) {
			this.aString28 = arg1.method5760();
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZLclient!mo;)V")
	public void method2387(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5750();
			if (local9 == 0) {
				return;
			}
			this.method2385(local9, arg0);
		}
	}
}
