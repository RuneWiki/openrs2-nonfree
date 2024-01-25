import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public final class Class4_Sub31 extends Class4 implements Interface2 {

	@OriginalMember(owner = "client!nw", name = "m", descriptor = "I")
	public int anInt7039;

	@OriginalMember(owner = "client!nw", name = "o", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "I")
	public int anInt7042;

	@OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
	public int anInt7043;

	@OriginalMember(owner = "client!nw", name = "w", descriptor = "J")
	public long aLong180;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)C")
	@Override
	public char method5851() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)I")
	@Override
	public int method5849() {
		return this.anInt7039;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)I")
	@Override
	public int method5853() {
		return this.anInt7043;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)I")
	@Override
	public int method5852() {
		return this.anInt7042;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)J")
	@Override
	public long method5850() {
		return this.aLong180;
	}
}
