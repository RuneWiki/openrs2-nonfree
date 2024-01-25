import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class6_Sub18_Sub2 extends Class6_Sub18 {

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V")
	public Class6_Sub18_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public void method8796() {
		this.aNativeHeap6.b();
	}
}
