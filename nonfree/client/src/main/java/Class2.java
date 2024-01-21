import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TVKHSKYG")
public class Class2 {

	@OriginalMember(owner = "client!TVKHSKYG", name = "b", descriptor = "J")
	public long aLong25;

	@OriginalMember(owner = "client!TVKHSKYG", name = "c", descriptor = "Lclient!TVKHSKYG;")
	public Class2 aClass2_41;

	@OriginalMember(owner = "client!TVKHSKYG", name = "d", descriptor = "Lclient!TVKHSKYG;")
	public Class2 aClass2_42;

	@OriginalMember(owner = "client!TVKHSKYG", name = "a", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!TVKHSKYG", name = "a", descriptor = "()V")
	public final void method530() {
		if (this.aClass2_42 != null) {
			this.aClass2_42.aClass2_41 = this.aClass2_41;
			this.aClass2_41.aClass2_42 = this.aClass2_42;
			this.aClass2_41 = null;
			this.aClass2_42 = null;
		}
	}
}
