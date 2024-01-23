import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class54 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public int anInt1524;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public int anInt1525;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	public int anInt1530;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	public int anInt1531;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
	public int anInt1534;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class54() {
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class54(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aByte8 = arg0.method3920();
		this.anInt1524 = arg0.method3948();
		this.anInt1530 = arg0.method3896();
		this.anInt1531 = arg0.method3896();
		this.anInt1534 = arg0.method3896();
		this.anInt1525 = arg0.method3896();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public int method1251() {
		return this.aByte8 & 0x7;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
	public int method1252() {
		return (this.aByte8 & 0x8) == 8 ? 1 : 0;
	}
}
