import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class251 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "I")
	public int anInt7241;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	public int anInt7242;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "B")
	private byte aByte98;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public int anInt7243;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public int anInt7245;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	public int anInt7251;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class251() {
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!md;)V")
	public Class251(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aByte98 = arg0.method3693();
		this.anInt7242 = arg0.method3711();
		this.anInt7245 = arg0.method3731();
		this.anInt7251 = arg0.method3731();
		this.anInt7243 = arg0.method3731();
		this.anInt7241 = arg0.method3731();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I")
	public int method5636() {
		return (this.aByte98 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
	public int method5640() {
		return this.aByte98 & 0x7;
	}
}
