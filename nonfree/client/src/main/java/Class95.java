import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class95 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!hd;")
	public Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	public int anInt2764;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "Lclient!hr;")
	public Class95 aClass95_3;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public void method2463() {
		if (Static234.anInt4844 >= 500) {
			return;
		}
		this.anInt2764 = 0;
		this.aClass2_Sub2_1 = null;
		this.aClass95_3 = Static59.aClass95_1;
		Static234.anInt4844++;
		Static59.aClass95_1 = this;
	}
}
