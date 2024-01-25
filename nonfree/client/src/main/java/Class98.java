import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class98 {

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public int anInt2192 = 2048;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	public int anInt2196 = 2048;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	public int anInt2197 = 0;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "I")
	public int anInt2191 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ee;Z)V")
	public void method1984(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method1986(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!ee;)V")
	private void method1986(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt2197 = arg1.method8645();
		} else if (arg0 == 2) {
			this.anInt2196 = arg1.method8631();
		} else if (arg0 == 3) {
			this.anInt2192 = arg1.method8631();
		} else if (arg0 == 4) {
			this.anInt2191 = arg1.method8595();
		}
	}
}
