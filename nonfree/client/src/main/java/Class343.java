import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class343 {

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
	public int anInt9278;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public int anInt9282;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	public int anInt9283;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!et;)V")
	public void method8180(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8581(-17416);
			if (local13 == 0) {
				return;
			}
			this.method8181(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!et;ZI)V")
	private void method8181(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar6 = Static639.method8672(arg0.method8536());
		} else if (arg1 == 3) {
			this.anInt9282 = arg0.method8575();
			this.anInt9278 = arg0.method8581(-17416);
			this.anInt9283 = arg0.method8581(-17416);
		}
	}
}
