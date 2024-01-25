import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class128 {

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Lclient!jf;")
	public Class4_Sub1_Sub2 aClass4_Sub1_Sub2_1;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!gm;")
	public Class128 aClass128_2;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method3217() {
		if (Static60.anInt1600 < 500) {
			this.aClass128_2 = Static266.aClass128_3;
			this.aClass4_Sub1_Sub2_1 = null;
			Static60.anInt1600++;
			Static266.aClass128_3 = this;
		}
	}
}
