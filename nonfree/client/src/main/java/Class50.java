import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class Class50 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	public int anInt1376;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
	public int anInt1380;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public int anInt1383;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Z")
	public final boolean method1127() {
		return (this.anInt1376 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Z")
	public final boolean method1128() {
		return (this.anInt1376 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)Z")
	public final boolean method1130() {
		return (this.anInt1376 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Z")
	public final boolean method1133() {
		return (this.anInt1376 & 0x8) != 0;
	}
}
