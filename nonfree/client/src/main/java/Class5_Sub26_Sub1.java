import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class5_Sub26_Sub1 extends Class5_Sub26 {

	@OriginalMember(owner = "client!gv", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(I)V")
	public Class5_Sub26_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	public void method2871() {
		this.aNativeHeap1.b();
	}
}
