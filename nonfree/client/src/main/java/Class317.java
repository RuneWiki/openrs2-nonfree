import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class317 {

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public int anInt8314;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	public int anInt8315;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public int anInt8316;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	public int anInt8317;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	public int anInt8318;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	public int anInt8319;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	public int anInt8321;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public int anInt8324;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public int anInt8325;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	public int anInt8326;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public int anInt8327;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public int anInt8329;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!rk;)Z")
	public boolean method7143(@OriginalArg(1) Class317 arg0) {
		return this.anInt8317 == arg0.anInt8317 && arg0.anInt8326 == this.anInt8326 && this.anInt8316 == arg0.anInt8316;
	}
}
