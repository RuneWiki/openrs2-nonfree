import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class187 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!lba;")
	public Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public int anInt5462;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!mg;")
	public Class187 aClass187_1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	public void method4694() {
		if (Static132.anInt2533 >= 500) {
			return;
		}
		this.anInt5462 = 0;
		this.aClass1_Sub1_1 = null;
		this.aClass187_1 = Static387.aClass187_2;
		Static387.aClass187_2 = this;
		Static132.anInt2533++;
	}
}
