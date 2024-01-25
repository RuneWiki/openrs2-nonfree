import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class2_Sub12_Sub2 extends Class2_Sub12 {

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub12_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public void method3736() {
		this.aNativeHeap4.b();
	}
}
