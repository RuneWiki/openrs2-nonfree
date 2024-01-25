import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class3_Sub21_Sub2 extends Class3_Sub21 {

	@OriginalMember(owner = "client!uda", name = "n", descriptor = "I")
	public int anInt9435;

	@OriginalMember(owner = "client!uda", name = "o", descriptor = "I")
	public int anInt9436;

	@OriginalMember(owner = "client!uda", name = "p", descriptor = "J")
	public long aLong278;

	@OriginalMember(owner = "client!uda", name = "q", descriptor = "I")
	public int anInt9437;

	@OriginalMember(owner = "client!uda", name = "r", descriptor = "I")
	public int anInt9438;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)I")
	@Override
	public int method7977() {
		return this.anInt9436;
	}

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "(I)I")
	@Override
	public int method7982() {
		return this.anInt9438;
	}

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "(I)I")
	@Override
	public int method7983() {
		return this.anInt9437;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)I")
	@Override
	public int method7981() {
		return this.anInt9435;
	}

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)J")
	@Override
	public long method7979() {
		return this.aLong278;
	}
}
