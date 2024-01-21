import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CZLFLPZK")
public class Class6 {

	@OriginalMember(owner = "client!CZLFLPZK", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!CZLFLPZK", name = "b", descriptor = "Lclient!CZLFLPZK;")
	public Class6 aClass6_41;

	@OriginalMember(owner = "client!CZLFLPZK", name = "c", descriptor = "Lclient!CZLFLPZK;")
	public Class6 aClass6_42;

	@OriginalMember(owner = "client!CZLFLPZK", name = "a", descriptor = "()V")
	public final void method542() {
		if (this.aClass6_42 != null) {
			this.aClass6_42.aClass6_41 = this.aClass6_41;
			this.aClass6_41.aClass6_42 = this.aClass6_42;
			this.aClass6_41 = null;
			this.aClass6_42 = null;
		}
	}
}
