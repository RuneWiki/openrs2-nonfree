import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class178 {

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public int anInt5231 = 2048;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public int anInt5234 = 2048;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	public int anInt5235 = 0;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public int anInt5237 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!cu;I)V")
	private void method4091(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt5235 = arg1.method2582();
		} else if (arg0 == 2) {
			this.anInt5231 = arg1.method2588();
		} else if (arg0 == 3) {
			this.anInt5234 = arg1.method2588();
		} else if (arg0 == 4) {
			this.anInt5237 = arg1.method2641();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method4092(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2582();
			if (local5 == 0) {
				return;
			}
			this.method4091(local5, arg0);
		}
	}
}
