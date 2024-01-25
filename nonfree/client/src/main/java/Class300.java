import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class300 {

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	public int anInt8663;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public int anInt8664;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	public int anInt8665;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	public int anInt8666;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public int anInt8667;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public int anInt8668;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	public int anInt8669;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public int anInt8670;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public int anInt8671;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	public int anInt8673;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public int anInt8674;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int anInt8675;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!qd;)Z")
	public boolean method7263(@OriginalArg(1) Class300 arg0) {
		return this.anInt8674 == arg0.anInt8674 && this.anInt8663 == arg0.anInt8663 && arg0.anInt8675 == this.anInt8675;
	}
}
