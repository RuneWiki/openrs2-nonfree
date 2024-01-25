import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class5_Sub35 extends Class5 implements Interface18 {

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
	public int anInt6307;

	@OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
	public int anInt6310;

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
	public int anInt6311;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!mea", name = "q", descriptor = "J")
	public long aLong180;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)I")
	@Override
	public int method5314() {
		return this.anInt6311;
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)C")
	@Override
	public char method5313() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)J")
	@Override
	public long method5310() {
		return this.aLong180;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)I")
	@Override
	public int method5311() {
		return this.anInt6307;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)I")
	@Override
	public int method5312() {
		return this.anInt6310;
	}
}
