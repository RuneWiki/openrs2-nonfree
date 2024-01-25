import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class104 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public int anInt3159;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "B")
	private byte aByte20;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	public int anInt3166;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	public int anInt3167;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	public int anInt3169;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	public int anInt3170;

	static {
		new Class106("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class104() {
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!at;)V")
	public Class104(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aByte20 = arg0.method2122();
		this.anInt3159 = arg0.method2161();
		this.anInt3170 = arg0.method2140();
		this.anInt3166 = arg0.method2140();
		this.anInt3169 = arg0.method2140();
		this.anInt3167 = arg0.method2140();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
	public int method2915() {
		return this.aByte20 & 0x7;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(Z)I")
	public int method2922() {
		return (this.aByte20 & 0x8) == 8 ? 1 : 0;
	}
}
