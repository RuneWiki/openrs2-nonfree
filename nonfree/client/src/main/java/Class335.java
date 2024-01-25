import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class335 {

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
	public boolean aBoolean577 = false;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "Z")
	public boolean aBoolean578 = false;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public int anInt8737 = -1;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public int anInt8743 = 2;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
	public int anInt8745 = 64;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	public int anInt8742 = 1;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	public int anInt8747 = 64;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!wq;I)V")
	public void method7510(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(10) int local10 = arg0.method7291();
			if (local10 == 0) {
				return;
			}
			this.method7511(local10, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIILclient!wq;)V")
	private void method7511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub36 arg2) {
		if (arg0 == 1) {
			this.anInt8737 = arg2.method7333();
			if (this.anInt8737 == 65535) {
				this.anInt8737 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt8745 = arg2.method7333() + 1;
			this.anInt8747 = arg2.method7333() + 1;
		} else if (arg0 == 3) {
			arg2.method7318();
		} else if (arg0 == 4) {
			this.anInt8743 = arg2.method7291();
		} else if (arg0 == 5) {
			this.anInt8742 = arg2.method7291();
		} else if (arg0 == 6) {
			this.aBoolean578 = true;
		} else if (arg0 == 7) {
			this.aBoolean577 = true;
		}
	}
}
