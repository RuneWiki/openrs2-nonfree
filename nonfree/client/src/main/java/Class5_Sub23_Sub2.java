import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public final class Class5_Sub23_Sub2 extends Class5_Sub23 {

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(I)V")
	public Class5_Sub23_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(Z)V")
	public void method7901() {
		this.aNativeHeap6.b();
	}
}
