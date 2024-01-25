import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class255 {

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "[I")
	public int[] anIntArray612;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
	public int anInt6763 = -1;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
	public int anInt6764 = -1;

	static {
		new Class7(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!hp;)V")
	public void method5564(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5366();
			if (local15 == 0) {
				return;
			}
			this.method5568(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BILclient!hp;)V")
	private void method5568(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt6763 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anIntArray612 = new int[arg1.method5366()];
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray612.length; local36++) {
				this.anIntArray612[local36] = arg1.method5362();
			}
		} else if (arg0 == 3) {
			this.anInt6764 = arg1.method5366();
		}
	}
}
