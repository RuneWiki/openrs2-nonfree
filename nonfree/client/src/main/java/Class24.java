import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class24 {

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	public int anInt764;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
	public int anInt765;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!aq;I)Z")
	public boolean method798(@OriginalArg(0) Class24 arg0) {
		return this.anInt761 == arg0.anInt761 && this.anInt763 == arg0.anInt763 && this.anInt765 == arg0.anInt765;
	}
}
