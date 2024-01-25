import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class232 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	public int anInt7238;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
	public int anInt7240;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
	public int anInt7241;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
	public int anInt7243;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
	public int anInt7244;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
	public int anInt7246;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
	public int anInt7248;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
	public int anInt7249;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
	public int anInt7250;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
	public int anInt7251;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	public int anInt7252;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
	public int anInt7253;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!nt;Z)Z")
	public boolean method6058(@OriginalArg(0) Class232 arg0) {
		return this.anInt7238 == arg0.anInt7238 && this.anInt7240 == arg0.anInt7240 && this.anInt7244 == arg0.anInt7244;
	}
}
