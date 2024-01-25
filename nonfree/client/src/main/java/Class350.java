import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class350 {

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	public int anInt9010;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
	public int anInt9012;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	public int anInt9013;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public int anInt9014;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
	public int anInt9015;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public int anInt9016;

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
	public int anInt9017;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	public int anInt9018;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	public int anInt9019;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
	public int anInt9021;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
	public int anInt9022;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
	public int anInt9023;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!vj;)Z")
	public boolean method7495(@OriginalArg(1) Class350 arg0) {
		return this.anInt9022 == arg0.anInt9022 && arg0.anInt9013 == this.anInt9013 && arg0.anInt9014 == this.anInt9014;
	}
}
