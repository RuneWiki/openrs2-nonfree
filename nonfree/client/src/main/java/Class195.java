import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class195 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!pc;")
	public Class195 aClass195_2;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!tm;")
	public Class11_Sub5 aClass11_Sub5_1;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public int anInt5542;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public void method4423() {
		if (Static88.anInt4390 >= 500) {
			return;
		}
		this.aClass11_Sub5_1 = null;
		this.anInt5542 = 0;
		this.aClass195_2 = Static364.aClass195_3;
		Static364.aClass195_3 = this;
		Static88.anInt4390++;
	}
}
