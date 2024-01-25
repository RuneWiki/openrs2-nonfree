import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class4_Sub19 extends Class4 implements Interface5 {

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
	public int anInt3161;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "J")
	public long aLong105;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
	public int anInt3169;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I")
	@Override
	public int method2830() {
		return this.anInt3169;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I")
	@Override
	public int method2832() {
		return this.anInt3161;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)C")
	@Override
	public char method2833() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I")
	@Override
	public int method2834() {
		return this.anInt3168;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)J")
	@Override
	public long method2831() {
		return this.aLong105;
	}
}
