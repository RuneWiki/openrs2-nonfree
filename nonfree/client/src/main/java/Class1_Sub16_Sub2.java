import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class1_Sub16_Sub2 extends Class1_Sub16 {

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V")
	public void method6230() {
		this.aNativeHeap4.b();
	}
}
