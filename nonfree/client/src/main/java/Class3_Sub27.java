import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class3_Sub27 extends Class3 implements Interface7 {

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
	public int anInt3773;

	@OriginalMember(owner = "client!hp", name = "q", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
	public int anInt3778;

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "J")
	public long aLong114;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)I")
	@Override
	public int method3366() {
		return this.anInt3773;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)I")
	@Override
	public int method3367() {
		return this.anInt3778;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
	@Override
	public int method3368() {
		return this.anInt3779;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)J")
	@Override
	public long method3369() {
		return this.aLong114;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)C")
	@Override
	public char method3370() {
		return this.aChar3;
	}
}
