import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class62 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public int anInt3035;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public int anInt3036;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	public int anInt3037;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public int anInt3038;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	public int anInt3040;

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class62() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!ab;)V")
	public Class62(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aByte7 = arg0.method1707();
		this.anInt3037 = arg0.method1680();
		this.anInt3035 = arg0.method1690();
		this.anInt3038 = arg0.method1690();
		this.anInt3040 = arg0.method1690();
		this.anInt3036 = arg0.method1690();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
	public int method2086() {
		return (this.aByte7 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)I")
	public int method2087() {
		return this.aByte7 & 0x7;
	}
}
