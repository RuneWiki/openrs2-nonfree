import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class169 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
	public int anInt4253;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	public int anInt4254;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
	public int anInt4256;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
	public int anInt4257;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
	public int anInt4259;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
	public int anInt4260;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
	public int anInt4262;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	public int anInt4263;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	public int anInt4264;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
	public int anInt4265;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	public int anInt4266;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public int anInt4267;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLclient!iq;)Z")
	public boolean method3786(@OriginalArg(1) Class169 arg0) {
		return arg0.anInt4265 == this.anInt4265 && this.anInt4259 == arg0.anInt4259 && this.anInt4267 == arg0.anInt4267;
	}
}
