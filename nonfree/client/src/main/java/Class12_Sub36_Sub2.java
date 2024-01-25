import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class12_Sub36_Sub2 extends Class12_Sub36 {

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(I)V")
	public Class12_Sub36_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
	public void method7158() {
		this.aNativeHeap6.b();
	}
}
