import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class100 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	public int anInt3793;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	public int anInt3795;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	public int anInt3796;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
	public int anInt3800;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "B")
	private byte aByte12;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
	public int anInt3804;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class100() {
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class100(@OriginalArg(0) Class1_Sub17 arg0) {
		this.aByte12 = arg0.method2155();
		this.anInt3800 = arg0.method2178();
		this.anInt3793 = arg0.method2140();
		this.anInt3804 = arg0.method2140();
		this.anInt3795 = arg0.method2140();
		this.anInt3796 = arg0.method2140();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
	public int method3001() {
		return (this.aByte12 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
	public int method3003() {
		return this.aByte12 & 0x7;
	}
}
