import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class92 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public int anInt2084;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "B")
	private byte aByte26;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public int anInt2087;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	public int anInt2090;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "I")
	public int anInt2092;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class92() {
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class92(@OriginalArg(0) Class2_Sub7 arg0) {
		this.aByte26 = arg0.method4477();
		this.anInt2087 = arg0.method4518();
		this.anInt2084 = arg0.method4509();
		this.anInt2092 = arg0.method4509();
		this.anInt2090 = arg0.method4509();
		this.anInt2089 = arg0.method4509();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	public int method1724() {
		return this.aByte26 & 0x7;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)I")
	public int method1725() {
		return (this.aByte26 & 0x8) == 8 ? 1 : 0;
	}
}
