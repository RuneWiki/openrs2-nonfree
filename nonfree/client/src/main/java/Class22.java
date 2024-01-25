import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class Class22 {

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
	public int anInt1412;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	public int anInt1413;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
	public int anInt1414;

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Z")
	public final boolean method1427() {
		return (this.anInt1414 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)Z")
	public final boolean method1428() {
		return (this.anInt1414 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)Z")
	public final boolean method1430() {
		return (this.anInt1414 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)Z")
	public final boolean method1431() {
		return (this.anInt1414 & 0x1) != 0;
	}
}
