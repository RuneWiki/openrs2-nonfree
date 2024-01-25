import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class22 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Z")
	public boolean aBoolean58;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
	public int anInt667 = 16777215;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	public int anInt671 = 8;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method567(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5539();
			if (local5 == 0) {
				return;
			}
			this.method569(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method569(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt671 = arg1.method5598();
		} else if (arg0 == 2) {
			this.aBoolean58 = true;
		} else if (arg0 == 3) {
			this.anInt666 = arg1.method5586();
			this.anInt669 = arg1.method5586();
			this.anInt673 = arg1.method5586();
		} else if (arg0 == 4) {
			this.anInt670 = arg1.method5539();
		} else if (arg0 == 5) {
			this.anInt674 = arg1.method5598();
		} else if (arg0 == 6) {
			this.anInt667 = arg1.method5541();
		}
	}
}
