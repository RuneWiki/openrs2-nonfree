import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BLBQHZXT")
public class Class1 {

	@OriginalMember(owner = "client!BLBQHZXT", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!BLBQHZXT", name = "b", descriptor = "Lclient!BLBQHZXT;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!BLBQHZXT", name = "c", descriptor = "Lclient!BLBQHZXT;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!BLBQHZXT", name = "a", descriptor = "()V")
	public final void method571() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
