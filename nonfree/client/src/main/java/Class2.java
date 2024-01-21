import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OJTWJXEY")
public class Class2 {

	@OriginalMember(owner = "client!OJTWJXEY", name = "b", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!OJTWJXEY", name = "c", descriptor = "Lclient!OJTWJXEY;")
	public Class2 aClass2_41;

	@OriginalMember(owner = "client!OJTWJXEY", name = "d", descriptor = "Lclient!OJTWJXEY;")
	public Class2 aClass2_42;

	@OriginalMember(owner = "client!OJTWJXEY", name = "a", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!OJTWJXEY", name = "a", descriptor = "()V")
	public final void method466() {
		if (this.aClass2_42 != null) {
			this.aClass2_42.aClass2_41 = this.aClass2_41;
			this.aClass2_41.aClass2_42 = this.aClass2_42;
			this.aClass2_41 = null;
			this.aClass2_42 = null;
		}
	}
}
