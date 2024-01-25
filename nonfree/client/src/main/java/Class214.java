import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class214 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!wd;")
	public Class214 aClass214_21;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public int anInt6237;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!pf;")
	public Class44_Sub4 aClass44_Sub4_1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public void method5645() {
		if (Static349.anInt6298 >= 500) {
			return;
		}
		this.aClass44_Sub4_1 = null;
		this.aClass214_21 = Static208.aClass214_22;
		this.anInt6237 = 0;
		Static208.aClass214_22 = this;
		Static349.anInt6298++;
	}
}
