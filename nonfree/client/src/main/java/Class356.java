import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class356 {

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!uda;")
	public Class370 aClass370_2;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
	private int anInt9355;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public int anInt9356;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public int anInt9357;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ika;I)V")
	public void method7924(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2048(255);
			if (local11 == 0) {
				return;
			}
			this.method7926(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lclient!tm;")
	public synchronized Class361 method7925() {
		@Pc(13) Class361 local13 = (Class361) this.aClass370_2.aClass307_91.method7002((long) this.anInt9355);
		if (local13 != null) {
			return local13;
		}
		local13 = Static735.method8269(this.aClass370_2.aClass182_120, this.anInt9355, 0);
		if (local13 != null) {
			this.aClass370_2.aClass307_91.method7000(local13, (long) this.anInt9355);
		}
		return local13;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBLclient!ika;)V")
	private void method7926(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt9355 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt9356 = arg1.method2048(255);
			this.anInt9357 = arg1.method2048(255);
		}
	}
}
