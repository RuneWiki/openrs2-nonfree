import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class244 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public int anInt7213;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Z")
	public boolean aBoolean494 = true;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method5994(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7548();
			if (local11 == 0) {
				return;
			}
			this.method5996(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!rt;IB)V")
	private void method5996(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static473.method6742(arg0.method7584());
		} else if (arg1 == 2) {
			this.anInt7213 = arg0.method7549();
		} else if (arg1 == 4) {
			this.aBoolean494 = false;
		} else if (arg1 == 5) {
			this.aString53 = arg0.method7589();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z")
	public boolean method5998() {
		return this.aChar3 == 's';
	}
}
