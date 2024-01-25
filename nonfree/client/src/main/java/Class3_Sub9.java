import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public final class Class3_Sub9 extends Class3 implements Interface13 {

	@OriginalMember(owner = "client!bha", name = "m", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bha", name = "s", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!bha", name = "t", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!bha", name = "z", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)I")
	@Override
	public int method746() {
		return this.anInt717;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)I")
	@Override
	public int method747() {
		return this.anInt725;
	}

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)I")
	@Override
	public int method749() {
		return this.anInt720;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)C")
	@Override
	public char method745() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)J")
	@Override
	public long method748() {
		return this.aLong23;
	}
}
