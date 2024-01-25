import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class167 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public int anInt5111 = 2048;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public int anInt5112 = 2048;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	public int anInt5114 = 0;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public int anInt5120 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!iaa;)V")
	public void method4418(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4966();
			if (local17 == 0) {
				return;
			}
			this.method4421(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BILclient!iaa;)V")
	private void method4421(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt5114 = arg1.method4966();
		} else if (arg0 == 2) {
			this.anInt5112 = arg1.method4999();
		} else if (arg0 == 3) {
			this.anInt5111 = arg1.method4999();
		} else if (arg0 == 4) {
			this.anInt5120 = arg1.method4974();
		}
	}
}
