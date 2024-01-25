import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class193 {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Z")
	public boolean aBoolean353;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
	public int anInt4841;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
	public int anInt4844;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
	public int anInt4845;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
	public int anInt4850;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	public int anInt4851;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
	public int anInt4842 = 8;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	public int anInt4843 = 16777215;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILclient!fh;)V")
	private void method3845(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt4842 = arg1.method5028();
		} else if (arg0 == 2) {
			this.aBoolean353 = true;
		} else if (arg0 == 3) {
			this.anInt4850 = arg1.method5061();
			this.anInt4844 = arg1.method5061();
			this.anInt4851 = arg1.method5061();
		} else if (arg0 == 4) {
			this.anInt4845 = arg1.method5007();
			return;
		} else if (arg0 == 5) {
			this.anInt4841 = arg1.method5028();
			return;
		} else if (arg0 == 6) {
			this.anInt4843 = arg1.method5008();
			return;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method3847(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5007();
			if (local11 == 0) {
				return;
			}
			this.method3845(local11, arg0);
		}
	}
}
