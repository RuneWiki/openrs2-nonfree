import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JZLLDEPM")
public class Class2 {

	@OriginalMember(owner = "client!JZLLDEPM", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!JZLLDEPM", name = "c", descriptor = "Lclient!JZLLDEPM;")
	public Class2 aClass2_39;

	@OriginalMember(owner = "client!JZLLDEPM", name = "d", descriptor = "Lclient!JZLLDEPM;")
	public Class2 aClass2_40;

	@OriginalMember(owner = "client!JZLLDEPM", name = "a", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!JZLLDEPM", name = "a", descriptor = "()V")
	public final void method504() {
		if (this.aClass2_40 != null) {
			this.aClass2_40.aClass2_39 = this.aClass2_39;
			this.aClass2_39.aClass2_40 = this.aClass2_40;
			this.aClass2_39 = null;
			this.aClass2_40 = null;
		}
	}
}
