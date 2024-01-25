import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class5_Sub23_Sub1 extends Class5_Sub23 {

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V")
	public Class5_Sub23_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	public void method4103() {
		this.aNativeHeap1.b();
	}
}
