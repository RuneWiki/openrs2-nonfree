import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class6_Sub20_Sub2 extends Class6_Sub20 {

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(I)V")
	public Class6_Sub20_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
	public void method8844() {
		this.aNativeHeap6.a();
	}
}
