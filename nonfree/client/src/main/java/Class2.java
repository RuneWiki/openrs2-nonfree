import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2 {

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public int anInt64;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public int anInt66;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt68;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	public int anInt69;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public int anInt70;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class2() {
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!hp;)V")
	public Class2(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aByte1 = arg0.method5416();
		this.anInt64 = arg0.method5362();
		this.anInt68 = arg0.method5407();
		this.anInt70 = arg0.method5407();
		this.anInt66 = arg0.method5407();
		this.anInt69 = arg0.method5407();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)I")
	public int method63() {
		return this.aByte1 & 0x7;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
	public int method66() {
		return (this.aByte1 & 0x8) == 8 ? 1 : 0;
	}
}
