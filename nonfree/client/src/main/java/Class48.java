import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class48 {

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "B")
	private byte aByte22;

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
	public int anInt1485;

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
	public int anInt1486;

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
	public int anInt1487;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
	public int anInt1488;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
	public int anInt1489;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "()V")
	public Class48() {
	}

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!iaa;)V")
	public Class48(@OriginalArg(0) Class6_Sub26 arg0) {
		this.aByte22 = arg0.method4972();
		this.anInt1488 = arg0.method4999();
		this.anInt1489 = arg0.method5000();
		this.anInt1487 = arg0.method5000();
		this.anInt1486 = arg0.method5000();
		this.anInt1485 = arg0.method5000();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I")
	public int method1319() {
		return (this.aByte22 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)I")
	public int method1323() {
		return this.aByte22 & 0x7;
	}
}
