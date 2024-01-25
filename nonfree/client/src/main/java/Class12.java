import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class12 {

	@OriginalMember(owner = "client!an", name = "f", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "I")
	public int anInt345 = 1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method263(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5539();
			if (local16 == 0) {
				return;
			}
			this.method267(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method267(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static372.method4863(arg1.method5600());
		} else if (arg0 == 2) {
			this.anInt345 = 0;
		}
	}
}
