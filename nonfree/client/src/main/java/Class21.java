import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public final class Class21 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "Lclient!tg;")
	public Class11_Sub1_Sub1 aClass11_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "Lclient!bda;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
	public void method639() {
		if (Static533.anInt8980 < 500) {
			this.aClass11_Sub1_Sub1_1 = null;
			this.aClass21_1 = Static52.aClass21_3;
			Static533.anInt8980++;
			Static52.aClass21_3 = this;
		}
	}
}
