import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class Class41 {

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public int anInt1439;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
	public int anInt1446;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z")
	public final boolean method1234() {
		return (this.anInt1446 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)Z")
	public final boolean method1237() {
		return (this.anInt1446 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)Z")
	public final boolean method1239() {
		return (this.anInt1446 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)Z")
	public final boolean method1242() {
		return (this.anInt1446 & 0x4) != 0;
	}
}
