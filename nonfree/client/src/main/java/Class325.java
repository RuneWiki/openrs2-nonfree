import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class325 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "C")
	private char aChar6;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
	public int anInt9243;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljava/lang/String;")
	public String aString129;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "Z")
	public boolean aBoolean674 = true;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)Z")
	public boolean method7797() {
		return this.aChar6 == 's';
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!gga;B)V")
	private void method7798(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static622.method8571(arg1.method8391());
		} else if (arg0 == 2) {
			this.anInt9243 = arg1.method8369();
		} else if (arg0 == 4) {
			this.aBoolean674 = false;
		} else if (arg0 == 5) {
			this.aString129 = arg1.method8354();
			return;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!gga;)V")
	public void method7799(@OriginalArg(1) Class6_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8374();
			if (local9 == 0) {
				return;
			}
			this.method7798(local9, arg0);
		}
	}
}
