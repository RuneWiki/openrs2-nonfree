import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class Class47 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public int anInt1353;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt1355;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public int anInt1359;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Z")
	public final boolean method1193() {
		return (this.anInt1353 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Z")
	public final boolean method1194() {
		return (this.anInt1353 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Z")
	public final boolean method1196() {
		return (this.anInt1353 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Z")
	public final boolean method1197() {
		return (this.anInt1353 & 0x4) != 0;
	}
}
