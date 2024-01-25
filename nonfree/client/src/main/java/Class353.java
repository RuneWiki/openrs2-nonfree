import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class353 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public int anInt9931 = -1;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
	public int anInt9935 = 64;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
	public int anInt9937 = 2;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "Z")
	public boolean aBoolean842 = false;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
	public int anInt9936 = 1;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	public int anInt9939 = 64;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
	public boolean aBoolean841 = false;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBLclient!mc;I)V")
	private void method8270(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub41 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt9931 = arg1.method7860();
			if (this.anInt9931 == 65535) {
				this.anInt9931 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt9935 = arg1.method7860() + 1;
			this.anInt9939 = arg1.method7860() + 1;
		} else if (arg0 == 3) {
			arg1.method7861();
		} else if (arg0 == 4) {
			this.anInt9937 = arg1.method7816();
		} else if (arg0 == 5) {
			this.anInt9936 = arg1.method7816();
		} else if (arg0 == 6) {
			this.aBoolean842 = true;
		} else if (arg0 == 7) {
			this.aBoolean841 = true;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!mc;I)V")
	public void method8271(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub41 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method7816();
			if (local13 == 0) {
				return;
			}
			this.method8270(local13, arg1, arg0);
		}
	}
}
