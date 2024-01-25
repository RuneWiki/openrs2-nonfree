import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ska")
public final class Class340 {

	@OriginalMember(owner = "client!ska", name = "c", descriptor = "I")
	public int anInt9213;

	@OriginalMember(owner = "client!ska", name = "l", descriptor = "I")
	public int anInt9215;

	@OriginalMember(owner = "client!ska", name = "k", descriptor = "I")
	public int anInt9217;

	@OriginalMember(owner = "client!ska", name = "m", descriptor = "I")
	public int anInt9218;

	@OriginalMember(owner = "client!ska", name = "d", descriptor = "I")
	public int anInt9220;

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "I")
	public int anInt9222;

	@OriginalMember(owner = "client!ska", name = "g", descriptor = "I")
	public int anInt9223;

	@OriginalMember(owner = "client!ska", name = "q", descriptor = "I")
	public int anInt9224;

	@OriginalMember(owner = "client!ska", name = "b", descriptor = "I")
	public int anInt9225;

	@OriginalMember(owner = "client!ska", name = "o", descriptor = "I")
	public int anInt9226;

	@OriginalMember(owner = "client!ska", name = "f", descriptor = "I")
	public int anInt9227;

	@OriginalMember(owner = "client!ska", name = "p", descriptor = "I")
	public int anInt9228;

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(Lclient!ska;B)Z")
	public boolean method8127(@OriginalArg(0) Class340 arg0) {
		return this.anInt9218 == arg0.anInt9218 && arg0.anInt9217 == this.anInt9217 && this.anInt9226 == arg0.anInt9226;
	}
}
