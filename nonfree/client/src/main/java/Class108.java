import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public final class Class108 {

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "Lclient!tv;")
	public Class15_Sub2 aClass15_Sub2_1;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "Lclient!gaa;")
	public Class108 aClass108_3;

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
	public int anInt3129;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	public void method2791() {
		if (Static516.anInt8761 >= 500) {
			return;
		}
		this.anInt3129 = 0;
		this.aClass108_3 = Static86.aClass108_2;
		this.aClass15_Sub2_1 = null;
		Static516.anInt8761++;
		Static86.aClass108_2 = this;
	}
}
