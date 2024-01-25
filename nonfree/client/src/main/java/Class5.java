import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public int anInt56;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
	public int anInt57;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public int anInt59;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public int anInt60;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	public int anInt61;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	public int anInt62;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	public int anInt64;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	public int anInt66;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
	public int anInt67;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public int anInt68;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ad;)Z")
	public boolean method79(@OriginalArg(1) Class5 arg0) {
		return arg0.anInt58 == this.anInt58 && this.anInt59 == arg0.anInt59 && this.anInt63 == arg0.anInt63;
	}
}
