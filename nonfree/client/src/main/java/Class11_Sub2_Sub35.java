import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class11_Sub2_Sub35 extends Class11_Sub2 {

	static {
		new Class117(" days.", " Tage.", " jours.", " dias.");
		new Class117(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		return Static73.anIntArray91;
	}
}
