import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class166 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public int anInt4832 = 2048;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public int anInt4834 = 0;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	public int anInt4836 = 0;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public int anInt4835 = 2048;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!md;I)V")
	private void method3917(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt4834 = arg1.method3737();
		} else if (arg0 == 2) {
			this.anInt4835 = arg1.method3711();
		} else if (arg0 == 3) {
			this.anInt4832 = arg1.method3711();
		} else if (arg0 == 4) {
			this.anInt4836 = arg1.method3701();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!md;I)V")
	public void method3918(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3737();
			if (local7 == 0) {
				return;
			}
			this.method3917(local7, arg0);
		}
	}
}
