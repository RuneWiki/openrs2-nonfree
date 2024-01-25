import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class266 {

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
	public int anInt7748;

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
	public int anInt7752;

	@OriginalMember(owner = "client!paa", name = "i", descriptor = "Z")
	public boolean aBoolean566;

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
	public int anInt7754;

	@OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
	public int anInt7755;

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
	public int anInt7756;

	@OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
	public int anInt7758 = 8;

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
	public int anInt7757 = 16777215;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!rv;B)V")
	private void method6583(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt7758 = arg1.method3698();
		} else if (arg0 == 2) {
			this.aBoolean566 = true;
		} else if (arg0 == 3) {
			this.anInt7755 = arg1.method3638();
			this.anInt7752 = arg1.method3638();
			this.anInt7748 = arg1.method3638();
		} else if (arg0 == 4) {
			this.anInt7756 = arg1.method3642();
		} else if (arg0 == 5) {
			this.anInt7754 = arg1.method3698();
		} else if (arg0 == 6) {
			this.anInt7757 = arg1.method3633();
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!rv;)V")
	public void method6584(@OriginalArg(1) Class5_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3642();
			if (local5 == 0) {
				return;
			}
			this.method6583(local5, arg0);
		}
	}
}
