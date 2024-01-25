import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class116 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "B")
	private byte aByte34;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public int anInt3018;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	public int anInt3023;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public int anInt3024;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	public int anInt3025;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public int anInt3026;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class116() {
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!kh;)V")
	public Class116(@OriginalArg(0) Class11_Sub25 arg0) {
		this.aByte34 = arg0.method5175();
		this.anInt3024 = arg0.method5187();
		this.anInt3026 = arg0.method5198();
		this.anInt3025 = arg0.method5198();
		this.anInt3018 = arg0.method5198();
		this.anInt3023 = arg0.method5198();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	public int method2557() {
		return this.aByte34 & 0x7;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
	public int method2558() {
		return (this.aByte34 & 0x8) == 8 ? 1 : 0;
	}
}
