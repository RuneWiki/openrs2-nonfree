import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class250 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	public int anInt7541 = -1;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	public int anInt7547 = 2;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	public int anInt7543 = 64;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	public int anInt7542 = 1;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	public int anInt7544 = 64;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Z")
	public boolean aBoolean561 = false;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Z")
	public boolean aBoolean562 = false;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZILclient!ol;)V")
	public void method6678(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method5203();
			if (local14 == 0) {
				return;
			}
			this.method6679(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!ol;IZ)V")
	private void method6679(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt7541 = arg1.method5211();
			if (this.anInt7541 == 65535) {
				this.anInt7541 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt7543 = arg1.method5211() + 1;
			this.anInt7544 = arg1.method5211() + 1;
		} else if (arg0 == 3) {
			arg1.method5175();
		} else if (arg0 == 4) {
			this.anInt7547 = arg1.method5203();
		} else if (arg0 == 5) {
			this.anInt7542 = arg1.method5203();
		} else if (arg0 == 6) {
			this.aBoolean562 = true;
		} else if (arg0 == 7) {
			this.aBoolean561 = true;
		}
	}
}
