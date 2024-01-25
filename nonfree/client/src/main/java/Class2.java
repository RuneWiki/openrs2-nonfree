import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
	public int anInt6;

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
	public int anInt8;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
	public Class2() {
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class2(@OriginalArg(0) Class5_Sub41 arg0) {
		this.aByte1 = arg0.method7861();
		this.anInt10 = arg0.method7860();
		this.anInt8 = arg0.method7804();
		this.anInt5 = arg0.method7804();
		this.anInt6 = arg0.method7804();
		this.anInt9 = arg0.method7804();
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)I")
	public int method23() {
		return (this.aByte1 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
	public int method25() {
		return this.aByte1 & 0x7;
	}
}
