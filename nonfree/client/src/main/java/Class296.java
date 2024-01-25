import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Class296 {

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
	public int anInt8050;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	public int anInt8051;

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
	public int anInt8053;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
	public int anInt8054;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
	public int anInt8055;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
	public int anInt8056;

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
	public int anInt8057;

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
	public int anInt8058;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
	public int anInt8059;

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
	public int anInt8060;

	@OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
	public int anInt8061;

	@OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
	public int anInt8063;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!rba;I)Z")
	public boolean method7015(@OriginalArg(0) Class296 arg0) {
		return arg0.anInt8050 == this.anInt8050 && arg0.anInt8053 == this.anInt8053 && this.anInt8054 == arg0.anInt8054;
	}
}
