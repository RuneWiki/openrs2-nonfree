import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public final class Class6_Sub18_Sub1 extends Class6_Sub18 {

	@OriginalMember(owner = "client!eka", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(I)V")
	public Class6_Sub18_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(I)V")
	public void method2605() {
		this.aNativeHeap3.b();
	}
}
