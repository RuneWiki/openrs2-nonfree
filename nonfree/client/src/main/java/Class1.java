import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class Class1 {

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Lclient!fi;")
	public Class1 aClass1_243;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Lclient!fi;")
	public Class1 aClass1_244;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "J")
	public long aLong207;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Z")
	public final boolean method5576() {
		return this.aClass1_244 != null;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public final void method5577() {
		if (this.aClass1_244 != null) {
			this.aClass1_244.aClass1_243 = this.aClass1_243;
			this.aClass1_243.aClass1_244 = this.aClass1_244;
			this.aClass1_244 = null;
			this.aClass1_243 = null;
		}
	}
}
