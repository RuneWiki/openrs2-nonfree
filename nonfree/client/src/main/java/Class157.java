import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class157 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	public int anInt3906;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	public int anInt3909;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "B")
	private byte aByte49;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
	public int anInt3911;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
	public int anInt3912;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class157() {
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!rp;)V")
	public Class157(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aByte49 = arg0.method2753();
		this.anInt3909 = arg0.method2767();
		this.anInt3911 = arg0.method2726();
		this.anInt3908 = arg0.method2726();
		this.anInt3906 = arg0.method2726();
		this.anInt3912 = arg0.method2726();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)I")
	public int method3676() {
		return this.aByte49 & 0x7;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)I")
	public int method3679() {
		return (this.aByte49 & 0x8) == 8 ? 1 : 0;
	}
}
