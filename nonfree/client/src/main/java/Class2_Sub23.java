import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class2_Sub23 extends Class2 implements Interface16 {

	@OriginalMember(owner = "client!ica", name = "p", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ica", name = "s", descriptor = "J")
	public long aLong109;

	@OriginalMember(owner = "client!ica", name = "u", descriptor = "I")
	public int anInt5119;

	@OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
	public int anInt5120;

	@OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
	public int anInt5123;

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
	@Override
	public int method4432() {
		return this.anInt5123;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)C")
	@Override
	public char method4433() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
	@Override
	public int method4431() {
		return this.anInt5119;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)J")
	@Override
	public long method4434() {
		return this.aLong109;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)I")
	@Override
	public int method4435() {
		return this.anInt5120;
	}
}
