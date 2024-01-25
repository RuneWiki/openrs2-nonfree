import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class4 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!ae;")
	public Class4 aClass4_1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!gg;")
	public Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public int anInt123;

	static {
		new Class182("", 76);
		new Class209(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public void method140() {
		if (Static360.anInt6968 >= 500) {
			return;
		}
		this.aClass3_Sub2_1 = null;
		this.anInt123 = 0;
		this.aClass4_1 = Static47.aClass4_2;
		Static47.aClass4_2 = this;
		Static360.anInt6968++;
	}
}
