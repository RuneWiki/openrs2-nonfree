import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class19 {

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
	public int anInt765;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
	public int anInt773;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!aw;I)Z")
	public boolean method791(@OriginalArg(0) Class19 arg0) {
		return arg0.anInt767 == this.anInt767 && this.anInt776 == arg0.anInt776 && arg0.anInt774 == this.anInt774;
	}
}
