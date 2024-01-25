import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class295 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public int anInt7987;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	public int anInt7989;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "Z")
	public boolean aBoolean573;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
	public int anInt7993;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
	public int anInt7994;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
	public int anInt8000;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
	public int anInt7998 = 16777215;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
	public int anInt7990 = 8;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method6505(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6069();
			if (local13 == 0) {
				return;
			}
			this.method6509(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method6509(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt7990 = arg1.method6003();
		} else if (arg0 == 2) {
			this.aBoolean573 = true;
		} else if (arg0 == 3) {
			this.anInt7994 = arg1.method6058();
			this.anInt7989 = arg1.method6058();
			this.anInt7987 = arg1.method6058();
		} else if (arg0 == 4) {
			this.anInt8000 = arg1.method6069();
		} else if (arg0 == 5) {
			this.anInt7993 = arg1.method6003();
			return;
		} else if (arg0 == 6) {
			this.anInt7998 = arg1.method6031();
			return;
		}
	}
}
