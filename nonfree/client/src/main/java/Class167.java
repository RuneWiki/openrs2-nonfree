import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class167 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!tp;")
	public Class47_Sub1 aClass47_Sub1_2;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public int anInt4346;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!mo;")
	public Class167 aClass167_2;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	public void method3611() {
		if (Static78.anInt1454 >= 500) {
			return;
		}
		this.anInt4346 = 0;
		this.aClass47_Sub1_2 = null;
		this.aClass167_2 = Static321.aClass167_3;
		Static321.aClass167_3 = this;
		Static78.anInt1454++;
	}
}
