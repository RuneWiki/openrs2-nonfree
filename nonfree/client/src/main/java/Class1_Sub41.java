import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class1_Sub41 extends Class1 implements Interface21 {

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "J")
	public long aLong345;

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
	public int anInt7860;

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
	public int anInt7861;

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
	public int anInt7862;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)I")
	@Override
	public int method6535() {
		return this.anInt7860;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)C")
	@Override
	public char method6536() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
	@Override
	public int method6532() {
		return this.anInt7862;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)J")
	@Override
	public long method6534() {
		return this.aLong345;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
	@Override
	public int method6533() {
		return this.anInt7861;
	}
}
