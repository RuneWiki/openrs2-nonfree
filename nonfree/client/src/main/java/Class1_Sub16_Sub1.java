import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class1_Sub16_Sub1 extends Class1_Sub16 {

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "J")
	public long aLong69;

	@OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
	public int anInt2085;

	@OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
	public int anInt2086;

	@OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
	public int anInt2087;

	@OriginalMember(owner = "client!eba", name = "z", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)I")
	@Override
	public int method3648() {
		return this.anInt2089;
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(B)I")
	@Override
	public int method3650() {
		return this.anInt2087;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)I")
	@Override
	public int method3646() {
		return this.anInt2085;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(Z)J")
	@Override
	public long method3649() {
		return this.aLong69;
	}

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "(B)I")
	@Override
	public int method3652() {
		return this.anInt2086;
	}
}
