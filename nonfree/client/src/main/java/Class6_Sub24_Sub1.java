import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class6_Sub24_Sub1 extends Class6_Sub24 {

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
	public Class6_Sub24_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method3326() {
		this.aNativeHeap1.b();
	}
}
