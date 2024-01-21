import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class Class1 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!jd;")
	public Class1 aClass1_213;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!jd;")
	public Class1 aClass1_214;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "J")
	public long aLong147;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z")
	public final boolean method3492() {
		return this.aClass1_214 != null;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public final void method3499() {
		if (this.aClass1_214 != null) {
			this.aClass1_214.aClass1_213 = this.aClass1_213;
			this.aClass1_213.aClass1_214 = this.aClass1_214;
			this.aClass1_214 = null;
			this.aClass1_213 = null;
		}
	}
}
