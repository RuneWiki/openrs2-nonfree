import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class199 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	public int anInt5222;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public int anInt5224;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	public int anInt5225;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public int anInt5226;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	public int anInt5227;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	public int anInt5228;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public int anInt5229;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	public int anInt5232;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public int anInt5233;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	public int anInt5234;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public int anInt5236;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!lb;)Z")
	public boolean method4308(@OriginalArg(1) Class199 arg0) {
		return this.anInt5227 == arg0.anInt5227 && this.anInt5226 == arg0.anInt5226 && arg0.anInt5228 == this.anInt5228;
	}
}
