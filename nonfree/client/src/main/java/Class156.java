import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class156 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "I")
	public int anInt4281;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "I")
	public int anInt4283;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "I")
	private int anInt4287;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lclient!hb;")
	public Class88 method4085() {
		@Pc(11) Class88 local11 = (Class88) Static309.aClass70_100.method1396((long) this.anInt4287);
		if (local11 != null) {
			return local11;
		}
		local11 = Static363.method2255(Static243.aClass53_112, this.anInt4287, 0);
		if (local11 != null) {
			Static309.aClass70_100.method1406(local11, (long) this.anInt4287);
		}
		return local11;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!ec;B)V")
	public void method4086(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub10 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method3972();
			if (local13 == 0) {
				return;
			}
			this.method4087(arg1, local13, arg0);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ec;III)V")
	private void method4087(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt4287 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt4283 = arg0.method3972();
			this.anInt4281 = arg0.method3972();
			return;
		}
	}
}
