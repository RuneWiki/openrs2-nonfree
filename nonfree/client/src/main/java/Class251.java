import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class251 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	public int anInt7018;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "Lclient!ur;")
	public Class251 aClass251_3;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Lclient!vn;")
	public Class8_Sub3 aClass8_Sub3_2;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public void method5637() {
		if (Static103.anInt1877 >= 500) {
			return;
		}
		this.anInt7018 = 0;
		this.aClass251_3 = Static41.aClass251_1;
		this.aClass8_Sub3_2 = null;
		Static41.aClass251_1 = this;
		Static103.anInt1877++;
	}
}
