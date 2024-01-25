import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class146 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
	public int anInt4004;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
	public int anInt4005;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
	public int anInt4007;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
	public int anInt4008;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	public int anInt4009;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
	public int anInt4010;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
	public int anInt4011;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
	public int anInt4012;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
	public int anInt4015;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
	public int anInt4016;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
	public int anInt4017;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
	public int anInt4018;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!hs;I)Z")
	public boolean method3326(@OriginalArg(0) Class146 arg0) {
		return arg0.anInt4004 == this.anInt4004 && arg0.anInt4018 == this.anInt4018 && arg0.anInt4011 == this.anInt4011;
	}
}
