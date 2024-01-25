import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class Class2 {

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "J")
	public long aLong352;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Lclient!hh;")
	public Class2 aClass2_345;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!hh;")
	public Class2 aClass2_346;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Z")
	public final boolean method9871() {
		return this.aClass2_346 != null;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
	public final void method9872() {
		if (this.aClass2_346 != null) {
			this.aClass2_346.aClass2_345 = this.aClass2_345;
			this.aClass2_345.aClass2_346 = this.aClass2_346;
			this.aClass2_346 = null;
			this.aClass2_345 = null;
		}
	}
}
