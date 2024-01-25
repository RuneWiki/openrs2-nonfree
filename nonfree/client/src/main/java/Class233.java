import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class233 {

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
	public int anInt6763;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Z")
	public boolean aBoolean596 = true;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!mc;I)V")
	private void method5636(@OriginalArg(1) Class5_Sub41 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static144.method2600(arg0.method7861());
		} else if (arg1 == 2) {
			this.anInt6763 = arg0.method7804();
		} else if (arg1 == 4) {
			this.aBoolean596 = false;
		} else if (arg1 == 5) {
			this.aString56 = arg0.method7847();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method5640(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7816();
			if (local11 == 0) {
				return;
			}
			this.method5636(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)Z")
	public boolean method5642() {
		return this.aChar4 == 's';
	}
}
