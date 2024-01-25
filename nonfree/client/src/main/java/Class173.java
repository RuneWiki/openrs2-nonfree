import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class173 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	public int anInt5094;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public int anInt5096;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!hg;")
	public Class98 aClass98_2;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	private int anInt5100;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!nj;IB)V")
	private void method4201(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5100 = arg0.method4083();
		} else if (arg1 == 2) {
			this.anInt5094 = arg0.method4096();
			this.anInt5096 = arg0.method4096();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lclient!mn;")
	public synchronized Class154 method4204() {
		@Pc(13) Class154 local13 = (Class154) this.aClass98_2.aClass268_26.method6166((long) this.anInt5100);
		if (local13 != null) {
			return local13;
		}
		local13 = Static467.method3619(this.aClass98_2.aClass250_43, this.anInt5100, 0);
		if (local13 != null) {
			this.aClass98_2.aClass268_26.method6164(local13, (long) this.anInt5100);
		}
		return local13;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method4205(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4096();
			if (local5 == 0) {
				return;
			}
			this.method4201(arg0, local5);
		}
	}
}
