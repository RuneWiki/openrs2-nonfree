import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class345 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public int anInt9422;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public int anInt9423;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
	public int anInt9424;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
	public int anInt9426;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	public int anInt9428;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	public int anInt9429;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
	public int anInt9430;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
	public int anInt9431;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	public int anInt9433;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public int anInt9434;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
	public int anInt9436;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
	public int anInt9437;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!tm;I)Z")
	public boolean method8226(@OriginalArg(0) Class345 arg0) {
		return this.anInt9437 == arg0.anInt9437 && arg0.anInt9422 == this.anInt9422 && arg0.anInt9423 == this.anInt9423;
	}
}
