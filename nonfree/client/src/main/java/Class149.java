import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class149 {

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public int anInt4487 = 0;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public int anInt4485 = 0;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	public int anInt4490 = 2048;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
	public int anInt4492 = 2048;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!bk;I)V")
	public void method3947(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1832();
			if (local5 == 0) {
				return;
			}
			this.method3952(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!bk;III)V")
	private void method3952(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4487 = arg0.method1832();
		} else if (arg2 == 2) {
			this.anInt4492 = arg0.method1845();
		} else if (arg2 == 3) {
			this.anInt4490 = arg0.method1845();
		} else if (arg2 == 4) {
			this.anInt4485 = arg0.method1834();
		}
	}
}
