import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class2_Sub37 extends Class2 implements Interface13 {

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	public int anInt6874;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	public int anInt6878;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "J")
	public long aLong171;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public int anInt6880;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)I")
	@Override
	public int method5851() {
		return this.anInt6878;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)C")
	@Override
	public char method5852() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)J")
	@Override
	public long method5853() {
		return this.aLong171;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I")
	@Override
	public int method5854() {
		return this.anInt6874;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
	@Override
	public int method5850() {
		return this.anInt6880;
	}
}
