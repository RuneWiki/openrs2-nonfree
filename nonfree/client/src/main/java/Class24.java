import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class24 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public int anInt392;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Z")
	public boolean aBoolean37 = true;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!re;I)V")
	public void method372(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5174();
			if (local9 == 0) {
				return;
			}
			this.method373(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!re;)V")
	private void method373(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static243.method3660(arg1.method5188());
		} else if (arg0 == 2) {
			this.anInt392 = arg1.method5150();
		} else if (arg0 == 4) {
			this.aBoolean37 = false;
		} else if (arg0 == 5) {
			this.aString2 = arg1.method5128();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	public boolean method375() {
		return this.aChar2 == 's';
	}
}
