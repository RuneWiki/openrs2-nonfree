import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class65 {

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
	public int anInt1670;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "B")
	private byte aByte43;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	public int anInt1671;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
	public int anInt1673;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public int anInt1675;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
	public int anInt1676;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	public Class65() {
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!ofa;)V")
	public Class65(@OriginalArg(0) Class5_Sub22 arg0) {
		this.aByte43 = arg0.method5963();
		this.anInt1673 = arg0.method5968();
		this.anInt1675 = arg0.method5913();
		this.anInt1671 = arg0.method5913();
		this.anInt1676 = arg0.method5913();
		this.anInt1670 = arg0.method5913();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
	public int method1364() {
		return this.aByte43 & 0x7;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I")
	public int method1366() {
		return (this.aByte43 & 0x8) == 8 ? 1 : 0;
	}
}
