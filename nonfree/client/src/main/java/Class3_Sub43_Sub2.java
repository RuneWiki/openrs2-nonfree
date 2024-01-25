import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class3_Sub43_Sub2 extends Class3_Sub43 {

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
	public int anInt8908;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "J")
	public long aLong258;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
	public int anInt8913;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
	public int anInt8914;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
	public int anInt8917;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
	@Override
	public int method7776() {
		return this.anInt8913;
	}

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)J")
	@Override
	public long method7779() {
		return this.aLong258;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
	@Override
	public int method7774() {
		return this.anInt8914;
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)I")
	@Override
	public int method7777() {
		return this.anInt8917;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)I")
	@Override
	public int method7778() {
		return this.anInt8908;
	}
}
