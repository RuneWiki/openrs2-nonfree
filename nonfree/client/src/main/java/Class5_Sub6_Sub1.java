import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public final class Class5_Sub6_Sub1 extends Class5_Sub6 {

	@OriginalMember(owner = "client!bda", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(I)V")
	public Class5_Sub6_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)V")
	public void method567() {
		this.aNativeHeap1.b();
	}
}
