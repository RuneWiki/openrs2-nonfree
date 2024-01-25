import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class216 {

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
	public int anInt5872 = 0;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public int anInt5871 = 2048;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
	public int anInt5873 = 0;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public int anInt5875 = 2048;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBLclient!hp;)V")
	private void method4891(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt5873 = arg1.method5366();
		} else if (arg0 == 2) {
			this.anInt5875 = arg1.method5362();
		} else if (arg0 == 3) {
			this.anInt5871 = arg1.method5362();
		} else if (arg0 == 4) {
			this.anInt5872 = arg1.method5380();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!hp;)V")
	public void method4892(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5366();
			if (local5 == 0) {
				return;
			}
			this.method4891(local5, arg0);
		}
	}
}
