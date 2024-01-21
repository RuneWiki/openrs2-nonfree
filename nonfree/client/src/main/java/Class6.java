import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NQPZRHXK")
public class Class6 {

	@OriginalMember(owner = "client!NQPZRHXK", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!NQPZRHXK", name = "c", descriptor = "Lclient!NQPZRHXK;")
	public Class6 aClass6_41;

	@OriginalMember(owner = "client!NQPZRHXK", name = "d", descriptor = "Lclient!NQPZRHXK;")
	public Class6 aClass6_42;

	@OriginalMember(owner = "client!NQPZRHXK", name = "a", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!NQPZRHXK", name = "a", descriptor = "()V")
	public final void method545() {
		if (this.aClass6_42 != null) {
			this.aClass6_42.aClass6_41 = this.aClass6_41;
			this.aClass6_41.aClass6_42 = this.aClass6_42;
			this.aClass6_41 = null;
			this.aClass6_42 = null;
		}
	}
}
