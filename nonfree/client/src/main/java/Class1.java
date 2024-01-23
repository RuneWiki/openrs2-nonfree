import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class Class1 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!dh;")
	public Class1 aClass1_201;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "J")
	public long aLong170;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "Lclient!dh;")
	public Class1 aClass1_202;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Z")
	public final boolean method3751() {
		return this.aClass1_201 != null;
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
	public final void method3758() {
		if (this.aClass1_201 != null) {
			this.aClass1_201.aClass1_202 = this.aClass1_202;
			this.aClass1_202.aClass1_201 = this.aClass1_201;
			this.aClass1_202 = null;
			this.aClass1_201 = null;
		}
	}
}
