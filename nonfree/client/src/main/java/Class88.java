import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class88 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public int anInt3791;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	public int anInt3798;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	public int anInt3800;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	public int anInt3804;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
	public int anInt3806;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class88() {
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!fj;)V")
	public Class88(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aByte6 = arg0.method2770();
		this.anInt3800 = arg0.method2765();
		this.anInt3806 = arg0.method2793();
		this.anInt3791 = arg0.method2793();
		this.anInt3798 = arg0.method2793();
		this.anInt3804 = arg0.method2793();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
	public int method2920() {
		return this.aByte6 & 0x7;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)I")
	public int method2922() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}
}
