import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class53 {

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public int anInt1028;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Z")
	public boolean aBoolean64 = true;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!rv;)V")
	public void method954(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3642();
			if (local3 == 0) {
				return;
			}
			this.method955(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!rv;B)V")
	private void method955(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static549.method7576(arg1.method3677());
		} else if (arg0 == 2) {
			this.anInt1028 = arg1.method3671();
		} else if (arg0 == 4) {
			this.aBoolean64 = false;
		} else if (arg0 == 5) {
			this.aString9 = arg1.method3661();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Z")
	public boolean method956() {
		return this.aChar1 == 's';
	}
}
