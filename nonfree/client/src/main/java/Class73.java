import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class73 {

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
	public int anInt1789 = -1;

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
	public int anInt1791 = -1;

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
	public int anInt1790 = 0;

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
	public int anInt1793 = -1;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(ILclient!et;)V")
	public void method1539(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8581(-17416);
			if (local9 == 0) {
				return;
			}
			this.method1540(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!et;II)V")
	private void method1540(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1789 = arg0.method8575();
		} else if (arg1 == 2) {
			this.anIntArray132 = new int[arg0.method8581(-17416)];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray132.length; local21++) {
				this.anIntArray132[local21] = arg0.method8575();
			}
		} else if (arg1 == 3) {
			this.anInt1791 = arg0.method8581(-17416);
		} else if (arg1 == 4) {
			this.anInt1790 = arg0.method8581(-17416);
		} else if (arg1 == 5) {
			this.anInt1793 = arg0.method8575();
		}
	}
}
