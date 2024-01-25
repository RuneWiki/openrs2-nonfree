import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	static {
		new Class119("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
		new Class119("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(Z)V")
	public void method1063() {
		this.aNativeHeap1.a();
	}
}
