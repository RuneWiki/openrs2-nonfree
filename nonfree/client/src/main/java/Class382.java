import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class382 {

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
	public int anInt10771 = 0;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
	public int anInt10777 = 2048;

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
	public int anInt10773 = 2048;

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
	public int anInt10775 = 0;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLclient!ji;)V")
	public void method8788(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method8246();
			if (local12 == 0) {
				return;
			}
			this.method8789(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method8789(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt10775 = arg1.method8246();
		} else if (arg0 == 2) {
			this.anInt10777 = arg1.method8220();
		} else if (arg0 == 3) {
			this.anInt10773 = arg1.method8220();
		} else if (arg0 == 4) {
			this.anInt10771 = arg1.method8231();
			return;
		}
	}
}
