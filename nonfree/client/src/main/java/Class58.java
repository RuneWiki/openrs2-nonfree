import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class58 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "B")
	private byte aByte7;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public int anInt3120;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	public int anInt3123;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public int anInt3124;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	public int anInt3126;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class58() {
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class58(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aByte7 = arg0.method1611();
		this.anInt3126 = arg0.method1642();
		this.anInt3124 = arg0.method1626();
		this.anInt3123 = arg0.method1626();
		this.anInt3127 = arg0.method1626();
		this.anInt3120 = arg0.method1626();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public int method2225() {
		return this.aByte7 & 0x7;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
	public int method2226() {
		return (this.aByte7 & 0x8) == 8 ? 1 : 0;
	}
}
