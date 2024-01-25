import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class187 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Lclient!bf;")
	public Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "Lclient!rr;")
	public Class187 aClass187_3;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
	public int anInt5493;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public void method5027() {
		if (Static230.anInt1972 >= 500) {
			return;
		}
		this.aClass11_Sub2_2 = null;
		this.anInt5493 = 0;
		this.aClass187_3 = Static55.aClass187_1;
		Static55.aClass187_1 = this;
		Static230.anInt1972++;
	}
}
