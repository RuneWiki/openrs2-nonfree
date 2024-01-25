import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class81 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public int anInt2432;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Lclient!jr;")
	public Class10_Sub3 aClass10_Sub3_1;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!gr;")
	public Class81 aClass81_3;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public void method2352() {
		if (Static277.anInt5269 >= 500) {
			return;
		}
		this.aClass10_Sub3_1 = null;
		this.aClass81_3 = Static236.aClass81_2;
		this.anInt2432 = 0;
		Static236.aClass81_2 = this;
		Static277.anInt5269++;
	}
}
