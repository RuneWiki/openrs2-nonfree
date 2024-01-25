import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class1_Sub41_Sub1 extends Class1_Sub41 {

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(I)V")
	public Class1_Sub41_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
	public void method5941() {
		this.aNativeHeap2.a();
	}
}
