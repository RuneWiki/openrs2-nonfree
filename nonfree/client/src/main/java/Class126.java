import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class126 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public int anInt4026 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public int anInt4025 = 2048;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public int anInt4027 = 0;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	public int anInt4030 = 2048;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!ef;II)V")
	private void method3468(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt4027 = arg1.method3124();
		} else if (arg0 == 2) {
			this.anInt4025 = arg1.method3104();
		} else if (arg0 == 3) {
			this.anInt4030 = arg1.method3104();
		} else if (arg0 == 4) {
			this.anInt4026 = arg1.method3108();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ef;BI)V")
	public void method3469(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method3124();
			if (local13 == 0) {
				return;
			}
			this.method3468(local13, arg0, arg1);
		}
	}
}
