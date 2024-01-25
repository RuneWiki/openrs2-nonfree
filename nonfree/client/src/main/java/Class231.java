import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class231 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public int anInt6504;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public int anInt6505;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "B")
	private byte aByte69;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public int anInt6507;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	public int anInt6511;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
	public int anInt6512;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class231() {
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!vt;)V")
	public Class231(@OriginalArg(0) Class2_Sub24 arg0) {
		this.aByte69 = arg0.method5759();
		this.anInt6505 = arg0.method5753();
		this.anInt6507 = arg0.method5776();
		this.anInt6504 = arg0.method5776();
		this.anInt6511 = arg0.method5776();
		this.anInt6512 = arg0.method5776();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
	public int method5610() {
		return this.aByte69 & 0x7;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)I")
	public int method5614() {
		return (this.aByte69 & 0x8) == 8 ? 1 : 0;
	}
}
