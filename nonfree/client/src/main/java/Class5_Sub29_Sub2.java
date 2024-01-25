import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class5_Sub29_Sub2 extends Class5_Sub29 {

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class5_Sub29_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public void method7249() {
		this.aNativeHeap6.a();
	}
}
