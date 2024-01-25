import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class302 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public int anInt8386;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Z")
	public boolean aBoolean642 = true;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z")
	public boolean method7331() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method7332(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static383.method5912(arg0.method3027());
		} else if (arg1 == 2) {
			this.anInt8386 = arg0.method3015();
			return;
		} else if (arg1 == 4) {
			this.aBoolean642 = false;
			return;
		} else if (arg1 == 5) {
			this.aString96 = arg0.method3046();
			return;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method7333(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method3030();
			if (local18 == 0) {
				return;
			}
			this.method7332(arg0, local18);
		}
	}
}
