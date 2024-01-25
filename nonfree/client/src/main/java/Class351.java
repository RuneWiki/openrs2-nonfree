import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class351 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	public int anInt9903;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	private int anInt9907;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	public int anInt9910;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!ec;")
	public Class74 aClass74_2;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!rg;)V")
	public void method8357(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8604();
			if (local5 == 0) {
				return;
			}
			this.method8363(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lclient!fg;")
	public synchronized Class98 method8358() {
		@Pc(13) Class98 local13 = (Class98) this.aClass74_2.aClass166_14.method4805((long) this.anInt9907);
		if (local13 != null) {
			return local13;
		}
		local13 = Static651.method2404(this.aClass74_2.aClass353_22, this.anInt9907, 0);
		if (local13 != null) {
			this.aClass74_2.aClass166_14.method4803(local13, (long) this.anInt9907);
		}
		return local13;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!rg;II)V")
	private void method8363(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9907 = arg0.method8571();
		} else if (arg1 == 2) {
			this.anInt9910 = arg0.method8604();
			this.anInt9903 = arg0.method8604();
		}
	}
}
