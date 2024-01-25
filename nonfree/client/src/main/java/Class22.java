import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class22 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!lq;")
	public Class31_Sub2 aClass31_Sub2_1;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!bg;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	public void method579() {
		if (Static156.anInt2954 >= 500) {
			return;
		}
		this.anInt640 = 0;
		this.aClass22_1 = Static200.aClass22_3;
		this.aClass31_Sub2_1 = null;
		Static156.anInt2954++;
		Static200.aClass22_3 = this;
	}
}
