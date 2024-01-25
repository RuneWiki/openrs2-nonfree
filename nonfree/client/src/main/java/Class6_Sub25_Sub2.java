import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class6_Sub25_Sub2 extends Class6_Sub25 {

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
	public Class6_Sub25_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
	public void method8133() {
		this.aNativeHeap6.a();
	}
}
