import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class205 {

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "Lclient!nga;")
	public Class34_Sub1_Sub1 aClass34_Sub1_Sub1_1;

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "Lclient!lda;")
	public Class205 aClass205_3;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
	public void method4729() {
		if (Static366.anInt6248 < 500) {
			this.aClass34_Sub1_Sub1_1 = null;
			this.aClass205_3 = Static38.aClass205_2;
			Static366.anInt6248++;
			Static38.aClass205_2 = this;
		}
	}
}
