import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class342 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
	public int anInt8929;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
	public int anInt8930;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	public int anInt8931;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
	public int anInt8933;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	public int anInt8934;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
	public int anInt8935;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
	public int anInt8936;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
	public int anInt8937;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
	public int anInt8938;

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
	public int anInt8939;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
	public int anInt8941;

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
	public int anInt8942;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ur;Z)Z")
	public boolean method7114(@OriginalArg(0) Class342 arg0) {
		return this.anInt8929 == arg0.anInt8929 && this.anInt8935 == arg0.anInt8935 && arg0.anInt8934 == this.anInt8934;
	}
}
