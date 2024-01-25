import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class115 {

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
	public int anInt3813;

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
	public int anInt3815;

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
	public int anInt3817;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
	public int anInt3819;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "Z")
	public boolean aBoolean300;

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	public int anInt3823;

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
	public int anInt3816 = 8;

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
	public int anInt3820 = 16777215;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!ol;)V")
	public void method3538(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5203();
			if (local9 == 0) {
				return;
			}
			this.method3539(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IBLclient!ol;)V")
	private void method3539(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt3816 = arg1.method5211();
		} else if (arg0 == 2) {
			this.aBoolean300 = true;
		} else if (arg0 == 3) {
			this.anInt3819 = arg1.method5174();
			this.anInt3815 = arg1.method5174();
			this.anInt3817 = arg1.method5174();
		} else if (arg0 == 4) {
			this.anInt3823 = arg1.method5203();
		} else if (arg0 == 5) {
			this.anInt3813 = arg1.method5211();
		} else if (arg0 == 6) {
			this.anInt3820 = arg1.method5161();
		}
	}
}
