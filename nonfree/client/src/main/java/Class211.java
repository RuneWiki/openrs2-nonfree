import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class211 {

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	public int anInt5530;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	public int anInt5531;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	public int anInt5532;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	public int anInt5534;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
	public int anInt5536;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	public int anInt5538;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	public int anInt5539;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
	public int anInt5540;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
	public int anInt5541;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
	public int anInt5542;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public int anInt5543;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!kj;I)Z")
	public boolean method4909(@OriginalArg(0) Class211 arg0) {
		return arg0.anInt5541 == this.anInt5541 && this.anInt5534 == arg0.anInt5534 && arg0.anInt5538 == this.anInt5538;
	}
}
