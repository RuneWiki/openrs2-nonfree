import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class108 {

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	public int anInt2348;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Z")
	public boolean aBoolean161 = true;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method2203(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7695(101);
			if (local11 == 0) {
				return;
			}
			this.method2204(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method2204(@OriginalArg(1) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static223.method3822(arg0.method7720());
		} else if (arg1 == 2) {
			this.anInt2348 = arg0.method7748();
		} else if (arg1 == 4) {
			this.aBoolean161 = false;
		} else if (arg1 == 5) {
			this.aString32 = arg0.method7703(0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)Z")
	public boolean method2205() {
		return this.aChar5 == 's';
	}
}
