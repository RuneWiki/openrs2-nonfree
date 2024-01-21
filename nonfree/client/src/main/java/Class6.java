import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OKDOXVFL")
public class Class6 {

	@OriginalMember(owner = "client!OKDOXVFL", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!OKDOXVFL", name = "b", descriptor = "Lclient!OKDOXVFL;")
	public Class6 aClass6_41;

	@OriginalMember(owner = "client!OKDOXVFL", name = "c", descriptor = "Lclient!OKDOXVFL;")
	public Class6 aClass6_42;

	@OriginalMember(owner = "client!OKDOXVFL", name = "a", descriptor = "()V")
	public final void method512() {
		if (this.aClass6_42 != null) {
			this.aClass6_42.aClass6_41 = this.aClass6_41;
			this.aClass6_41.aClass6_42 = this.aClass6_42;
			this.aClass6_41 = null;
			this.aClass6_42 = null;
		}
	}
}
