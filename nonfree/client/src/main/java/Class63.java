import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class63 {

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
	public int anInt1196;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
	public int anInt1199;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public int anInt1203;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "B")
	private byte aByte25;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	public int anInt1206;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class63() {
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class63(@OriginalArg(0) Class5_Sub36 arg0) {
		this.aByte25 = arg0.method7318();
		this.anInt1203 = arg0.method7333();
		this.anInt1199 = arg0.method7268();
		this.anInt1205 = arg0.method7268();
		this.anInt1196 = arg0.method7268();
		this.anInt1206 = arg0.method7268();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	public int method1165() {
		return this.aByte25 & 0x7;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
	public int method1166() {
		return (this.aByte25 & 0x8) == 8 ? 1 : 0;
	}
}
