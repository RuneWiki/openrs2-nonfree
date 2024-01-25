import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class309 {

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
	public int anInt8903 = 1;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method7471(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4966();
			if (local5 == 0) {
				return;
			}
			this.method7473(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!iaa;B)V")
	private void method7473(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static60.method1329(arg1.method4972());
		} else if (arg0 == 2) {
			this.anInt8903 = 0;
		}
	}
}
