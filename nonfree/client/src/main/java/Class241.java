import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class241 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!tn;")
	public Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public int anInt6554;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!uc;")
	public Class241 aClass241_1;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public void method5079() {
		if (Static308.anInt5305 >= 500) {
			return;
		}
		this.aClass241_1 = Static455.aClass241_3;
		this.aClass3_Sub4_2 = null;
		this.anInt6554 = 0;
		Static455.aClass241_3 = this;
		Static308.anInt5305++;
	}
}
