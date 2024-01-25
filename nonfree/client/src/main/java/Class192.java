import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class192 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "Lclient!lba;")
	public Class192 aClass192_3;

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "Lclient!at;")
	public Class21_Sub1_Sub1 aClass21_Sub1_Sub1_1;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V")
	public void method4605() {
		if (Static123.anInt9123 < 500) {
			this.aClass192_3 = Static186.aClass192_1;
			this.aClass21_Sub1_Sub1_1 = null;
			Static186.aClass192_1 = this;
			Static123.anInt9123++;
		}
	}
}
