import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class5 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public int anInt76 = -1;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	public int anInt75 = 64;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	public int anInt82 = 64;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public int anInt84 = 1;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
	public int anInt77 = 2;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Z")
	public boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILclient!gga;)V")
	private void method109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub23 arg2) {
		if (arg0 == 1) {
			this.anInt76 = arg2.method8363();
			if (this.anInt76 == 65535) {
				this.anInt76 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt75 = arg2.method8363() + 1;
			this.anInt82 = arg2.method8363() + 1;
		} else if (arg0 == 3) {
			arg2.method8391();
		} else if (arg0 == 4) {
			this.anInt77 = arg2.method8374();
		} else if (arg0 == 5) {
			this.anInt84 = arg2.method8374();
		} else if (arg0 == 6) {
			this.aBoolean9 = true;
		} else if (arg0 == 7) {
			this.aBoolean8 = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!gga;B)V")
	public void method110(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub23 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method8374();
			if (local9 == 0) {
				return;
			}
			this.method109(local9, arg0, arg1);
		}
	}
}
