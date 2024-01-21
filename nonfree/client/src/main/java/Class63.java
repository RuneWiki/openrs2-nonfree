import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class63 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public int anInt3710;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public int anInt3714;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	public int anInt3715;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public int anInt3716;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public int anInt3717;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	public Class63() {
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!hc;)V")
	public Class63(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aByte6 = arg0.method548();
		this.anInt3715 = arg0.method546();
		this.anInt3710 = arg0.method499();
		this.anInt3717 = arg0.method499();
		this.anInt3716 = arg0.method499();
		this.anInt3714 = arg0.method499();
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
	public int method2538() {
		return this.aByte6 & 0x7;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I")
	public int method2539() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}
}
