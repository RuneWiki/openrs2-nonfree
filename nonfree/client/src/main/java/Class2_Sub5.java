import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	public final int anInt478;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	public final int anInt475;

	static {
		new Class93("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt478 = arg0;
		this.anInt475 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)Z")
	public boolean method708(@OriginalArg(0) int arg0) {
		return (this.anInt478 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
	public boolean method709() {
		return (this.anInt478 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z")
	public boolean method710() {
		return (this.anInt478 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)Z")
	public boolean method711() {
		return (this.anInt478 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)I")
	public int method714() {
		return Static65.method1491(this.anInt478);
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)I")
	public int method715() {
		return this.anInt478 >> 18 & 0x7;
	}
}
