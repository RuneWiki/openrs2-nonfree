import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class5_Sub42_Sub2 extends Class5_Sub42 {

	@OriginalMember(owner = "client!pca", name = "z", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(I)V")
	public Class5_Sub42_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
	public void method6375() {
		this.aNativeHeap4.a();
	}
}
