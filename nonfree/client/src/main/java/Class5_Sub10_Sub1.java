import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class5_Sub10_Sub1 extends Class5_Sub10 {

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
	public Class5_Sub10_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	public void method1726() {
		this.aNativeHeap1.a();
	}
}
