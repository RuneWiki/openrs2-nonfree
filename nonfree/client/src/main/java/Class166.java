import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class166 {

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public int anInt4273;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "Z")
	public boolean aBoolean281 = true;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLclient!fh;)V")
	public void method3403(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5539();
			if (local15 == 0) {
				return;
			}
			this.method3405(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILclient!fh;)V")
	private void method3405(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static372.method4863(arg1.method5600());
		} else if (arg0 == 2) {
			this.anInt4273 = arg1.method5603();
		} else if (arg0 == 4) {
			this.aBoolean281 = false;
		} else if (arg0 == 5) {
			this.aString51 = arg1.method5549();
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)Z")
	public boolean method3406() {
		return this.aChar3 == 's';
	}
}
